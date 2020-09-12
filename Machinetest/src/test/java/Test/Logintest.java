package Test;

import org.testng.annotations.Test;

import Firstpage.LoginPage;
import Utilites.Baseclass;





public class Logintest extends Baseclass {
  

		 LoginPage l;
		 
		 @Test(dataProvider = "dp")
		 public void login(String n, String p)  {
			  System.out.println(n +p);
			   l=new LoginPage(driver);
			  l.logindetails(n,p);
			

		 }
		 @Test 
			public void validateloginpagetest()
			{    
				  String b=l.validatelogintitle();
				  System.out.println(b);
				
			  }
		 
		
	  
	  
	  
  }

