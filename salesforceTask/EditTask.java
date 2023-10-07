package salesforceTask;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditTask{

	public static void main(String[] args) throws InterruptedException {
//		"Test Steps:
		WebDriverManager.chromedriver().setup();
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver= new ChromeDriver(options);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
//		1. Login to https://login.salesforce.com
		driver.findElement(By.name("username")).sendKeys("ramkumar.ramaiah@testleaf.com");
		driver.findElement(By.name("pw")).sendKeys("Password#123");
		driver.findElement(By.name("Login")).click();
//		2. Click on toggle menu button from the left corner
		//driver.findElement(By.className("slds-icon-waffle")).click();
		driver.findElement(By.xpath("//div[@class='appLauncher slds-context-bar__icon-action']//button[1]")).click();
		
//		3. Click view All and click Sales from App Launcher
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		
//		4. Click on Opportunity tab 
		WebElement opportunities = driver.findElement(By.xpath("//a[@title='Opportunities']"));
		driver.executeScript("arguments[0].click();",opportunities);
//		5. Click on New button
		driver.findElement(By.partialLinkText("New")).click();		
//		6. Choose Close date as Tomorrow Date
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("10/13/2022");
		//driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("10/13/2022",Keys.ENTER);
//		7. Click on save
		driver.findElement(By.xpath("//button[text()='Save']")).click();
//		8. Verify the Alert message (Complete this field) displayed for Name and Stage
		String text = driver.findElement(By.xpath("//div[text()='Complete this field.']")).getText();
		if (text.contains("Complete"))
		{
			System.out.println("Alert message displayed");
		}
		else
		{
			System.out.println("Alert message not displayed");
		}
	}
}
