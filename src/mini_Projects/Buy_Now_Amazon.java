package mini_Projects;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buy_Now_Amazon {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jenes_raj\\eclipse-workspace\\selenium_Ipt\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
	
	searchbox.sendKeys("Bangles"+Keys.ENTER);
	
	driver.findElement(By.xpath("//span[text()='Jewellery Bracelets for Women Stylish Rose Gold Plated Crystal Bracelet Bangle Jewellery for Girls and Women']")).click();
	
	Thread.sleep(3000);
	
	System.out.println("Window 1 Tittle:"+driver.getTitle());
	
	
	String ParentWindow =driver.getWindowHandle();
	Set<String>WindowHandles=driver.getWindowHandles();
	
	for(String ChildWindow:WindowHandles) {
		if(!ChildWindow.equalsIgnoreCase(ParentWindow)) {
			driver.switchTo().window(ChildWindow);
		}
	}
	Thread.sleep(3000);
	System.out.println("Window 2 Tittle:"+driver.getTitle());
	driver.findElement(By.xpath("//input[@id='buy-now-button']")).click();

	

	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\Users\\Jenes_raj\\eclipse-workspace\\selenium_Ipt\\Screenshot\\adactin.png");
	FileUtils.copyFile(source, destination);
	
	
		
	}

}
