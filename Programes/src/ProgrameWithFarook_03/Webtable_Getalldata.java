package ProgrameWithFarook_03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Webtable_Getalldata {
	WebDriver d;
	@BeforeTest
	public void startBrowser(){
	
	WebElement con=d.findElement(By.xpath(""));
	System.out.println(con);
	List<WebElement> rows=con.findElements(By.xpath(" "));
	List<WebElement> cols=con.findElements(By.xpath(" "));
	System.out.println(rows+"   "+cols);
	String row1=con.findElement(By.xpath(" ")).getText();
	for (int i = 0; i < rows.size(); i++) {
		for (int j = 0; j < cols.size(); j++) {
			d.findElement(By.xpath("/html/div[1]/div[6]/section[1]/div/section/div[1]div/table/tbody/tr["+i+"]/td["+j+"]"));
		}
	}
	}
	@AfterTest
	public void close(){
		d.close();
	
	}
}
