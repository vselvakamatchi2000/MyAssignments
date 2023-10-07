package learnDataIntegration;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ClassRoom1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook book=new XSSFWorkbook("./Project/SampleBook.xlsx");
		XSSFSheet sheet = book.getSheetAt(0);
		XSSFRow row = sheet.getRow(2);
		XSSFCell cell = row.getCell(1);
		String stringCellValue = cell.getStringCellValue();
		System.out.println("Excel value of second row and first column " +stringCellValue);

	}

}
