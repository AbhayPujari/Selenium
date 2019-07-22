package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AbhayPujari\\Desktop\\Selenium\\Selenium_Server_Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Navigate to home
		driver.navigate().to("http://newtours.demoaut.com/");
		WebElement link = driver.findElement(By.linkText("Cruises"));
		
		//Actions
		Actions MO = new Actions(driver);
		Action MouseOver = MO.moveToElement(link).build();
		MouseOver.perform();
		MO.sendKeys(link,(Keys.ENTER)).perform();
		
		
	}

}
