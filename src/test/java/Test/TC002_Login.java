package Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.Projectspecification;
import Page.Homepage;
import Page.Login;


	public class TC002_Login extends Projectspecification 
	{
	  
		@BeforeTest
		
		public void setup () throws Exception
		{
			readFromPropFile();
			sheetname ="Login";
		}
		
		
		@Test (dataProvider = "getdata")
		
		public void validLogin (String mailid, String Password,String type, String message) throws Exception

	{
		Homepage obj = new Homepage(driver);
		Login obj2 = new Login(driver);
		
		obj.clickUSA();
		obj.login();
		obj2.entermailid(mailid);
		obj2.enterpassword(Password);
		obj2.loginclick();
	//	obj.validatelogin (type,message);
		
	}
	} 
	