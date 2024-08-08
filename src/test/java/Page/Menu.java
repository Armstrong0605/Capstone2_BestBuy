package Page;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Projectspecification;

public class Menu extends Projectspecification 
{
	
	@FindBy (xpath ="//button[normalize-space()='Appliances']")
	WebElement applainces;
	
	@FindBy (xpath="//button[normalize-space()='Major Kitchen Appliances']")
	WebElement applaincedropdown1;
	
	@FindBy (xpath = "//a[normalize-space()='Dishwashers']")
	WebElement applaiancedropdown2;
	
	@FindBy (xpath = "//button[normalize-space()='Brands']")
	WebElement Brand;
	
	@FindBy (xpath = "//a[normalize-space()='Apple']")
	WebElement Branddropdown;
	
public  Menu(WebDriver driver) 

{
  Menu.driver = driver;
  
  PageFactory.initElements(driver, this);
 
	}

public Menu Validate_Applaiances (String type, String message) 

{
   applainces.click();	
   applaincedropdown1.click();
   
   if (type.equalsIgnoreCase("open"))
   {
	applaiancedropdown2.click();
	
	String actualTitle = driver.getTitle();
	
	assert_Check (actualTitle.contains("Dishwashers"),message);
   }
   
    return this;
}

private void assert_Check(boolean condition, String message) {
    assertTrue(condition, message);
}


public Menu Validate_Brands (String type, String message) 

{ 
 driver.findElement(By.xpath("//button[@aria-label='Menu']")).click();
   Brand.click();	
   
   if (type.equalsIgnoreCase("open"))
   {
	
	Branddropdown.click();
	
	String actualTitle = driver.getTitle();
	
	assert_Check1 (actualTitle.contains("Apple"),message);
   }
   
    return this;
}

private void assert_Check1 (boolean condition, String message) {
    assertTrue(condition, message);
}
}

