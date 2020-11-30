package ProgrameWithFarook_03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Webtable_Tc2 {

	WebDriver d;
	@BeforeTest
	public void startBro()
	{
		d=new FirefoxDriver();
		d.get("http://www.worldclock.com/");
	
	}
	
	@Test
	public void count()
	{
		WebElement con=d.findElement(By.xpath(""));
		System.out.println(con);
		List<WebElement>ros=con.findElements(By.tagName("tr"));
		System.out.println("Total no of Rows are :"+ros);
		List<WebElement>col=con.findElements(By.tagName("td"));
		System.out.println("Total no of columns are :"+col);
	
	}
	@AfterTest
	public void close(){
		d.close();
		
	}
	
	
	
	
	
}
