package apachepoi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeexcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub


		File src = new File("C:\\Users\\DELL\\Desktop\\sel work\\pom.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		String data0 = 	sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("data from excel sheet is " + data0);
		
		 sheet1.getRow(0).createCell(2).setCellValue("fail");
		FileOutputStream fout = new FileOutputStream(src);
		wb.write(fout);
		System.out.println(fout);
		wb.close();
			}
	}


