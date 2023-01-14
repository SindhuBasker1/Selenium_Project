package Ipt_Class_Program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Important_Program {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Jenes_raj\\eclipse-workspace\\selenium_Ipt\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	
	Thread.sleep(3000);
	WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
	searchbox.sendKeys("iphone12"+Keys.ENTER);
	List<WebElement>iphoneprice =driver.findElements(By.xpath("//span[@class='a-price-whole']"));

	for(int i=0;i<iphoneprice.size();i++) {
		String text = iphoneprice.get(i).getText();
		//System.out.println(text);
	}

	String[]iphone= {"60,990", "55,990", "60,990","55,990","55,990","49,900","60,990",
			"60,990","60,900","67,999","74,900","54,900","59,900","54,900","2,999","1,499" };
			
		Arrays.sort(iphone);
		System.out.println(Arrays.toString(iphone));
		System.out.println("The Lowest Price is : Rs" + iphone[iphone.length-16]); 
		
		
		
			
			
			
	



	}
		
		
		}
		
	
	
	

	


	


			
		
			
		

	
		
		
	
	
	
	
	



