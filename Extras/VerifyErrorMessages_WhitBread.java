package Testcases.whitbread_brewersfayer_autotests.Tests;

import java.util.logging.Logger;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Pages.CreateAccountPage_WhitBread;
import utility.BaseClass;
import utility.CustomSoftAssert;

public class VerifyErrorMessages_WhitBread extends BaseClass {

	@Test
	public void verifycreateAccountWhitBread() throws InterruptedException {

		CustomSoftAssert sa2 = new CustomSoftAssert(driver);

		BaseClass.logger = report.startTest("VerifyErrorMEssages WhitBread  Test",
				"This test will Verify ErrorMEssages");

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

		driver.findElement(By.xpath("//a[text()='terms and conditions']")).click();

		WebElement modal = driver.findElement(By.xpath("//a[@class='misc-link inline-misc modal-open']"));
		String parent = modal.getText();
		System.out.println("test1 " + parent);

		String Actuallinktextpopup = modal.findElement(By.xpath("//h3[contains(text(),'Terms and Conditions')]"))
				.getText();

		System.out.println(Actuallinktextpopup);

		String Expectedlinktextpopup = "Terms and Conditions123";

		try {

			logger.log(LogStatus.INFO,
					"Start Validation :-> Verification of Terms and Conditions link is working or not");

			sa2.assertEquals(Actuallinktextpopup, Expectedlinktextpopup, "Validation of terms and conditions link");

			// logger.log(LogStatus.PASS, "Validation of terms and conditions link is
			// Successfull");
		} catch (WebDriverException e) {

			logger.log(LogStatus.FAIL, "Verification of terms and conditions link",
					"Validation of terms and conditions link is not Successfull");

		}

		Thread.sleep(5000);

		account.Clickoncross();
		// modal.findElement(By.xpath("//a[@class='close-button']")).click();

		System.out.println("clicked on cross button");

		account.clickOncheckbox1();

		account.clickOncheckbox2();

		Thread.sleep(3000);

		account.clickOnLoginButton();

		account.InvalidEmailLogin();

		account.clickOnLoginButton();

		String EmailActError = driver.findElement(By.xpath("//div[@id='email-wrapper']")).getText();

		String EmailExpError = "Email address is not validssss";

		System.out.println(EmailActError);

		try {
			logger.log(LogStatus.INFO,
					"Start Validation :-> Verification of Error message by clicking on Create button after entering invalid email is correct or not");
			sa2.assertEquals(EmailActError, EmailExpError,
					"Validation of Error message for Email Address field with invalid email");

		} catch (WebDriverException e) {
			logger.log(LogStatus.FAIL,
					"Validation of Error message by clicking on Create button after entering invalid email is not correct");
		}

		String PasswordActError = driver
				.findElement(
						By.xpath("//div[@class='form-group has-feedback fl_wrap col-xs-12 has-error has-danger'][1]"))
				.getText();

		String PasswordExpError = "4 and 24 alphanumeric characters long";

		System.out.println(PasswordActError);

		try {
			logger.log(LogStatus.INFO,
					"Start Validation :-> Verification of Error message for password field is correct or not");
			sa2.assertEquals(PasswordActError, PasswordExpError, "Validation of Error message for password field");

		} catch (WebDriverException e) {
			logger.log(LogStatus.FAIL, "Validation of Error message for password",
					"Validation of Error message by clicking on Create button without entering password is not successfull");
		}

		String ConfPasswordActError = driver.findElement(By.xpath("//div[@id='password2-wrapper']")).getText();
		String ConfPasswordExpError = "Your passwords don't match!";

		System.out.println(ConfPasswordActError);

		try {

			logger.log(LogStatus.INFO,
					"Start Validation :-> Verification of Error message for Conf password field is correct or not");
			sa2.assertEquals(ConfPasswordActError, ConfPasswordExpError,
					"Validation of Error message for password field");

		} catch (WebDriverException e) {
			logger.log(LogStatus.FAIL, "Validation of Error message for password",
					"Validation of Error message by clicking on Create button without entering password is not successfull");
		}

		driver.findElement(By.xpath("//input[@placeholder='Email address*']")).clear();
		Thread.sleep(4000);
		account.LoginToApplication();

		account.clickOnConnectButton();

		Thread.sleep(9000);

		logger.log(LogStatus.INFO, "Connected - Connection is Success.");

		sa2.assertAll();

	}

}
