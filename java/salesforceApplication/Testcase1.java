package salesforceApplication;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class Testcase1 extends CommonClass{
	
	@BeforeTest
	public void setfileName() {
		filename="Question";
	}
	@Test(dataProvider = "testData")
	public void RunTestcase1(String Question,String Details) throws InterruptedException {
		
		driver.findElement(By.className("slds-r6")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='search'])[3]")).sendKeys("Content",Keys.ENTER);
		//driver.findElement(By.className("slds-input")).sendKeys("Content");
		driver.findElement(By.xpath("//mark[text()='Content']")).click();
		WebElement findElement = driver.findElement(By.xpath("(//a[@class='slds-context-bar__label-action dndItem'])[2]"));
        driver.executeScript("arguments[0].click();", findElement);
		//driver.findElement(By.xpath("//span[text()='Chatter']")).click();
//		driver.findElement(By.xpath("//span[text()='Chatter']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("(//span[@class='title'])[3]")).click();
		
		driver.findElement(By.tagName("textarea")).sendKeys(Question);
		driver.findElement(By.xpath("//div[@role='textbox']//p[1]")).sendKeys(Details);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Ask']")).click();
	    String text = driver.findElement(By.xpath("(//span[@class='uiOutputText'])[3]")).getText();
	    
	    
	    if (text.contains(Question))
	    		{
	    	System.out.println("Added");
	    
	    		}
	    else
	    {
	    	System.out.println("Not added");
	    }
		driver.close();

}
}
