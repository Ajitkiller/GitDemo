package MultipleWindow;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultiWiindow {

	WebDriver driver;
	@BeforeTest
	public void open() throws InterruptedException{
		driver=new FirefoxDriver();
		driver.get("https://www.online.citibank.co.in/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("APPLY FOR CREDIT CARDS")).click();
		
	}
	@Test
	public void data1() throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		String parent=driver.getWindowHandle();
		Set<String>popups=driver.getWindowHandles();
		Iterator<String>it=popups.iterator();
		while (it.hasNext()) {
			String popupHandler=it.next().toString();
			if (!popupHandler.contains(parent)) {
				driver.switchTo().window(popupHandler);
				Thread.sleep(5000);
			
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/article/form/div[1]/div[2]/div[2]/a")).click();
		}
			
		}
		
	
	
	
	}}
