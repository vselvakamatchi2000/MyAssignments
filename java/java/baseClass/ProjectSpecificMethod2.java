package baseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcelFile;

public class ProjectSpecificMethod2 {

	public static RemoteWebDriver driver;
    public String filename;
   
    @BeforeMethod
    public void preCondition() {
    	//String browser, String url, String username, String password

    	WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://leaftaps.com/opentaps/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @AfterMethod
    public void postCondition() {
        driver.close();    }
    @DataProvider // (name="fetchData")
    public String[][] testData() throws IOException {
        String[][] readData = ReadExcelFile.readData(filename);
        return readData;
    }

}
