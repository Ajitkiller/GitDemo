package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngEx2OrgHRM {

	WebDriver driver;
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@Test
	public void login() throws InterruptedException{
		WebElement uname=driver.findElement(By.id("txtUsername"));
		uname.clear();
		uname.sendKeys("Admin");
		uname.click();
		WebElement pass=driver.findElement(By.id("txtPassword"));
		pass.clear();
		pass.sendKeys("admin123");
		pass.click();
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(5000);
	}

	@Test(priority=1)
	public void status(){
		String actual=driver.findElement(By.linkText("Welcome Admin")).getText();
		String Expected="Welcome Admin";
		Assert.assertEquals(Expected, actual);
		System.out.println("pass");
	}
	
	@Test(priority=2)
	public void logout(){
		WebElement welcom=driver.findElement(By.id("welcome"));
		welcom.click();
		//System.out.println("successfully click on welcome admin");
		
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("successfully click on logout");
	}
	@AfterTest
	public void close(){
	driver.close();
	}
	
	
	
	
	
}
