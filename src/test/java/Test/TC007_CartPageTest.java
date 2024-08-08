package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.Projectspecification;
import Page.Cart_Page;
import Page.Homepage;

public class TC007_CartPageTest extends Projectspecification 

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
		Cart_Page obj7 = new Cart_Page(driver);
		
		obj.clickUSA();
		
		obj7.Add_Cart ();
		
		
	}
	}

