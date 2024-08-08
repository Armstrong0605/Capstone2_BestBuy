package Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.Projectspecification;
import Page.Bottom_links;
import Page.Homepage;

public class TC003_Bottomlinks extends Projectspecification 
{
	@BeforeTest
	public void setup () throws Exception
	{
		readFromPropFile();
	
	}
	
	@Test
	
	public void validBottom_link () throws Exception

{
	Homepage obj = new Homepage(driver);
	Bottom_links obj3 = new Bottom_links(driver);
	
	obj.clickUSA();
	obj.Bottom_linktest();
	obj3.validateAccessibilityLink("open","Page not found");
	obj3.validateTerms("open","Page not found");
	obj3.validatePrivacy("open","Page not found");
	obj3.validateAds ("open","Page not found");
	obj3.validateStatePrivacyRights("open","Page not found");
	
}
} 

