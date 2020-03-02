package com.first.javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tc3MercuryTravel {
	
	WebDriver driver;
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://www.mercurytravels.co.in/");
	}
	@Test
	public void data() throws InterruptedException{
		Thread.sleep(5000);
		driver.findElement(By.id("flights")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("fromCity")).sendKeys("Hyderabad, India - Hyderabad International Airport (HYD)");
		driver.findElement(By.name("toCity")).sendKeys("Bangalore, India - Bangalore International Airport (BLR)");
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('dpf1').value='19/02/2020'");
		Thread.sleep(5000);
		js.executeScript("document.getElementById('dpf2').value='25/02/2020'");
		driver.findElement(By.id("Adults")).sendKeys("2");
		Thread.sleep(2000);
		driver.findElement(By.id("Childs")).sendKeys("5");
		Thread.sleep(2000);
		driver.findElement(By.id("Infants")).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.name("cabinClass")).sendKeys("Business Class");
		Thread.sleep(2000);
		driver.findElement(By.id("searchFlightsBtn")).click();
	}
	@AfterTest
	public void close(){
		driver.close();
	}
	
	
	
	
	
	
	
}
