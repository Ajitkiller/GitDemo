package JanLast;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tc5Drop {

	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.mercurytravels.co.in/");
	//way-1	
	/*	WebElement Dropdown=driver.findElement(By.id("themes"));
		List<WebElement>Word=Dropdown.findElements(By.tagName("option"));
		for (int i = 0; i < Word.size(); i++) {
			if (Word.get(i).getText().equals("Family")) {
				System.out.println("pass");
			}
			else
				System.out.println("fail");
		}*/
		
		//way-2
		WebElement Dropdown=driver.findElement(By.id("themes"));
		List<WebElement>Word=Dropdown.findElements(By.tagName("option"));
		String Expected="Family";
		for (int i = 0; i < Word.size(); i++) {
			String Actually=Word.get(i).getText();
			if (Actually.equals(Expected)) {
				System.out.println("Pass");
			}
		}
		
		

	}

}
