package Ipt_Class_Program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jenes_raj\\eclipse-workspace\\selenium_Ipt\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();

		System.out.println("=========To get All data========");
		
        List<WebElement> Alldata = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
		for (WebElement a : Alldata) {
			String text = a.getText();
			System.out.println(text);
			}
		System.out.println("========To get row wise data=====");
		
        List<WebElement> Coloumn = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td"));
		for (WebElement b : Coloumn) {
			String text = b.getText();
			System.out.println(text);
		}
		System.out.println("========To get Row wise data=====");
		
		List<WebElement> Row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]"));
		for (WebElement c : Row) {
			String text = c.getText();
			System.out.println(text);
		}
		System.out.println("========To get  Particular data=====");
		
        WebElement particular = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[2]/td[3]"));
        System.out.println(particular.getText());
        
		List<WebElement> Headers = driver.findElements(By.xpath("//table[@id='customers']//th"));
		System.out.println("Number Of Headers :" + Headers.size());
        System.out.println("=======Print all Headers=======");
		for (WebElement d : Headers) {
			String text = d.getText();
			System.out.println(text);
		}
		
	

	}
}
