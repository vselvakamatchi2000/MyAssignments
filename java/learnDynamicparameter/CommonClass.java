package learnDynamicparameter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CommonClass {
	public ChromeDriver driver;
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void precondition(String url,String username,String password)
	{
		
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.id("username")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();

}
	public void postcondition()
	{
		driver.close();
	}
}


/*
 * Step:1
 * in xml--> <parameter name="url" value="http://leaftaps.com/opentaps/" ></parameter>
 * step:2
 * in common claa @parameters above preconditionmethod
 * @Parameters({"url","username","password"})
 * step:3 
 * passed arguments to precondition Methodpublic void precondition(String url,String username,String password)
 */
