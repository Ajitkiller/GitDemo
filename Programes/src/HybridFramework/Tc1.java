package HybridFramework;

import java.io.IOException;

import org.testng.annotations.Test;


public class Tc1 {

	CombineMethods cmd;
	@Test
	public void modularDF() throws InterruptedException, IOException{
		cmd=new CombineMethods();
		cmd.openBrowser();
		cmd.login();
	}
	/*	@Test
		public void DataDriven() throws InterruptedException{
		cmd.DataloginAgain("Admin", "admin123");
		cmd.status();
		cmd.addUser();
		cmd.Logout();
		cmd.close();
	}*/
	
	
}
