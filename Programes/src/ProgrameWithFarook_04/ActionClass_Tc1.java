package ProgrameWithFarook_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionClass_Tc1 {

	WebDriver d;
	@BeforeTest
	public void open(){
		d=new FirefoxDriver();
		d.get("http://www.google.om");
		
	}
	@Test
	public void handleMmoper(){
		Actions a1=new Actions(d);
		WebElement gm=d.findElement(By.linkText("Gmail"));
		
		a1.contextClick(gm).build().perform();
		WebElement abo=d.findElement(By.linkText("About us"));
		a1.moveToElement(abo).build().perform();
		
		WebElement btn=d.findElement(By.id(" "));
		a1.doubleClick(btn).build().perform();
		
		
	}
	
	
	
	
}
