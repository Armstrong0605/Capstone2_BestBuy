package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.Projectspecification;
import Page.Homepage;

public class Homepage extends Projectspecification {
	
	public Homepage(WebDriver driver) 
	{
		Homepage.driver=driver;
	}
	
	@FindBy(xpath = "//button[normalize-space()='Skip for now']")
	WebElement validSignuptext;
	
	@FindBy (xpath ="//p[normalize-space()='Please enter a valid email address.']")
	WebElement invalidloginText;
	
	
	public Signup clickUSA ()
	{
		  driver.findElement(By.xpath("//div[@lang='en']//img[@alt='United States']")).click();
		  return new Signup (driver);
	}
	
	public Login login ()
	{
		driver.findElement(By.xpath("//span[@class='v-p-right-xxs line-clamp']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Sign In']")).click();
		
		return new Login (driver);
		 
	}
public Homepage validateSignup(String type, String message) throws Exception {
		
		
		if(type.equalsIgnoreCase("valid"))
		{
			
		String actualtext = validSignuptext.getText();
		
		screenShot("Valid SignupTest_Validation");
		
		soft_assert(actualtext,message);
		
		
		} 
		else if(type.equalsIgnoreCase("invalidemail")) 
		{
		
		String actualErrorMsg = invalidloginText.getText();
		
		screenShot("Invalid LoginTest_Validation");
		
		soft_assert(actualErrorMsg, message);
		
		}
		return this;

	} 




    public Bottom_links Bottom_linktest() 
   
    {
    return new Bottom_links(driver);	
    }
     
    public Menu Menu_Validation ()
    {
     driver.findElement(By.xpath("//button[@aria-label='Menu']")).click();
     return new Menu(driver);
    }
    
    public Department_Shopping Department_Shopping ()
    {
    	return new Department_Shopping(driver);
    }
    
    public Brand_Shopping Brand_Shopping ()
    {
    	return new Brand_Shopping(driver);
    }
    
    public Cart_Page Opencart ()
    {
    	driver.findElement(By.xpath("//span[@class='cart-label']")).click();
    	return new Cart_Page(driver);
    }
}


	

