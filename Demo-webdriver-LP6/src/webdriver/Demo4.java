package webdriver;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AbhayPujari\\Desktop\\Selenium\\Selenium_Server_Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Navigate to home
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("Cruises")).click();
		Thread.sleep(3000);
		//2nd Navigation Method
		driver.navigate().back();
		Thread.sleep(3000);
		//3rd Navigation Method
		driver.navigate().forward();
		//4th Navigation Method
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		

	}

}
