package Test.Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
public class Test0 {

	

	  // public String baseUrl = "http://prodtestpdm.nexgenpdmecom.com";
	    public String baseUrl = "https://pdm.sandbox-nexgenpkgsoft.com/";
	  
	   
	   public WebDriver driver; 
	  
	  // public By frameLocator = By.className("CallOutOrder_EComV1");
	  // public By tagText = By.id("tags");
	   
	  @Test
	  public void verifyNexgenTitle() throws InterruptedException, IOException {
	  
	     String expectedTitle = "Nexgen Packaging, Ltd.";   
	     String actualTitle = driver.getTitle();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     AssertJUnit.assertEquals(actualTitle, expectedTitle);
	     
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
	     
	    WebElement dash = driver.findElement(By.xpath("//a[text()='Dashboard']"));
	    Actions actions = new Actions(driver);
	    actions.moveToElement(dash);
	     
	     //Select Create New Order dropdown and open pop ups
	     WebDriverWait wait = new WebDriverWait(driver, 180);
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder1_ddlActions"))); 
	     Select dropdown = new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlActions")));
	     dropdown.selectByVisibleText("Create New Order");
	     
	     //Select Master Customer
	     Select MC = new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlMasterCustomerNewOrder")));
	     MC.selectByValue("449");
	     Thread.sleep(5000);
	     
	     //click on the Continue button
	     WebDriverWait wait1 = new WebDriverWait(driver, 180);
	     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder1_lnkSubmitMessage"))); 
	     WebElement ContinueButton = driver.findElement(By.id("ctl00_ContentPlaceHolder1_lnkSubmitMessage"));
	     ContinueButton.click();
	     Thread.sleep(7000);
	     
	   
	   //  WebElement SubmitButton = driver.findElement(By.id("//html/body/form/div[3]/div/div[2]/div/div[3]/div/center/div/a[1]/img"));
	  //   SubmitButton.click();
	   // Thread.sleep(5000);
	   
	     
	     //Select Master Customer
	     
	  /*   
	     String winHandleBefore1 = driver.getWindowHandle();
	     
	     // Switch to new window opened
	     for (String winHandle1 : driver.getWindowHandles())
	     {
	         driver.switchTo().window(winHandle1);
	         
	     }
	     driver.switchTo().window(winHandleBefore1);  */
	   
	     WebElement PO1 = driver.findElement(By.xpath("(//td[@id='lst_chico_inbound_ctrl0_Td1']/input)[position()=2]"));
	     PO1.click();
	     Thread.sleep(5000);
	     
	  //   WebElement POCheck = driver.findElement(By.xpath("(//div[@id='uniform-chkCalloutPONoChild']/span/input)[position()=2]"));  // Change Position as per requirement
	  //   POCheck.click();
	  //   Thread.sleep(3000);
	     
	  //   WebDriverWait myWait2 = new WebDriverWait(driver, 10);
	  //   myWait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("rdoOrders")));
	     
	   //  WebElement chkPersist = driver.findElement(By.id("rdoOrders"));
	  //   for(int i=0; i<2; i++)
	   //     {
	   //      chkPersist.click();
	  //      }
	  //   Thread.sleep(5000);
	     
	  }
	   
	  
	   
	  @BeforeMethod
	  
	  public void launchBrowser() {

	     System.out.println("Nexgen Packaging Ltd."); 
	     System.setProperty("webdriver.chrome.driver" , "C:\\Users\\parthsarthi.nishant\\eclipse-workspace\\Test\\Drivers\\chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.get(baseUrl);
	       
	  }
	  
	  
	 @AfterMethod
	 
	 public void terminateBrowser() {
	    
	    //close Chrome
	    //driver.close();
	    
	    //exit the program explicitly
	    //System.exit(0);
	 
	 
	 }
	
	
}
