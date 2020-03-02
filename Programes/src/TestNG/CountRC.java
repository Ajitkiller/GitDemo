package TestNG;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CountRC {
	WebDriver driver;
	@BeforeTest
	public void open() throws InterruptedException{
		driver=new FirefoxDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		Thread.sleep(3000);
	}
	@Test
	public void count(){
		WebElement table=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table"));
		List<WebElement>crow=table.findElements(By.tagName("tr"));
		System.out.println("Total no of rows are:"+crow.size());
		List<WebElement>ccol=table.findElements(By.tagName("td"));
		System.out.println("Total no of rows are:"+ccol.size());
		
	}
	@AfterTest
	public void close(){
		driver.close();
		
	}
	
	
	
	
}
