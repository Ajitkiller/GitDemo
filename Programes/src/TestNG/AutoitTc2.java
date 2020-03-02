package TestNG;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutoitTc2 {


	WebDriver driver;
	
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://selenium.dev/downloads/");
	}
	@Test
	public void jarFilesDownload() throws IOException{
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/p[1]/a"));
		java.lang.Runtime.getRuntime().exec("‪C:/Users/USER/Desktop/jar.exe");
	}
	
	
	
	
	
	
}
