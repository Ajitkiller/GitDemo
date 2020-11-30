package ProgrameWithFarook_04;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Robot_01 {

	WebDriver d;
	
	@BeforeTest
	public void openBrowser(){
		d=new FirefoxDriver();
		d.get("https://www.hdnicewallpapers.com/");
		
	}
	
	@Test
	public void downloadImage() throws AWTException{
		d.findElement(By.xpath("/html/body/main/div/div/div/div[1]/section/section[2]/div/figure[1]/a/img")).click();
		d.findElement(By.xpath("/html/body/main/div/div/div/div[1]/section[4]/div[1]/div[2]/a/div")).click();
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_ENTER);
		
		
	}
	
	
	
	
	
}
