package mini_Projects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Project {
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jenes_raj\\eclipse-workspace\\selenium_Ipt\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/index.php");
		driver.findElement(By.id("username")).sendKeys("SINDHUBASKER");
		driver.findElement(By.id("password")).sendKeys("Sindhu");
		driver.findElement(By.id("login")).click();

		driver.findElement(By.id("location")).sendKeys("London");
		driver.findElement(By.id("hotels")).sendKeys("Hotel Sunshine");
		driver.findElement(By.id("room_type")).sendKeys("Super Deluxe");
		driver.findElement(By.id("room_nos")).sendKeys("3-Three");
		driver.findElement(By.id("datepick_in")).sendKeys("11/07/2017");
		driver.findElement(By.id("datepick_out")).sendKeys("12/07/2017");
		driver.findElement(By.id("adult_room")).sendKeys("2-Two");
		driver.findElement(By.id("child_room")).sendKeys("2-Two");
		driver.findElement(By.id("Submit")).click();

		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();

		WebElement FirstName = driver.findElement(By.id("first_name"));
		FirstName.sendKeys("Sindhu");
		WebElement LastName = driver.findElement(By.id("last_name"));
		LastName.sendKeys("Basker");
		WebElement Address = driver.findElement(By.id("address"));
		Address.sendKeys("7/312,Main Road,Tirunelveli");
		WebElement CreditCard = driver.findElement(By.id("cc_num"));
		CreditCard.sendKeys("1234567890123456");
		WebElement CardType = driver.findElement(By.id("cc_type"));
		Select S6 = new Select(CardType);
		CardType.sendKeys("VISA");
		WebElement SelMonth = driver.findElement(By.id("cc_exp_month"));
		Select S7 = new Select(SelMonth);
		SelMonth.sendKeys("March");
		WebElement SelYear = driver.findElement(By.id("cc_exp_year"));
		Select S8 = new Select(SelYear);	
		SelYear.sendKeys("2020");
		WebElement CVVNum = driver.findElement(By.id("cc_cvv"));
		CVVNum.sendKeys("123");
		WebElement BookNow = driver.findElement(By.id("book_now"));
		BookNow.click();

		WebElement LogOut = driver.findElement(By.xpath("//a[@href='Logout.php']"));
		LogOut.click();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Jenes_raj\\eclipse-workspace\\selenium_Ipt\\Screenshot\\adactin.png");
		FileUtils.copyFile(source, destination);

		driver.close();

	}
}
