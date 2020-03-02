package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngEx1 {

	@BeforeTest
	public void openBrowser(){
		System.out.println("Open browser successfully and navigate to site");
	}
	@AfterTest
	public void closeapp(){
		System.out.println("Close application successfully");
	}
	
	@Test(priority=0)
	public void register(){
		System.out.println("Register successful");
	}
	@Test(priority=1)
	public void login(){
		System.out.println("Login successfully welcome Admin page");
	}
	@Test(priority=3)
	public void sending(){
		System.out.println("Report send to Team Lead");
	}
	@Test(priority=2)
	public void logout(){
		System.out.println("Logout successfully");
	}
}
