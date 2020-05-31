package Testcases.whitbread_brewersfayer_autotests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import utility.BaseClass_WelcomeBack;

public class HomePage{
	
//	private static final String BaseClass_WelcomeBack =null;
	
	WebDriver driver;
	
	public HomePage(WebDriver ldriver)
	{
		driver=ldriver;
	}
	
	@FindBy(xpath="//a[@class='btn btn-register']")
	WebElement Welcomeback;
	
	
	  public void WelcomebackClick() {
	    	
	    	Welcomeback.click();
	    }
	    
	
	/*@FindBy(xpath="//*[@id='account']/a")
	WebElement accountLink;
	
	
	public void clickOnAccountLink()
	{
		boolean status=accountLink.isDisplayed();
		boolean Enablestatus=accountLink.isEnabled();
		
		Assert.assertTrue(status);
		Assert.assertTrue(Enablestatus);
		
		if(status && Enablestatus)
		{
		accountLink.click();
		System.out.println("Click on Link ");
		}
	}
	
	public void verifyPageTitle()
	{
		Assert.assertTrue(driver.getTitle().contains("ONLINE STORE"));
		System.out.println("Application Title Verified ");
	}
*/
}
