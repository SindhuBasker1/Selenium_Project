package Ipt_Class_Program;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Concept {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jenes_raj\\eclipse-workspace\\selenium_Ipt\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html#google-Vignette");
		driver.manage().window().maximize();
		
//Simple Alert:
		
		driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	    Alert SimpleAlert=	driver.switchTo().alert();
	    SimpleAlert.accept();
	    
//Confirm Alert:
	    
	    driver.findElement(By.xpath(" //a[text()='Alert with OK & Cancel ']")).click();
	    driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	    Alert ConfirmAlert=	driver.switchTo().alert();
	    ConfirmAlert.dismiss();
	    
//Prompt Alert:
	    
	    driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
	    driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
	    Alert PromptAlert=	driver.switchTo().alert();
	    String text = PromptAlert.getText();
	    System.out.println(text);
	    PromptAlert.accept();
	    
	    
	    
	    
	    
	    
	
	
		
		
	}

}
