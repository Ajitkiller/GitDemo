package JanLast;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.support.ui.Select;


public class Dropdown {

	public static void main(String[] args) {
		
		//Open browser navigate to mercury travelers .
		//2)slect any one values from dropdown.
		ProfilesIni pf=new ProfilesIni();
		FirefoxProfile fp=pf.getProfile("Ak007");
		
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.mercurytravels.co.in/");
		
	//	Way-1
		WebElement Dropdown=driver.findElement(By.id("themes"));
		Dropdown.sendKeys("Family");
		
	//	Way-2
	/*	we Dropdowns=new Select(driver.findElement(By.id("themes")));
		Dropdowns.selectByVisibleText("Family");
		Dropdowns.selectByIndex(4);
		*/
	}

}
