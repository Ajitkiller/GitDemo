package HybridFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.testing.DDFramework.OrangeHRMTc1;

import atu.testrecorder.exceptions.ATUTestRecorderException;

public class Datadriven {
	WebDriver driver;
	FileInputStream fso;
	FileOutputStream fo;
	XSSFWorkbook wb;
	XSSFSheet wsh;
	OrangeHRMTc1 module;
	
	@Test
	public void data() throws InterruptedException, ATUTestRecorderException, IOException{
		module=new OrangeHRMTc1();
		module.openBrowser();
		module.operation();
	}
}
