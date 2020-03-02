import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlertTc2 {

	WebDriver driver;
	
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
	}
	@Test
	public void getDataFromAllTable(){
		WebElement table=driver.findElement(By.tagName("table"));
		List<WebElement>crow=table.findElements(By.tagName("tr"));
		
		for (int i = 0; i < crow.size(); i++) {
			List<WebElement>ccol=crow.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < ccol.size(); j++) 
			{
				System.out.print(ccol.get(j).getText()+"\t");
			}
			System.out.println(" ");
		}
	}
	
	
	
}
