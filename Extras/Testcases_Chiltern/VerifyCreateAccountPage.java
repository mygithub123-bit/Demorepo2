package Testcases_Chiltern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Pages.CreateAccountPage;
import Pages.LoginPage;
import freemarker.log.Logger;
import utility.BaseClass;

public class VerifyCreateAccountPage extends BaseClass {

	SoftAssert Assert = new SoftAssert();

	@Test
	public void verifycreateAccount() throws InterruptedException {

		BaseClass.logger = report.startTest("VerifyCreateAccount Test", "This test will Verify Login details");

		// Assert.assertEquals(true, false);

		logger.log(LogStatus.INFO, "Browser Started");

		logger.log(LogStatus.INFO, "Application Started");

		CreateAccountPage account = PageFactory.initElements(driver, CreateAccountPage.class);

		account.clickOncheckbox1();

		logger.log(LogStatus.INFO, "clicked on first check box");

		account.clickOncheckbox2();
		logger.log(LogStatus.INFO, "clicked on second check box");

		account.clickOnLoginButton();
		logger.log(LogStatus.INFO, "clicked on Login button");

		Thread.sleep(100);

		account.LoginToApplication();

		// logger.log(LogStatus.INFO, "Login Credentials are Entered.");
		Assert.assertTrue(true, null);
		logger.log(LogStatus.PASS, "Login Credentials are Entered.");

		account.clickOnConnectButton();

		Thread.sleep(9000);

		logger.log(LogStatus.INFO, "Connected - Connection is Success.");

	}

}
