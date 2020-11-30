package ProgrameWithFarook_05;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleWindow_Tc1 {

	WebDriver d;
	@BeforeTest
	public void start(){
		d=new FirefoxDriver();
		d.get("http://worldworst.com/");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.findElement(By.linkText("Apply for credit card"));
		
	}
	@Test
	public void multipleTc() throws InterruptedException{
		String par=d.getWindowHandle();
		Set<String>pop=d.getWindowHandles();
		Iterator<String>it=pop.iterator();
		String pophlr=it.next().toString();
		while (!pophlr.contains(par)) {
			d.switchTo().window(pophlr);
			Thread.sleep(3000);
			d.findElement(By.xpath(" "));
		}
	}
	
	
	
	
}
