package ProgrameWithFarook;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tc7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		FirefoxDriver d=new FirefoxDriver();
		
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("http://www.bing.com");
		List<WebElement>Links=d.findElements(By.tagName("a"));
		System.out.println("pass 1");
		System.out.println("Total links are :"+Links.size());
		System.out.println("pass 2");
		Thread.sleep(5000);
		for (int i = 3; i <= Links.size(); i++) {
			if (Links.get(i).isDisplayed()) {
				System.out.println("pass 3");
				String name=Links.get(i).getText();
				Links.get(i).click();
				System.out.println("pass 4");
				String url=d.getCurrentUrl();
				System.out.println("pass 5");
				System.out.println(url+"  "+name);
				System.out.println("pass 6");
				Thread.sleep(3000);
				d.navigate().back();
				Thread.sleep(3000);
				Links=d.findElements(By.tagName("a"));
			
			}
			else {
				System.out.println("Not displayed");
			}
			
		}
		
		

	}

}
