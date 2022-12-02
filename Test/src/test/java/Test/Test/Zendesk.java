package Test.Test;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;
import org.apache.poi.xssf.usermodel.*;




public class Zendesk {
	


	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\parthsarthi.nishant\\eclipse-workspace\\E2EProject\\E2EProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://nexgenit.zendesk.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//	driver.switchTo().frame(1);
	
		driver.findElement(By.id("user_email")).sendKeys("zendeskalert@googlegroups.com");
		//Thread.sleep(2000);
		driver.findElement(By.name("user[password]")).sendKeys("DRftgyhu12");
		
		driver.findElement(By.id("sign-in-submit-button")).click();
		Thread.sleep(3000);
		WebElement test=driver.findElement(By.id("ember1709"));
		Thread.sleep(3000);
		test.click();
		
		//View entire table
		//System.out.println(driver.findElement(By.id("views_views-ticket-table")).getText());
		
		Thread.sleep(3000);
		String Total=driver.findElement(By.xpath("(//div[@class='sc-1s8ami4-0 gtrjgl'])[1]")).getText();
		
		int iTest = Integer.parseInt(Total);
		System.out.println("Total unsolved Ticket = "+iTest);
		
		String arr[][]= new String [iTest+1][6];
		
		for(int i=2; i<=iTest+2; i++)
		{
			
			try {
				
				
				for(int j=0; j<5;)
				{
					
		
		//Ticket No
		String Ticket=driver.findElement(By.xpath("//*[@id=\"views-ticket-table-56259368-container\"]/div/table/tbody/tr["+i+"]/td[5]")).getText();
		String[] splittedString = Ticket.split("#");
		String tic = ("https://nexgenit.zendesk.com/agent/tickets/"+ splittedString[1].trim());
		arr[i-2][j]=tic;
		//System.out.print(tic);
		j++;
		
		
			
		//Assigned
		
		String excelFilePath=".\\DataFiles\\import.xlsx";
		FileInputStream inputstream=new FileInputStream(excelFilePath);
		XSSFWorkbook workbook=new XSSFWorkbook(inputstream);
		//XSSFSheet sheet=workbook.getSheet("sheet1");
		XSSFSheet sheet=workbook.getSheetAt(0);//Use above line or index

		//Using for loop
		int rows=sheet.getLastRowNum();
		int cols=sheet.getRow(1).getLastCellNum();

		for(int r=0;r<=rows;r++) 
		{
			XSSFRow row=sheet.getRow(r);
			
			for(int c=0;c<2;c++)
			{
				
				
				
				XSSFCell cell=row.getCell(c);
				String data=(cell.getStringCellValue());
				
				if(tic.contains(data))
				{
					c=c+1;
					XSSFCell cell2=row.getCell(c);
					arr[i-2][j]=cell2.getStringCellValue();
					//System.out.print(cell2.getStringCellValue()+",");
				}
				
				
			}
			
		}
		
		
		j++;
		
		// Priority
		String Priority=driver.findElement(By.xpath("//*[@id=\"views-ticket-table-56259368-container\"]/div/table/tbody/tr["+i+"]/td[11]")).getText();
		
		arr[i-2][j]=Priority;
		//System.out.print(Priority+",");
		j++;
		
		//Status Open/Pending
		String open=driver.findElement(By.xpath("//*[@id=\"views-ticket-table-56259368-container\"]/div/table/tbody/tr["+i+"]/td[4]/span/div/div")).getText();
		
		if(open.contains("O"))
		{
			arr[i-2][j]="Open";
			//System.out.print("open,");
		}
		else
		{
			arr[i-2][j]="Pending";
			//System.out.print("Pending,");
		}
		
		j++;
		
		// Created On
		WebElement l=driver.findElement(By.xpath("//*[@id=\"views-ticket-table-56259368-container\"]/div/table/tbody/tr["+i+"]/td[8]/time"));
		String val = l.getAttribute("title");
		String[] splittedString2 = val.split(",");
		arr[i-2][j]=splittedString2[0];
		//System.out.print(splittedString2[0]+",");
		j++;
		
		//Requested by
		String Request=driver.findElement(By.xpath("//*[@id=\"views-ticket-table-56259368-container\"]/div/table/tbody/tr["+i+"]/td[7]")).getText();
		arr[i-2][j]=Request;
		//System.out.print(Request);
		//System.out.println();
				
		
			}
				
			}
			catch (Exception e) {
			     
			    }
		
			
		}
		//---
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet= workbook.createSheet("Emp Info");

		//Using for loop

		int rows=arr.length;
		int cols=arr[0].length;

		for(int r=0;r<rows;r++)
		{
			XSSFRow row=sheet.createRow(r);
			
			for(int c=0;c<cols;c++)
			{
				XSSFCell cell=row.createCell(c);
				Object value=arr[r][c];
				
				if(value instanceof String)
					cell.setCellValue((String)value);
				
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
				
				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);
				
			}
		}
		
		
		
			try
			{
	
			String filePath=".\\DataFiles\\export.xlsx";
		
			FileOutputStream outstream=new FileOutputStream(filePath);
			workbook.write(outstream);
			
			outstream.close();
		
			
			System.out.println("Export.xlsx created successfully");
			}
			catch(Exception ex) {
				System.out.println("File not found");        
			} 
			driver.close();
		
		}
	}
		
	
	


