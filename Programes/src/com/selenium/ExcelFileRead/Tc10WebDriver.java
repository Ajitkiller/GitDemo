package com.selenium.ExcelFileRead;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tc10WebDriver {

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
			Thread.sleep(5000);
		}
		@Test
		public void test() throws IOException{
		String	Gm=driver.findElement(By.linkText("Gmail")).getText();
		wsh.createRow(2).createCell(3).setCellValue(Gm);
		System.out.println("Pass");
		FileOutputStream fo=new FileOutputStream("C:\\Users\\USER\\Desktop\\Excl.xlsx");
		wb.write(fo);
	}

}
