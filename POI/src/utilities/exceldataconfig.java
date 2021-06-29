package utilities;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceldataconfig {

	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	public exceldataconfig(String excelpath) throws Exception
	{
		
		File src = new File(excelpath);
		FileInputStream fis = new FileInputStream(src);
		 wb = new XSSFWorkbook(fis);
		 
		
		
	} 
	
	public String getData(int sheetNumber, int row, int column)
	{
		 sheet1 = wb.getSheetAt(sheetNumber);
		String data = sheet1.getRow(row).getCell(column).getStringCellValue();
		return data;
		
	}
	
	public int getRowcount (int sheetIndex )
	{
		int row = wb.getSheetAt(sheetIndex).getLastRowNum();
		
		row = row + 1;
		return row;
	}
}
