package Log4j;

import org.apache.log4j.xml.DOMConfigurator;
import org.jboss.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrgHrm {
	private static Logger log=Logger.getLogger(OrgHrm.class);
		WebDriver driver;
		
	@BeforeTest
	public void open(){
		DOMConfigurator.configure("log4j.xml");
		driver=new FirefoxDriver();
		log.info("Browser open successfull");
	}
		@Test
		public void test(){
		driver.get("https://opensource-demo.orangehrmlive.com/");
		log.info("OrgHrm page open successfully");
		}
	}
	
	
	









