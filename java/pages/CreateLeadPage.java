package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseClass.ProjectSpecificMethod;

public class CreateLeadPage extends ProjectSpecificMethod{
	
	public CreateLeadPage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	public CreateLeadPage enterCompanyname(String cname)
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		return this;
	}
	public CreateLeadPage enterfirstname(String fname)
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		
		return this;
	}
	public CreateLeadPage enterlastname(String lname)
	{
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		return this;
	}
	public CreateLeadPage clickCreate()
	{
		driver.findElement(By.name("submitButton")).click();
		return this;
	}

}
