package salesforceOpportunity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateNewOpportunity {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		"Test Steps:
//		1. Login to https://login.salesforce.com
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\compatable Chrome Driver Version.exe");
		//WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
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
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//button[text()='View All']"))));
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
//		// click on the compose button as soon as the "compose" button is visible
//		driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
		
		
//		4. Click on Opportunity tab 
		WebElement Opportunity = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();",Opportunity);
//		5. Click on New button
		driver.findElement(By.xpath("//div[text()='New']")).click();
//		6. Enter Opportunity name as 'Salesforce Automation by *Your Name*,Get the text and Store it 
		//(//input[@class='slds-input'])[4]
		driver.findElement(By.xpath("(//input[@class='slds-input'])[4]")).sendKeys("Salesforce Automation by Selva");
		Thread.sleep(2000);
		String name =driver.findElement(By.xpath("(//input[@class='slds-input'])[4]")).getText();
		System.out.println(name);
		Thread.sleep(2000);
//		7. Choose close date as Today
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("11/11/2022");
		//driver.findElement(By.name("CloseDate")).sendKeys("11/11/2022");
//		8. Select 'Stage' as Need Analysi
		//driver.findElement(By.xpath("//button[contains(@class,'slds-combobox__input slds-input_faux')]")).click();
	//	driver.findElement(By.xpath("//div[@role='none']//button")).click();
		//driver.findElement(By.xpath("//button[contains(@class,'slds-combobox__input slds-input_faux')]")).click();
		//(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[1]
		driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Needs Analysis']")).click();
//		WebElement Stage = driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value']"));
//		driver.executeScript("arguments[0].click();",Stage );
//		WebElement NeedsAnalysis = driver.findElement(By.xpath("//span[text()='Needs Analysis']"));
//		driver.executeScript("arguments[0].click();",NeedsAnalysis );
		//driver.findElement(By.xpath("//div[@class=\"slds-listbox slds-listbox_vertical slds-dropdown slds-dropdown_fluid slds-dropdown_left\"]")).click();
//		WebElement Stage1 = driver.findElement(By.xpath("//div[@class=\"slds-listbox slds-listbox_vertical slds-dropdown slds-dropdown_fluid slds-dropdown_left\"]"));
//		driver.executeScript("arguments[0].click();", Stage1);
//		9. click Save and VerifyOppurtunity Name"
		driver.findElement(By.name("SaveEdit")).click();
		
	   String text = driver.findElement(By.xpath("//span[contains(@class,'toastMessage slds-text-heading--small')]")).getText();
		
		if (text.contains("Selva"))
		{
			System.out.println("Opportunity Created");
		}
		else
		{
			System.out.println("Opportunity not Created");
		}


	}

}
