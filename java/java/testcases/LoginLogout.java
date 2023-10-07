package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseClass.ProjectSpecificMethod;
import pages.LoginPage;

public class LoginLogout extends ProjectSpecificMethod{
	
	
	
	@BeforeTest
	public void setfileName() {
		filename="Credentials";
		testName="LoginLogout";
		testDesc="Functionality of loginpage";
		author="Hari";
		category="Functional";
	}
	
	
	
	
	@Test(dataProvider="testData")
	public void runLoginLogout(String uname,String pwd)
	{
		//LoginPage lp=new LoginPage();
		new LoginPage(driver).enterUsername(uname).enterPassword(pwd).clickLogin().clickLogout();
				
	}

}
	

