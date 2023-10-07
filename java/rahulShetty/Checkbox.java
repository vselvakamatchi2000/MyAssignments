package rahulShetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		ChromeDriver driver= new ChromeDriver(option);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
		checkbox.click();
		System.out.println(checkbox.isSelected());
	}}