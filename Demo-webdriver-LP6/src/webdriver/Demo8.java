package webdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.seleniumhq.jetty9.server.HttpChannelState.Action;

public class Demo8 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AbhayPujari\\Desktop\\Selenium\\Selenium_Server_Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Navigate to home
		driver.navigate().to("http://realestate.upskills.in/wp-admin/");
        String URL1 =driver.getCurrentUrl();
        System.out.println("URL1 is "+URL1);
		driver.findElement(By.id("user_login")).sendKeys("admin");
		driver.findElement(By.id("user_pass")).sendKeys("adminuser@12345");
		driver.findElement(By.name("login")).click();
	    WebElement link = driver.findElement(By.xpath("//*[contains(text(),'Howdy')]"));
	    Actions act = new Actions(driver);
	    //act.contextClick(link).build().perform();
	   act.contextClick(link).build().perform();
	    //act.moveToElement(link).build().perform();
	   Robot rb = new Robot();
	   rb.keyPress(KeyEvent.VK_DOWN);
	   Thread.sleep(3000);
	   rb.keyPress(KeyEvent.VK_ENTER);
	   Thread.sleep(3000);
	   rb.keyPress(KeyEvent.VK_CONTROL);
	   Thread.sleep(3000);
	   rb.keyPress(KeyEvent.VK_TAB);
	   String URL = driver.getCurrentUrl();
	   System.out.println("Current URL is "+URL);
	   if(URL.equals(URL1))
	   {
		   System.out.println("both URL's are same ");
	   }
	   else
		   System.out.println("both URL's are not same ");
	}

}
