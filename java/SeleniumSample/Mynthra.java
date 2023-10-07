package SeleniumSample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mynthra {

public static void main(String[] args) {
	



		//Myntra
		//1) Open https://www.myntra.com/
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--start-fullscreen");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		//2) Mouse hover on MeN 
		Actions act=new Actions(driver);
		WebElement Men = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
		act.moveToElement(Men).perform();
		//3) Click Jackets 
		driver.findElement(By.xpath("(e")).click();
		//4) Find the total count of item 
		String text = driver.findElement(By.xpath("//div[@class='title-container']")).getText();
		System.out.println(text);
		//5) Validate the sm of categories count matches
		String text2 = driver.findElement(By.xpath("(//span[@class='categories-num'])[1]")).getText();
		System.out.println(text2);
		String text3 = driver.findElement(By.xpath("(//span[@class='categories-num'])[2]")).getText();
		System.out.println(text3);
		String sum= text2+text3;
		System.out.println(sum);
		//6) Check jackets
		
		//7) Click + More option under BRAND
		//8) Type Duke and click checkbox
		//9) Close the pop-up x
		//10) Confirm all the Coats are of brand Duke
		//Hint : use List 
		//11) Sort by Better Discount
		//12) Find the price of first displayed item
		//Click on the first product
		//13) Take a screen shot
		//14) Click on WishList Now
		//15) Close Browser
	}
}
