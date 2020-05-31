package Testcases.whitbread_brewersfayer_autotests;

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
import Testcases.whitbread_brewersfayer_autotests.pages.Testing;
import Testcases.whitbread_brewersfayer_autotests.utility.WhitBreadCommonMethods;
import freemarker.log.Logger;
import utility.BaseClass;
import utility.CustomSoftAssert;
import utility.HelperClass;

public class TestingTest extends BaseClass {

	@Test
	public void verifycreateAccountWhitBread() throws InterruptedException {

		CustomSoftAssert sa1 = new CustomSoftAssert(driver);

		BaseClass.logger = report.startTest("VerifyCreateAccount WhitBread  Test",
				"This test will Verify Login details");
		Testing tst = new Testing(driver);
		tst.ClickingOnFB();
		
		
		
	}
		

}
