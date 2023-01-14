package Ipt_Class_Program;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_KeyboardBasedActions {
	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jenes_raj\\eclipse-workspace\\selenium_Ipt\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		Robot r = new Robot();
		
        r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_I);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_I);
		Thread.sleep(3000);
		System.out.println("Open a Inspect");

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_N);
		Thread.sleep(3000);
		System.out.println("Open a new browser window");

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(3000);
		System.out.println("Open a new Tab");

		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		System.out.println("Switch Screens");

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_E);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_E);
		Thread.sleep(3000);
		System.out.println("Select the search box");

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_W);
		Thread.sleep(3000);
		System.out.println("Close the Current tab");

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_H);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_H);
		Thread.sleep(3000);
		System.out.println("Open the browsing history");

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_J);
		r.keyRelease(KeyEvent.VK_CONTROL);																	
		r.keyRelease(KeyEvent.VK_J);
		Thread.sleep(3000);
		System.out.println("Open the download  history");

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_D);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_D);
		Thread.sleep(3000);
		System.out.println("Bookmark the current website");

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_P);
		Thread.sleep(3000);
		System.out.println("Print the current web page");

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_U);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_U);
		Thread.sleep(3000);
		System.out.println("Open the current page source code");

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_O);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_O);
		Thread.sleep(3000);
		System.out.println("Open a file from your computer");

	}

}
