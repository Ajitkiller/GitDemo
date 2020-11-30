package ProgrameWithFarook_05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatePicker_Tc1 {
	WebDriver d;
	@BeforeTest
	public void startCase(){
		d=new FirefoxDriver();
		d.get("https://jqueryui.com/datepicker/");
		
	}
	@Test
	public void stateMent(){
		d.switchTo().frame(0);
		d.findElement(By.id("datepicker")).sendKeys("28/04/1995");
		
	}
	
	
	
	
	

}
