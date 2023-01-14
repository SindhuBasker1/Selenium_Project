package Ipt_Class_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jenes_raj\\eclipse-workspace\\selenium_Ipt\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys("shabasker");
		driver.findElement(By.id("pass")).sendKeys("sha12334");
		
//Explicit Wait:

		WebDriverWait wait = new WebDriverWait(driver, 30);

		WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Log in']")));

		login.click();
		
		
		
		
		
		
		
		
		}

	



		
		
	}


