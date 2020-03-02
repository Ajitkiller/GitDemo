package Progreme1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class Tc5 {

	public static void main(String[] args)
	{
		
		//open browser and browse the bing link
		ProfilesIni pf=new ProfilesIni();
		FirefoxProfile fp=pf.getProfile("Ak007");
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.bing.com/");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		int count=0;
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++) 
		{
			System.out.println(links.get(i).isDisplayed());
			count++;
		}
		System.out.println("No of total links  :"+links.size());
		System.out.println("No of visible links  :"+count);
		System.out.println("No of hidden links  :"+(links.size()-count));
		
		
		
	}

}
