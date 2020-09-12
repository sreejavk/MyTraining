package Firstpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPage {
	  WebDriver driver;
  

	  
	  

		
		
		@CacheLookup
		@FindBy(xpath="//a[(text()='Login')]")
	WebElement Log;
		
		
		@CacheLookup
		@FindBy(name="patUserName")
		WebElement user;
		@CacheLookup
		@FindBy(name="patPassword")
	WebElement password;
		
		@CacheLookup
		@FindBy(className="btnSignIn")
	WebElement sub;
		
	  public void logindetails(String n, String p) {

		  driver.navigate().refresh();
		  
		  Log.click();
		  
		  
		  
		  user.sendKeys(n);
		  password.sendKeys(p);
		  
		  
		  sub.click();
		
		  driver.navigate().to("http://ferro.direct2patient.com/");
	  }
	  public String validatelogintitle()
	  {
		  String a=driver.getTitle();
		  
		return a;
				
	  
	  } 
	  
	  public LoginPage(WebDriver driver)
	{
		  this.driver=driver;
		  PageFactory.initElements(driver, this);
	}
	
	  
	  
	  
	  
	  
	  
	  
  }

