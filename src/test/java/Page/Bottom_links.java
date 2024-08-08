package Page;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.Projectspecification;



public class Bottom_links extends Projectspecification {


@FindBy (xpath ="//a[normalize-space()='Accessibility']")
WebElement Accessibility;

@FindBy (xpath= "//a[normalize-space()='Terms & Conditions']")
WebElement Terms;

@FindBy (xpath="//a[normalize-space()='Privacy']")
WebElement Privacy;

@FindBy (xpath="//a[normalize-space()='Interest-Based Ads']")
WebElement Ads;

@FindBy (xpath = "//a[normalize-space()='State Privacy Rights']")
WebElement StatePrivacyRights;


 public Bottom_links ( WebDriver driver)
 {
	 Bottom_links. driver = driver;
	 PageFactory.initElements(driver, this);
	
 }
 
 public  Bottom_links validateAccessibilityLink(String type, String message) throws Exception {
    
	 if (type.equalsIgnoreCase("open")) {
        
         Accessibility.click();

         String actualTitle = driver.getTitle();
        
         assert_Check(actualTitle.contains("Accessibility"), message);
     }
     
	 return this;
 }

    private void assert_Check(boolean condition, String message) {
     assertTrue(condition, message);
 }
    
    public  Bottom_links validateTerms(String type, String message) throws Exception {
        
   	 if (type.equalsIgnoreCase("open")) {
           
            Terms.click();

            String actualTitle = driver.getTitle();
           
            assert_Check1(actualTitle.contains("Terms and Conditions"), message);
        }
        
   	 return this;
    }

       private void assert_Check1(boolean condition, String message) {
        assertTrue(condition, message);
    }
       
       public  Bottom_links validatePrivacy(String type, String message) throws Exception {
           
     if (type.equalsIgnoreCase("open")) {
    	           
    	 Privacy.click();
 
    	 String actualTitle = driver.getTitle();
    	           
        assert_Check2(actualTitle.contains("Privacy"), message);
    	        
     }
    	        
    return this;
    	    }

    private void assert_Check2(boolean condition, String message) {
    	        
    assertTrue(condition, message);
    	   
    }
    	
    public  Bottom_links validateAds(String type, String message) throws Exception {
    	           
    if (type.equalsIgnoreCase("open")) 
    {
    	    	           
    	    Ads.click();
            String actualTitle = driver.getTitle();
    	   assert_Check3(actualTitle.contains("Interest-Based Ads"), message);
    }
    	    return this;
     }

      private void assert_Check3(boolean condition, String message) 
      {
      assertTrue(condition, message);
      }
      
     public  Bottom_links validateStatePrivacyRights(String type, String message) throws Exception {
    	    	           
    	   if (type.equalsIgnoreCase("open")) {
    	    	    	           
    		   StatePrivacyRights .click();

    	    String actualTitle = driver.getTitle();
    	    	    	           
    	   assert_Check4(actualTitle.contains("State Privacy Rights"), message);
    	    	    	       
    	   }
    	    	    	        
    	   return this;
    	   
    	   }

    	   private void assert_Check4(boolean condition, String message) {
    	   
    		   assertTrue(condition, message);
    	    	    	    
    	   }
    	  
    	   public Homepage returnhome()
    	   {
    		  return new Homepage(driver);
    	   }
    	 
 
}
