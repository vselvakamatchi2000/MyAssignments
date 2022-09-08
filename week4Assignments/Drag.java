package week4Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Drag {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		WebElement drag = driver.findElement(By.xpath("//div[@class='ui-panel-content ui-widget-content']"));
		Point location = drag.getLocation();
		System.out.println(location);
		//int x = location.getX();
	   // int y = location.getY();
		Actions act=new Actions(driver);
		act.dragAndDropBy(drag, 120, 254).perform();
		
		
	    Thread.sleep(200);
		/*
		 * Draggable Columns
        -Move the Column Name to Column Quanity */
		WebElement Find = driver.findElement(By.xpath("//th[contains(@class,'ui-state-default ui-draggable-column')]"));
		WebElement replace = driver.findElement(By.xpath("(//th[contains(@class,'ui-state-default ui-draggable-column')])[3]"));
        act.dragAndDrop(Find, replace).perform();
        WebElement columnsText = driver.findElement(By.xpath("//span[text()='Columns reordered']"));
        String verifycolumns = columnsText.getText();
        
     //Get the Toaster message to confirm it
        if (verifycolumns.contains("Columns"))
        {
        	System.out.println("Columns reordered");
        }
        else
        {
        	System.out.println("not recorded");
        }
        
        Thread.sleep(300);
       //Draggable Rows
       // -Move the row 3 to row 4
        WebElement row3 = driver.findElement(By.xpath("(//td[text()='Blue T-Shirt'])[2]"));
		WebElement row4 = driver.findElement(By.xpath("(//td[text()='Blue Band'])[2]"));
        act.dragAndDrop(row3, row4).perform();
        WebElement rowsText = driver.findElement(By.xpath("//span[text()='Row moved']"));
        String verifyrows = rowsText.getText();
        
     //Get the Toaster message to confirm it
        if (verifyrows.contains("Row"))
        {
        	System.out.println("Row moved");
        }
        else
        {
        	System.out.println("not recorded");
        }
        
        Thread.sleep(2000);
        
      //Resize Image 
        WebElement logosize = driver.findElement(By.id("form:logo"));
        Point location2 = logosize.getLocation();
        System.out.println(location2);
      //Resize the message and Verify it 
        WebElement size = driver.findElement(By.xpath("//img[@class='shadow-1 ui-resizable']"));
		act.dragAndDropBy(size,150, 90);
		
		Thread.sleep(2000);
      //Range Slider
		WebElement findElement = driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle ui-corner-all')]"));
		Point location1 = findElement.getLocation();
		//int x = location1.getX();
	//	int y = location1.getY();
		System.out.println(location1);
		act.dragAndDropBy(findElement, -30, 0).perform();
		//act.moveByOffset(-30, 0).perform();
      //Give a range between 10 and 80 (use movebyOffset() for x values ,y should be 0  and use negative value for right move)
		 



	}


}
