package JanLast;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tc4Dropdown {

	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.mercurytravels.co.in/");

		List<WebElement>Dropdown=driver.findElements(By.tagName("select"));
		System.out.println("total no. of Dropdown is   :"+" "+Dropdown.size());

		for (int i = 0; i < Dropdown.size(); i++) {
			System.out.println(Dropdown.get(i).getText());
			
		}
		
		
		
		
		
		
	}

}
