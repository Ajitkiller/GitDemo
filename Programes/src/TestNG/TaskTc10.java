package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TaskTc10 {
		WebDriver driver; 
		@BeforeTest
		public void open(){
			
			driver=new FirefoxDriver();
			driver.get("https://www.timeanddate.com/worldclock/");
		}

		@Test
		public void getData() throws InterruptedException{
		WebElement table=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table"));
		List<WebElement>crow=table.findElements(By.tagName("tr"));
		System.out.println("Total no of rows are:"+crow.size());
		List<WebElement>ccol=table.findElements(By.tagName("td"));
		System.out.println("Total no of columns are:"+ccol.size());
		Thread.sleep(3000);
		int col=ccol.size()/crow.size();
		try{
		for (int i = 1; i <= crow.size(); i++) {
			for (int j = 1; j <= ccol.size(); j++) {
			String name=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(name+"\t");
			}
			System.out.println(" ");
		}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		}@AfterTest
		public void close(){
			driver.close();
		}
		
	}


