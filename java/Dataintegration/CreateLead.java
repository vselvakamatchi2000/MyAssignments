package Dataintegration;




import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends CommonClass {
	//connect test data to test class
    @Test(dataProvider="testData")//(dataProvider="fetchdata")
	public void runCreateLead(String cname,String fname, String lname) {
		WebDriverManager.chromedriver().setup();
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		driver.findElement(By.name("submitButton")).click();
		
}
    
    @DataProvider//(name="fetchdata")
    public String[][] testData()
    {
    	//two dimensional data (rows and columns)
    	//to hold the data's in the format of rows and columns
    	String[][] data= new String[2][3];//2 sets and 3 datas
    	
    	data[0][0]="Testleaf";
    	data[0][1]="Hari";
    	data[0][2]="R";
    			
    	data[1][0]="Wipro";
    	data[1][1]="venila";
    	data[1][2]="R";
    	
    	return data;
    	
    	
    }
}


//Statictestng



