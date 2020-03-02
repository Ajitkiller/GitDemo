package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Webtable {
WebDriver driver;
	@BeforeTest
	public void open() throws InterruptedException{
		driver=new FirefoxDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		Thread.sleep(3000);
	}
	@Test
	public void count(){
		List<WebElement>table=driver.findElements(By.tagName("table"));
		System.out.println(table.size());
	}
	//if i write @test in place of @AfterTest,then @Test will not executed.
	@AfterTest
	public void close(){
		driver.close();
	}
	
	
	
}
