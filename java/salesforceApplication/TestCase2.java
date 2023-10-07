package salesforceApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase2 extends CommonClass2  {

     	@BeforeTest
       public void setfileName() {
       filename="LastName";
	}
	@Test(dataProvider = "testData")
	public void RunTestCase2(String LastName) throws InterruptedException {
		
		driver.findElement(By.className("slds-r6")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='search'])[3]")).sendKeys("Individuals",Keys.ENTER);
		driver.findElement(By.xpath("//mark[text()='Individuals']")).click();
		driver.findElement(By.xpath("//div[text()='New']")).click();
		//driver.findElement(By.xpath("//div[@title='New']")).click();
		driver.findElement(By.xpath("//a[@class='select']")).click();
		driver.findElement(By.xpath("(//li[@class='uiMenuItem uiRadioMenuItem']//a)[3]")).click();
		//driver.findElement(By.xpath("(//a[@role='menuitemradio'])[3]")).click();
		driver.findElement(By.xpath("//input[contains(@class,'lastName compoundBLRadius')]")).sendKeys(LastName);
		driver.findElement(By.xpath("(//button[@data-aura-class='uiButton forceActionButton'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='slds-r7']/following-sibling::div[1]")).click();
		
//		driver.findElement(By.className("slds-r8")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("Customers");
		driver.findElement(By.xpath("//mark[text()='Customers']")).click();
		driver.findElement(By.xpath("//a[@class='forceActionLink']")).click();
		//driver.findElement(By.xpath("//div[@title='New']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='slds-button slds-button--neutral']//a")).sendKeys("Bala");
		//driver.findElement(By.xpath("//div[@class='autocompleteWrapper slds-grow']//input[1]")).sendKeys("Bala");
		//driver.findElement(By.xpath("//input[contains(@class,'default input')]")).sendKeys("Bala",Keys.ENTER);
	
		
		//String text = driver.findElement(By.linkText("Bala")).getText();
//		String text = driver.findElement(By.xpath("//div[text()='RRama']")).getText();
//		
//		
//		 if (text.contains(LastName))
// 		{
// 	System.out.println("Name displayed");
// 
// 		}
// else
// {
// 	System.out.println("Not displayed");
// }
//		
		 driver.close();
		
		
		
	}
}
