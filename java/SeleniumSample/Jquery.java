package SeleniumSample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jquery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/sortable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		driver.switchTo().parentFrame();
		WebElement find = driver.findElement(By.xpath("//li[text()='Item 4']"));
		WebElement replace = driver.findElement(By.xpath("//li[text()='Item 6']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(find, replace).perform();
		
		/*
		 * https://jqueryui.com/sortable/
		 * 

SwitchTo frame 
use ActionsClass to move the element 4 to 6
https://github.com/TestLeafPages/Non-IT-July/tree/main/week4
		 */

	}

}
