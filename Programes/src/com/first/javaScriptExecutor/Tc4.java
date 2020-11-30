package com.first.javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.lowagie.text.Document;

public class Tc4 {
WebDriver d;
JavascriptExecutor js=(JavascriptExecutor)d;
@BeforeTest
public void openBeer(){
	d=new FirefoxDriver();
	d.get("http://www.facebook.com/");
	
}
@Test
public void logIn(){
js.executeScript("download.getElementById('Email').value='Kajit2759@gmail.com'");
System.out.println("E-mail Id entered successfully");
js.executeScript("download.getElementById('Password').value='12345785'");
System.out.println("Password enter successfully");
js.executeScript("document.getElementById('u_0_b').click()");
System.out.println("Login successfully"); 
}

}
