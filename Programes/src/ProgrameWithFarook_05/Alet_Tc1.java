package ProgrameWithFarook_05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Alet_Tc1 {

	WebDriver d;
	@BeforeTest
	public void 
	openDrive
	
	(){
		d=new FirefoxDriver();
		d.get("https://www.tsrtconline.in/oprs-web/");
	}
	@Test
	public void
	perfOper
	
	(){
		d.findElement(By.id("searchBtn"));
		String d1=d.switchTo().alert().getText();
		System.out.println(d1);
		d.switchTo().alert().accept();
	}
	
	
	@AfterTest
	public void
	finishProgm

	(){
		d.close();
		d.quit();
	}
	
	
	
	
	
}
