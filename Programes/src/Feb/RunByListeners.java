package Feb;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Feb.TestNGListeners.class)
public class RunByListeners {

	WebDriver driver;
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@Test
	public void test() throws IOException, InterruptedException
	{
		FileInputStream prop=new FileInputStream("C:\\Users\\USER\\Desktop\\Dec19\\Programes\\OrgHrmLogin.properties");
		Properties file=new Properties();
		file.load(prop);
		Thread.sleep(5000);
		driver.findElement(By.id(file.getProperty("Username"))).clear();
		driver.findElement(By.id(file.getProperty("Username"))).sendKeys("Admin");
		driver.findElement(By.id(file.getProperty("Password"))).clear();
		driver.findElement(By.id(file.getProperty("Password"))).sendKeys("admin123");
		driver.findElement(By.id(file.getProperty("Login"))).click();
	}
	
	
	
	
	
}
