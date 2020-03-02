package WindowElements;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutoitTc1 {

	WebDriver driver;
	
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("http://www.hdnicewallpapers.com/Wallpaper-Download/Thoughts-and-Quotes/Beautiful-Good-Morning-Quote-Wallpaper");
	}
	@Test
	public void downloadPhoto() throws IOException{
		driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/section[4]/div[1]/div[2]/a/div")).click();
		java.lang.Runtime.getRuntime().exec("‪C:/Users/USER/Desktop/Cute.exe");
	}
	
	
	
	
	
	
}
