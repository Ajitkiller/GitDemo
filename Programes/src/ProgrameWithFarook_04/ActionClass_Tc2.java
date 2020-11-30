package ProgrameWithFarook_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionClass_Tc2 {


	WebDriver d;
	@BeforeTest
	public void open(){
		d=new FirefoxDriver();
		d.get("http://www.jqueryui.com");
		
	}
	@Test
	public void dragdrp(){
		d.switchTo().frame(0);
		WebElement sli=d.findElement(By.id("Slider"));
		int loc=sli.getLocation().y;
		Actions a1=new Actions(d);
		a1.dragAndDropBy(sli, 70, loc).build().perform();
		
	}
	
	
	
	
	
	
}
