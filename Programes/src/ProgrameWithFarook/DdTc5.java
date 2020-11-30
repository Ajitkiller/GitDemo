package ProgrameWithFarook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DdTc5 {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("https://www.mercurytravels.co.in/");
		
		WebElement drop=d.findElement(By.id("themes"));
		
		List<WebElement>op=drop.findElements(By.tagName("option"));
		String Expt="Family";
		
		for (int i = 0; i < op.size(); i++) {
			String Act=op.get(i).getText();
			if (Act.equals(Expt)) {
				System.out.println("Pass");
			}
			System.out.println("Fail");
		}
		
		
		
	}

}
