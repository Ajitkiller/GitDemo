package ProgrameWithFarook_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class AtuTest_Case01 {

	WebDriver d;
	ATUTestRecorder a1;
	@BeforeTest
	public void recordSrt() throws ATUTestRecorderException{
		a1=new ATUTestRecorder("C:\\Users\\USER\\Desktop\\Testing_video", "spicejet", true);
		a1.start();
		d=new FirefoxDriver();
		d.get("https://www.spicejet.com/");
		}
	@Test
	public void programeShoot() throws InterruptedException, ATUTestRecorderException{
		Thread.sleep(4000);
		Select s1=new Select(d.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")));
		s1.selectByIndex(5);
		Thread.sleep(3000);
		Select ss1=new Select(d.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")));
		ss1.selectByIndex(12);
		Thread.sleep(3000);
		d.findElement(By.id("ctl00_mainContent_view_date1")).sendKeys("15/12");
		
		d.findElement(By.id("ctl00_mainContent_view_date2")).sendKeys("20/12");
		a1.stop();
		
		
	}
	
	
	
	
	
}
