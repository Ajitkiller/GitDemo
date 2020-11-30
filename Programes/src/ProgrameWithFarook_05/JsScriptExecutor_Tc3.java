package ProgrameWithFarook_05;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JsScriptExecutor_Tc3 {

		WebDriver d;
		@BeforeTest
		public void startCase(){
			d=new FirefoxDriver();
			d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			d.get("https://www.mercurytravels.co.in/");
			
		}
	
	@Test
	public void niftyChal() throws InterruptedException{
	/*	Thread.sleep(4000);
		String s1=d.switchTo().alert().getText();
		System.out.println(s1);*/
		Thread.sleep(4000);
		d.findElement(By.linkText("No, thanks")).click();
		System.out.println("Alert window cancels");
		
		d.findElement(By.linkText("Got it!")).click();
		System.out.println("Cookies request got it");
		
		Thread.sleep(60000);
		d.switchTo().frame(0);
		/*d.findElement(By.id("/html/body/div/div/div/div/div/div/div/div/"
				+ "div/div/div[1]"
				+ "/div[3]/div[2]/svg")).click();*/
		d.findElement(By.xpath("//*[@fill='none']")).click();
		System.out.println("chat with mercury travel window minimize");
		
	}
	
	
}
