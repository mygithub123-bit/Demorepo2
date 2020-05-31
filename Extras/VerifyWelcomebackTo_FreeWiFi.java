package Testcases.whitbread_brewersfayer_autotests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Pages.CreateAccountPage_WhitBread;
import Testcases.whitbread_brewersfayer_autotests.utility.BaseClass_Admin;
import Testcases.whitbread_brewersfayer_autotests.utility.BaseClass_WelcomeBack;
import Testcases.whitbread_brewersfayer_autotests.utility.Custom_Admin;

public class VerifyWelcomebackTo_FreeWiFi extends  BaseClass_WelcomeBack{
	
	
	
	@Test
	public void VerifyWelcomebackTo_freewifi() throws InterruptedException {

		Custom_Admin sa5 = new Custom_Admin(driver);

		BaseClass_WelcomeBack.logger2 = report.startTest("VerifyWelcomebackTo_FreeWiFi  Test",
				"This test will Verify VerifyWelcomebackTo_FreeWiFi details");

		CreateAccountPage_WhitBread welcome = PageFactory.initElements(driver, CreateAccountPage_WhitBread.class);

		logger2.log(LogStatus.INFO, "Browser Started");


		logger2.log(LogStatus.INFO, "welcome back page is displayed");

		welcome.WelcomebackClick();
		
		Thread.sleep(6000);
		
		logger2.log(LogStatus.INFO, "connected to free wifi");
		Thread.sleep(5000);
	}
}

	
	
	


