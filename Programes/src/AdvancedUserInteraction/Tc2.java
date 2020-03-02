package AdvancedUserInteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tc2 {

	WebDriver driver;
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://www.mercurytravels.co.in/");
	}
	@Test
	public void data() throws InterruptedException{
		Thread.sleep(3000);
		WebElement about=driver.findElement(By.linkText("About Us"));
		Actions ac=new Actions(driver);
		Thread.sleep(5000);
		ac.moveToElement(about).build().perform();
		
	}
	
	
}
