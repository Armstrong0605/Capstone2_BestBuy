package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.Projectspecification;

import Page.Homepage;
import Page.Menu;

public class TC004_MenuValidation extends Projectspecification 
{
	@BeforeTest
	public void setup () throws Exception
	{
		readFromPropFile();
	
	}
	
	@Test
	
	public void Menu_Validation () throws Exception

{
	Homepage obj = new Homepage(driver);
	Menu obj4 = new Menu(driver);
	
	obj.clickUSA();
	obj.Menu_Validation ();
	obj4.Validate_Applaiances("open","Page not found");
	obj4.Validate_Brands("open", "Page not found");
	
}
} 



