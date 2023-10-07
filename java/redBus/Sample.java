package redBus;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
	    ChromeOptions option = new ChromeOptions();
	    option.addArguments("--disable-notifications");
	    // Launch Firefox / Chrome
	    ChromeDriver driver = new ChromeDriver(option);
	    // Load https://www.redbus.in/
	    driver.get("https://www.redbus.in/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    // Type "Chennai" in the FROM text box
	    driver.findElement(By.id("src")).sendKeys("Chennai");
	    driver.findElement(By.xpath("//li[text()='Chennai']")).click();
	    // Type "Bangalore" in the TO text box
	    driver.findElement(By.id("dest")).sendKeys("Bangalore");
	    driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
	    // Select tomorrow's date in the Date field
	    driver.findElement(By.id("onward_cal")).click();
	    driver.findElement(By.xpath("(//td[@class='wd day'])[1]")).click();
	    // Click Search Buses
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
	    
	    
	    File source = driver.getScreenshotAs(OutputType.FILE); 
	    File destination = new File("./snaps/seats.png"); 
	    FileUtils.copyFile(source, destination);
	}

}
