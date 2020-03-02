package com.testing.DDFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class StoreAllData {

	WebDriver driver;
	FileInputStream fso;
	FileOutputStream fo;
	XSSFWorkbook wb;
	XSSFSheet wsh;
	@BeforeTest
	public void openBrowser() throws InterruptedException{
		driver=new FirefoxDriver();
		driver.get("http://www.newtours.demoaut.com/");
	Thread.sleep(5000);
	}
	
	@Test
	public void operation() throws IOException, InterruptedException{
		fso=new FileInputStream("C:\\Users\\USER\\Desktop\\Excl.xlsx");
		wb=new XSSFWorkbook(fso);
		wsh=wb.getSheet("Sheet4");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.linkText("REGISTER")).click();
		WebElement down=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select"));
		List<WebElement>country=down.findElements(By.tagName("option"));
		
		/*for (int i = 1; i < country.size(); i++) {
			String Actual=country.get(i).getText();
			wsh.createRow(i).createCell(0).setCellValue(Actual);
		}*/
		for (int i = 1; i < country.size(); i++) {
			String Actual=country.get(i).getText();
			wsh.getRow(i).createCell(1).setCellValue(Actual);
			String Expected=wsh.getRow(i).getCell(0).getStringCellValue();
			if (Actual.equals(Expected)) {
				wsh.getRow(i).createCell(2).setCellValue("Pass");
			}
			else {
				wsh.getRow(i).createCell(2).setCellValue("Fail");
			}
			}
		fo=new FileOutputStream("C:\\Users\\USER\\Desktop\\Excl.xlsx");
		wb.write(fo);
		driver.close();
		
		
		
	}
}
