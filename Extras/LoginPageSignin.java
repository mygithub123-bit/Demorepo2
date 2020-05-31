package Testcases.whitbread_brewersfayer_autotests.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Factory.DataProviderFactory;

public class LoginPageSignin {
	
WebDriver driver;
	
	public LoginPageSignin(WebDriver ldriver)
	{
		driver=ldriver;
	}
	
	@FindBy(id="yes_account") WebElement Signintab;
	
    @FindBy(id="login") WebElement Emailaddress;
	
	@FindBy(id="password") WebElement password;
	
	@FindBy(xpath="//*[@id=\"div_login\"]/form/button") WebElement ConnectTOwifi;
	
	@FindBy(id="connecting") WebElement Connectbutton;
	
	//@FindBy(xpath="//*[@id=\"body\"]/div[2]/div/div") 



public void clickonsignintab()
{
	Signintab.click();
}

public void verifyPageTitle()
{
	Assert.assertTrue(driver.getTitle().contains("Welcome back"));
	System.out.println("Application Title Verified ");
}

/*public void clickonConnectbutton()
{
	Connectbutton.click();
}*/

/*public void LoginToApplicationsigntab() throws InterruptedException
{
	Emailaddress.sendKeys(DataProviderFactory.getExcelconfig().getStringData("Login",0,0));
	
	System.out.println("Emailaddress entered");
	
  password.sendKeys(DataProviderFactory.getExcelconfig().getStringData("Login",0,1));
	
	System.out.println("password entered");
	
	//confpassword.sendKeys(DataProviderFactory.getExcelconfig().getStringData("Login",0,2));
	
	//System.out.println("conf password entered");

			
	//ContinueButton.click();
	
	//System.out.println("clicked on Continue button");
	
	//Thread.sleep(30);
	
	
}*/










public void ConnectTOwifi()
{
	ConnectTOwifi.click();
}

public void LoginToApplicationsigntab() {
	// TODO Auto-generated method stub
	
	
Emailaddress.sendKeys(DataProviderFactory.getExcelconfig().getStringData("Login",0,0));
	
	System.out.println("Emailaddress entered");
	
  password.sendKeys(DataProviderFactory.getExcelconfig().getStringData("Login",0,1));
	
	System.out.println("password entered");
	
	//confpassword.sendKeys(DataProviderFactory.getExcelconfig().getStringData("Login",0,2));
	
	//System.out.println("conf password entered");

			
	//ContinueButton.click();
	
	//System.out.println("clicked on Continue button");
	
	//Thread.sleep(30);
	
	
}

public void clickonConnectbutton() {
	
	Connectbutton.click();
	System.out.println("clicked on Connect button");
}


public void waittest()
{
	
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}

public void ErrorValidation()
{
	String actual_msg=driver.findElement(By.xpath("//*[@id=\"body\"]/div[2]/div/div")).getText();
	
	System.out.println(actual_msg);
	
	String expected_msg="";
	
	//System.out.println("its blank");
	
	//Assert.assertEquals(actual_msg, expected_msg);
	
	if(expected_msg.equalsIgnoreCase(actual_msg))
	{
		System.out.println("Test Case is Passed No Error Message");
	}
	else {
		System.out.println("Test case is Failed Error msg displayed is" +actual_msg);
	}
			
}




//@Test
/*public void CheckImage() throws Exception {

WebElement ImageFile = driver.findElement(By.xpath("//img[contains(@id,'Test Image')]"));

    Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
    if (!ImagePresent)
    {
         System.out.println("Image not displayed.");
    }
    else
    {
        System.out.println("Image displayed.");
    }*/
}





