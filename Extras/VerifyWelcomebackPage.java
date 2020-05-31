package Testcases.whitbread_brewersfayer_autotests.Tests;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Pages.CreateAccountPage;
import Pages.CreateAccountPage_WhitBread;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.Welcome;
import utility.BaseClass;
import utility.BaseClass_WelcomeBack;
import utility.CustomSoftAssert;

public class VerifyWelcomebackPage extends BaseClass {
	
	/*WebDriver driver;
	
	public VerifyWelcomebackPage(WebDriver driver) {
		
		this.driver=driver;
	}*/
	
  

	@Test
	public void verifymanageAccountLink() throws InterruptedException {

		
		
		
		/*System.out.println("step1");
		CustomSoftAssert sa4 = new CustomSoftAssert(driver);
		System.out.println("step2");

		BaseClass_WelcomeBack.logger2 = report.startTest("Verify WelcomeBack page  Test",
				"This test will Verify WelcomeBack page");

		Thread.sleep(6000);
		System.out.println("step3");*/
		CreateAccountPage_WhitBread account = PageFactory.initElements(driver, CreateAccountPage_WhitBread.class);

		logger.log(LogStatus.INFO, "Browser Started");

		logger.log(LogStatus.INFO, "Application Startedsssss");
		
		
		account.gmail();
		//logger2.log(LogStatus.INFO, "Application Started");

		/*try {
			
			if (account.WelcomeBackPage()) {
				logger2.log(LogStatus.PASS, "Welcome back page is displayed", "Welcome back page is displayed and validated.");
			} else {
				logger2.log(LogStatus.FAIL, "Welcome back page is not displayed", "welcome back page is not Validated  Whit-Bread portal is Not displayed");
			}
		} catch (WebDriverException e) {
			logger2.log(LogStatus.FAIL, "Verification of welcome back is not Validated", "Failed due to welcomeback is not Validated welcome back page is Not displayed");
		}
		
		String Expected="Welcome back to our Free WiFi";
		String Actual=driver.findElement(By.xpath("//h3[@class='page-header']")).getText();
        
		try {
			
			logger2.log(LogStatus.INFO, "Start Validation-->Welcome back page title is displayed or not");
			sa4.assertEquals(Actual, Expected, "Validation of welcome back Title");
		}catch(WebDriverException e) {
			
			logger2.log(LogStatus.FAIL, "Verification of welcomeback title", "page Tilte is displayed other than welcomeback title");
			
			
		}
		
		
		
		
		
		
		account.WelcomebackClick();*/
	}
	
}
