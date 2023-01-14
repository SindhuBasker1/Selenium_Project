package Ipt_Class_Program;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jenes_raj\\eclipse-workspace\\selenium_Ipt\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
//Implicit Wait:

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("Bangles" + Keys.ENTER);

		List<WebElement> Bangles = driver.findElements(By.xpath("//span[text()='ZENEME']"));

		for (WebElement a : Bangles) {

			String text = a.getText();

			System.out.println(text);
		}

	}

}
