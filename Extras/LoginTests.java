package utility;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;

import Pages.AccountValidationPage;
import Pages.CreateAccountPage;
//public ExtentReports report;

public class LoginTests extends Extent1 {
	
	//protected WebDriver driver;

	@Test(priority = 0, description = "Login to Registration Page.")

	public void verifycreateAccount() throws InterruptedException {
		ExtentReports report = new ExtentReports(
				System.getProperty("user.dir") + "\\Report\\" + "wifireport" + System.currentTimeMillis() + ".html");

		report.startTest("verifycreateAccount", "Registaration page verification");

		
		WebDriver driver = null;
		CreateAccountPage createAccountPage = new CreateAccountPage(driver);

		AccountValidationPage accountValidationPage = new AccountValidationPage(driver);

		createAccountPage.clickOncheckbox1();
		createAccountPage.clickOncheckbox2();
		createAccountPage.clickOnLoginButton();
		createAccountPage.LoginToApplication();
		createAccountPage.clickOnConnectButton();

	}

}
