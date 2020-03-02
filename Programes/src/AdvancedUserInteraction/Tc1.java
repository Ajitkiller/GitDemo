package AdvancedUserInteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tc1 {
WebDriver driver;
@BeforeTest
public void open(){
	driver=new FirefoxDriver();
	driver.get("http://www.google.com");
}
@Test
public void data() throws InterruptedException{
	WebElement gmail=driver.findElement(By.linkText("Gmail"));
	Actions ac=new Actions(driver);
	Thread.sleep(5000);
	ac.contextClick(gmail).build().perform();
	
}




}
