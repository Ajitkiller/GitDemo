package ProgrameWithFarook_05;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatePicker_Tc2 {

	WebDriver d;
	@BeforeTest
	public void startCase(){
		d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		d.get("https://www.spicejet.com/");
		
	}
	@Test
	public void spiceJet(){
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("document.getElementById('ctl00_mainContent_view_date1').value='10/12'");
		js.executeScript("document.getElementById('ctl00_mainContent_view_date2').value='12/12'");
		
	}
	
	
	
}
