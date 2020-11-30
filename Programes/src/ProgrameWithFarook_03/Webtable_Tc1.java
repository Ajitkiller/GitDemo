package ProgrameWithFarook_03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Webtable_Tc1 {

	WebDriver d;
	@BeforeTest
	public void startBro()
	{
		d=new FirefoxDriver();
		d.get("http://www.worldclock.com/");
	
	}
	
	@Test
	public void count()
	{
		List<WebElement>con=d.findElements(By.tagName("table"));
		System.out.println(con);
		
	}
	@AfterTest
	public void close(){
		d.close();
		
	}
	
	
}
