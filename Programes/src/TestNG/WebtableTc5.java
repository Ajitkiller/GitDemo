package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebtableTc5 {

	WebDriver driver;
	
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
	}
	@Test
	public void ContAllCols(){
			String data1="/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[";
			String data2="]";
			for (int i = 1; i < 37; i++) {
				String path=driver.findElement(By.xpath(data1+i+data2)).getText();
				System.out.println(path);
			}

			}
	@AfterTest
	public void close(){
		driver.close();
	}
		
	}
	
	
	

