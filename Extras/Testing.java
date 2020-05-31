package Testcases.whitbread_brewersfayer_autotests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

import Factory.DataProviderFactory;
import Testcases.whitbread_brewersfayer_autotests.utility.WhitBreadCommonMethods;
import Testcases.whitbread_brewersfayer_autotests.utility.WhitBreadCommonMethods1;
import utility.BaseClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.Wait;

public class Testing extends BaseClass {

	private static final String Baseclass = null;

	SoftAssert sa1 = new SoftAssert();

	WebDriver driver;

	public Testing(WebDriver ldriver) {
		driver = ldriver;
	}

	/*
	 * public CreateAccountPage_WhitBread() { PageFactory.initElements(driver,
	 * this); }
	 */

	//@FindBy(xpath = "//input[@id='email']")
	//WebElement click1;
	
	//WebElement wv = driver.findElement(By.xpath("//input[@id='email']"));
	
	String s = "//input[@id='email']";
	
	public void ClickingOnFB() throws InterruptedException {
		WhitBreadCommonMethods1.click(driver, s);		
		WhitBreadCommonMethods1.click(driver, s);
		
		
	}


}
