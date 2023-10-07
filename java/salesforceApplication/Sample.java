package salesforceApplication;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
	
		WebDriverManager.edgedriver().setup();
	
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
	    ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/ ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys("ramkumar.ramaiah@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Password#123");
		driver.findElement(By.id("Login")).click();
		
		
		driver.findElement(By.className("slds-r6")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='search'])[3]")).sendKeys("Individuals",Keys.ENTER);
		driver.findElement(By.xpath("//mark[text()='Individuals']")).click();

	}}
