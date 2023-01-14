package mini_Projects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addto_Cart_Project {
	public static void main(String[] args) throws IOException, InterruptedException {
		
	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jenes_raj\\eclipse-workspace\\selenium_Ipt\\Driver\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
		
	driver.manage().window().maximize();
		
	driver.get("https://www.amazon.in/Sasitrends-Gram-Gold-Plated-Size-Daily-Wearable-Bangles/dp/B07D2F24C2/ref=sr_1_19?keywords=Bangles&qid=1673000551&sr=8-19&th=1");
		
    driver.findElement(By.xpath("//input[@value='Add to Cart']")).click();
	   
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\Users\\Jenes_raj\\eclipse-workspace\\selenium_Ipt\\Screenshot\\addcart.png");
	FileUtils.copyFile(source, destination);
	
	
	

		
		
	}
	
	

}
