package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\AbhayPujari\\Desktop\\Selenium\\Selenium_Server_Drivers\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AbhayPujari\\Desktop\\Selenium\\Selenium_Server_Drivers\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		String ExpectedTitle = "OrangeHRM";
		//Thread.sleep(3000);
		//driver.navigate().refresh();
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		if (ExpectedTitle.equals(ActualTitle))
		{
		driver.findElement(By.xpath("//*[@id='welcome']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		//driver.findElement(By.xpath("//*[@id=\'welcome-menu\']/ul/li[2]/a")).click();
		//driver.findElement(By.partialLinkText("Log")).click();
		driver.close(); // This will close the opened instance of the browser and it will close only one browser
		//driver.quit(); /*This will close the all opened instance of the browser and it will close all browser */
		}
		
		else
		{
			System.out.println("Title is not same");
			driver.close();
		}
		 
	}

}
