package ProgWithFarook_02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox_Tc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://www.spicejet.com/");
		
		List<WebElement> chkbox=d.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(chkbox.size());
		
		for (int i = 0; i < chkbox.size(); i++) {
			if (chkbox.get(i).isSelected()) {
				System.out.println(chkbox.get(i).getText()+"is Selected ");
			}
			else {
				System.out.println(chkbox.get(i).getText()+"is not Selected");
			}
		}
		
		
		
	}

}
