package AdvancedUserInteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tc5DragDrop {

	WebDriver driver;
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		
	}
	@Test
	public void data1(){
		
		driver.switchTo().frame(0);
		Actions ac=new Actions(driver);
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		ac.dragAndDrop(drag, drop).build().perform();
		
		
	}
	
	
	
	
	
	
}
