package interview_preparation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jenes_raj\\eclipse-workspace\\selenium_Ipt\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
//Css Selector:

//1.Locate By Id:#
//         Syntax: tagname#id value
		driver.findElement(By.cssSelector("input#email")).sendKeys("shabasker");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("45678910");

//2.Locate By Attribute:
//         Syntax: tagname[attributename='attribute value']
		driver.findElement(By.cssSelector("button[name='login']")).click();

//3.Locate By Matches:

//  i)starts-with:^
//          Syntax: tagname[attributename^='te']
		driver.navigate().to("https://www.amazon.in/");
		
		WebElement searchbox = driver.findElement(By.cssSelector("input[type^='te']"));
		searchbox.sendKeys("Books" + Keys.ENTER);
//  ii)Ends-with:$
//          Syntax:  tagname[attributename$='me']

		driver.navigate().to("https://www.instagram.com/");

		driver.findElement(By.cssSelector("input[name$='me']")).sendKeys("diyajenesh");

//  iii)Contains:*	   
		driver.findElement(By.cssSelector("input[name*='password']")).sendKeys("sha@321");

	}

}
