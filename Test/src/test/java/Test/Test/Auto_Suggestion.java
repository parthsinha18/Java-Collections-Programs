package Test.Test;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Auto_Suggestion {

	

		public static void main(String[] args) throws InterruptedException {
			
			
			
			try {
			System.setProperty("webdriver.chrome.driver" , "C:\\Users\\parthsarthi.nishant\\eclipse-workspace\\Test\\Drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			Thread.sleep(2000);
			// WebElement ele1=driver.findElement(By.xpath("//iframe[@name='callout']"));
			//driver.switchTo().frame(ele1);
			//driver.findElement(By.className("M6CB1c rr4y5c")).click();
			//driver.switchTo().defaultContent();
			driver.findElement(By.name("q")).sendKeys("selenium");
			Thread.sleep(3000);
			List<WebElement> ele = driver.findElements(By.xpath("//div[@class='mkHrUc']/ul[1]/div/ul/li[@class='sbct']"));
			
			for(WebElement wb:ele) 
			{
				System.out.println(wb.getText());
				if(wb.getText().contains("selenium webdriver")) {
					wb.click();
					Thread.sleep(1000);
				break;
				}
				
				
				
			}
			
			
			
			boolean res=driver.getPageSource().contains("selenium webdriver");

			if(res==true)
			{
				Assert.assertTrue(true);
				System.out.println("Passed");
				
			}
			else
			{
				System.out.println("Fail");
			}
			}
			
			catch(Exception e ) 
			{
				System.out.println(e.getMessage());
			}
			
			/*
			driver.findElement(By.name("q")).sendKeys("selenium");
		
	        List<WebElement> autoSuggest = driver.findElements(By.className("UUbT9"));
	        Thread.sleep(3000);
	      
	        // print the auto suggest
	        for (WebElement a : autoSuggest)
	        {
	        	System.out.println("Values are = " + a.getText());
	        	if (a.getText().equalsIgnoreCase("selenium webdriver"));
	        	a.click();
	        	Thread.sleep(3000);
	        	break;
	        }
	        driver.close();
	        */
			/*
			System.setProperty("webdriver.chrome.driver" , "C:\\Users\\parthsarthi.nishant\\eclipse-workspace\\Test\\Drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://pdm.sandbox-nexgenpkgsoft.com/cr/create-nexgen-order-form.aspx?OrderType=E&order=285365&mastercustomerID=4874&isNexgenSubmit=False&isNewOrder=false&Page=0&rptpageno=1&tiMenuType=18&inEntityId=1");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.id("txtusername")).sendKeys("janethui");
			driver.findElement(By.id("txtpwd")).sendKeys("123456");
			driver.findElement(By.id("lnklogin")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtCustomerService")).sendKeys("al");
			Thread.sleep(2000);
			List<WebElement> ele = driver.findElements(By.xpath("(//div[@class='ajaxcontainer'])[5]/ul/li[@id='0']"));
			Thread.sleep(2000);
			
			
			for (WebElement wb2 :ele) 
			{
				System.out.println(wb2.getText());
			}
			for(WebElement wb:ele) 
			{
				
				
				
				if(wb.getText().contains("Alice Chui")) {
					wb.click();
					Thread.sleep(1000);
				break;
			
				}
			*/
		}
		}

