package testcase;




import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class CreateLead extends CommonClass{
	
	
    @Test(dataProvider="testData")//(name=fetchdata)
	public void runcreate(String cname,String fname,String lname) {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		driver.findElement(By.name("submitButton")).click();
		
}
    @DataProvider//(name=fetchdata)
    public String[][] testData()
    {
    	//to hold the data in format of rows and columns
    	String[][] data=new String[2][3];
    	
    	data[0][0]="Testleaf";
    	data[0][1]="Hari";
    	data[0][2]="R";
    	
    	data[1][0]="Wipro";
    	data[1][1]="Venila";
    	data[1][2]="R";
    	
    	
    	return data;
    }
}






