package Page;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Projectspecification;

public class Department_Shopping extends Projectspecification 

{
	@FindBy (xpath ="//button[normalize-space()='TV & Home Theater']")
	WebElement TV;
	
	@FindBy (xpath="//button[normalize-space()='TVs by Size']")
	WebElement TVdropdown1;
	
	@FindBy (xpath = "//a[normalize-space()='85-Inch or Larger TVs']")
	WebElement TVdropdown2 ;
	
	@FindBy (xpath = "//a[contains(text(),'TCL - 85\" Class S5-Series 4K UHD HDR LED Smart Goo')]")
	WebElement TVSelection1;
	
	@FindBy (xpath= "//button[@class='c-button c-button-primary c-button-lg c-button-block c-button-icon c-button-icon-leading add-to-cart-button ']")
	WebElement Addtocart;
	
	@FindBy (xpath="//button[normalize-space()='Continue shopping']")
	WebElement Continue;
	
	public Department_Shopping(WebDriver driver)
	{
		Department_Shopping.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public Department_Shopping Validate_Item (String type, String message) throws IOException 

	{
	   TV.click();	
	  
	   TVdropdown1.click();
	   
	   TVdropdown2.click();
	   
	   if (type.equalsIgnoreCase("open"))
	   {
		TVSelection1.click();
		
		String actualTitle = driver.getTitle();
        
		System.out.println("Actual Title: " + actualTitle);
		
		assert_Check (actualTitle.contains("TCL 85\" Class S5-Series 4K UHD HDR LED Smart Google TV (2024) 85S551G - Best Buy"),message);
		
		screenShot("Department_Shopping Validation");
	   }
	   
	    return this;
	}

	private void assert_Check(boolean condition, String message) {
	    assertTrue(condition, message);
	
}
	
	public void AddtoCart ()
	{
		Addtocart.click();
	}
	
	public Department_Shopping continueshopping ()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		click(Continue);
		return this;
	}
	
	public Brand_Shopping nextElement()
	{
		return new Brand_Shopping(driver);
	}
}
