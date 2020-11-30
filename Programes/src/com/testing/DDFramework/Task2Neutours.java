package com.testing.DDFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Task2Neutours {
	WebDriver driver;
	FileInputStream fso;
	FileOutputStream fo;
	XSSFWorkbook wb;
	XSSFSheet wsh;
	@BeforeTest
	public void open() throws InterruptedException{
		driver=new FirefoxDriver();
		driver.get("http://www.newtours.demoaut.com/");
	Thread.sleep(5000);
	}
	@Test
	public void registerlink() throws IOException, InterruptedException{
		fso=new FileInputStream("C:\\Users\\USER\\Desktop\\Excl.xlsx");
		wb=new XSSFWorkbook(fso);
		wsh=wb.getSheet("Sheet1");
		int rowc=wsh.getLastRowNum();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(rowc + "nos. of rows are avilabe");
		Thread.sleep(3000);
		driver.findElement(By.linkText("REGISTER")).click();
		
		for (int i = 1; i <=rowc; i++) {
			String fname=wsh.getRow(i).getCell(0).getStringCellValue();
			String lname=wsh.getRow(i).getCell(1).getStringCellValue();
			String Email=wsh.getRow(i).getCell(2).getStringCellValue();
			String Add=wsh.getRow(i).getCell(3).getStringCellValue();
			String City=wsh.getRow(i).getCell(4).getStringCellValue();
			String State=wsh.getRow(i).getCell(5).getStringCellValue();
			String Country=wsh.getRow(i).getCell(6).getStringCellValue();
			String Username=wsh.getRow(i).getCell(7).getStringCellValue();
			String Pass=wsh.getRow(i).getCell(8).getStringCellValue();
			String ConfPass=wsh.getRow(i).getCell(9).getStringCellValue();
			
			driver.findElement(By.name("firstName")).sendKeys(fname);
			driver.findElement(By.name("lastName")).sendKeys(lname);
			driver.findElement(By.name("phone")).sendKeys("1235668777");
			driver.findElement(By.id("userName")).sendKeys(Email);
			driver.findElement(By.name("address1")).sendKeys(Add);
			driver.findElement(By.name("city")).sendKeys(City);
			driver.findElement(By.name("state")).sendKeys(State);
			
			WebElement contr=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select"));
			Select ac=new Select(contr);
			ac.selectByVisibleText(Country);
		
			driver.findElement(By.id("email")).sendKeys(Username);
			driver.findElement(By.name("password")).sendKeys(Pass);
			driver.findElement(By.name("confirmPassword")).sendKeys(ConfPass);
			driver.findElement(By.name("register")).click();
			Thread.sleep(3000);
			String Actual=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
			String Expected=wsh.getRow(i).getCell(0).getStringCellValue();
			
			if (Actual.contains(Expected)) {
				wsh.getRow(i).createCell(10).setCellValue(Actual);
				wsh.getRow(i).createCell(11).setCellValue("passed");
				driver.navigate().back();
				
			}
			else {
				wsh.getRow(i).createCell(10).setCellValue("not matched");
				wsh.getRow(i).createCell(11).setCellValue("fail");
				driver.navigate().back();
				
			}
			
			
			}
		Thread.sleep(3000);
		fo=new FileOutputStream("C:\\Users\\USER\\Desktop\\Excl.xlsx");
		wb.write(fo);
		driver.close();
		
	}

}
