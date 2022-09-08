package week4Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class menu {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/menu.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		
		Actions act=new Actions(driver);
		WebElement Shipments = driver.findElement(By.xpath("//span[text()='Shipments']"));
		act.click(Shipments).perform();
		WebElement Tracker = driver.findElement(By.xpath("//span[text()='Tracker']"));
		act.contextClick(Tracker).perform();
		Thread.sleep(2000);
		WebElement Orders = driver.findElement(By.xpath("(//span[text()='Orders'])[2]"));
		act.click(Orders).perform();
		driver.findElement(By.xpath("//span[contains(@class,'ui-icon ui-icon-triangle-1-w')]")).click();
		//WebElement Back = driver.findElement(By.xpath("//span[contains(@class,'ui-icon ui-icon-triangle-1-w')]"));
		//act.click(Back).perform();
		
		
		
		
		
		
		
		/*
		 * Launch the url: https://www.leafground.com/menu.xhtml
     Menu Bar
         -Do click on shipment and mousehover on Tracker and Do rightClick on Tracker
     Slide Menu
         -Do click Orders and click Back 
		 */

	}

}
