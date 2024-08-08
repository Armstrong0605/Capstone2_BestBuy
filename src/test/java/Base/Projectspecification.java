package Base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import Utility.Utilityclass;

public class Projectspecification extends Utilityclass {
	
	@BeforeMethod
	public void launchingBrowser() throws Exception {
		
		
		browserLaunch(prop.getProperty("url"),prop.getProperty("browser"));
	}
	
	@AfterMethod
	public void closeBrowser() {
		
	browserClose();
	}
	
	@DataProvider (name = "getdata")
	public String[][] getdata() throws Exception

    {
	
		String [][] data = readExcel(sheetname);
	    
		return data;
    
    }
}
