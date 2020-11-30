package DataDriven_TestCase;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Tc1 {

	@Test
	public void maching() throws IOException{
		FileInputStream fis=new FileInputStream("C:\\Users\\USER\\Desktop\\fprac.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sht=wb.getSheet("Sheet1");
		int r=sht.getLastRowNum();
		
	
		for (int i = 0; i <=r; i++) {
				String col1=sht.getRow(i).getCell(0).getStringCellValue();
				String col2=sht.getRow(i).getCell(1).getStringCellValue();
				
				
				if (col1.equals(col2)) {
				sht.getRow(i).createCell(2).setCellValue("pass");
			
				}
				else {
				sht.getRow(i).createCell(2).setCellValue("fail");
			
				}}
		FileOutputStream fos=new FileOutputStream("C:\\Users\\USER\\Desktop\\fprac.xlsx");
				wb.write(fos);
	}
}
