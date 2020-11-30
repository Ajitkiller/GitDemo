package ProgrameWithFarook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Text_Tc2 {

	public static void main(String[] args) {
	
		FirefoxDriver d=new FirefoxDriver();
		d.get("https://www.mercurytravels.co.in/");
		
		List<WebElement>btext=d.findElements(By.tagName("b"));
		for (int i = 0; i < btext.size(); i++) {
			System.out.println(btext.get(i).getText());
		}
		
		
		
		
	}

}
