package ProgrameWithFarook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DdTc6 {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("https://www.mercurytravels.co.in/");
		
		WebElement drop=d.findElement(By.id("themes"));
		
		List<WebElement>chkword=drop.findElements(By.tagName("option"));
		
		int count=0;
		for (int i = 0; i < chkword.size(); i++) {
			
			if (chkword.get(i).getText().equals("Family")) {
				System.out.println("pass");
				count++;
			}
			
			
		}
		System.out.println(count);
		
		
	}

}
