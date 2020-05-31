package Testcases_Chiltern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Pages.AccountValidationPage_WhitBread;
import Pages.CreateAccountPage_WhitBread;
import utility.BaseClass;
import utility.BaseClass1;
import utility.CustomSoftAssert;
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


public class ReportDemo1 {
	
	@Test
	public void test1()
	{
		ExtentReports report=new ExtentReports(System.getProperty("user.dir")+"\\Report\\wifispark.html");
		ExtentTest logger=report.startTest("VerifyLogin", "This test will verfiy login details");
		logger.log(LogStatus.INFO, "Browser started");
		logger.log(LogStatus.INFO, "Application started");
		logger.log(LogStatus.FAIL, "Verified error message");
		report.endTest(logger);
		//report.flush();
		
	}
	
	@Test
	public void test2()
	{
		ExtentReports report1=new ExtentReports(System.getProperty("user.dir")+"\\Report\\wifispark.html");
		ExtentTest logger1=report1.startTest("VerifyEmail", "This test will verfiy login details");
		logger1.log(LogStatus.INFO, "Browser startedgggg");
		logger1.log(LogStatus.INFO, "Application startedddd");
		logger1.log(LogStatus.FAIL, "Verified error message123");
		report1.endTest(logger1);
		report1.flush();
	

}
}
	
	
	
//}

/*public class ReportDemo1 extends BaseClass {

	@Test
	public void verifycreateAccountWhitBread() throws InterruptedException {

		CustomSoftAssert sa1 = new CustomSoftAssert(driver);

		ExtentTest logger = report.startTest("VerifyCreateAccount WhitBread  Test",
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
		
		
		public class VerifyAccountValidationPage_WhitBread extends BaseClass1 {

			@Test
			public void verifyAccountvalidation() throws InterruptedException {

				ExtentTest logger1 = report.startTest("Verify WhitBread AccountValidation Test",
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

				Thread.sleep(2000);

				logger1.log(LogStatus.INFO, "clicked on gmailicon button");

				Validation.getTextFromElements();

				logger1.log(LogStatus.INFO, "Account is Validated - User is connected to WhitBread Wifi");

				// logger1.log(LogStatus.INFO, "Validated Email Link and Manage Preferneces");

				// logger1.log(LogStatus.INFO, "Performed Forget device and delete operation");

				logger1.log(LogStatus.INFO, "Test Completed");

				Thread.sleep(4000);
				report.flush();

			}
	}


	
	

*/