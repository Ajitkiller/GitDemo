import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task1 {
WebDriver driver;
	
	@BeforeTest
	public void open(){
		ProfilesIni pf= new ProfilesIni();
		FirefoxProfile px=pf.getProfile("automation");
		driver=new FirefoxDriver();
		driver.get("http://www.angelfire.com/super/badwebs/");
	}
	@Test
	public void data() throws InterruptedException{
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("/html/body/p[5]/b/a/font")).click();
		Thread.sleep(5000);
		String parent=driver.getWindowHandle();
		Set<String>popups=driver.getWindowHandles();
		Iterator<String> it=popups.iterator();
		while(it.hasNext())
		{
			String phld=it.next().toString();
			if (!phld.contains(parent)) {
				driver.switchTo().window(phld);
				Thread.sleep(5000);
				
				List<WebElement>links =driver.findElements(By.tagName("a"));
				System.out.println("Total no of links are:"+links.size());
				
			
			for (int i = 0; i < links.size(); i++) {
				System.out.println(links.get(i).getText());
			}
		}
	}
}}
