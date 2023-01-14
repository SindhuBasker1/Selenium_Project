package interview_preparation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jenes_raj\\eclipse-workspace\\selenium_Ipt\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		/*driver.get("https://www.facebook.com/");
	    driver.findElement(By.id("email")).sendKeys("manishabasker");
	    driver.findElement(By.id("pass")).sendKeys("1234");
	    driver.findElement(By.name("login")).click();
	    driver.findElement(By.xpath("//i[@class='_9ai6 img sp_vxiiSmFDFzJ_1_5x sx_63629e']")).click();
	    driver.navigate().back();*/
		
	  /*  driver.get("https://www.instagram.com/");
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("shabasker");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("diya321");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();*/
		
		driver.get("https://automationexercise.com/");
		driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Manisha");
		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("sammanisha98@gmail.com");
		

		
	}

}
