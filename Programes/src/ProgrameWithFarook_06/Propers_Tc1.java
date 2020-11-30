package ProgrameWithFarook_06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Propers_Tc1 {

	WebDriver d;
	@BeforeTest
	public void openBrow(){
		d=new FirefoxDriver();
		d.get("");
			
	}
	@Test
	public void monkyTech() throws IOException, InterruptedException{
		FileInputStream fo=new FileInputStream("E:\\GitDemo\\Programes\\name.properties");
		Properties pr=new Properties();
		pr.load(fo);
		Thread.sleep(4000);
		d.findElement(By.id(pr.getProperty("User_name"))).clear();
		d.findElement(By.id(pr.getProperty("User_name"))).sendKeys("Admin");
		d.findElement(By.id(pr.getProperty("Password"))).clear();
		d.findElement(By.id(pr.getProperty("Password"))).sendKeys("admin123");
		d.findElement(By.id(pr.getProperty("Login"))).click();
		
		
		
	}
	
	
	
	
}
