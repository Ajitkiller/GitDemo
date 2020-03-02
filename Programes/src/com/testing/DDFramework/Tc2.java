package com.testing.DDFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import atu.testrecorder.exceptions.ATUTestRecorderException;

public class Tc2 {
	WebDriver driver;
	FileInputStream fso;
	FileOutputStream fo;
	XSSFWorkbook wb;
	XSSFSheet wsh;
	@BeforeTest
	public void openBrowser() throws InterruptedException, ATUTestRecorderException{
		driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	Thread.sleep(5000);
	}
	@Test
	public void operation() throws IOException, InterruptedException, ATUTestRecorderException {
		fso=new FileInputStream("C:\\Users\\USER\\Desktop\\Excl.xlsx");
		wb=new XSSFWorkbook(fso);
		wsh=wb.getSheet("Sheet3");
		int rowc=wsh.getLastRowNum();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(rowc + "nos. of rows are avilabe");
		String user=wsh.getRow(1).getCell(0).getStringCellValue();
		//System.out.println("pass 39");
		String pass=wsh.getRow(1).getCell(1).getStringCellValue();
		//System.out.println("pas 40");
		Thread.sleep(3000);
		
		
			driver.findElement(By.id("txtUsername")).clear();
			driver.findElement(By.id("txtUsername")).sendKeys(user);
			
			driver.findElement(By.id("txtPassword")).clear();
			driver.findElement(By.id("txtPassword")).sendKeys(pass);
			
			driver.findElement(By.id("btnLogin")).click();
			Thread.sleep(3000);
	
				driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]")).click();
				for (int i = 1; i <=rowc; i++) {
					
				
				driver.findElement(By.id("menu_pim_addEmployee")).click();
				Thread.sleep(4000);
				String Fname=wsh.getRow(i).getCell(7).getStringCellValue();
				String Mname=wsh.getRow(i).getCell(8).getStringCellValue();
				String Lname=wsh.getRow(i).getCell(9).getStringCellValue();
				String idno=wsh.getRow(i).getCell(10).getStringCellValue();
				driver.findElement(By.id("firstName")).sendKeys(Fname);
				driver.findElement(By.id("middleName")).sendKeys(Mname);
				driver.findElement(By.id("lastName")).sendKeys(Lname);
				driver.findElement(By.id("employeeId")).clear();
				driver.findElement(By.id("employeeId")).sendKeys(idno);
				
				driver.findElement(By.id("btnSave")).click();
				
				String Actual=driver.findElement(By.id("firstName")).getAttribute("value");
				wsh.getRow(i).createCell(11).setCellValue(Actual);
				String Expected=wsh.getRow(i).getCell(7).getStringCellValue();
				if (Actual.equals(Expected)) {
					wsh.getRow(i).createCell(12).setCellValue("Pass");
					
				}
				else {
					wsh.getRow(i).createCell(12).setCellValue("Fail");
					
				}
			//driver.navigate().back();
			
		}
		fo=new FileOutputStream("C:\\Users\\USER\\Desktop\\Excl.xlsx");
		wb.write(fo);
		driver.close();
				}
				
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			

