package Testcases.whitbread_brewersfayer_autotests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Welcome {
	
WebDriver driver;
	
	public Welcome(WebDriver ldriver)
	{
		driver=ldriver;
	}
	
	//@FindBy(xpath="//*[text()='Manage Preferences']") WebElement managepref;
	
	@FindBy(xpath="//a[contains(text(),'Manage Preferences')]") WebElement managepref;
	
	public void manageclick() throws InterruptedException
	{
		managepref.click();
		System.out.println("clicked on the Manage preferences link");
		
		Thread.sleep(20);
	}

}
