package salesforceApplication;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import learnDataIntegration.ReadExcelFile;

public class CommonClass2 {

	public EdgeDriver driver;
	public String filename;

	@Parameters({"url", "username", "password" })
	@BeforeMethod
	public void preCondition(String url, String username, String password) {
		// TODO Auto-generated method stub
	
		WebDriverManager.edgedriver().setup();
	
		EdgeOptions option = new EdgeOptions();
		option.addArguments("--disable-notifications");
	    driver = new EdgeDriver(option);
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("Login")).click();

	}
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	@DataProvider 
	public String[][] testData() throws IOException {
		String[][] readData = ReadExcelFile.readData(filename);
		return readData;
	}
}
