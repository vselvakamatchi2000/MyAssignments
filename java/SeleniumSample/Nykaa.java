package SeleniumSample;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//1) Go to https://www.nykaa.com/
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//2) Mouseover on Brands and Search L'Oreal Paris
		WebElement brands = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions act=new Actions(driver);
		act.moveToElement(brands).perform();
		//3) Click L'Oreal Paris
		driver.findElement(By.xpath("//div[@id='scroller-container']/div[7]/a[1]")).click();
		//4) Check the title contains L'Oreal Paris(Hint-GetTitle)
		driver.getTitle();
		//5) Click sort By and select customer top rated
		//driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("//div[@class='css-0']//button[1]")).click();
		driver.findElement(By.xpath("(//div[@class='control-indicator radio '])[3]")).click();
		//6) Click Category and click Hair->Click haircare->Shampoo
		driver.findElement(By.xpath("(//div[@class='filter-open css-1kwl9pj'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
	    driver.findElement(By.xpath("(//span[text()='Hair Care'])[2]")).click();
	    driver.findElement(By.xpath("//div[@class='control-indicator checkbox ']")).click();
		//7) Click->Concern->Color Protection
	    driver.findElement(By.xpath("//span[text()='Concern']")).click();
	    driver.findElement(By.xpath("(//div[@class='control-indicator checkbox '])[10]")).click();
       // driver.findElement(By.xpath("(//label[@class='control control-checkbox']//div[@class='control-indicator checkbox active'])[2]")).click();
	    //driver.findElement(By.xpath("(//div[@class='control-indicator checkbox '])[11]")).click();
//		//8)check whether the Filter is applied with Shampoo
        String text = driver.findElement(By.xpath("//div[@class='css-1emjbq5']/span[text()='Shampoo']")).getText();
        System.out.println(text);
//	    String text = driver.findElement(By.xpath("//div[@id='filters-listing']/div[1]/div[2]/div[1]")).getText();
	    if(text.contains("Shampoo"))
	    {
	    	 System.out.println("Filter applied with Shampoo");
	    }
	    else
	    {
	    	 System.out.println("Filter not applied");
	    }
		//9) Click on L'Oreal Paris Colour Protect Shampoo
	    driver.findElement(By.xpath("//div[@class='css-43m2vm']//img[1]")).click();
	   // driver.findElement(By.xpath("//div[@class='css-1rd7vky']/div[@class='css-xrzmfa']")).click();
	   // driver.findElement(By.xpath("//div[@class='css-xrzmfa']")).click();
		//10) GO to the new window and select size as 175ml
	    Set<String> windowHandles = driver.getWindowHandles();
	    List<String> switchTOWindow1=new ArrayList<String>(windowHandles); 
	    driver.switchTo().window(switchTOWindow1.get(1));
	    WebElement findElement = driver.findElement(By.xpath("//div[@class='css-11wjdq4']/select[@class='css-2t5nwu']"));
	    Select dropdown=new Select(findElement);
	    dropdown.selectByVisibleText("175ml");
	    //11) Print the MRP of the roduct
	    String text2 = driver.findElement(By.xpath("(//div[@class='css-1d0jf8e'])[1]")).getText();
	    System.out.println(text2);
		//12) Click on ADD to BAG
	    driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();
		//13) Go to Shopping Bag 
	   // WebElement proceed = driver.findElement(By.xpath("//div[@class='css-0 e1ewpqpu1']/button"));
	    
	    driver.switchTo().frame("iframe");
	    driver.findElement(By.xpath("//div[@class='css-0 e1ewpqpu1']/button")).click();
	  //  driver.switchTo().window(switchTOWindow1.get(0));
	   
		//14) Print the Grand Total amount
	  //span[@class='css-n8gwxi e171rb9k3']
	    String text3 = driver.findElement(By.xpath("//span[text()='₹259']")).getText();
	    System.out.println(text3);
		//15) Click Proceed
	    driver.findElement(By.xpath("(//button[@class='css-guysem e8tshxd0'])[2]")).click();
		//16) Click on Continue as Guest
	    driver.findElement(By.xpath("//button[text()='CONTINUE AS GUEST']")).click();
		//17) Check if this grand total is the same in step 14
	    String text4 = driver.findElement(By.xpath("//span[text()='259']")).getText();
	    System.out.println(text4);
	    if(text2.contains(text4))
	    {
	    	System.out.println("grand total is the same");
	    }
	    else
	    {
	    	System.out.println("grand total is not the same");
	    }
		//18) Close all windows
	    driver.quit();
	}

}
