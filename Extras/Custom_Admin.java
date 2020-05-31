package whitbread_beefeater_autotests.utility;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.IAssert;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.LogStatus;

public class Custom_Admin extends SoftAssert {
	WebDriver driver;

	public Custom_Admin(WebDriver driver) {
		this.driver = driver;
	}

	@Override
	public void onAssertFailure(IAssert assertCommand) {

		BaseClass_Admin.logger.log(LogStatus.FAIL,
				"Failed :: Reason for Failure :: This Test Step is Failed due to Title is not displayed as Expected.");
		String pathOfScreenShot = HelperClass.takeScreenshotWithTimeStamp(driver);
		BaseClass_Admin.logger.log(LogStatus.FAIL,
				"Expected Title is: " + assertCommand.getExpected() + " but Actual Title displayed is: "
						+ assertCommand.getActual() + "\n" + BaseClass_Admin.logger.addScreenCapture(pathOfScreenShot));
		BaseClass_Admin.logger.log(LogStatus.INFO, "End of Validation.");
	}

	@Override
	public void onAssertSuccess(IAssert assertCommand) {
		BaseClass_Admin.logger.log(LogStatus.PASS, "Passed :: Expected Title is: " + assertCommand.getExpected()
				+ " and Actual Title displayed is: " + assertCommand.getActual());

	}

}
