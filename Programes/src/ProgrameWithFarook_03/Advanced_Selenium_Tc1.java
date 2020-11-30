package ProgrameWithFarook_03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Advanced_Selenium_Tc1 {

	WebDriver d;
	
	@BeforeTest
	public void startBrowser()
	{
		d=new FirefoxDriver();
		d.get("http://opensource-demo.orangehrmlive.com/");
	}
	@Test
	public void loginOpr()
	{
		d.findElement(By.id("txtUsername"));
		d.findElement(By.id("txtPassword "));
		d.findElement(By.id("Login"));
	}
	@Test
	public void checkStatus()
	{
		String Actual="Welcome Admin";
		String Expcted=d.findElement(By.linkText("Welcome Admin")).getText();
		Assert.assertEquals(Actual, Expcted);
		
	}
	
	@Test
	public void logoutAdmin(){
		d.findElement(By.linkText("Welcome Admin")).click();
		d.findElement(By.linkText("Logout")).click();
	}
	@Test
	public void close(){
		
		d.close();
		d.quit();
		
		
	}
	
	
	
	
}
