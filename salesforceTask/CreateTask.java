package salesforceTask;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateTask {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		"Test Steps:
//		1. Launch the app
		WebDriverManager.chromedriver().setup();
//		ChromeOptions option = new ChromeOptions();
//	    option.addArguments("--disable-notifications");
//		ChromeDriver driver=new ChromeDriver(option);
		ChromeDriver driver=new ChromeDriver();
//		driver.get("https://www.amazon.in/");
//		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
//		2. Login with the credentials		
		driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Password#123");
//		3. Click Login
		driver.findElement(By.id("Login")).click();
//		4. Click on toggle menu button from the left corner
		driver.findElement(By.className("slds-r5")).click();
		Thread.sleep(2000);
//		5. Click view All and click Sales from App Launcher
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
//		6. Click on Opportunity tab 
		WebElement Opportunities = driver.findElement(By.xpath("//a[@title='Opportunities']"));
		driver.executeScript("arguments[0].click();",Opportunities);
//		7. Click on New button
		driver.findElement(By.className("forceActionLink")).click();		
//		8. Choose Close date as Tomorrow Date
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("9/30/2022");
//		9. Click on save
		driver.findElement(By.xpath("//button[text()='Save']")).click();
	
//		10. Verify the Alert message (Complete this field) displayed for Name and Stage
		String text = driver.findElement(By.xpath("(//div[text()='Complete this field.'])[2]")).getText();
		
		if (text.contains("Complete this field"))
		{
			System.out.println("Alert message displyed");
		}
		else
		{
			System.out.println("Alert message is not displyed");
		}
		

	}

}
