package ProgrameWithFarook_05;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.lowagie.text.Document;

public class JavaScriptEditor_Tc1 {

	WebDriver d;
	@BeforeTest
	public void start(){
		d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("http://facebook.com/");
		
	}
	@Test
	public void execuScrip(){
	 	JavascriptExecutor js=(JavascriptExecutor)d;
	 	js.executeScript("document.getElementById('email').value='xxxxxxx'");
	 	js.executeScript("document.getElementById('pass').value='xxxxxxx'");
	 	js.executeScript("document.getElementById('logIn').value='xxxxxxx'");
	}
	@AfterTest
	public void close
	(){
		d.close();
	}
	
}
