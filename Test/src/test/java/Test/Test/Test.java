package Test.Test;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	
	
	
	public static void main(String[] args) throws InterruptedException  {
		/*
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\parthsarthi.nishant\\eclipse-workspace\\Test\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		*/
		String str = "madam";
		String rev ="";
		for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
		
		
		if(str.equals(rev)) 
		{
			System.out.println("PAlindrome");
		}
		
		
		
		
	}}
}