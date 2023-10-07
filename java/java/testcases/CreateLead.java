package testcases;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseClass.ProjectSpecificMethod;
import pages.LoginPage;

public class CreateLead extends ProjectSpecificMethod{
	
//	public CreateLead(RemoteWebDriver driver)
//	{
//		this.driver=driver;
//	}
//	
	@BeforeTest
	public void setfileName() {
		filename="Credentials";
	}
	
	
	@Test(dataProvider="testData")
	public void runCreateLead(String uname,String pwd)
	{
		new LoginPage(driver).enterUsername(uname).enterPassword(pwd).clickLogin().Clickcrmsfa().VerifyPageTitle();
	}
	

}
