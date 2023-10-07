package baseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.agent.builder.AgentBuilder.Identified.Extendable;
import utils.ReadExcelFile;

public class ProjectSpecificMethod {

	public RemoteWebDriver driver;
    public String filename;
    public static ExtentReports extent;
    public String testName,testDesc,author,category;
    public static ExtentTest test;
    
    @Parameters({ "browser", "url" })
    @BeforeMethod
    public void preCondition(String browser,String url) {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            // Remove the ChromeDriver and declare it globally..
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
    	WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @BeforeSuite
    public void StartReport()
    {
        
        ExtentHtmlReporter report=new ExtentHtmlReporter("./report/result.html");
        report.setAppendExisting(true);
        extent=new ExtentReports();
        extent.attachReporter(report);
    }
    @BeforeClass
    public void testDetails()
    {
    	test = extent.createTest(testName,testDesc);
        test.assignAuthor(author);
        test.assignCategory(category);
        
    }
//    public void reportstep(String Status,String message)
//    {
//    	if(Status.equalsIgnoreCase("pass"))
//    	{
//    		test.pass(message);
//    	}
////    	else if(Status.equalsIgnoreCase("fail"))
////    	{
////    	//	test.fail(message)
////    	}
    	
    
    @AfterMethod
    public void postCondition() {
        driver.close();    }
    @DataProvider // (name="fetchData")
    public String[][] testData() throws IOException {
        String[][] readData = ReadExcelFile.readData(filename);
        return readData;
    }
    
    @AfterSuite
    public void StopReport()
    
    {
    	extent.flush();
    }
    
    

}
