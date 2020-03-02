package JanLast;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrgHrm {

	public static void main(String[] args) throws InterruptedException {
	
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		Thread.sleep(5000);
		driver.quit();
		
		
		
	}

}
