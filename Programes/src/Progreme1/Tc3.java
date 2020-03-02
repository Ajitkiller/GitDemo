package Progreme1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class Tc3 {

	public static void main(String[] args)
	{
		
		ProfilesIni pf=new ProfilesIni();
		FirefoxProfile fp=pf.getProfile("Ak007");
			
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.mercurytravels.co.in/");
			
			List<WebElement>links=driver.findElements(By.tagName("a"));
			System.out.println("no of links are :"+" "+links.size());
			
			for (int i = 0; i < links.size(); i++) 
			{
				System.out.println(links.get(i).getText());
			}
			
		
		
		
		
		
		

	}

}
