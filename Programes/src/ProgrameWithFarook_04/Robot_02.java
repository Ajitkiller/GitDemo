package ProgrameWithFarook_04;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Robot_02 {

	WebDriver d;
	@BeforeTest
	public void openBrowser()
	{
		d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.get("https://www.hdnicewallpapers.com/");
		
	}
	@Test
	public void 
	
	
	
	
	
	
}
