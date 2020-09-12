package Firstpage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Homepage {
	WebDriver driver;
	
	@CacheLookup
	@FindBy(id="productSearch")

	WebElement ser;

	
	@CacheLookup
	@FindBy(xpath="//li[@id='hemax-caplets']")

	WebElement cli;

	

			
	
		
	  
		  public void Product() throws AWTException {

			  
			//driver.navigate().refresh();
			 
			ser.sendKeys("Hemax Hematinic Caplets");
			  ser.click();
			  cli.click();
			  
			 // Select s= new Select(ser);//in select we pass object but in action class we pass driver
			  
			 //Robot r=new Robot();
			  
			 // r.keyPress(KeyEvent.VK_ENTER);
			  //s.selectByVisibleText("Hemax Hematinic Caplets");
			  
			  
			 // ser.sendKeys("Hemax Hematinic Caplets");
			 // ser.click();
			  	
			  //Actions act=new Actions(driver);
			  //act.moveToElement(ser).perform();
			
			 
	  }
		  
		

		public Homepage(WebDriver driver) {
			this.driver=driver;
			  PageFactory.initElements(driver, this);
			
			
		


  
	  
	  
	  
  }
}
