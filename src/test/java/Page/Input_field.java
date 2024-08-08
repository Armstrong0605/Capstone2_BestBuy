package Page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Base.Projectspecification;

public class Input_field extends Projectspecification 

{
	
	@FindBy(xpath ="//input[@id='gh-search-input']")
	WebElement input;
	
	@FindBy(xpath ="//span[@class='header-search-icon']//*[name()='svg']")
	WebElement search;
	
	@FindBy(xpath="//h3[@class='no-results-message-new']/strong")
	WebElement error;
	
  public Input_field (WebDriver driver)
  {
	  Input_field.driver = driver;
	  PageFactory.initElements(driver, this);
  }
  
  public void Inputs () throws IOException
  {
	  sendkeys(input,"123456789");
	  click(search);
	  WebElement noresult = driver.findElement(By.xpath("//h3[@class='no-results-message-new']/strong"));
	  String expectedMessage = "Hmmm, we didn't find anything for \"123456789\"";
	  String actualMessage = noresult.getText();
	  Assert.assertTrue(actualMessage.contains("123456789"), "No results message does not contain the search term.");
	  screenShot("Input Validation");   
  }

  }

