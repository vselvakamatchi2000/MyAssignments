package sampleTestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stubW
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("vaa vaa en devadhai song");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']//yt-icon[1]")).click();
		//driver.findElement(By.xpath("//yt-formatted-string[text()='Abhiyum Naanum - Vaa Vaa En Devadhai Video | Prakash Raj, Trisha | Vidyasagar']")).click();
		//driver.manage().window().maximize();
		Thread.sleep(2000);
		Shadow dom= new Shadow(driver);
		WebElement play = dom.findElementByXPath("//ytd-moving-thumbnail-renderer[@class='style-scope ytd-thumbnail']//img[1]");
		play.click();
		
		
	
		//driver.findElement(By.xpath("//ytd-moving-thumbnail-renderer[@class='style-scope ytd-thumbnail']//img[1]")).click();

	}

}
