package Test.Test;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {

	
	
	
	public static void main(String[] args) throws InterruptedException  {
		try {
		System.setProperty("webdriver.gecko.driver" , "C:\\Users\\parthsarthi.nishant\\eclipse-workspace\\E2EProject\\E2EProject\\Drivers\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
	        driver.get("https://nexgenit.zendesk.com/");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        Thread.sleep(1000);
	        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='user_email']/parent::div"))).sendKeys("abcd@gmail.com");
		}
		catch(Exception e)
		
		{
			System.out.println(e.getMessage());
		}
}
}