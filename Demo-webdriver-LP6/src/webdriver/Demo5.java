package webdriver;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AbhayPujari\\Desktop\\Selenium\\Selenium_Server_Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Navigate to home
		driver.navigate().to("http://newtours.demoaut.com/");
		WebElement link = driver.findElement(By.linkText("Cruises"));
		
		//Actions
		Actions MH = new Actions(driver);
		//Mouse Over on the Cruise
		Action mouseover = MH.moveToElement(link).build();
		//will move the mouse to that element
		mouseover.perform();
		//This is to click enter from Keyboard
		//MH.sendKeys(link,(Keys.ENTER)).perform();
		MH.sendKeys(link,(Keys.RETURN)).perform(); //This is also used to enter using Keyboards
		
		
		
	}

}
