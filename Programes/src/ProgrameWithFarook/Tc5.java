package ProgrameWithFarook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tc5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Open firefox browser
		FirefoxDriver d=new FirefoxDriver();
				//Navigate to mercury travels
		
		d.get("http://www.bing.com");
		
		List<WebElement>links=d.findElements(By.tagName("a"));
				
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++) {
			
			links.get(i).getText();
			
		}
				
	}

}
