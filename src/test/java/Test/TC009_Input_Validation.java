package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.Projectspecification;
import Page.Cart_Page;
import Page.Homepage;
import Page.Input_field;

public class TC009_Input_Validation extends Projectspecification 

{
	
	@BeforeTest
	public void setup () throws Exception
	{
		readFromPropFile();
	
	}
	
	@Test
	
	public void Cart_Page_Validation () throws Exception

{
	Homepage obj = new Homepage(driver);
	Input_field obj9 = new Input_field(driver);
	
	obj.clickUSA();
	
	obj9.Inputs();
	
	
}
}
