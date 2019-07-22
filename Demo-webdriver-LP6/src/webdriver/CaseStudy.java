package webdriver;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseStudy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AbhayPujari\\Desktop\\Selenium\\Selenium_Server_Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		String underconstitle = "Under Construction: Mercury Tours";
		//Trying to click on all the links
		List<WebElement> links = driver.findElements(By.tagName("a"));
		String[] linktext = new String[links.size()]; //Storing the size of the link in link text
		int i=0;
		//Extract the link text of each link element
		for (WebElement e:links)
		{
			linktext[i]=e.getText();
			i++;
			
		}
		
		//Test weather each link is working or not working
		
		for (String t:linktext)
		{
			driver.findElement(By.linkText(t)).click();
			
			if (driver.getTitle().equals(underconstitle))
			{
				
				System.out.println("\"" + t +"\" + is underconstruction");
			}
			
			else
			{
				System.out.println("\"" + t +"\" + is Working");
			}
			driver.navigate().back();
		}
		driver.close();
	}

}
