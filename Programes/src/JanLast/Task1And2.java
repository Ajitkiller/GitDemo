package JanLast;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task1And2 {

	public static void main(String[] args) {
	
		FirefoxDriver driver=new FirefoxDriver();
		//driver.get("https://www.google.com/");
		
	/*	List<WebElement> link=driver.findElements(By.tagName("a"));
		System.out.println(link.size());
		
		for (int i = 0; i < link.size(); i++) {
			System.out.println(link.get(i).getText());
		}*/
		
		driver.get("https://www.bing.com/");
		List<WebElement> link=driver.findElements(By.tagName("a"));
		System.out.println(link.size());
		
		/*for (int i = 0; i < link.size(); i++) {
			if (link.get(i).isDisplayed()) {
				String lname=links.get(i).getText();
				links.get(i).click();
				String url=lname.get(i).getCurrentUrl();
				System.out.println(lname+" "+url);
				driver.navigate().back();
				links=driver.findElements(By.tagName("a"));
				}*/
		}
		
		
		
	}

//}
