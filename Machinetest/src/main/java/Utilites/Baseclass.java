package Utilites;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;


import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


  
  public class Baseclass {
	  
	  public WebDriver driver;
	  
	  
		@BeforeClass
		  public void beforeclass() {
		  

			 System.setProperty("webdriver.chrome.driver","C:\\Users\\sreeja\\Desktop\\chromediver\\chromedriver.exe\\");	
			 driver=new ChromeDriver();
			 driver.manage().window().maximize();
			driver.get("http://ferro.direct2patient.com/");
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
		}
		
	  @AfterTest
	  
	  public void afterclass() throws InterruptedException 
	  {
		  //Thread.sleep(5000);
		  //driver.close();
		  
	  }  

	  @DataProvider
	  public Object[][] dp()  throws BiffException,IOException{
	  FileInputStream f= new FileInputStream("C:\\Users\\sreeja\\Desktop\\Machinetest.xls");
	  Workbook w= Workbook.getWorkbook(f);
	  Sheet s=w.getSheet("Sheet1");
	  
	   int rws=s.getRows();
	      int col=s.getColumns();
	      System.out.println("Row"+rws+"coloums"+col);
	      String[][]input=new String[rws][col];
	      for(int i=0;i<rws;i++)
	      {
	        for(int j=0;j<col;j++)
	        
	        {
	        
	       Cell c= s.getCell(j,i);
	        input[i][j]=c.getContents();
	      }
	  }
	      
	  
	  return input;
	  
	  }
	  
	

	  
	  
	  
	  
	  
  }

