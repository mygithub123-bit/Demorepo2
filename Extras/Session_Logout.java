package Testcases.whitbread_brewersfayer_autotests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.gargoylesoftware.htmlunit.html.Keyboard;
import com.relevantcodes.extentreports.LogStatus;

import Testcases.whitbread_brewersfayer_autotests.utility.BaseClass_Admin;
import Testcases.whitbread_brewersfayer_autotests.utility.BaseClass_SessionLogout;
import utility.BaseClass;

public class Session_Logout extends BaseClass_SessionLogout {

	@Test
	public void session_Logout() throws InterruptedException {

		BaseClass_SessionLogout.logger = report.startTest("session logout  Test",
				"This test will Verify session logout details");

		logger.log(LogStatus.INFO, "Browser Started");

		logger.log(LogStatus.INFO, "session logout starts");

		System.out.println("google launched");

		Actions builder = new Actions(driver);
		builder.sendKeys(Keys.RETURN).perform();
		System.out.println("hitted enter");

		Thread.sleep(4000);

		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		logger.log(LogStatus.INFO, "session logout completed");

		System.out.println("completed");

	}
}
