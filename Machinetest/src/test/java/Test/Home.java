package Test;

import org.testng.annotations.Test;

import java.awt.AWTException;


import Firstpage.Homepage;
import Firstpage.LoginPage;
import Utilites.Baseclass;

public class Home  extends Baseclass{

		 LoginPage l;
		 Homepage h;
		 
		/*@Test(dataProvider = "dp")
		 public void login(String n, String p)  {
			  System.out.println(n +p);
			  
			l=new LoginPage(driver);
			  l.logindetails(n,p);
			
	  
		}*/
		 
		 @Test
		 
		 public void Hometest() throws AWTException
		 {
			  
			   h=new Homepage(driver);
			  h.Product();
			  
		  }
		}

		 

