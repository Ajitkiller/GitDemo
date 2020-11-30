package ProgrameWithFarook;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Text_Tc3_CheckText {

	public static void main(String[] args) {
		
				//Open browser
				FirefoxDriver d=new FirefoxDriver();
				//Navigate to flipkart.com
				d.get("https://www.mercurytravel.com/");
				
				WebElement exp=d.findElement(By.xpath(""));
				String text=exp.getTagName();
				
				if (text.equals("b")) {
					System.out.println("its bold");
				}
				else {
					System.out.println("its normal");
				}
				
	}

}
