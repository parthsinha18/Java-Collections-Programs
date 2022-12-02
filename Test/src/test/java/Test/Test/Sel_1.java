package Test.Test;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sel_1 {
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\parthsarthi.nishant\\eclipse-workspace\\E2EProject\\E2EProject\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']")).click();
		driver.findElement(By.xpath("//a[@href='https://www.facebook.com/OrangeHRM/']")).click();
		driver.findElement(By.xpath("//a[@href='https://twitter.com/orangehrm?lang=en']")).click();
		/*
		Set<String> handles = driver.getWindowHandles();
		List<String> hlist = new ArrayList<String>(handles);
		
		if(windows1("Facebook" , hlist))
				{
			
			          System.out.println("Right window");
			
				}
			}

	public static boolean windows1(String title , List<String> hlist) 
	{
		for(String e: hlist) 
		{
			
			String title1 = driver.switchTo().window(e).getTitle();
			driver.switchTo().window(e);
			if(title.contains(title1)) 
			{
				
				System.out.println("Right window found");
				return true;
			}
		}
		return false;
		*/
		 /*
		String parent=driver.getWindowHandle();
		Set<String>childwindow=driver.getWindowHandles();
		
		Iterator<String> it=  childwindow.iterator();
		
		while(it.hasNext()) 
		{
			String child= it.next();
			String title=driver.switchTo().window(child).getTitle();
			System.out.println(title);
			if(title.contains("Facebook")) 
			{
				break;
			}
		}
		*/
		Set<String>childwindow=driver.getWindowHandles();
		
		for(String s:childwindow) 
		{
			
			String title1= driver.switchTo().window(s).getTitle();
			System.out.println(title1);
			if(title1.contains("OrangeHRM - World's Most Popular Opensource HRIS | Secaucus NJ | Facebook")) 
			{
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	  
		 
		 }

	
	

