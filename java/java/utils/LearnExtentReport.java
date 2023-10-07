package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Step:1 : add the dependency to the pom.xml        
        //Set a path for the report as html format
    ExtentHtmlReporter report=new ExtentHtmlReporter("./report/result.html");
    report.setAppendExisting(true);
    
        //step :2 To capture the data from the testcase,intialize the class
    ExtentReports extent=new ExtentReports();
    
    //using extent report attach the data to the result.html
     extent.attachReporter(report);
    
     ExtentTest test = extent.createTest("LoginTestcase", "Funtionality of the Loginpage");
     test.pass("Logged in Successfully");
     test.fail("Login functionality is failed");
     test.assignAuthor("Hari");
     test.assignCategory("Funtional");
     
     
     extent.flush();
     

	}

}
