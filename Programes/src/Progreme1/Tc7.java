package Progreme1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class Tc7 {

	public static void main(String[] args) 
	{
		//open browser and browse the bing link
				ProfilesIni pf=new ProfilesIni();
				FirefoxProfile fp=pf.getProfile("Ak007");
				
				FirefoxDriver driver=new FirefoxDriver();
				driver.get("https://www.bing.com/");
				List<WebElement>links=driver.findElements(By.tagName("a"));
				
				for (int i = 0; i < links.size(); i++) 
				{
					if (links.get(i).isDisplayed())
					{
					   String lname=links.get(i).getText();
					   links.get(i).click();
					 //  String url=links.get(i).get
					 //  System.out.println(lname+" "+url);
					   driver.navigate().back();
					   links=driver.findElements(By.tagName("a"));
					}
				}
		
		
		
		
		
		
	}

}
