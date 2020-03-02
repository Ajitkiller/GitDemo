package com.modular.driven;

import org.testng.annotations.Test;

public class Tc1OrgHrm {
	ReusuableMethods rdx;
	
	@Test
	public void OrghrmTc1(){
		rdx= new ReusuableMethods();
		rdx.openBrowser();
		rdx.navigateTo("https://opensource-demo.orangehrmlive.com/");
		rdx.login("Admin", "admin123");
		rdx.verifyLogin();
		rdx.Logout();
		rdx.close();
	}
	
	
	
}
