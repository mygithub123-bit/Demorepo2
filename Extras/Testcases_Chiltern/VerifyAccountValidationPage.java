package Testcases_Chiltern;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Pages.AccountValidationPage;
import utility.BaseClass1;

public class VerifyAccountValidationPage extends BaseClass1 {

	@Test
	public void verifyAccountvalidation() throws InterruptedException {

		BaseClass1.logger1 = report.startTest("VerifyAccountValidation Test",
				"This test will Verify Account Validation details");
		AccountValidationPage Validation = PageFactory.initElements(driver, AccountValidationPage.class);

		logger1.log(LogStatus.INFO, "Browser Started");

		logger1.log(LogStatus.INFO, "Application Started");

		Validation.LoginToGmailusername();
		logger1.log(LogStatus.PASS, "Username Entered");

		Validation.GmailNextbutton();
		logger1.log(LogStatus.INFO, "clicked on Next button");

		Validation.LoginToGmailpassword();

		logger1.log(LogStatus.PASS, "Password Entered");

		Validation.GmailPasswordNext();

		logger1.log(LogStatus.INFO, "clicked on Next button");

		Validation.GamilGoogle_apps();

		logger1.log(LogStatus.INFO, "clicked on Google_apps button");

		Validation.Gmailgmailicon();

		Thread.sleep(2000);

		logger1.log(LogStatus.INFO, "clicked on gmailicon button");

		Validation.getTextFromElements();

		logger1.log(LogStatus.PASS, "Account is Validated - User is connected to Chiltern Wifi");

		logger1.log(LogStatus.PASS, "Validated Email Link and Manage Preferneces");

		Thread.sleep(5000);

	}

}
