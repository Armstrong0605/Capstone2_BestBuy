package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.Projectspecification;
import Page.Department_Shopping;
import Page.Homepage;
import Page.Menu;

public class TC005_Department_Shopping_Test extends Projectspecification 

{
	@BeforeTest
	public void setup () throws Exception
	{
		readFromPropFile();
	
	}
	
	@Test 
	
	public void Department_shopping_Validation () throws Exception

{
	Homepage obj = new Homepage(driver);
	Department_Shopping obj5 = new Department_Shopping (driver);
	
	obj.clickUSA();
	obj.Menu_Validation ();
	obj5.Validate_Item("open","Page not found");
	obj5.AddtoCart();
	obj5.continueshopping();
	obj5.nextElement();
	
}
} 

