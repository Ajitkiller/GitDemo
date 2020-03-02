import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Cookies {

	WebDriver driver;
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://www.mirror.co.uk/");
	}
	@Test
	public void data1() throws InterruptedException{
		Thread.sleep(5000);
		Set<Cookie>cook=driver.manage().getCookies();
		System.out.println("Total no of cookies are:"+cook.size());
		driver.manage().deleteAllCookies();
		cook=driver.manage().getCookies();
		System.out.println("Total no of cookies are:"+cook.size());
	}
	
	
	
}
