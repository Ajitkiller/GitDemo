package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrgHrmLogout {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 	      
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtUsername")).click();
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("txtPassword")).click();
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.xpath("//*[@id='welcome']")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		
		}
	}


