package com.selenium.keyword;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class ActionkeyTc2 {

WebDriver driver;
	
	public void lunchBrowser(){
		driver=new FirefoxDriver();
	}
	public void navigate(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	
	public void login(){
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	}
	public void status(){
		String Actual=driver.findElement(By.linkText("Welcome Admin")).getText();
		String Expected="Welcome";
		//Assert.assertEquals(Expected, Actual);
		if (Actual.contains(Expected)) {
			System.out.println("Verify Login successfully");
		}
	}
	public void addUser() throws InterruptedException{
		driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("firstName")).sendKeys("Ajit");
		driver.findElement(By.id("middleName")).sendKeys("Kumar");
		driver.findElement(By.id("lastName")).sendKeys("Sahoo");
		driver.findElement(By.id("employeeId")).clear();
		driver.findElement(By.id("employeeId")).sendKeys("007");
		driver.findElement(By.id("btnSave")).click();
	}
	public void Logout(){
		driver.findElement(By.linkText("Welcome Admin")).click();
		driver.findElement(By.linkText("Logout")).click();
		
	}
	public void close(){
		driver.close();
	}
	
}
