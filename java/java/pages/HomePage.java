package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseClass.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod{
	
	public HomePage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}

	public HomePage VerifyPageTitle()
	{
		System.out.println(driver.getTitle());
		
		return this;
	}
	public LeadsPage ClickLead()
	{
		driver.findElement(By.linkText("Leads")).click();
		
		return new LeadsPage(driver);
	}
	
}
