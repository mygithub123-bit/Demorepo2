/*package Testcases;

public class Test1 {

}

//package Testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import org.testng.asserts.IAssert;
import org.testng.asserts.SoftAssert;

import com.mongodb.MapReduceCommand.OutputType;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sun.jna.platform.FileUtils;

import Pages.CreateAccountPage;
import Pages.CreateAccountPage_WhitBread;
import Pages.LoginPage;
import freemarker.log.Logger;
import utility.BaseClass;
import utility.BaseClass1;
import utility.BaseTest1;
import utility.HelperClass;

public class Test2 extends BaseTest1 {

	//ITestResult result;
	//SoftAssert sa1 = new SoftAssert();Test2

	@Test
	public void verifycreateAccountWhitBread() throws InterruptedException {
		
		SoftAssert sa1 = new SoftAssert();

		BaseClass1.logger = report.startTest("VerifyCreateAccount WhitBread23  Test",
				"This test will Verify Login details");

		//CreateAccountPage_WhitBread account = PageFactory.initElements(driver, CreateAccountPage_WhitBread.class);

		logger.log(LogStatus.INFO, "Browser Started");

		logger.log(LogStatus.INFO, "Application Started");

		try {
			if (account.homepagedisplayed()) {
				logger.log(LogStatus.PASS, "Verification of portal", "Whit-Bread portal is displayed");
			} else {
				logger.log(LogStatus.FAIL, "Verification of portal", "Whit-Bread portal is Not displayed");
			}
		} catch (WebDriverException e) {
			logger.log(LogStatus.FAIL, "Verification of portal", "Failed due to Whit-Bread portal is Not displayed");
		}

		String expected="Gmail";
		String actual=driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).getText();
		try{
			Assert.assertEquals(actual, expected, "passed123");
			logger.log(LogStatus.PASS, "Paass1");
		}
		catch(WebDriverException e)
		{
			logger.log(LogStatus.FAIL, "Failed1");
			System.out.println("hello");
		}
		
		String expected1 = "VIDEOSppp";
		String actual1 = driver.findElement(By.xpath("//nav[@class='navigation']//span[@class='menu-text'][contains(text(),'VIDEOS')]")).getText();
		try {
		AssertJUnit.assertEquals(actual1, expected1, "passsded456");
		logger.log(LogStatus.PASS, "Paass2");
	}
	catch(WebDriverException e)
	{
		logger.log(LogStatus.FAIL, "Failed2");
		System.out.println("hello123");
	}
		sa1.assertAll();
}
	
		
		System.out.println(actual);
		boolean b=buttondisplayed(expected, actual);
		if(b=false) {
			logger.log(LogStatus.FAIL, "Verification of portal", "Not success");
			
				//ITestResult result = null;
				if (result.getStatus() == ITestResult.FAILURE) {
					String path = HelperClass.takeScreenshotWithTimeStamp(driver);
		}
		//}
	//}
		
				
		
		//public boolean buttondisplayed(String expected1, String actual1) {
			
			//String expected1="ABOUT";
			//String actual1=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[8]/a[1]/span[1]/span[1]")).getText();
			//System.out.println(actual);
			//SoftAssert sa1=new SoftAssert();
			if(expected1.equals(actual1)) {
				return true;
			}
			else {
				return false;
			}
			sa1.assertEquals(expected1, actual1, "Page Title is displaying as :" + actual1);
			sa1.assertAll();
			if(sa1.equals(false)) {
				
				return false;
			}
			return false;
			
			

			
			
		}
	
			
			
		
			
		
	
	



*/