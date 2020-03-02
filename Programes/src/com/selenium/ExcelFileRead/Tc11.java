package com.selenium.ExcelFileRead;

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

public class Tc11 {

	WebDriver driver;
	FileInputStream wso;
	XSSFWorkbook wb;
	XSSFSheet wsh;
	@BeforeTest
	public void openGoogle() throws InterruptedException, IOException{
		wso=new FileInputStream("C:\\Users\\USER\\Desktop\\Excl.xlsx");
		wb= new XSSFWorkbook(wso);
		wsh=wb.getSheet("sheet1");
		driver=new FirefoxDriver();
		driver.get("http://www.google.com");
	}
	@Test
	public void test() throws IOException, InterruptedException{
		String Actual=driver.findElement(By.linkText("Gmail")).getText();
		String Expected=wsh.getRow(2).getCell(2).getStringCellValue();
		
		wsh.getRow(2).createCell(3).setCellValue(Actual);
		if (Actual.equals(Expected)) {
			System.out.println("pass");
			wsh.getRow(2).createCell(4).setCellValue("pass");
		}
		else 
			wsh.getRow(2).createCell(4).setCellValue("fail");
		
		FileOutputStream fo=new FileOutputStream("C:\\Users\\USER\\Desktop\\Excl.xlsx");
		wb.write(fo);
	}
	
}
