package Testcases.whitbread_brewersfayer_autotests.Tests;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import org.testng.asserts.IAssert;
import org.testng.asserts.SoftAssert;

import com.mongodb.MapReduceCommand.OutputType;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sun.jna.platform.FileUtils;

import Pages.CreateAccountPage;
import Pages.CreateAccountPage_WhitBread;
import Pages.LoginPage;
import freemarker.log.Logger;
import utility.BaseClass;
import utility.CustomSoftAssert;
import utility.HelperClass;

public class VerifyCreateAccountPage_WhitBread extends BaseClass {

	@Test
	public void verifycreateAccountWhitBread() throws InterruptedException {

		CustomSoftAssert sa1 = new CustomSoftAssert(driver);

		BaseClass.logger = report.startTest("VerifyCreateAccount WhitBread  Test",
				"This test will Verify Login details");

		CreateAccountPage_WhitBread account = PageFactory.initElements(driver, CreateAccountPage_WhitBread.class);

		logger.log(LogStatus.INFO, "Browser Started");

		logger.log(LogStatus.INFO, "Application Started");
		
		//System.out.println("google launched");

		try {
			if (account.homepagedisplayed()) {
				logger.log(LogStatus.PASS, "Verification of portal", "Whit-Bread portal is displayed");
			} else {
				logger.log(LogStatus.FAIL, "Verification of portal", "Whit-Bread portal is Not displayed");
			}
		} catch (WebDriverException e) {
			logger.log(LogStatus.FAIL, "Verification of portal", "Failed due to Whit-Bread portal is Not displayed");
		}

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

			sa1.assertEquals(actualTitle, expectedTitle, "Validation of Registration page Title");

		} catch (WebDriverException e) {

			logger.log(LogStatus.FAIL, "Verification of portal",
					"Page Title is displayed other than Register for our Free WiFi");

		}

		account.LoginToApplication();

		String expectedTitle1 = "You now have temporary access";

		String actualTitle1 = driver.findElement(By.xpath("//h3[@class='page-header']")).getText();

		System.out.println(actualTitle);

		try {

			logger.log(LogStatus.INFO,
					"Start Validation :-> Verification of "+"You now have temporary access"+" title is displayed correct or not");

			sa1.assertEquals(actualTitle1, expectedTitle1, "Page Title is displaying as : " + actualTitle1);

			logger.log(LogStatus.INFO, "Login Credentials are Entered.");

		} catch (WebDriverException e) {

			logger.log(LogStatus.INFO, "Login Credentials are Entered and login is successful");
			logger.log(LogStatus.FAIL, "Page Title is displayed other than You now have temporary access");

		}

		account.clickOnConnectButton();

		Thread.sleep(9000);

		logger.log(LogStatus.INFO, "Connected - Connection is Success.");

		sa1.assertAll();

	}

}
