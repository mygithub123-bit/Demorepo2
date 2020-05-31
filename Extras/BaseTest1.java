package utility;

/*public class BaseTest1 {

}*/



import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Factory.BrowserFactory;
import Factory.DataProviderFactory;

public class BaseTest1 {

	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	protected WebDriver driver;
	
	@BeforeSuite
	public void setup() {
		htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/MyOwnReport.html");
		extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	
	@AfterMethod
	public void getResult(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			test.fail(MarkupHelper.createLabel(result.getName()+"Test case Failed", ExtentColor.RED));
			test.fail(result.getThrowable());
		}
		
		else if(result.getStatus()==ITestResult.SUCCESS) {
			test.pass(MarkupHelper.createLabel(result.getName()+"Test case passed", ExtentColor.GREEN));
		}
		
		else {
			test.skip(MarkupHelper.createLabel(result.getName()+"Test case skipped", ExtentColor.YELLOW));
			test.skip(result.getThrowable());
		}
	}
	@AfterSuite
	public void teardown() {
		extent.flush();
	}
	
	@Parameters({ "browser" })
	@BeforeClass
	public void startBrowser(String browser) {
		System.out.println("========Test Started=========");

		driver = BrowserFactory.startBrowser(browser);

		driver.get(DataProviderFactory.getConfig().getTestURL1());

		System.out.println("=======Application launched=====");
	}
	
}

