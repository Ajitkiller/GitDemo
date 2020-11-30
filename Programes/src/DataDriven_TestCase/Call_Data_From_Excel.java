package DataDriven_TestCase;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Call_Data_From_Excel {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\USER\\Desktop\\fprac.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sht=wb.getSheet("Sheet1");
		int r=sht.getLastRowNum();
		System.out.println(r);
		
		for (int i = 0; i <r; i++) {
			int col=sht.getRow(i).getLastCellNum();
			
			for (int j = 0; j < col; j++) {
				String d1=sht.getRow(i).getCell(j).getStringCellValue();
				System.out.print(d1+"\t");
			}
			System.out.println();
		}
		
		
		
	}
}
