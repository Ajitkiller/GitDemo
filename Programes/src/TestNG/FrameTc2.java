package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FrameTc2 {

	WebDriver driver;
	
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("http://www.angelfire.com/super/badwebs/");
	}
	@Test
	public void data(){
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("/html/body/p[5]/b/a/font")).click();
	}
	@AfterTest
	public void close(){
		driver.close();
	}
	
	
	
	
	
	
	
	
}
