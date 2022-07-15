package Test.Test;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

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
	
	
	
	
		
	
		   public String baseUrl = "https://pdm.sandbox-nexgenpkgsoft.com/";
		       String driverPath =  "C:\\Users\\parthsarthi.nishant\\eclipse-workspace\\Test\\Drivers\\chromedriver.exe";
		        String browserdriver = "webdriver.chrome.driver";
		   public WebDriver driver; 

		          
		   @Test
		   public void verifyNexgenTitle() throws InterruptedException, IOException 
		   {
		  
		   
		   // maximize the browser window
		   driver.manage().window().maximize(); 

		   // enter a valid Username in the Username textbox
		   WebElement username = driver.findElement(ById.id("txtusername"));
		   username.clear();
		   username.sendKeys("pd.test.all.user");

		    // enter a valid password in the password textbox
		    WebElement password = driver.findElement(ById.id("txtpwd"));
		    password.clear();
		    password.sendKeys("123456");
		 
		   // click on the Login button
		   WebElement LoginButton = driver.findElement(ById.id("lnklogin"));
		   LoginButton.click();
		   
		 //Select Create Project dropdown and open pop ups
		   WebDriverWait wait = new WebDriverWait(driver, 180);
		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder1_ddlActions"))); 
		   Select dropdown = new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlActions")));
		   dropdown.selectByVisibleText("Create Project");
		   
		   //Enter Master customer using Ajax search
		   driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlMasterCustomer")).sendKeys("maas");
		   Thread.sleep(5000);
		   
		   //get the ajax container for Master customer
		   WebElement MCajaxContainer = driver.findElement(By.className("ajaxcontainer"));
		   
		   //Values in the container
		   WebElement MCajaxHolder = MCajaxContainer.findElement(By.xpath("//li[@id='3670']"));
		   List<WebElement> MCajaxValues = MCajaxHolder.findElements(By.xpath("//li[@id='3670']"));
		   
		   for (WebElement value : MCajaxValues) {
		      if(value.getText().equals("Maastec's Test empresa & MC(Li & Fung, American, Columbia, Claires and Blend)")){
		         value.click();
		         break;
		      }
		      
		   }
		   
		// enter a Project name
		   WebElement ProjectName = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtProjectName"));
		   ProjectName.clear();
		   ProjectName.sendKeys("Maastec_TestProject16");                                                                                     // change project name everytime
		   
		   // Select Project status
		   Select ProjectStatus = new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlProjectStatus")));
		   ProjectStatus.selectByVisibleText("New");
		   
		// enter a Project Description
		   WebElement ProjectDes = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtProjectDescription"));
		   ProjectDes.clear();
		   ProjectDes.sendKeys("Maastec_TestProject_New");
		   
		   // click on the Submit button
		   WebElement SubmitButton = driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_lnkSubmitProjectDetail']/img"));
		   SubmitButton.click();
		   Thread.sleep(5000);
		   
		 
		   // Switching to Alert        
		 //  Alert alert = driver.switchTo().alert();    
		         
		   // Accepting alert      
		  // alert.accept();    
		   driver.switchTo().alert().accept();
		   
		 //Enter Project Name in search field
		   driver.findElement(By.id("ctl00_txtkeywords")).sendKeys("Maastec_TestProject16");                                                       // change everytime
		   Thread.sleep(3000);
		   
		   //get the ajax container for search field
		   WebElement SearchField = driver.findElement(By.className("ajaxcontainer"));
		   Thread.sleep(3000);
		   
		   //Values in the container
		   WebElement ProjectNameList = SearchField.findElement(By.xpath("//html/body/form/div[7]/table/tbody/tr[1]/td/div/div[4]/table/tbody/tr[2]/td/div/div/table/tbody/tr/td[2]/div/ul/li"));
		   List<WebElement> ProjectSelect = ProjectNameList.findElements(By.xpath("//html/body/form/div[7]/table/tbody/tr[1]/td/div/div[4]/table/tbody/tr[2]/td/div/div/table/tbody/tr/td[2]/div/ul/li"));
		   Thread.sleep(2000);
		   
		   for (WebElement value : ProjectSelect) {
		      if(value.getText().equals("Maastec_TestProject16")){                                                                                  // change everytime
		         value.click();
		         break;
		      }
		      
		   }
		   
		   //Click on Search button
		   WebElement SearchButton = driver.findElement(By.xpath("//html/body/form/div[7]/table/tbody/tr[1]/td/div/div[4]/table/tbody/tr[2]/td/div/div/table/tbody/tr/td[3]/div/a"));
		   SearchButton.click();
		   Thread.sleep(3000);
		   
		   //Click on Search button
		   WebElement ViewItemButton = driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_lvProjects_ctrl0_tdProjectItem > a > img.Iconsize"));
		   ViewItemButton.click();
		   Thread.sleep(4000);
		   
		 //Select Create Project Item option and open pop ups
		   WebDriverWait wait1 = new WebDriverWait(driver, 180);
		   wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder1_ddlActions"))); 
		   Select CreateItemDropdown = new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlActions")));
		   CreateItemDropdown.selectByVisibleText("Create Project Item");
		   
		   Select ProductType = new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlPIProductType")));
		   ProductType.selectByVisibleText("Box");
		   Thread.sleep(500);
		   
		   WebElement ItemCode = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtPICustItemCode"));
		   ItemCode.clear();
		   ItemCode.sendKeys("Gayatri_Test2");                                                                                                                        // change Item code everytime
		   Thread.sleep(500);
		   
		   WebElement ItemDes = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtPIItemDesc"));
		   ItemDes.clear();
		   ItemDes.sendKeys("Gayatri_Mas_Test2");                                                                                                                      // Change item description everytime
		   Thread.sleep(500);
		   
		   Select UOM = new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlPIUOM")));
		   UOM.selectByVisibleText("DOZEN");
		   Thread.sleep(500);
		   
		 //Click on Submit button
		   WebElement Submit = driver.findElement(By.xpath("//span[@id='spnbutton']/img"));
		   Submit.click();
		   Thread.sleep(5000);
		   
		   Alert alert1 = driver.switchTo().alert();    
		   alert1.accept();     
		   
		   
		   
		   
		   }
		  
		  
		  @BeforeMethod
		  
		  public void launchBrowser() {

		     System.out.println("Nexgen Packaging Ltd."); 
		     System.setProperty(browserdriver,driverPath);
		      driver = new ChromeDriver();
		  //   driver=new FirefoxDriver();
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
