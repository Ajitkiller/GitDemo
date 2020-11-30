package ProgrameWithFarook;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DdTc7 {

	public static void main(String[] args) throws InterruptedException {
		

		FirefoxDriver d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		d.get("https://www.mercurytravels.co.in/");
		
		WebElement drop=d.findElement(By.id("themes"));
		
		List<WebElement>opref=drop.findElements(By.tagName("option"));
		for (int i = 0; i < opref.size(); i++) {
			
			if (opref.get(i).isDisplayed()) {
				Thread.sleep(3000);
				System.out.println(opref.get(i).getText()+" Is displayed");
			}
			else
				System.out.println("this is not displayed");
		}
		
		
	}

}
