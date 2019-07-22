package webdriver;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTourAutomation {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AbhayPujari\\Desktop\\Selenium\\Selenium_Server_Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*/input[@name='userName']")).sendKeys("sunil");
		//driver.findElement(By.xpath("//*/input[@name='password']")).sendKeys("sunil");
		//driver.findElement(By.xpath("//*/input[@name='login']")).click();
		
		WebElement username = driver.findElement(By.name("userName"));
		
		if (username.isEnabled())
		{
			username.sendKeys("sunil");
			username.clear();
			username.sendKeys("sunil");
		}
		
	    if(username.isDisplayed())
		{
	    	String UN = username.getAttribute("value");
	    	String UN1 =username.getAttribute("name");
	    	System.out.println("Username is  "+UN);
	    	String text=driver.findElement(By.xpath("//*[contains(text(),'Name:')]")).getText();
	    	System.out.println(text);
	    	System.out.println(UN);
	    	System.out.println(UN1);
	    
	    	
	    	
		}
			
	  driver.findElement(By.xpath("//*/input[@name='password']")).sendKeys("sunil");
	  driver.findElement(By.xpath("//*/input[@name='login']")).click();
	 // driver.findElement(By.xpath("//*/input[@value='oneway']")).click();
	  //System.out.println(driver.getTitle());
	 // System.out.println((By.tagName("title")).);
	  
	 Thread.sleep(3000); 
	  if (driver.findElement(By.xpath("//*[@name='tripType' and @value='roundtrip']")).isSelected())
	  {
		  driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();
	  }
	 // driver.findElement(By.xpath("//*[@name='passCount']"))
	  
	  WebElement DD =driver.findElement(By.name("passCount"));
	  //select is going to click on the dropdown
	  
	  Select sel = new Select(DD);
	  
	  //Get all the values from the dropdown
	  List<WebElement> options = sel.getOptions();
	  System.out.println(options.size());
	  for (int i=0;i<options.size();i++)
	  {
		  System.out.println(options.get(i).getText());
	  }
	  //select index value
	  sel.selectByValue("2");
	  WebElement opt1 = sel.getFirstSelectedOption();
	// String opt1 = driver.findElement(By.name("passCount")).getAttribute("value");
	 System.out.println(opt1.getAttribute("value")); 
	  Thread.sleep(3000);
	  sel.selectByVisibleText("1");
	  String opt2 = driver.findElement(By.name("passCount")).getAttribute("value");
		 System.out.println(opt2); 
	  Thread.sleep(3000);
	  sel.selectByIndex(0);
	  String opt3 = driver.findElement(By.name("passCount")).getAttribute("value");
		 System.out.println(opt3); 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@name='servClass' and @value='Business']")).click();
		 driver.findElement(By.name("findFlights")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.name("reserveFlights")).click();
		 driver.findElement(By.name("passFirst0")).sendKeys("sunil");
		 driver.findElement(By.name("passLast0")).sendKeys("sunil");
		 driver.findElement(By.name("creditnumber")).sendKeys("1111 1111 1111");
		 List<WebElement>checkbox = driver.findElements(By.xpath("//*[@name='ticketLess' and @value='checkbox']"));
		 //this for loop to click on both the check boxes
		 System.out.println("Size of the check box is " +checkbox.size());
		 for (int i=0;i<checkbox.size()-1;i++)
		 {
			 checkbox.get(i).click();
		 }
		 driver.findElement(By.name("buyFlights")).click();
		 driver.findElement(By.xpath("//*[contains(text(),'SIGN-OFF')]")).click();
		/* for (WebElement e:checkbox)
		 {
			
			 // e.click();
		 }*/
 		}
		
		
		
		
		
	}
	


