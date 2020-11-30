package ProgrameWithFarook_04;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Cokistc1 {

	WebDriver d;
	@BeforeTest
	public void openBro(){
		d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("hhtp://www.mirror.co.in");
	}
	@Test
	public void doit(){
		Set<Cookie>cook=d.manage().getCookies();
		System.out.println("Total no of cookies are :"+cook);
		d.manage().deleteAllCookies();
		System.out.println(cook);
	}
	@AfterTest
	public void exit(){
		d.close();
		d.quit();
	}
}
