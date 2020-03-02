package com.first.javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tc3 {

	WebDriver driver;
	@BeforeTest
	public void open() throws InterruptedException{
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		}
	@Test
	public void test() throws InterruptedException{
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		//js.executeScript("window.scrollBy(0, 50000)");
		Thread.sleep(3000);
		//js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		js.executeScript("document.getElementId('pass').scrollIntoView()");
	
	}
	
	
	
}
