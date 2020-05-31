package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Factory.DataProviderFactory;

public class LoginPage {
	
	
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver)
	{
		driver=ldriver;
	}
	
	
	/*@FindBy(id="log") WebElement username;
	
	@FindBy(name="pwd") WebElement password;
	
	@FindBy(xpath=".//*[@id='login']") WebElement loginButton;*/
	
	
   @FindBy(xpath="//*[@id=\"form_tcs\"]/div[1]/label/span") WebElement checkbox1;
	
	@FindBy(xpath="//*[@id=\"form_tcs\"]/div[2]/label/span") WebElement checkbox2;
	
	//@FindBy(xpath="//*[@id=\"confirm") WebElement loginButton;
	
	@FindBy(xpath="//a[contains(text(),'Create account')]") WebElement loginButton;
	
	
	
	
	
	
	
	
	/*public void LoginToApplication()
	{
       username.sendKeys(DataProviderFactory.getExcelconfig().getStringData("Login",0,0));
		
		System.out.println("username entered");
		
      password.sendKeys(DataProviderFactory.getExcelconfig().getStringData("Login",0,1));
		
		System.out.println("password entered");

				
		loginButton.click();
		
		System.out.println("clicked on login button");
	}*/
	
	
	/*public void setUsername()
	{
		//username.sendKeys("selenium");
		
	username.sendKeys(DataProviderFactory.getExcelconfig().getStringData("Login",0,0));
		
		System.out.println("username entered");
		
		

	}*/

	
	/*public void setPassword()
	{
		//password.sendKeys("webdriver");
		
		password.sendKeys(DataProviderFactory.getExcelconfig().getStringData("Login",0,1));
		
		System.out.println("password entered");
	}*/
	
	/*public void clickOnLoginButton()
	{
		loginButton.click();
		
		System.out.println("clicked on login button");
	}*/
	
	public void clickOncheckbox1()
	{
		checkbox1.click();
		
		System.out.println("clicked on checkbox1 button");
	}
	
	
	public void clickOncheckbox2()
	{
		checkbox2.click();
		
		System.out.println("clicked on checkbox2 button");
	}
	
	
	
	public void clickOnLoginButton()
	{
		loginButton.click();
		
		System.out.println("clicked on login button");
	}
}
