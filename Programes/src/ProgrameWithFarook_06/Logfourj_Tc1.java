package ProgrameWithFarook_06;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Logfourj_Tc1 {
	private static Logger log=Logger.getLogger(Logfourj_Tc1.class);

	WebDriver d;
	@BeforeTest
	public void open(){
	DOMConfigurator.configure("log4j.xml");
	d=new FirefoxDriver();
	log.info("OPEN BROWSER");
	d.get("http://google.com/");
	log.info("successfully google opened");
	}
	@Test
	public void acyion() throws InterruptedException{
		WebElement a1=d.findElement(By.linkText("Gmail"));
		a1.click();
		log.info("Gmail click successfully");
		d.navigate().back();
		Thread.sleep(4000);
		Actions a2=new Actions(d);
		log.info("action class created");
		a2.contextClick(a1).build().perform();
			log.info("right click perform");
			
	}
	
}
