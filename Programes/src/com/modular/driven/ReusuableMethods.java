package com.modular.driven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReusuableMethods {
	WebDriver driver;
	
	public void openBrowser(){
		driver=new FirefoxDriver();
	}
	public void navigateTo(String url){
		driver.get(url);
	}
	public void login(String un, String pass){
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	}
	public void verifyLogin(){
		String Actual=driver.findElement(By.linkText("Welcome Admin")).getText();
		String Expected="Welcome";
		if (Actual.contains(Expected)) {
			System.out.println("Verify Login successfully");
		}
	}
	public void Logout(){
		driver.findElement(By.linkText("Welcome Admin")).click();
		driver.findElement(By.linkText("Logout")).click();
		
	}
	public void close(){
		driver.close();
	}
}
