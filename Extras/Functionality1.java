/*package Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utility.BaseClass;
import utility.BaseTest;
import utility.BaseTest1;

public class Functionality1 extends BaseTest1 {
	
	@Test
	public void functionalityTest1() {
		
		
		ExtentReports report=new ExtentReports();
		
		ExtentTest test= report.createTest("verify login");
		
		test.log(LogStatus.INFO, "app started");
		
		test.log(LogStatus.INFO, "app", "details");
		
		test=extent.createTest("functionality1Test1");
		
		
		
		BaseTest1.logger = report.startTest("VerifyCreateAccount WhitBread1  Test",
				"This test will Verify Login details");

		//report=extent
		Assert.assertTrue(1>0);
		System.out.println("test1");
		
		//logger.log(LogStatus.PASS,"skls", "shshkshdhskjdks");
	}
	
	@Test
	public void functionalityTest2() {
		
		//test=extent.createTest("functionality1Test2");
		
		BaseClass.logger = report.startTest("VerifyCreateAccount WhitBread2  Test",
				"This test will Verify Login details");
		//Assert.assertEquals("manu", "monu");
		Assert.assertTrue(9>1);
		System.out.println("test2");
		//logger.log(LogStatus.PASS,"testuuu", "shshkshdhskjdks");
	}
	
	@Test
	public void functionalityTest3() {
		
		//test=extent.createTest("functionality1Test3");
		BaseClass.logger = report.startTest("VerifyCreateAccount WhitBread3  Test",
				"This test will Verify Login details");
		Assert.assertEquals("manujjjjj", "manullllll");
		//logger.log(LogStatus.FAIL, "Verification of portal", "Failed due to Whit-Bread portal is Not displayed");
		System.out.println("test3");
	}

}
*/