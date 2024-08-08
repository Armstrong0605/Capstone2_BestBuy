package Test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.Projectspecification;
import Page.Brand_Shopping;
import Page.Cart_Page;
import Page.Checkout_Page;
import Page.Department_Shopping;
import Page.Homepage;

public class TC008_PaymentComplete_test extends Projectspecification

{
	@BeforeTest
	public void setup () throws Exception
	{
		readFromPropFile();
	
	}
	
	@Test 
	
	public void Payment_Validation() throws IOException
	{
		Homepage obj = new Homepage(driver);
		Department_Shopping obj5 = new Department_Shopping (driver);
		Brand_Shopping obj6 = new Brand_Shopping(driver);
		Cart_Page obj7 = new Cart_Page(driver);
		Checkout_Page obj8 = new Checkout_Page(driver);
		
		
		obj.clickUSA();
		obj.Menu_Validation ();
		obj5.Validate_Item("open","Page not found");
		obj5.AddtoCart();
		obj5.continueshopping();
		obj5.nextElement();
		obj6.Checkout ("open", "Page not Found");
    	obj6.AddtoCart();
		obj6.NextStep();
	//	obj7.Add_Cart ();
		obj8.Checkout_Validation();
	}
}
