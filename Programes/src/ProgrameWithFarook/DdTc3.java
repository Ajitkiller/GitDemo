package ProgrameWithFarook;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DdTc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver d=new FirefoxDriver();
		
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://www.mercurytravels.co.in/");
		
		
		
		List<WebElement>dp=d.findElements(By.tagName("Select"));
		System.out.println("Pass");
		System.out.println(dp.size());
		for (int i = 0; i < dp.size(); i++) {
			String name=dp.get(i).getAttribute("name");
			System.out.println(name);
		}
	}

}
