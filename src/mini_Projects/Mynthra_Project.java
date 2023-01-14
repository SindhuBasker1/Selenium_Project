package mini_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mynthra_Project {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jenes_raj\\eclipse-workspace\\selenium_Ipt\\Driver\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.myntra.com/water-bottles?extra_search_param=isautosuggestentry%3atrue%3a%3aid%3a2297-water-bottles");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//h4[text()='Set Of 3 Transparent Glass Water Bottle']")).click();
		
        driver.findElement(By.xpath("//span[text()='Bag']")).click();
        
        System.out.println("The Process Completed");
        
	    
    
		
		
	}

}
