package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebtableTc4 {

	WebDriver driver;
	@BeforeTest
	public void open() throws InterruptedException{
		driver=new FirefoxDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
	}
	@Test
	public void countName(){
	
	String data1="/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[";
	String data2="]/td[1]";
	for (int i = 1; i < 37; i++) {
		String path=driver.findElement(By.xpath(data1+i+data2)).getText();
		System.out.println(path);
	}

	}
	//way---2
	/*@Test
	public void countNam(){
		for (int j = 0; j < 37; j++) {
			
		}
		WebElement name=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr["+j+"]/td[1]")).getText();
		System.out.println(name);
	}*/
	@AfterTest
	public void close(){
		driver.close();
	}
	
	
	
}
