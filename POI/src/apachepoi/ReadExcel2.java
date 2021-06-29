package apachepoi;

import utilities.exceldataconfig;

public class ReadExcel2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		exceldataconfig excel = new exceldataconfig("C:\\\\Users\\\\DELL\\\\Desktop\\\\sel work\\\\pom.xlsx");
		
		System.out.println(excel.getData(0, 0, 0));
	}

}
