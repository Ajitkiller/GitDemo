package Bootstrap;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Bootstarp {

	WebDriver driver;
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://www.goibibo.com/");
	}
	@Test
	public void ajit() throws InterruptedException{
		Thread.sleep(5000);
		driver.findElement(By.id("get_sign_in")).click();
		//driver.switchTo().frame(0);
		List<WebElement>frames=driver.findElements(By.tagName("frame"));
		System.out.println("no of frames are :"+frames.size());
		
		Thread.sleep(5000);
		driver.findElement(By.id("authMobile")).sendKeys("108");
		driver.findElement(By.id("mobileSubmitBtn")).click();
	}
	
	
	
	
	
}
