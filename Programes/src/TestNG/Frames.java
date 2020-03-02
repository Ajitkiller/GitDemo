package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Frames {

	WebDriver driver;
	
		@BeforeTest
		public void open(){
			
			
			driver=new FirefoxDriver();
			driver.get("http://www.angelfire.com/super/badwebs/");
		}
		@Test
		public void frames(){
			List<WebElement>frame=driver.findElements(By.tagName("frame"));
			frame.addAll(driver.findElements(By.tagName("frame")));
		System.out.println("Total no of frames are :"+frame.size());
		
		
		
		
	}

}
