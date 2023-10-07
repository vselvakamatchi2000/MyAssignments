package week6day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForElementToVisible {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/waits.xhtml");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text()='Click First Button']")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(8));
		driver.findElement(By.xpath("//span[@id='j_idt87:hide3']//button[1]")).click();
		
		
	}

}
