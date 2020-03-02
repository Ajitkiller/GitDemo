package Progreme1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class Tc4 {

	public static void main(String[] args) {
		
		ProfilesIni pf=new ProfilesIni();
		FirefoxProfile fp=pf.getProfile("Ak007");
			
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.bing.com/");
			
			List<WebElement>header=driver.findElements(By.id("hdr"));
			System.out.println("no of links are :"+" "+header.size());
			
		
		
		
		
		
		
	}

}
