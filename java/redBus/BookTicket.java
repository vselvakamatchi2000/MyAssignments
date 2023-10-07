package redBus;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



import io.github.bonigarcia.wdm.WebDriverManager;

public class BookTicket {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
	    ChromeOptions option = new ChromeOptions();
	    option.addArguments("--disable-notifications");
	    // Launch Firefox / Chrome
	    ChromeDriver driver = new ChromeDriver(option);
		//WebDriverManager.firefoxdriver().setup();
		//FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.findElement(By.id("src")).sendKeys("Chennai");
	    driver.findElement(By.xpath("//li[text()='Chennai']")).click();
	    driver.findElement(By.id("dest")).sendKeys("Bangalore");
	    driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
	    driver.findElement(By.id("onward_cal")).click();
		driver.findElement(By.xpath("//td[text()='8']")).click();
		//driver.findElement(By.xpath("//button[text()='Search Buses']")).click();
		driver.findElement(By.id("search_btn")).click();
		String text = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
	    System.out.println(text);
	    WebElement web = driver.findElement(By.xpath("//label[@for='bt_SLEEPER']"));
	    driver.executeScript("arguments[0].scrollIntoView();", web);
	    web.click();
	    String secondbus = driver.findElement(By.xpath("//div[text()='V2K Travels']")).getText();
	    System.out.println("Name of the second resulting bus : "+secondbus);
	    driver.findElement(By.xpath("//i[@class='icon icon-close']")).click();
	    driver.findElement(By.xpath("(//div[contains(@class,'button view-seats')])[2]")).click();
	    Thread.sleep(5000);
	   // File source = driver.getScreenshotAs(OutputType.FILE); 
	  // File destination = new File("./snaps/seats.png"); 
	    //FileUtils.copyFile(source, destination);
	    File source = driver.getScreenshotAs(OutputType.FILE); 
		File destination =new File("./Image/shot4.png") ;
		FileUtils.copyFile(source, destination);
	    
	    
		
		
	}

}




/*
 * WebDriverManager.firefox().setup();
FirefoxDriver driver = new FirefoxDriver();
Testcase 2 (RedBus)
01) Launch Firefox / Chrome
02) Load https://www.redbus.in/
03) Type "Chennai" in the FROM text box
04) Type "Bangalore" in the TO text box
05) Select tomorrow's date in the Date field
06) Click Search Buses
07) Print the number of buses shown as results (ex:104 Buses found)
08) Choose SLEEPER in the left menu 
09) Print the name of the second resulting bus 
10) Click the VIEW SEATS of that bus
11) Take screenshot and close browser
 */

