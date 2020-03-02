package JanLast;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tc6Dropdown {

	public static void main(String[] args) {
	
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.mercurytravels.co.in/");
	
		WebElement Dropdown=driver.findElement(By.id("themes"));
		List<WebElement>Word=Dropdown.findElements(By.tagName("option"));
		int count=0;
		for (int i = 0; i < Word.size(); i++) {
			if (Word.get(i).getText().equals("Family")) {
				count++;
			}
			
		}
		System.out.println(count);
		
		
		
		
		
		
	}

}
