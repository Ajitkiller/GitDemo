package ProgrameWithFarook_06;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class Barcode_tc2 {

	WebDriver d;
	@BeforeTest
	public void openBrow(){
		d=new FirefoxDriver();
		d.get("");
		}
	@Test
	public void regression() throws NotFoundException, IOException{
		String pic1=d.findElement(By.xpath("//*[attribute='']")).getAttribute("src");
		URL ub=new URL(pic1);
		BufferedImage bio=ImageIO.read(ub);
		LuminanceSource ls=new BufferedImageLuminanceSource(bio);
		BinaryBitmap bit=new BinaryBitmap(new HybridBinarizer(ls));
		Result rs=new MultiFormatReader().decode(bit);
		System.out.println("name of bar code is :"+rs.getText());
	}
	
	
	
	
	
}
