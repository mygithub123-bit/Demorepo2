package utility;

import org.testng.annotations.Test;

public class Temp extends BaseClass {
	@Test
	public void m1() {
		CustomSoftAssert sa1 = new CustomSoftAssert(driver);
		logger = report.startTest("VerifyCreateAccount WhitBread  Test",
				"This test will Verify Login details");
		String expected = "ABOUs";
		String actual = "ABOU";
		sa1.assertEquals(actual, expected, "passed123");

		String expected1 = "VIDEOSpppa";
		String actual1 = "VIDEOSppp";
		sa1.assertEquals(actual1, expected1, "passsded456");
		sa1.assertAll();
		
	}
}
