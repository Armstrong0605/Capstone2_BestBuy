package Page;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Projectspecification;

public class Checkout_Page extends Projectspecification 

{
	
	@FindBy (xpath = "//span[@class='cart-label']")
	WebElement cart;
	
	@FindBy (xpath="//button[normalize-space()='Checkout']")
	WebElement Checkout;
	
	@FindBy (xpath= "//button[text()='Continue as Guest']")
	WebElement Guest;
	
	@FindBy (id="user.emailAddress")
	WebElement mail;
	
	@FindBy (xpath="//input[@id='user.phone']")
	WebElement Phonenumberverification;
	
	@FindBy (xpath="//label[@for='text-updates']")
	WebElement CheckBox;
	
	@FindBy (xpath="//span[normalize-space()='Continue to Payment Information']")
	WebElement PaymentInformation;
	
  public Checkout_Page(WebDriver driver)
  
      {
	  Checkout_Page.driver = driver;
	  PageFactory.initElements(driver, this);
	  }
  
  public void Checkout_Validation() throws IOException 
  {
	  click(cart);
	  click(Checkout);
	  click(Guest);
	  sendkeys(mail,"jennerarmstrong2002@gmail.com");
	  sendkeys(Phonenumberverification, "6465554099");
	  click(CheckBox);
	  click(PaymentInformation);
	  screenShot("Payment Validation");
  }
  
  
  
  
}
