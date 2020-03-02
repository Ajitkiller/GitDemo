package Popups;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PopupsEx1 {

	WebDriver driver;
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://www.rediff.com/");
	}
	@Test
	public void data1() throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String parent=driver.getWindowHandle();
		Set<String>popups=driver.getWindowHandles();
		Iterator<String>it=popups.iterator();
		while (it.hasNext()) {
			String popupHandles=it.next().toString();
			if (!popupHandles.contains(parent)) {
				driver.switchTo().window(popupHandles);
				Thread.sleep(5000);
			}
		}driver.close();
	}
	
	
	
	
}
