package week4Assignments;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class redBus {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		driver.findElement(By.id("src")).sendKeys("Madiwala Bangalore");
		driver.findElement(By.xpath("//li[text()='Madiwala, Bangalore']")).click();	
		driver.findElement(By.id("dest")).sendKeys("Koyambedu Chennai");
		driver.findElement(By.xpath("//li[text()='Koyambedu, Chennai']")).click();
		driver.findElement(By.xpath("//span[contains(@class,'fl icon-calendar_icon-new')]")).click();
		driver.findElement(By.xpath("//button[text()='>']")).click();
		driver.findElement(By.xpath("//td[text()='20']")).click();
		//driver.findElement(By.xpath("//button[@class='fl button']")).click();
	    String title = driver.getTitle();
		System.out.println(title);
		
		
		
		
/*
 * Step:1-Launch the url (https://www.redbus.in/)
Step:2-Enter From -Madiwala Bangalore
Step:3-Enter To Koyambedu Chennai
Step:4-Select the Date 30-September-2022
Step:5-Print the Title of the page
https://github.com/TestLeafPages/Non-IT-July/tree/main/week4
 */

	}

}
