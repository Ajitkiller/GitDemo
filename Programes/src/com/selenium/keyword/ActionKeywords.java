package com.selenium.keyword;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActionKeywords {

	WebDriver driver;
	
	public void lunchBrowser(){
		driver=new FirefoxDriver();
	}
	public void navigate(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	public void enterUsername(){
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	}
	public void enterPassword(){
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}
	public void login(){
		driver.findElement(By.name("Submit")).click();
	}
}
