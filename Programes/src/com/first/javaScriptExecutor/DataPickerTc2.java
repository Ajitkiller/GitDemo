package com.first.javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataPickerTc2 {

	WebDriver driver;
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
	}
	@Test
	public void data1() throws InterruptedException{
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('ctl00_mainContent_view_date1').value='19/02'");
		js.executeScript("document.getElementById('ctl00_mainContent_view_date2').value='21/02'");
	}
	@AfterTest
	public void close() throws InterruptedException{
		Thread.sleep(5000);
		driver.close();
		
	}
	
	
	
}
