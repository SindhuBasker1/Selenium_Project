package Ipt_Class_Program;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lowest_Price {
	public static void main(String[] args)  throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Jenes_raj\\eclipse-workspace\\selenium_Ipt\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	
	Thread.sleep(3000);
	WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
	searchbox.sendKeys("iphone12"+Keys.ENTER);
	

//WebElement price=driver.findElement(By.xpath("//*[@class='a-price-whole']/parent::*"));
List<WebElement>price =driver.findElements(By.xpath("//span[@class='a-price-whole']"));
List<WebElement>tittle =driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
List<WebElement>list =driver.findElements(By.xpath("//span[@class='a-price-whole']"));
for(WebElement amount:price) {
	String count = amount.getText();
	for(WebElement iphone:tittle) {
		String header = iphone.getText();
		
if(list.size()!=0)
{
	for(int i=1;i<list.size();i++)
	{
		
		System.out.print(count);
	   System.out.println(header);
		
	}


}


    String[]iphone1= {};
		
     Arrays.sort(iphone1);
     System.out.println(iphone1);
		System.out.println(Arrays.toString(iphone1));
		System.out.println("The Lowest Price is : Rs" + iphone1[iphone1.length-16]); 
 
	

	

	}
}
}
	}



	







	
	
	
	
	
	
	
	
	
	
	





