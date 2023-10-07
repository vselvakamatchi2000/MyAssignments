package salesforceOpportunity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditOppotunity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		"Test Steps:
//		1. Login to https://login.salesforce.com
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Password#123");
		driver.findElement(By.id("Login")).click();
//		2. Click on toggle menu button from the left corner
		driver.findElement(By.className("slds-icon-waffle")).click();
//		3. Click view All and click Sales from App Launcher
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
//		4. Click on Opportunity tab 
		WebElement opportunities = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();",opportunities);
//		5. Search the Opportunity 'Salesforce Automation by *Your Name*'
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Salesforce Automation by Selva",Keys.ENTER);
		//driver.findElement(By.className("slds-input")).sendKeys("Salesforce Automation by Selva",Keys.ENTER);
		//driver.findElement(By.name("Opportunity-search-input")).sendKeys("Salesforce Automation by Selva",Keys.ENTER);
//		6. Click on the Dropdown icon and Select Edit
		driver.findElement(By.xpath("//a[@title='Show 3 more actions']")).click();
		//driver.findElement(By.xpath("//table[contains(@class,'slds-table forceRecordLayout')]")).click();
//		7. Choose close date as Tomorrow date
//		8. Select 'Stage' as Perception Analysis
//		9. Select Deliver Status as In Progress
//		10. Enter Description as SalesForce
//		11. Click on Save and Verify Stage as Perception Analysis
		driver.findElement(By.xpath("//div[contains(@class,'uiScroller scroller-wrapper')]")).click();
		driver.findElement(By.xpath("//div[contains(@class,'uiScroller scroller-wrapper')]")).click();
		driver.findElement(By.xpath("//div[@data-aura-class='uiScroller']")).click();
		
		
		
		

	}

}
