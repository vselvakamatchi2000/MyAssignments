package redBus;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selva\\chromedriver-win64.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
		driver.findElement(By.xpath("//span[text()=' for mens']")).click();
		String text = driver.findElement(By.xpath("//div[contains(@class,'a-section a-spacing-small')]")).getText();
		System.out.println(text);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Generic']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='LeeRooy']")).click();
		String text2 = driver.findElement(By.xpath("//div[contains(@class,'a-section a-spacing-small')]")).getText();
		System.out.println(text2);
		if (text.equals(text2))
		{
			System.out.println("The results is not reduced");
		}
		else
		{
			System.out.println("The result got redced");
		}
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		String text3 = driver.findElement(By.xpath("//span[text()='Hang It Large 40 L Laptop Backpack Laptop Backpacks ll Laptop Bags for Men (Blue) (BLUE)']")).getText();
		System.out.println("Bag Name: "+text3);
		String text4 = driver.findElement(By.xpath("//span[text()='(45% off)']")).getText();
		System.out.println("Discount :"+text4);
		System.out.println("There is no deal of the for this product");
		
		Thread.sleep(2000);
		
		File source = driver.getScreenshotAs(OutputType.FILE); 
		//File destination = new File("./snaps/seats.png"); 
		File destination =new File("./Image/shot2.png") ;
		FileUtils.copyFile(source, destination);
		
		driver.close();
		    
		
		
		
	}

}
/*
 * Testcase 1 (Amazon)
01) Launch Chome
02) Load https://www.amazon.in/
03) Type "Bags" in the Search box
04) Choose the third displayed item in the result (bags for boys)
05) Print the total number of results (like 20000)
    1-48 of over 20,000 results for "bags for boys"
06) Select the first 2 brands in the left menu
    (like American Tourister, Generic) 1-48 of over 3,000 results for "bags for travelling"
07) Confirm the results have got reduced (use step 05 for compare)
08) Choose New Arrivals (Sort)
09) Print the first resulting bag info (name, discounted price)
10) Confirm the color of the 'Deal of the day' is in kind of Red
11) Click on the First Deal of the day
12) Confirm the price on previous and this page are same 
13) Take screenshot and close
 */
