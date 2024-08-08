package Page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Projectspecification;

public class Signup extends Projectspecification{

	
	@FindBy (id = "firstName") WebElement Firstname;
	@FindBy (id= "lastName") WebElement Lastname;
	@FindBy (id = "email") WebElement Mailid;
	@FindBy (id = "fld-p1") WebElement Passfield;
	@FindBy (id = "reenterPassword") WebElement CnfrmPass;
	@FindBy (id = "phone") WebElement Phonenumber;
	@FindBy (xpath = "//input[@id='is-recovery-phone']") WebElement checkbox;
	@FindBy (xpath = "//button[@type='submit']") WebElement Createaccount;
	@FindBy (xpath ="//button[normalize-space()='Skip for now']")WebElement Skipnow;
	

	public Signup(WebDriver driver) 
	{
		Signup.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clickCreateaccount ()
	{
		driver.findElement(By.xpath("//span[@class='v-p-right-xxs line-clamp']")).click();
		driver.findElement(By.xpath("//a[contains(@class, 'create-account-btn')]")).click();
	}
	public Signup enterfirstname (String firstname)
	{
	   sendkeys(Firstname, firstname);
	   return this;
	}
	public Signup enterlastname (String lastname)
	{
		sendkeys (Lastname,lastname);
		return this;
	}
	public Signup entermailid (String mailid)
	{
		sendkeys (Mailid, mailid);
		return this;
	}
	public Signup enterpassword (String Password)
	{
		sendkeys (Passfield, Password);
		return this;
	}
    public Signup Confirmpassword (String CnfrmPassword)
    {
    	sendkeys (CnfrmPass, CnfrmPassword);
    	return this;
    }
    public Signup Phone (String PhoneNumber)
    {
    	sendkeys (Phonenumber, PhoneNumber);
    	return this;
    }
    public Signup checkbox(String option) throws IOException {
        if ("yes".equalsIgnoreCase(option)) {
            if (!checkbox.isSelected()) {
                checkbox.click();
                
                screenShot("Signup Validation");
            }
        }
        return this;
    }
    
    public Homepage Signupclick()
    {
    	click(Createaccount);
    	click (Skipnow);
    	return new Homepage(driver);
    }
   	
    }
    

