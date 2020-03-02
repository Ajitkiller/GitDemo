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

public class Tc11ActExp {


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
	public void test() throws IOException, InterruptedException{
		//Capture the name of the page
	String	Actual=driver.findElement(By.linkText("Gmail")).getText();
	Thread.sleep(3000);
	//capture value enter into the cell
	wsh.getRow(2).createCell(3).setCellValue(Actual);
	System.out.println("Act val");
	//Expected value variable create
	String Expected=wsh.getRow(2).getCell(2).getStringCellValue();
	//compare Exp and Equal value
	if (Actual.equals(Expected)) {
		System.out.println("pass");
		wsh.createRow(2).createCell(4).setCellValue("pass");
	}
	else 
		wsh.createRow(2).createCell(4).setCellValue("fail");
	
	
	FileOutputStream fo=new FileOutputStream("C:\\Users\\USER\\Desktop\\Excl.xlsx");
	wb.write(fo);
	
	}
}
