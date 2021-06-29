package apachepoi;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File src = new File("C:\\Users\\DELL\\Desktop\\sel work\\pom.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		int rowcount = sheet1.getLastRowNum();
		System.out.println("total row is " + rowcount);
		
		for (int i =0; i<rowcount;i++)
		{ 
			
	String data0 = 	sheet1.getRow(i).getCell(0).getStringCellValue();
	System.out.println("data from excel sheet is " + data0);
		}
	wb.close();
	
	}
}




