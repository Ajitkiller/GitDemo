package JanLast;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.grid.web.Values;

public class Tc7Dropdown {

	public static void main(String[] args) {
		
		//open browser navigate to mercury travels
		//chose one dropdown and check all the values are avilabe or not
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.mercurytravels.co.in/");
		
		WebElement Dropdown=driver.findElement(By.id("themes"));
		List<WebElement>Values=Dropdown.findElements(By.tagName("option"));
		
		for (int i = 0; i < Values.size(); i++) {
			String vname=Values.get(i).getText();
			if (Values.get(i).isDisplayed()) {
				System.out.println(vname+"   is active");
			}
			else
				System.out.println(vname+"   is not active");
		}
		
		
		
		
		
	}

}
