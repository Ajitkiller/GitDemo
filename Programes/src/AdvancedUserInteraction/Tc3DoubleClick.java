package AdvancedUserInteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tc3DoubleClick {

	WebDriver driver;
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("http://www.google.com");
	}
	@Test
	public void data1() throws InterruptedException{
		Thread.sleep(3000);
		WebElement button=driver.findElement(By.name("btnK"));
		Actions ac=new Actions(driver);
		ac.doubleClick(button).build().perform();
	}
	
	
	
	
	
	
}
