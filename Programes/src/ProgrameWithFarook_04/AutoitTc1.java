package ProgrameWithFarook_04;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutoitTc1 {
	WebDriver d;
	@BeforeTest
	public void openBro(){
		d=new FirefoxDriver();
		
		d.get("https://www.hdnicewallpapers.com/");
	}
	@Test
	public void oppCell() throws IOException{
		
		d.findElement(By.xpath("/html/body/main/div/div/div/div[1]/section/section[2]/div/figure[1]/a/img")).click();
		d.findElement(By.xpath("/html/body/main/div/div/div/div[1]/section[4]/div[1]/div[2]/a/div")).click();
		java.lang.Runtime.getRuntime().exec("C:\\Users\\USER\\Desktop\\Autoit_tc1.exe");
		
		
	}
	@AfterTest
	public void close(){
		d.close();
	}
}
