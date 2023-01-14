package Ipt_Class_Program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jenes_raj\\eclipse-workspace\\selenium_Ipt\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// driver.get():

		driver.get("https://www.google.com/");
		driver.get("https://www.amazon.in/");
		driver.get("https://www.myntra.com/");
		driver.get("https://www.flipkart.com/");
		driver.get("https://www.snapdeal.com/");

		// Navigate().to():

		driver.navigate().to("https://www.snapdeal.com/products/stationery-basic-supplies-card-holders?sort=plrty");
		driver.navigate().to("https://www.myntra.com/home-furnishing-menu?"
				+ "f=categories%3ABath%20Towels%2CBeach%20Towels%2CFace%20Towels%2CHand%20Towels%2CTowel%20Set");
		driver.navigate().to("https://www.amazon.in/gp/new-releases/kitchen/1379989031/ref=zg_bsnr_nav_kitchen_1");
		driver.navigate().to(
				"https://www.flipkart.com/watches/watch-accessories/pr?sid=r18,trt&q=watches&otracker=categorytree");
		driver.navigate().to("https://artsandculture.google.com/play");

		// driver.get() and driver.navigate().to():

		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.snapdeal.com/products/stationery-basic-supplies-card-holders?sort=plrty");
		driver.get("https://www.amazon.in/");
		driver.navigate().to("https://www.myntra.com/home-furnishing-menu?"
				+ "f=categories%3ABath%20Towels%2CBeach%20Towels%2CFace%20Towels%2CHand%20Towels%2CTowel%20Set");
		driver.get("https://www.myntra.com/");
		driver.navigate().to("https://www.amazon.in/gp/new-releases/kitchen/1379989031/ref=zg_bsnr_nav_kitchen_1");
		driver.get("https://www.flipkart.com/");
		driver.navigate().to(
				"https://www.flipkart.com/watches/watch-accessories/pr?sid=r18,trt&q=watches&otracker=categorytree");
		driver.get("https://www.snapdeal.com/");
		driver.navigate().to("https://artsandculture.google.com/play");        
        
        
        
        
        
        
        
        
        
        
        
        
}
}
