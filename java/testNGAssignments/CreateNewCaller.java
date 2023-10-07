package testNGAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class CreateNewCaller {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://dev128148.service-now.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("Selva@123");
		driver.findElement(By.id("sysverb_login")).click();
		//Shadow
		Shadow shadow = new Shadow(driver);;
		
		shadow.setImplicitWait(10);
		shadow.findElementByXPath("//div[@id='all']").click();
		//shadow.findElementByXPath("//span[text()='Service Catalog']").click();//press enter
		//shadow.findElementByXPath("//div[@class='searchinput-cancel-button-wrapper']").click();
//		shadow.findElementByXPath("//div[@id='all']").click();
		//shadow.findElementByXPath("//div[@id='filter']").sendKeys("Service catalog",Keys.ENTER);
		// TODO Auto-generated method stub
//		1. Launch ServiceNow application
//		2. Login with valid credential
//		3. Click-All and Enter Callers in filter navigator and press enter 
//		4. Create new Caller by filling all the fields and click 'Submit'.
//		5. Search and verify the newly created Caller"

	}

}
