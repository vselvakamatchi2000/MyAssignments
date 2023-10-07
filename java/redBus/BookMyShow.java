package redBus;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;


public class BookMyShow {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://in.bookmyshow.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.findElement(By.tagName("input")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//li[@class='sc-dTLGrV eqBsHh']")).click();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.findElement(By.id("4")).click();
		driver.findElement(By.tagName("input")).sendKeys("Thiruchitrambalam");
		driver.findElement(By.xpath("//div[@class='sc-fQkuQJ hqIzUw']")).click();
		driver.findElement(By.xpath("//div[@class='sc-1vmod7e-2 iBonLL']")).click();
		String TheaterName = driver.findElement(By.linkText("AMB Cinemas: Gachibowli")).getText();
		Thread.sleep(2000);
		System.out.println("First displayed Theater: "+TheaterName);
		driver.findElement(By.xpath("//button[@class='Sign me Up!']")).click();
		driver.findElement(By.xpath("//div[text()='INFO']")).click();
		System.out.println("Parking available");
		driver.findElement(By.xpath("//div[@class='cross-container']")).click();
		driver.findElement(By.xpath("//div[@class='__details']")).click();
		driver.findElement(By.id("btnPopupAccept")).click();
		driver.findElement(By.id("pop_1")).click();
		driver.findElement(By.id("proceed-Qty")).click();
		//driver.findElement(By.xpath("//div[@id='B_3_0217']/a[1]")).click();
	    driver.findElement(By.xpath("//div[@id='B_2_0211']/a[1]")).click();
		//driver.findElement(By.xpath("//div[@id='B_2_0219']/a[1]")).click();
		driver.findElement(By.xpath("//a[@id='btmcntbook']")).click();
		Thread.sleep(2000);
		String SubTotal = driver.findElement(By.xpath("//span[text()='Rs.328.04']")).getText();
		System.out.println("Sub Total: "+ SubTotal);
		
		File source = driver.getScreenshotAs(OutputType.FILE); 
		File destination =new File("./Image/shot3.png") ;
		FileUtils.copyFile(source, destination);
		
		
		
		
		
		/*
		 * WebDriverManager.edge().setup();
EdgeDriver driver = new EdgeDriver();
Testcase 3 (BookMyShow)
01) Launch Edge / Chrome
02) Load https://in.bookmyshow.com/
03) Type the city as "Hyderabad" in Select City
04) Confirm the URL has got loaded with Hyderabad 
05) Search for your favorite movie 
06) Click Book Tickets
07) Print the name of the theater displayed first
08) Click on the info of the theater
09) Confirm if there is a parking facility in the theater
10) Close the theater popup
11) Click on the first green (available) timing
12) Click Accept
13) Choose 1 Seat and Click Select Seats
14) Choose any available ticket and Click Pay
15) Print the sub total
16) Take screenshot and close browser
		 */
	

	}

}
