package AtuTestRecorder;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
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

public class BarCode {
	
	WebDriver driver;
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("https://barcode.tec-it.com/en/?data=killer%20is%20back");
	}
	@Test 
	public void barCode() throws IOException, NotFoundException {
		String imgurl=driver.findElement(By.xpath("//html//body//div[2]//div[3]//form//div[7]//div[1]//img")).getAttribute("src");
		URL url=new URL(imgurl);
		BufferedImage bimg=ImageIO.read(url);
		LuminanceSource isource=new BufferedImageLuminanceSource(bimg);
		BinaryBitmap bmap=new BinaryBitmap(new HybridBinarizer(isource));
		Result rs= new MultiFormatReader().decode(bmap);
		System.out.println("Bar code is "+" "+rs.getText());
		
		
	}
	
	
	
	
	
}
