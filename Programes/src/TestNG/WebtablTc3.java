package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebtablTc3 {

	WebDriver driver;
	@BeforeTest
	public void open() throws InterruptedException{
		driver=new FirefoxDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
	}
	@Test
	public void status(){
		WebElement part1=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[8]/td[3]/a"));
		WebElement part2=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[6]/td[7]/a"));
		System.out.println(part1+" "+part2);
		
	}
	@AfterTest
	public void close(){
		driver.close();
	}
	
	
	
	
}
