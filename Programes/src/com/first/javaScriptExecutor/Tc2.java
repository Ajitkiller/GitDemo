package com.first.javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tc2 {

	WebDriver d;
	@BeforeTest
	public void open() throws InterruptedException{
		d= new FirefoxDriver();
		d.get("https://www.facebook.com/");
		Thread.sleep(5000);
		d.navigate().to("https://www.google.com/");
	}
	@Test
	public void ajitkiller() throws InterruptedException{
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("window.history.back()");
		Thread.sleep(5000);
		String title=js.executeScript("return document.title").toString();
		System.out.println(title);
		Thread.sleep(5000);
		js.executeScript("window.history.forward()");
		
	}
	
	
	
	
	
	
	
}
