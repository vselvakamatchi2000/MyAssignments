package differentParameters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CommonClass {
	//public ChromeDriver driver;
	public RemoteWebDriver driver;
	
	@Parameters({"browser","url","username","password"})
	@BeforeMethod
	public void precondition(String browser, String url,String username,String password)
	{
	if(browser.equalsIgnoreCase("chrome"))	
	{
	WebDriverManager.chromedriver().setup();
	//declare globally
    driver = new ChromeDriver();
	}
	else if (browser.equalsIgnoreCase("edge"))
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
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
