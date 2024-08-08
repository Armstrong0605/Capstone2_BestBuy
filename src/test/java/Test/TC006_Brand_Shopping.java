package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.Projectspecification;
import Page.Brand_Shopping;
import Page.Department_Shopping;
import Page.Homepage;

public class TC006_Brand_Shopping extends Projectspecification

{
	@BeforeTest
	public void setup () throws Exception
	{
		readFromPropFile();
	
	}
	
	@Test
	
	public void Brand_shopping_Validation () throws Exception

{
	Homepage obj = new Homepage(driver);
	Brand_Shopping obj6 = new Brand_Shopping(driver);
	
	 obj.clickUSA();
	
	obj6.Checkout ("open", "Page not Found");
	obj6.AddtoCart();
	obj6.NextStep();
	
}
}
