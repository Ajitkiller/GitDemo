package ProgrameWithFarook_03;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Alert_Tc2 {


	 WebDriver d;
	 @BeforeTest
	 public void open()
	 {
		 d=new FirefoxDriver();
		 d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 d.get("https://demo.automationtesting.in/Alerts.html/");
	 }
	
	@Test
	public void alert() throws InterruptedException
	{
		d.findElement(By.linkText("Alert with Textbox3")).click();;
		Thread.sleep(3000);
		String d1=d.switchTo().alert().getText();
		d.switchTo().alert().accept();
		System.out.println(d1);
		
	}
	
	
	
	
	
}
