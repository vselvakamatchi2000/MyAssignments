package learnRelativexpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leaftabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//div[@id='label']//a")).click();
		//li[@class='sectionTabButtonUnselected']//a
		driver.findElement(By.xpath("//li[@class='sectionTabButtonUnselected']//a")).click();
		//a[text()='Create Lead']
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//span[text()='Company Name']/following::input[@name='companyName']")).sendKeys("TCS");
		driver.findElement(By.xpath("//span[text()='First name']/following::input[@name='firstName']")).sendKeys("Selva");
		WebElement source = driver.findElement(By.xpath("//span[@class='tableheadtext']/following::select[@id='createLeadForm_dataSourceId']"));
		Select dropdown=new Select(source);
		dropdown.selectByVisibleText("Employee");
		Thread.sleep(2000);
		dropdown.selectByValue("LEAD_TRADESHOW");
		Thread.sleep(2000);
		dropdown.selectByIndex(4);
		driver.findElement(By.xpath("//span[text()='Last Name (Local)']/preceding::input[@name='firstNameLocal']")).sendKeys("Selva");
		driver.findElement(By.xpath("//span[text()='Birth Date']/preceding::input[@name='personalTitle']")).sendKeys("ms");
		driver.findElement(By.xpath("//span[text()='Birth Date']/following::input")).sendKeys("11/06/00");
		//driver.findElement(By.xpath("//img[@id='createLeadForm_birthDate-button']")).sendKeys("11/06/00");
		driver.findElement(By.xpath("//span[text()='Source']/preceding::input[@id='createLeadForm_lastName']")).sendKeys("B");
		
		
		
		
		
	}

}
