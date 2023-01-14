package Ipt_Class_Program;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluent_Wait {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Jenes_raj\\eclipse-workspace\\selenium_Ipt\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("email")).sendKeys("shabasker");
	driver.findElement(By.id("pass")).sendKeys("sha12334");
	driver.findElement((By.xpath("//button[text()='Log in']"))).click();
	
//Fluent Wait:
	
	Wait wait1 = new FluentWait(driver)
			.withTimeout(30,TimeUnit.SECONDS)
			.pollingEvery(3,TimeUnit.SECONDS)
			.ignoring(NoSuchElementException.class);

	
	


}
}
