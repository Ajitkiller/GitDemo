package WindowElements;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutoitTc3 {

	
WebDriver driver;
	
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://selenium.dev/downloads/");
	}
	@Test
	public void uploadFile() throws IOException{
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[3]/div/div/div/ul/li[3]")).click();
		driver.findElement(By.linkText("3.141.59")).click();
		
		java.lang.Runtime.getRuntime().exec("‪‪C:\\Users\\USER\\Desktop\\jar.exe");
		}
}
