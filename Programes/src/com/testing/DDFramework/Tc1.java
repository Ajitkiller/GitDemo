package com.testing.DDFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class Tc1 {

	ATUTestRecorder rec;
	
	WebDriver driver;
	FileInputStream fso;
	FileOutputStream fo;
	XSSFWorkbook wb;
	XSSFSheet wsh;
	@BeforeTest
	public void openBrowser() throws InterruptedException, ATUTestRecorderException{
		rec=new ATUTestRecorder("C:/Users/USER/Desktop/html", "datadriven", true);
		
		rec.start();
		
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
		System.out.println(rowc + "nos. of rows are avilabe");
		
		for(int i=1;i<=rowc;i++) {
			String user=wsh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("pass 39");
			String pass=wsh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("pas 40");
			Thread.sleep(3000);
			driver.findElement(By.id("txtUsername")).clear();
			driver.findElement(By.id("txtUsername")).sendKeys(user);
			
			driver.findElement(By.id("txtPassword")).clear();
			driver.findElement(By.id("txtPassword")).sendKeys(pass);
			
			driver.findElement(By.id("btnLogin")).click();
			Thread.sleep(3000);
		
			String actual=driver.getCurrentUrl();
			System.out.println(actual);
			Thread.sleep(2000);
			wsh.getRow(i).createCell(3).setCellValue(actual);
			String expected=wsh.getRow(i).getCell(2).getStringCellValue();
			
			if(expected.equals(actual)) {
				wsh.getRow(i).createCell(4).setCellValue("Pass");
				
			}
			else {
				wsh.getRow(i).createCell(4).setCellValue("Fail");
				
			}
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
			
		}
		fo=new FileOutputStream("C:\\Users\\USER\\Desktop\\Excl.xlsx");
		wb.write(fo);
		
		driver.close();
		rec.stop();
	}

	}

	

