package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseOver_Demo6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AbhayPujari\\Desktop\\Selenium\\Selenium_Server_Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Navigate to home
		/*driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");*/
		
		driver.get("http://newtours.demoaut.com/");
		Actions MO = new Actions(driver);
		//MO.sendKeys(Keys.RETURN).perform();
		/*Action MouseOver=MO.moveToElement(driver.findElement(By.xpath("//*[@id='btnLogin']"))).build();
		MO.perform();*/
		Thread.sleep(3000);
		MO.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB).perform();
		Thread.sleep(3000);
		MO.sendKeys(Keys.RETURN).perform();
		
		
		

	}

}
