package ProgWithFarook_02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Chech_Tc4 {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://www.spicejet.com/");
		List<WebElement> elements=d.findElements(By.tagName("a"));
		System.out.println("Total no of links are :"+elements.size());
		elements=d.findElements(By.tagName("img"));
		System.out.println("Total no of image are :"+elements.size());
		elements=d.findElements(By.xpath("//input[type='radio']"));
		System.out.println("Total no of radio are :"+elements.size());
		elements=d.findElements(By.xpath("//input[type='checkbox']"));
		System.out.println("Total no of checkbox are :"+elements.size());
		elements=d.findElements(By.xpath("//input[type='text']"));
		System.out.println("Total no of text are :"+elements.size());
		elements=d.findElements(By.xpath("//input[type='select']"));
		System.out.println("Total no of Dropdown are :"+elements.size());
		
	/*	Anather method
		List<WebElement> elements=d.findElements(By.tagName("a"));
		elements.addAll(d.findElements(By.tagName("img")));
		elements.addAll(d.findElements(By.tagName("select")));
		elements.addAll(d.findElements(By.tagName("radio")));
		
		System.out.println("Total no of elements are :"+elements.size());
		
		*/
	}

}
