package AdvancedUserInteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tc4DragAndDrop {

	WebDriver driver;
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/slider/");
		
	}
	@Test
	public void DragAndDrop() throws InterruptedException{
		
		
		driver.switchTo().frame(0);
		Actions ac=new Actions(driver);
		WebElement slider=driver.findElement(By.id("slider"));
		Thread.sleep(5000);
		int loc=slider.getLocation().y;
		ac.dragAndDropBy(slider, 70, loc).build().perform();
	}
	
	
	
	
	
	
}
