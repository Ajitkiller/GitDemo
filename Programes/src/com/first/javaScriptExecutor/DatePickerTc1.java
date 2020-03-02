package com.first.javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatePickerTc1 {

	WebDriver driver;
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/datepicker/");
	}
	@Test
	public void data() throws InterruptedException{
		Thread.sleep(5000);
		driver.findElement(By.id("datepicker")).sendKeys("19/02/2020");
		
	}
	@AfterTest
	public void close(){
		driver.close();
	}
	
	
	
	
	
	
}
