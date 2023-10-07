package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseClass.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod{
	
	
	public LoginPage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	
	public LoginPage enterUsername(String uname)
	{
		driver.findElement(By.id("username")).sendKeys(uname);
		
		return this;
		
	}
	public LoginPage enterPassword(String pwd)
	{
		driver.findElement(By.id("password")).sendKeys(pwd);
		return this;
		
	}
	public WelcomePage clickLogin()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(driver);
		
	}

}
