package Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.Projectspecification;
import Page.Homepage;
import Page.Signup;

public class TC001_Signup extends Projectspecification 
{
  
	@BeforeTest
	public void setup () throws Exception
	{
		readFromPropFile();
		sheetname ="Signup";
	}
		@Test (dataProvider = "getdata")
	public void validSignup (String firstname, String lastname,String mailid, String Password,String CnfrmPassword, String PhoneNumber, String option, String type, String message) throws Exception

{
	Homepage obj = new Homepage(driver);
	Signup obj1 = new Signup(driver);
	
	obj.clickUSA();
	obj1.clickCreateaccount ();
	obj1.enterfirstname(firstname);
	obj1.enterlastname(lastname);
	obj1.entermailid(mailid);
	obj1.enterpassword(Password);
	obj1.Confirmpassword(CnfrmPassword);
	obj1.Phone(PhoneNumber);
	obj1.checkbox(option);
	obj1.Signupclick();
	obj.validateSignup (type,message);
	
}
}
