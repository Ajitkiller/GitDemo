package ProgrameWithFarook_03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Frame_Tc2 {

	WebDriver d;
	@BeforeTest
	public void openBrowser(){
		d=new FirefoxDriver();
		d.get("");
	}
	@Test
	public void clickElement(){
		d.switchTo().frame(1);
		
		d.findElement(By.xpath("")).click();
	}
	
	@AfterTest
	public void closeBrowser(){
		d.close();
	}
	
	
}
