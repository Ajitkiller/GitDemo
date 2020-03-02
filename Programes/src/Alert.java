import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Alert {
	
	WebDriver driver;
		
		@BeforeTest
		public void open(){
			driver=new FirefoxDriver();
			driver.get("https://www.tsrtconline.in/oprs-web/");
		}
		@Test
		public void alertPage(){
			driver.findElement(By.id("searchBtn")).click();
			String d1=driver.switchTo().alert().getText();
			driver.switchTo().alert().accept();
			System.out.println("Alert page Text is");
			System.out.println(d1);
	}
		@AfterTest
		public void close(){
			driver.close();
		}

}
