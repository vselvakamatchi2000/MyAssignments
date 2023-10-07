package learnDataIntegration;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends CommonClass{
	
		
		@BeforeTest
		public void setfileName() {
			filename="Createlead";
		}
		
		

		@Test(dataProvider = "testData") // (dataProvider="fetchData")
		public void runCreate(String cname, String fname, String lname) {
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
			driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
			driver.findElement(By.name("submitButton")).click();

		}
//		@DataProvider // (name="fetchData") 
//		public String[][] testData() throws IOException 
//		
//		{ //String[][] readData = ReadExcelFile.readData(); 
//			String[][] readData = ReadExcelFile.readData(filename);
//			return readData;
//			
		
		
		}
		 
		/*
		 * @DataProvider // (name="fetchData") public String[][] testData() throws
		 * IOException { String[][] readData = ReadExcelFile.readData(); return
		 * readData;
		 * 
		 * ReadExcelFile obj=new ReadExcelFile(); String[][] readData = obj.readData();
		 * 
		 * }
		 */

		// to hold the data in format of rows and columns
		/*
		 * String[][] data= new String[2][3];
		 * 
		 * data[0][0]="Testleaf"; data[0][1]="Hari"; data[0][2]="R";
		 * 
		 * data[1][0]="Wipro"; data[1][1]="Venila"; data[1][2]="R";
		 */

		// get the data from the Excel class file-->use the data to the testcase

	


