package Page;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Projectspecification;

public class Login extends Projectspecification {

	@FindBy (id="fld-e") WebElement Mailid;
	@FindBy (id = "fld-p1") WebElement password;
	@FindBy (xpath = "//button[@type='submit']") WebElement login;
	
	public Login(WebDriver driver) {
		
		Login.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public Login entermailid(String mailid)
	{
		sendkeys(Mailid, mailid);
		
		return this;
	}
	
	public Login enterpassword (String Password)
	{
		sendkeys (password, Password);
		
		return this;
	}
	
	public Homepage loginclick() throws IOException
	{
		click(login);
		
		screenShot("Login Validation");
		
		return new Homepage(driver);
	}
	

}
