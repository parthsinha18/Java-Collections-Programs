package Test.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;

public class Test1 {

	public WebDriver driver; 
	 public String baseUrl = "https://pdm.sandbox-nexgenpkgsoft.com/";
	 
	@Test
	public void abc() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\parthsarthi.nishant\\eclipse-workspace\\Test\\Drivers\\chromedriver.exe");
		  driver = new ChromeDriver();
		     driver.get(baseUrl);
	 String expectedTitle = "Nexgen Packaging, Ltd.";   
     String actualTitle = driver.getTitle();
     System.out.println(driver.getTitle());
     
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     
     
     // maximize the browser window
     driver.manage().window().maximize(); 
  
     // enter a valid username in the Username textbox
     WebElement username = driver.findElement(ById.id("txtusername"));
     username.clear();
     username.sendKeys("cs.test.all.user");
  
      // enter a valid password in the password textbox
      WebElement password = driver.findElement(ById.id("txtpwd"));
      password.clear();
      password.sendKeys("123456");
   
     // click on the Login button
     WebElement LoginButton = driver.findElement(ById.id("lnklogin"));
     LoginButton.click();
     
     Thread.sleep(4000);
    WebElement dash = driver.findElement(By.xpath("//a[text()='Dashboard']"));
    Actions actions = new Actions(driver);
    actions.moveToElement(dash).perform();
    System.out.println(dash.getText());
     WebElement op = driver.findElement(By.xpath("//a[text()='Operational Dashboard']"));
     JavascriptExecutor jse3 = (JavascriptExecutor)driver;
	 jse3.executeScript("arguments[0].click()", op);
   
	}
}
