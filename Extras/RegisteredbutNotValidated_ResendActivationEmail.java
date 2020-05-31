package Testcases.whitbread_brewersfayer_autotests.Tests;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;

import Pages.CreateAccountPage_WhitBread;
import utility.BaseClass;
import utility.CustomSoftAssert;

public class RegisteredbutNotValidated_ResendActivationEmail extends BaseClass {

	@Test

	public void RegisteredbutNotValidated_resendActivationEmail() throws InterruptedException {

		
		
		System.out.println("step1");
		CustomSoftAssert sa3 = new CustomSoftAssert(driver);
		System.out.println("step2");

		//BaseClass.logger = report.startTest("Verify RegisteredbutNotValidated_ResendActivationEmail  Test",
				//"This test will Verify RegisteredbutNotValidated_ResendActivationEmail");

		Thread.sleep(6000);
		System.out.println("step3");
		CreateAccountPage_WhitBread account = PageFactory.initElements(driver, CreateAccountPage_WhitBread.class);

		logger.log(LogStatus.INFO, "Browser Started");

		logger.log(LogStatus.INFO, "Application Started");

		// account.gmail();

		try {
			System.out.println("step4");
			if (account.EmailnotValidated()) {
				logger.log(LogStatus.PASS, "Verification of Email not Validated portal",
						"Email not Validated Whit-Bread portal is displayed");
			} else {
				logger.log(LogStatus.FAIL, "Verification of Email not Validated portal",
						"Email not Validated  Whit-Bread portal is Not displayed");
			}
		} catch (WebDriverException e) {
			logger.log(LogStatus.FAIL, "Verification of Email not Validated portal",
					"Failed due to Email not Validated Whit-Bread portal is Not displayed");
		}

		Thread.sleep(5000);
		System.out.println("step3");
		account.ClickonResendActivationEmail();

		account.LogintoResendActivationPageEmail();

		account.VerifyEmailbutton();

		String ActualVerifyEmail = driver.findElement(By.xpath("//h1[contains(text(),'Unrecognised email address')]"))
				.getText();

		String ExpectedVerifyEmail = "Unrecognised email address";

		try {

			logger.log(LogStatus.INFO,
					"Start Validation :-> Verification of LogintoResendActivationPageEmail page title is displayed correct or not");
			sa3.assertEquals(ActualVerifyEmail, ExpectedVerifyEmail,
					"Validation of LogintoResendActivationPageEmail title /text displayed ");

		} catch (WebDriverException e) {
			logger.log(LogStatus.FAIL, "Validation of LogintoResendActivationPageEmail title",
					"Validation of LogintoResendActivationPageEmail title page is not displayed correctly");
		}

		account.ClickonRegister();

		account.clickOncheckbox1();

		logger.log(LogStatus.INFO, "clicked on first check box");

		account.clickOncheckbox2();
		logger.log(LogStatus.INFO, "clicked on second check box");

		account.clickOnLoginButton();
		logger.log(LogStatus.INFO, "clicked on Login button");

		Thread.sleep(1000);

		String expectedTitle = "Register for our Free WiFi";
		String actualTitle = driver.findElement(By.xpath("//h3[text()=' Register for our Free WiFi']")).getText();
		System.out.println("helllooo");

		try {

			logger.log(LogStatus.INFO,
					"Start Validation :-> Verification of Registration page Title is displayed correct or not");

			sa3.assertEquals(actualTitle, expectedTitle, "Validation of Registration page Title");

		} catch (WebDriverException e) {

			logger.log(LogStatus.FAIL, "Verification of portal",
					"Page Title is displayed other than Register for our Free WiFi");

		}

		account.LoginToApplication();

		String expectedTitle1 = "You now have temporary access";

		String actualTitle1 = driver.findElement(By.xpath("//h3[@class='page-header']")).getText();

		System.out.println(actualTitle);

		try {

			logger.log(LogStatus.INFO, "Start Validation :-> Verification of " + "You now have temporary access"
					+ " title is displayed correct or not");

			sa3.assertEquals(actualTitle1, expectedTitle1, "Page Title is displaying as : " + actualTitle1);

			logger.log(LogStatus.INFO, "Login Credentials are Entered.");

		} catch (WebDriverException e) {

			logger.log(LogStatus.INFO, "Login Credentials are Entered and login is successful");
			logger.log(LogStatus.FAIL, "Page Title is displayed other than You now have temporary access");

		}

		account.clickOnConnectButton();

		Thread.sleep(9000);

		logger.log(LogStatus.INFO, "Connected - Connection is Success.");

		sa3.assertAll();

	}

}
