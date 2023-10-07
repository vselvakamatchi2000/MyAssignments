package learnRelativeXpatyh;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leaftabs {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		ChromeDriver driver= new ChromeDriver(option);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//div[@id='label']/a")).click();
		driver.findElement(By.xpath("//ul[@class='shortcuts']//a")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
	
	}
}
