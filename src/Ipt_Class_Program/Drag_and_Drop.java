package Ipt_Class_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jenes_raj\\eclipse-workspace\\selenium_Ipt\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		
		WebElement From = driver.findElement(By.xpath("//div[@id='form:drag_content']"));
		WebElement To = driver.findElement(By.xpath("//div[@id='form:drop']"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(From, To).build().perform();     
	
	
		
		

		
	}

}
