package ProgrameWithFarook_05;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Popup_Tc1 {

	WebDriver d;
	@BeforeTest
	public void open(){
		d=new FirefoxDriver();
		d.get("http://www.rediff.com/");
		
	}
	@Test
	public void managePpoup() throws InterruptedException
	{
		d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		String par=d.getWindowHandle();
		Set<String> pop=d.getWindowHandles();
		Iterator<String>it=pop.iterator();
		String popHandlr=it.next().toString();
		while (!popHandlr.contains(par)) {
			d.switchTo().window(popHandlr);
			Thread.sleep(4000);
			d.close();
		}
		
		
		
		
		
		
	}
	
	
	
	
	
}
