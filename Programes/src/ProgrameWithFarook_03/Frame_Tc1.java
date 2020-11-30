package ProgrameWithFarook_03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Frame_Tc1 {

	WebDriver d;
	@BeforeTest
	public void openBrowser(){
		d=new FirefoxDriver();
		d.get(" ");
	}
	
	@Test
	public void countFrames(){
		List<WebElement>frames=d.findElements(By.tagName("frame"));
		System.out.println("Total no of frames are :"+frames);
		List<WebElement>iframe=d.findElements(By.tagName("iframe"));
		System.out.println("Total no of frames are :"+iframe);
		
		/*List<WebElement>frames=d.findElements(By.tagName("frame"));
		frames.addAll(d.findElements(By.tagName("iframe")));
		System.out.println("No of frames are :"+frames.size());
		
		*/
	}
	@AfterTest
	public void closeBrowser(){
		d.close();
	}
	
	
	
}
