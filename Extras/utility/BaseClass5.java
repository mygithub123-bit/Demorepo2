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


public class BaseClass5 {

	protected WebDriver driver;

	protected ExtentReports report;
	protected static ExtentTest logger1;

	@BeforeSuite
	public void setupReport() {
		report = new ExtentReports(

				System.getProperty("user.dir") + "\\Report\\" + "Wifispark" + System.currentTimeMillis() + ".html");

	}

	@AfterSuite
	public void closeAll() {
		// report.flush();
	}

	@AfterMethod
	public void tearDownReport(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			String path = HelperClass.takeScreenshotWithTimeStamp(driver);

			logger1.log(LogStatus.FAIL, "test.Captured screenshot", BaseClass.logger.addScreenCapture(path));

			logger1.log(LogStatus.FAIL, (result.getName() + " FAILED "));

		}

		report.endTest(BaseClass.logger);
		// report.flush();
	}

	@Parameters({ "browser" })
	@BeforeClass
	public void startBrowser(String browser) {
		System.out.println("========Test Started=========");

		driver = BrowserFactory.startBrowser(browser);

		driver.get(DataProviderFactory.getConfig().getTestURL());

		System.out.println("=======Application launched=====");
	}

	@AfterClass
	public void tearDown() {
		driver.quit();

		report.flush();

		System.out.println("=======Test Completed===========");
	}

}