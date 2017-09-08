import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReader {

	public static void main(String[] args) throws IOException{
		
		FileInputStream fis = new FileInputStream("D:\\test.xlsx");
		
		XSSFWorkbook wbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = wbook.getSheetAt(0);
		
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = row.getCell(0);
		
		System.out.println(cell);
		
		
		
		

	}

}
