package utility;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Factory.BrowserFactory;
import Factory.DataProviderFactory;

public class BaseClass_WelcomeBack {

	protected WebDriver driver;
	protected ExtentReports report;
	protected static ExtentTest logger2;

	@BeforeSuite
	public void setupReport() {
		report = new ExtentReports(
				System.getProperty("user.dir") + "\\Report\\" + "Wifisparks" + System.currentTimeMillis() + ".html");
	}

	@AfterSuite
	public void closeAll() {
		report.flush();
	}

	@AfterMethod
	public void tearDownReport(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			String path = HelperClass.takeScreenshotWithTimeStamp(driver);
			BaseClass_WelcomeBack.logger2.log(LogStatus.INFO, "Captured screenshot",
					BaseClass_WelcomeBack.logger2.addScreenCapture(path));
			BaseClass_WelcomeBack.logger2.log(LogStatus.FAIL, "TC Failed");

		}
		report.endTest(BaseClass_WelcomeBack.logger2);
	}

	@Parameters({ "browser" })
	@BeforeClass
	public void startBrowser(String browser) {
		System.out.println("========Test Started=========");

		driver = BrowserFactory.startBrowser(browser);

		driver.get(DataProviderFactory.getConfig().getTestURL2());

		System.out.println("=======Application launched=====");
	}

	@AfterClass
	public void tearDown() {
		driver.quit();

		System.out.println("=======Test Completed===========");
	}

}
