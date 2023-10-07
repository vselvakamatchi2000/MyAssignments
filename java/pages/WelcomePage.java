package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseClass.ProjectSpecificMethod;

public class WelcomePage extends ProjectSpecificMethod{
	
	public WelcomePage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	
	public HomePage Clickcrmsfa()
	{
		driver.findElement(By.linkText("CRM/SFA")).click();
		System.out.println(driver.getTitle());
		
		return new HomePage(driver);
	}
	
	public LoginPage clickLogout()
	{
		driver.findElement(By.tagName("input")).click();
		System.out.println(driver.getTitle());
		return new LoginPage(driver);
	}
	

}

