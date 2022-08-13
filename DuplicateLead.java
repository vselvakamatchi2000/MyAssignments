package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Airtel");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Selva Kamatchi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Venkatesan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Selva");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("HR");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("xxxxxxxx");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Selvakamatchi2000@gmail.com");
		driver.findElement(By.className("smallSubmit")).click();		
		String title=driver.getTitle();
		System.out.println("title");
		
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Jio");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Abinaya");
		driver.findElement(By.className("smallSubmit")).click();
		String title1=driver.getTitle();
	    System.out.println("title1");
			
		
	}

}
