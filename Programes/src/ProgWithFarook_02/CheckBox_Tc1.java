package ProgWithFarook_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox_Tc1 {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://www.spicejet.com/");
		
		WebElement chkbox=d.findElement(By.xpath(" "));
		chkbox.click();
		if (chkbox.isSelected()) {
			System.out.println("It is selected");
			
		}
		else {
			System.out.println("It is not selected");
		}
		
		
		
	}

}
