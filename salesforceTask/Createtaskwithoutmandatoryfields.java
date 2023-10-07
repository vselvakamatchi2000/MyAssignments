package salesforceTask;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createtaskwithoutmandatoryfields {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver= new ChromeDriver(options);
//		1. Login to https://login.salesforce.com
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		2. Login with the credentials		
		driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Password#123");
//		3. Click Login
		driver.findElement(By.id("Login")).click();
//		4) Click on toggle menu button from the left corner
		driver.findElement(By.className("slds-r5")).click();
		Thread.sleep(2000);
//		5) Click view All and click Sales from App Launcher
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
//		6) Click ontask and click New Task
		WebElement Tasks = driver.findElement(By.xpath("//a[@title='Tasks']"));
		driver.executeScript("arguments[0].click();",Tasks );
		Thread.sleep(6000);
		WebElement Splitview = driver.findElement(By.xpath("//div[@title='Display as Split View']//button[1]"));
		driver.executeScript("arguments[0].click();",Splitview );
		WebElement Table = driver.findElement(By.xpath("//li[@title='Table']//a[1]"));
		driver.executeScript("arguments[0].click();",Table );
		driver.findElement(By.xpath("//div[@title='New Task']")).click();
//		7) Select Name from Dropdown
		driver.findElement(By.xpath("(//a[contains(@class,'entityMenuTrigger slds-button')])[2]")).click();
		driver.findElement(By.xpath("(//a[@title='Leads'])[2]")).click();
//		8) Enter Coments as SALES FORCE Automation Using Selenium
		driver.findElement(By.xpath("//textarea[contains(@class,'textarea textarea')]")).sendKeys("SALES FORCE Automation");
//		9) Click on Save 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@title='Save']")).click();
//		10) Get the text of Error message Displayed and Verify the message
		String Text = driver.findElement(By.xpath("//div[text()='Complete this field.']")).getText();
	
		if (Text.contains("Complete"))
		{
			System.out.println("Complete the field warning displayed");
		}
		else
		{
			System.out.println("No warning");
		}
		String Text1 = driver.findElement(By.xpath("//li[text()='These required fields must be completed: Subject']")).getText();
		if (Text1.contains("required fields must be completed"))
		{
			System.out.println("Error message dispayed");

		}
		else
		{
			System.out.println("Error message not dispayed");
		}
		










		
		
		
	}

}
