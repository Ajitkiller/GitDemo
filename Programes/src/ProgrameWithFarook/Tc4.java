package ProgrameWithFarook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tc4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Open firefox browser
		FirefoxDriver d=new FirefoxDriver();
		//Navigate to mercury travels
		d.get("http://www.bing.com");
				
		WebElement hdr=d.findElement(By.id("hdr"));
		
		List<WebElement>header=hdr.findElements(By.tagName("a"));
		
		System.out.println(header.size());
		
		for (int i = 0; i < header.size(); i++) {
			
			System.out.println(header.get(i).getText());
		}
		
		
	}

}
