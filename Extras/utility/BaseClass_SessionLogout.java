package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Factory.BrowserFactory;
import Factory.DataProviderFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class BaseClass_SessionLogout {

	protected WebDriver driver;
	// public WebDriver driver;
	protected ExtentReports report;
	protected static ExtentTest logger;

	@BeforeSuite
	public void setupReport() {
		report = new ExtentReports(

				System.getProperty("user.dir") + "\\Report\\" + "Wifispark" + System.currentTimeMillis() + ".html");

	}

	@AfterSuite
	public void closeAll() {
		report.flush();
	}

	@AfterMethod
	public void tearDownReport(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			String path = HelperClass.takeScreenshotWithTimeStamp(driver);

			logger.log(LogStatus.FAIL, "test.Captured screenshot", BaseClass.logger.addScreenCapture(path));

			logger.log(LogStatus.FAIL, (result.getName() + " FAILED "));

			Reporter.log("browser session end", true);

		}
		driver.quit();
		// report.flush();
		// report.endTest(BaseClass.logger);
		// report.flush();
	}

	@Parameters({ "browser" })
	@BeforeClass
	public void startBrowser(String browser) {
		System.out.println("========Test Started=========");

		driver = BrowserFactory.startBrowser(browser);

		driver.get(DataProviderFactory.getConfig().getTestURL4());

		System.out.println("=======Application launched=====");
	}

	@AfterClass
	public void tearDown() {

		report.endTest(BaseClass.logger);

		System.out.println("=======Test Completed===========");
	}

}
