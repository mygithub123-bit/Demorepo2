package utility;

import java.io.IOException;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.relevantcodes.extentreports.LogStatus;

import Factory.BrowserFactory;
import Factory.DataProviderFactory;
import mx4j.log.Logger;

public class BaseTest {

	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	// public ExtentReports report;
	// protected static ExtentTest extent;
	protected WebDriver driver;
	protected static ExtentTest logger;

	@BeforeSuite
	public void setup() {
		 htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/MyOwnReport.html");

		// htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir") +
		// "\\Report\\" + "Wifispark" + System.currentTimeMillis() + ".html");

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		System.out.println("entered before suite");
	}

	@AfterMethod
	public void getResult(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {

			// String path = HelperClass.takeScreenshotWithTimeStamp(driver);

			// test.log(Status.FAIL,(Markup) BaseTest.test.addScreenCaptureFromPath(path));
			// test.log(Status.FAIL, (Markup) BaseTest.test.addScreenCaptureFromPath(path));
			//Reporter.log("browser session end", true);

			test.fail(MarkupHelper.createLabel(result.getName() + "Test case Failed", ExtentColor.RED));
			test.fail(result.getThrowable());
			System.out.println("entered after method");
			test.fail("sajksdja");

		}

		else if (result.getStatus() == ITestResult.SUCCESS) {
			test.pass(MarkupHelper.createLabel(result.getName() + "Test case passed", ExtentColor.GREEN));
		}

		else if (result.getStatus() == ITestResult.SKIP) {

			test.skip(MarkupHelper.createLabel(result.getName() + "Test case skipped", ExtentColor.YELLOW));
			test.skip(result.getThrowable());
			//test.fail(details, provider)
		}
		// report.removeTest(test);
	}

	@AfterSuite
	public void teardown() {
		extent.flush();

		System.out.println("entered after suite");
	}

	/*@Parameters({ "browser" })
	@BeforeClass
	public void startBrowser(String browser) {
		System.out.println("========Test Started=========");

		driver = BrowserFactory.startBrowser(browser);

		driver.get(DataProviderFactory.getConfig().getTestURL());

		System.out.println("=======Application launched=====");
		System.out.println("entered before class");
	}*/

	/*
	 * @AfterClass public void tearDown() {
	 * 
	 * driver.quit(); //report.flush();
	 * 
	 * System.out.println("=======Test Completed===========");
	 * System.out.println("entered after class"); }
	 */
}