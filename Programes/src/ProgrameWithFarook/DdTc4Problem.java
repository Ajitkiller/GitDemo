package ProgrameWithFarook;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DdTc4Problem {

	public static void main(String[] args) {
		FirefoxDriver d=new FirefoxDriver();
		
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://www.mercurytravels.co.in/");
		List<WebElement>rop=d.findElements(By.tagName("Select"));
		System.out.println(rop.size());
		
		for (int i = 0; i < rop.size(); i++) {
			List<WebElement>op=rop.get(i).findElements(By.tagName("Option"));
			System.out.println("pass");
			String text=op.get(i).getAttribute("name");
			System.out.println("pass3");
			System.out.println(text);
		}
	}

}
