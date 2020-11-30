package ProgrameWithFarook_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionClass_Tc3 {

	WebDriver d;
	@BeforeTest
	public void open(){
		d=new FirefoxDriver();
		d.get("http://www.jqueryui.com/droppable/");
		
	}
	@Test
	public void dragdrp(){
		
		d.switchTo().frame(0);
		Actions a1=new Actions(d);
		WebElement drop=d.findElement(By.id("Droppable"));
		WebElement drag=d.findElement(By.id("Draggable"));
		a1.dragAndDrop(drop, drag);
		
		
		
		
	}
	
	
	
	
	
	
}
