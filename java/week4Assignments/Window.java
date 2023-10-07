package week4Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> lastwindow=new ArrayList<String>(windowHandles);
		System.out.println(windowHandles.size());
		driver.switchTo().window(lastwindow.get(2));
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		driver.quit();
		
		
		
		
		/*
		 * .https://www.leafground.com/window.xhtml
          Click Open Multiple 
          Get the size of available Windows
          switch to last window 
          Get the Title of the Window
           Close all the windows except last window
		 */



	}

}
