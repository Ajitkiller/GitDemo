package Progreme1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class ChromeDriver {

	public static void main(String[] args) 
	{
		
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("Ak007");
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		//get title
		
		driver.findElement(By.linkText("Gmail")).click();
		String expected="Gmail";
		String Actual=driver.getTitle();
		if (Actual.contains(expected)) 
		{
			System.out.println("Pass");
		}
		else
			System.out.println("fail");
		
		
		
		
		
	}

}
