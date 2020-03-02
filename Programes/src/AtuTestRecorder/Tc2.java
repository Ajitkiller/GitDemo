package AtuTestRecorder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class Tc2 {

	ATUTestRecorder rec;
	WebDriver dri;
	
	@BeforeTest
	public void open() throws ATUTestRecorderException{
		rec=new ATUTestRecorder("C:/Users/USER/Desktop/html", "videotest", true);
		
		rec.start();
		dri=new FirefoxDriver();
		dri.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test
	public void test() throws InterruptedException, ATUTestRecorderException{
		Thread.sleep(5000);
		
		dri.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		dri.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		dri.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
		rec.stop();
	}
	
	
	
}
