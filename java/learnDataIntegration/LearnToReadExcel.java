package learnDataIntegration;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnToReadExcel {

	public static void main(String[] args) throws IOException {
		//Step:1 --->Created the excelsheet
		//Step:2 --> copy the Excel into the project under folder
		//Step:3---> set the path to read the required Excel File
		XSSFWorkbook book=new XSSFWorkbook("");
		//("./data/sampleData.xlsx")
		//Step:4-->Read the required sheet from the workbook
		XSSFSheet sheet = book.getSheet("");//book.getsheetAt(index);
		//Step:5 Get into the row
		XSSFRow row = sheet.getRow(0);
		//step:6 Get into the column
		XSSFCell cell = row.getCell(0);//0,0
		//step:7 Read the value
		String stringCellValue = cell.getStringCellValue();
		System.out.println("Reading the Excel Value from first row and first column [0,0]"+stringCellValue);
		
		//To read all the values from the Excel sheet
		
		//[0.0],[0,1]
		//[1.0],[1,1]
		//[2.0],[1,2]
		//Step:8--> Get the row count
		int rowCount = sheet.getLastRowNum();
		//it won't disply first row it will consider as header
		//Step:9 ---> to get the column count from single row
		
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println(physicalNumberOfRows);
		short ColCount = row.getLastCellNum();
		
		System.out.println("Row count :"+rowCount+" and column count "+ColCount);
		
		for(int i=0;i<=rowCount;i++)//row iteration
		{
			for(int j=0;j<ColCount;j++)//column iteration
			{
				String allvalues = sheet.getRow(i).getCell(j).getStringCellValue();
				//get
			}
		}
	}
}
