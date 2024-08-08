package Page;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Projectspecification;

public class Brand_Shopping extends Projectspecification
{
	
		@FindBy (xpath ="//button[normalize-space()='Brands']")
		WebElement Brands;
		
		@FindBy (xpath="//a[normalize-space()='Microsoft']")
		WebElement Microsoft;
		
		@FindBy (xpath = "//h2[normalize-space()='Windows laptops']")
		WebElement Laptopclick;
		
		@FindBy (xpath = "//a[contains(text(),'Lenovo - Ideapad 1 15.6\" Full HD Touchscreen Lapto')]")
		WebElement LaptopSelect;
		
		@FindBy (xpath= "//button[contains(@class,'c-button c-button-primary c-button-lg c-button-block c-button-icon c-button-icon-leading add-to-cart-button')]")
		WebElement Addtocart;
		
		@FindBy (xpath="//a[normalize-space()='Go to Cart']")
		WebElement gotocart;
		
		public Brand_Shopping(WebDriver driver)
		{
			Brand_Shopping.driver = driver;
			
			PageFactory.initElements(driver, this);
		}
		
		public  Brand_Shopping Checkout (String type, String message) 

		{
		  driver.findElement(By.xpath("//button[@aria-label='Menu']")).click();
		  
		  Brands.click();	
		  
		  Microsoft.click();
		   
		  Laptopclick.click();
		   
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   
		   if (type.equalsIgnoreCase("open"))
		   {
			LaptopSelect.click();
			
			String actualTitle = driver.getTitle();
	        
			System.out.println("Actual Title: " + actualTitle);
			
			assert_Check (actualTitle.contains("Lenovo Ideapad 1 15.6\" Full HD Touchscreen Laptop Ryzen 7 5700U with 16GB Memory AMD Radeon Graphics 512GB SSD Cloud Gray 82R400DTUS - Best Buy"),message);
		   }
		   
		    return this;
		}

		private void assert_Check(boolean condition, String message) 
		
		{
		   assertTrue(condition, message);
		}
		
		public void AddtoCart () throws IOException
		{
			Addtocart.click();
			
			screenShot("Brand_Shopping Validation");
		}
		
		public Brand_Shopping GotoCart()
		{
			click(gotocart);
			return this;
		}
		
		public Cart_Page NextStep ()
		{
			return new Cart_Page(driver);
		}
	}


