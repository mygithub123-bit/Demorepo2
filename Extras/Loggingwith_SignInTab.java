package Testcases.whitbread_brewersfayer_autotests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Pages.CreateAccountPage_WhitBread;
import utility.BaseClass;
import utility.CustomSoftAssert;

public class Loggingwith_SignInTab extends BaseClass {
	
	
	@Test
	public void Loggingwith_SignIntab() throws InterruptedException  {

		CustomSoftAssert sa1 = new CustomSoftAssert(driver);

		BaseClass.logger = report.startTest("Verify Loggingwith_SignIntab WhitBread  Test",
				"This test will Verify Login with sign in tab");

		CreateAccountPage_WhitBread account = PageFactory.initElements(driver, CreateAccountPage_WhitBread.class);

		logger.log(LogStatus.INFO, "Browser Started");

		logger.log(LogStatus.INFO, "Application Started");
		
		account.SignInTab();
		
		logger.log(LogStatus.INFO, "Sign in tab is displayed");
		
		account.LoginToSigninTab();

}
}
