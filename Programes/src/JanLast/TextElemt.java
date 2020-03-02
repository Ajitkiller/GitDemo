package JanLast;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextElemt {

	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.mercurytravels.co.in/");

		
		List<WebElement>Normal=driver.findElements(By.tagName("p"));
		System.out.println("Normal text no. is :"+Normal.size());
		for (int i = 0; i < Normal.size(); i++) {
			
		
		System.out.println("Normal text name are :"+Normal.get(i).getText());
		}
		List<WebElement>Bold=driver.findElements(By.tagName("b"));
		System.out.println("Bold text no. is :"+Bold.size());
		
		for (int j = 0; j < Bold.size(); j++) {
			System.out.println("Bold text name are :"+Bold.get(j).getText());
			
		}
		
		
		
		
		
		
		
		
	}

}
