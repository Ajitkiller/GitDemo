package ProgrameWithFarook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Open firefox browser
		FirefoxDriver d=new FirefoxDriver();
		//Navigate to mercury travels
		d.get("http://www.mercurytravels.com");
		//take all links of that page into a list 
		List<WebElement> links=d.findElements(By.tagName("a"));
		//Count total no of links
		System.out.println(links.size());
		
		//Use For loop for iteration
		for (int i = 0; i < links.size(); i++) {
			links.get(i).getText();
		}
		
		
		
		
		
	}

}
