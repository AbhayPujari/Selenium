package webdriver;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AbhayPujari\\Desktop\\Selenium\\Selenium_Server_Drivers\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		String val1 = driver.findElement(By.id("txtUsername")).getAttribute("value");
		System.out.println("The Value of Username is " +val1);
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		/*driver.findElement(By.linkText("Performance")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Admin")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("PIM")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Leave")).click();*/
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links " +Links.size());
		for (WebElement e:Links)
		{
			String alllinktext=e.getText();
			System.out.println(alllinktext);
			
		}
		
		
	}

}
