package testNGAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class Orderingmobile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://dev128148.service-now.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("Selva@123");
		driver.findElement(By.id("sysverb_login")).click();
		Thread.sleep(2000);
		//Shadow
		Shadow shadow = new Shadow(driver);;
		
		shadow.setImplicitWait(30);
		
		
	
		shadow.findElementByXPath("//div[@id='all']").click();
		Thread.sleep(2000);
    	shadow.findElementByXPath("//input[@id='filter']").sendKeys("Service catalog",Keys.ENTER);
//		driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]"));
		
		
		//"input[@id='sncwsgs-typeahead-input']"
		//shadow.findElementByXPath("//div[contains(@class,'sn-global-typeahead-control-container -global-active-input')]").sendKeys("Mobile",Keys.ENTER);
//		dom.findElementByXpath("//div[@id='all']").click();
//		dom.findElementByXpath("//div[@id='filter']").sendkeys("Service catalog",keys.Enter);
//		Thread.sleep(5000);
//		4. Click on  mobiles
//		driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
//		5.Select Apple iphone6s
//		dom.
//		shadow.findElementByXPath("//h3[text()='Iphone 6s']").click();
//		
//		WebElement color = shadow.findElementByXPath("//option[text()='Gold']");
//		driver.switchTo().frame(color);
//		
		
		
		
		
//1. Launch ServiceNow application
//2. Login with valid credentials username as admin and password as India@123
//3. Click-AllEnter Service catalog in filter navigator and press enter 
//4. Click on  mobiles
//5.Select Apple iphone6s
//6.Update color field to rose gold and storage field to 128GB
//7.Select  Order now option
//8.Verify order is placed and copy the request number"

		 

	}

}
