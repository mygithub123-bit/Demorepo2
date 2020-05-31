package Testcases.whitbread_brewersfayer_autotests.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Pages.AccountValidationPage;
import Pages.AccountValidationPage_WhitBread;
import utility.BaseClass1;

public class VerifyAccountValidationPage_WhitBread extends BaseClass1 {

	@Test
	public void verifyAccountvalidation() throws InterruptedException {

		BaseClass1.logger1 = report.startTest("Verify WhitBread AccountValidation Test",
				"This test will Verify Account Validation details");
		AccountValidationPage_WhitBread Validation = PageFactory.initElements(driver,
				AccountValidationPage_WhitBread.class);

		logger1.log(LogStatus.INFO, "Browser Started");

		logger1.log(LogStatus.INFO, "Application Started");
		
	

		Validation.LoginToGmailusername();
		logger1.log(LogStatus.INFO, "Username Entered");

		Validation.GmailNextbutton();
		logger1.log(LogStatus.INFO, "clicked on Next button");

		Validation.LoginToGmailpassword();

		logger1.log(LogStatus.INFO, "Password Entered");

		Validation.GmailPasswordNext();

		logger1.log(LogStatus.INFO, "clicked on Next button");

		Validation.GamilGoogle_apps();

		logger1.log(LogStatus.INFO, "clicked on Google_apps button");

		Validation.Gmailgmailicon();

		Thread.sleep(9000);

		logger1.log(LogStatus.INFO, "clicked on gmailicon button");

		Validation.getTextFromElements();

		logger1.log(LogStatus.INFO, "Account is Validated - User is connected to WhitBread Wifi");

		// logger1.log(LogStatus.INFO, "Validated Email Link and Manage Preferneces");

		// logger1.log(LogStatus.INFO, "Performed Forget device and delete operation");

		logger1.log(LogStatus.INFO, "Test Completed");

		Thread.sleep(4000);

	}

}