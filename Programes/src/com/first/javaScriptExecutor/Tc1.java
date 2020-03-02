package com.first.javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tc1 {

	WebDriver driver;
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		}
	@Test
	public void test() throws InterruptedException{
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('email').value='kajit2759@gmail.com'");
		js.executeScript("document.getElementById('pass').value='********'");
		js.executeScript("document.getElementById('u_0_b').click()");

		Thread.sleep(5000);
	
	
	
	}
}
