package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.Projectspecification;

public class Cart_Page extends Projectspecification { 


	@FindBy (xpath="//a[normalize-space()='Go to Cart']")
	WebElement gotocart;
	
	
public Cart_Page(WebDriver driver)
{
	Cart_Page.driver = driver;
	PageFactory.initElements(driver, this);
	
	}
	
     public  Cart_Page Add_Cart () {
    	 
     click(gotocart);
     
	 WebElement Element1 = driver.findElement(By.xpath("//a[contains(text(),'TCL - 85\" Class S5-Series 4K UHD HDR LED Smart Goo')]"));
     
	 WebElement Element2 = driver.findElement(By.xpath("//span[contains(text(),'Lenovo Ideapad 1i 15.6\" FHD Touchscreen Laptop - I')]"));
	
     Assert.assertTrue(Element1.isDisplayed(), "TV item is not present in the cart");
     
     if (Element1.isDisplayed())
     {
    	 System.out.println("TV is added to Cart");
     }
     
     Assert.assertTrue(Element2.isDisplayed(), "Lenovo item is not present in the cart");
     
     if (Element2.isDisplayed())
      {
    	  System.out.println("Laptop is Added to Cart");
      }
     return this;

}
}