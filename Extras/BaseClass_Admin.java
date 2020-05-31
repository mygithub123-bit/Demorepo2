package whitbread_beefeater_autotests.utility;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
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

public class BaseClass_Admin {

	protected WebDriver driver;
	protected ExtentReports report;
	protected static ExtentTest logger;
	
	
	
	@BeforeSuite
	public void setupReport() {
		report = new ExtentReports(

				System.getProperty("user.dir") + "\\Report\\" + "Wifispark" + System.currentTimeMillis() + ".html");

	}

	@AfterSuite
	public void closeAll() {
		
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
		//report.flush();
		//report.endTest(BaseClass.logger);
		//report.flush();
	}

	@Parameters({ "browser" })
	@BeforeClass
	public void startBrowser(String browser) {
		System.out.println("========Test Started=========");

		driver = BrowserFactory.startBrowser(browser);

		driver.get(DataProviderFactory.getConfig().getTestURL3());

		System.out.println("=======Application launched=====");
	}

	@AfterClass
	public  void tearDown() {
		
		report.endTest(BaseClass.logger);
		report.flush();
		

		System.out.println("=======Test Completed===========");
	}

}
