package ProgrameWithFarook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DdTc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirefoxDriver d=new FirefoxDriver();
		
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://www.mercurytravels.co.in/");
		
		
		
		d.findElement(By.id("themes"));
		System.out.println("Pass");
		
		Select s1=new Select(d.findElement(By.id("Themes")));
		s1.selectByIndex(4);
		
		
		
		
		
	}

}
