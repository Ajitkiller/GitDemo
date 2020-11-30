package ProgWithFarook_02;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox_Tc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirefoxDriver d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		d.get("https://www.spicejet.com/");
		
		List<WebElement> chkbox=d.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(chkbox.size());
		
		
		
		
		
		
		
		
	}

}
