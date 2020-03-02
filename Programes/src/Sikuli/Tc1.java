package Sikuli;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tc1 {


	WebDriver driver;
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://selenium.dev/downloads/");
	}
	@Test
	public void data() throws InterruptedException, FindFailed {
		Thread.sleep(5000);
		driver.findElement(By.linkText("3.141.59")).click();
		Thread.sleep(5000);
		
	Screen sc=new Screen();
	Pattern pt=new Pattern("‪C:/Users/USER/Desktop/Capture.PNG");

	sc.click(pt);
	}
	
	
	
	
	
}
