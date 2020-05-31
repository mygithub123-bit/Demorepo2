package Testcases.whitbread_brewersfayer_autotests.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Pages.CreateAccountPage_WhitBread;
import utility.BaseClass;
import utility.CustomSoftAssert;

public class Verification_Registered_UserForgot_Password extends BaseClass {

	@Test
	public void verification_Registered_UserForgot_Password() throws InterruptedException {

		CustomSoftAssert sa3 = new CustomSoftAssert(driver);

		BaseClass.logger = report.startTest("Verify Registered User - Forgot Password Test",
				"This test will Verify user Forgot Password details");

		CreateAccountPage_WhitBread account = PageFactory.initElements(driver, CreateAccountPage_WhitBread.class);

		logger.log(LogStatus.INFO, "Browser Started");

		logger.log(LogStatus.INFO, "Application Started");

		try {
			if (account.homepagedisplayed()) {
				logger.log(LogStatus.PASS, "Verification of portal", "Whit-Bread portal is displayed");
			} else {
				logger.log(LogStatus.FAIL, "Verification of portal", "Whit-Bread portal is Not displayed");
			}
		} catch (WebDriverException e) {
			logger.log(LogStatus.FAIL, "Verification of portal", "Failed due to Whit-Bread portal is Not displayed");
		}

		account.SignInTab();

		Thread.sleep(4000);

		// String ActualSignIntext =
		// driver.findElement(By.xpath("//a[@class='misc-link']")).getText();
		String ActualSignIntext = driver
				.findElement(By.xpath("//p[contains(text(),'Existing WiFi account holder sign in')]")).getText();
		String ExpectedSignIntext = "Existing WiFi account holder sign in";

		System.out.println(ActualSignIntext);

		try {

			logger.log(LogStatus.INFO,
					"Start Validation :-> Verification of SignIn header title Existing WiFi account holder sign in field is displayed correct or not");
			sa3.assertEquals(ActualSignIntext, ExpectedSignIntext,
					"Validation of SignIn header title Existing WiFi account holder sign in");

		} catch (WebDriverException e) {
			logger.log(LogStatus.FAIL, "Validation SignIn header title",
					"Validation of SignIn header title Existing WiFi account holder sign in is not displayed correctly");
		}

		account.ForgotPasswordLink();

		String ActualForgottenText = driver
				.findElement(By.xpath("//p[contains(text(),'Please enter your email address below. If recognis')]"))
				.getText();
		String ExpectedForgottenText = "Please enter your email address below. If recognised, you will be sent a reset link.";

		System.out.println(ActualForgottenText);

		try {

			logger.log(LogStatus.INFO,
					"Start Validation :-> Verification of Forgotten password? page title is displayed correct or not");
			sa3.assertEquals(ActualForgottenText, ExpectedForgottenText,
					"Validation of Forgotten password? page title is");

		} catch (WebDriverException e) {
			logger.log(LogStatus.FAIL, "Validation of Forgotten password? page title is",
					"Validation of Forgotten password? page title is not displayed correctly");
		}

		account.ForgotPasswordEmailLogin();
		account.ClickonContinue();

		String ActualPasswordReset = driver
				.findElement(By.xpath("//p[contains(text(),'A reset link has been sent to your email.')]")).getText();
		String ExpectedPasswordReset = "A reset link has been sent to your email.";

		System.out.println(ActualPasswordReset);

		try {

			logger.log(LogStatus.INFO,
					"Start Validation :-> Verification of password reset link has been sent page title is displayed correct or not");
			sa3.assertEquals(ActualPasswordReset, ExpectedPasswordReset,
					"Validation of Password reset link sent title /text displayed ");

		} catch (WebDriverException e) {
			logger.log(LogStatus.FAIL, "Validation of Password reset link title",
					"Validation of Password reset link sent title page is not displayed correctly");
		}

		account.BacktoSignInButton();

		System.out.println("forgot password");

		account.clickOncheckbox1();

		logger.log(LogStatus.INFO, "clicked on first check box");

		account.clickOncheckbox2();
		logger.log(LogStatus.INFO, "clicked on second check box");

		account.clickOnLoginButton();
		logger.log(LogStatus.INFO, "clicked on Login button");

		// account.ForgotPasswordEmailLogin();

		// account.ClickonContinue();

		account.LoginToApplication();
		Assert.assertTrue(true);
		logger.log(LogStatus.PASS, "Login to the portal","Login credentials are entered and login is success for forgot password");
		logger.log(LogStatus.INFO, "Login credentials are entered and login is successfull.");

		account.clickOnConnectButton();

		Thread.sleep(9000);

		logger.log(LogStatus.INFO, "Connected - Connection is Success.");
		
		sa3.assertAll();

	}
}
