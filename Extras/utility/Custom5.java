package utility;

//for RegisteredbutNotValidated_ResendActivationEmail 



import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.IAssert;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.LogStatus;

public class Custom5 extends SoftAssert {
	WebDriver driver;

	public Custom5(WebDriver driver) {
		this.driver = driver;
	}

	@Override
	public void onAssertFailure(IAssert assertCommand) {

		BaseClass5.logger1.log(LogStatus.FAIL,
				"Failed :: Reason for Failure :: This Test Step is Failed due to Title is not displayed as Expected.");
		String pathOfScreenShot = HelperClass.takeScreenshotWithTimeStamp(driver);
		BaseClass5.logger1.log(LogStatus.FAIL,
				"Expected Title is: " + assertCommand.getExpected() + " but Actual Title displayed is: "
						+ assertCommand.getActual() + "\n" + BaseClass.logger.addScreenCapture(pathOfScreenShot));
		BaseClass5.logger1.log(LogStatus.INFO, "End of Validation.");
	}

	@Override
	public void onAssertSuccess(IAssert assertCommand) {
		BaseClass5.logger1.log(LogStatus.PASS, "Passed :: Expected Title is: " + assertCommand.getExpected()
				+ " and Actual Title displayed is: " + assertCommand.getActual());
		// BaseClass.logger.log(LogStatus.INFO, "End of Validation.");
	}
	
	
	
}













