package ProgrameWithFarook;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tc6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirefoxDriver d=new FirefoxDriver();
		
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("http://www.bing.com");
		List<WebElement>TotalLinks=d.findElements(By.tagName("a"));

		System.out.println("Total no of links are :"+TotalLinks.size());
		int count=0;
		for (int i = 0; i < TotalLinks.size(); i++) {
			
			if (TotalLinks.get(i).isDisplayed()) {
			
			count++;
			}
			
		}
		
		System.out.println("Total no of links are :"+TotalLinks.size());
		System.out.println("No of visible links :"+count);
		
		System.out.println("No of hidden links are :"+(TotalLinks.size()-count));
	}

}
