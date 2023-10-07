package salesforceTask;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteTask {

	public static void main(String[] args) throws InterruptedException {
//		"Test Steps:
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
//		4. Click on toggle menu button from the left corner
		driver.findElement(By.className("slds-r5")).click();
//		5. Click view All and click Sales from App Launcher
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
//		6. Click on Tasks tab 
		WebElement Tasks = driver.findElement(By.xpath("//a[@title='Tasks']"));
		driver.executeScript("arguments[0].click();",Tasks);
//		7.Click on Dropdown icon available under tasks and select value as Recently viewed
		WebElement Splitview = driver.findElement(By.xpath("//div[@title='Display as Split View']//button[1]"));
		driver.executeScript("arguments[0].click();",Splitview );
		WebElement Table = driver.findElement(By.xpath("//li[@title='Table']//a[1]"));
		driver.executeScript("arguments[0].click();",Table );
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@title='Select a List View']")).click();
		driver.findElement(By.xpath("//span[contains(@class,'slds-text-color_weak slds-text-body_small')]")).click();
//		8. Click the Dropdown for Bootcamp task and select Delete
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(@class,'slds-button slds-button--icon-x-small')])[2]")).click();
		driver.findElement(By.xpath("//a[@title='Delete']")).click();
		driver.findElement(By.xpath("//button[@title='Delete']")).click();
//		//driver.findElement(By.xpath("//a[@title='Delete']")).click();
//		WebElement Delete = driver.findElement(By.xpath("//a[@title='Delete']"));
//		driver.executeScript("arguments[0].click();",Delete );
		//driver.findElement(By.xpath("//button[@title='Delete']//span[1]")).click();
		
//		9. Verfiy the Task is Deleted "
		//String Text = driver.findElement(By.xpath("//div[text()='Are you sure you want to delete this task?']")).getText();
		//String Text = driver.findElement(By.xpath("//span[contains(@class,'toastMessage slds-text-heading--small')]")).getText();
		String Text = driver.findElement(By.xpath("//div[text()='Are you sure you want to delete this task?']")).getText();
		if(Text.contains("delete"))
		{
			System.out.println("Task deleted successfully");
		}
		else
		{
			System.out.println("Not deleted");
		}


	}

}
