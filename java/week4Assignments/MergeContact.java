package week4Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
//		 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		// * 2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
//		 * 3. Click on Login Button using Class Locator
		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		 * 4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
//		 * 6. Click on Merge Contacts using Xpath Locator
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
//		 * 7. Click on Widget of From Contact
//		 * 8. Click on First Resulting Contact
     	driver.findElement(By.xpath("//img[@src='/images/fieldlookup.gif']")).click();
     	driver.findElement(By.xpath("//a[@id='ext-gen294']")).click();
//		 * 9. Click on Widget of To Contact
//		 * 10. Click on Second Resulting Contact
     	driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
     	driver.findElement(By.xpath("//div[@id='ext-gen300']")).click();
//		 * 11. Click on Merge button using Xpath Locator     	
		
        driver.findElement(By.linkText("Merge")).click();
		
		
		driver.switchTo().alert().accept();
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		
		
		
		
		/*
		 * //Pseudo Code
		 * 
//		 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
//		 * 2. Enter UserName and Password Using Id Locator
//		 * 3. Click on Login Button using Class Locator
//		 * 4. Click on CRM/SFA Link
//		 * 5. Click on contacts Button
//		 * 6. Click on Merge Contacts using Xpath Locator
//		 * 7. Click on Widget of From Contact
//		 * 8. Click on First Resulting Contact
//		 * 9. Click on Widget of To Contact
//		 * 10. Click on Second Resulting Contact
//		 * 11. Click on Merge button using Xpath Locator
//		 * 12. Accept the Alert
//		 * 13. Verify the title of the page
		 */



	}

}
