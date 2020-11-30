package ProgrameWithFarook_05;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JsBakForwd_Tc2 {

	WebDriver d;
	@BeforeTest
	public void open(){
		d=new FirefoxDriver();
		d.get("https://www.facebook.com/");
		}
	@Test
	public void backOper(){
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("window.history.back()");
		Thread.sleep(4000);
		String d1=js.executeScript("return document.title").toString();
		System.out.println(d1);
		Thread.sleep(4000);
		js.executeScript("window document.forword()");
		
	}
	
	
	
	
}
