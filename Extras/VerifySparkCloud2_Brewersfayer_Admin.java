package Testcases.whitbread_brewersfayer_autotests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.thoughtworks.selenium.webdriven.commands.WaitForPageToLoad;

import Pages.CreateAccountPage_WhitBread;

import Testcases.whitbread_brewersfayer_autotests.utility.BaseClass_Admin;
import Testcases.whitbread_brewersfayer_autotests.utility.Custom_Admin;
import utility.BaseClass;
import utility.CustomSoftAssert;

public class VerifySparkCloud2_Brewersfayer_Admin extends BaseClass_Admin {

	@Test
	public void verifyAdminWhitBread() throws InterruptedException {

		Custom_Admin sa5 = new Custom_Admin(driver);

		BaseClass_Admin.logger = report.startTest("VerifySparkCloud2Admin WhitBread  Test",
				"This test will Verify Admin details");

		Testcases.whitbread_brewersfayer_autotests.pages.SparkCloud2_Brewersfayer_Admin accountAdmin = PageFactory
				.initElements(driver,
						Testcases.whitbread_brewersfayer_autotests.pages.SparkCloud2_Brewersfayer_Admin.class);

		logger.log(LogStatus.INFO, "Browser Started");

		logger.log(LogStatus.INFO, "Admin Application Started");

		System.out.println("google launched");

		accountAdmin.LoginToApplication_Admin();
		accountAdmin.Click_Admin_Login();

		WebDriverWait wait = new WebDriverWait(driver, 15);
		System.out.println("wait executed");

		WebElement Transactions = driver
				.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Transactions')]"));

		accountAdmin.waitForElementClickable(driver, Transactions, 10);

		logger.log(LogStatus.INFO, "Navigated to Transactions option");

		WebElement Subscribers = driver.findElement(By.xpath("//a[contains(text(),'Subscribers')]"));

		accountAdmin.waitForElementClickable(driver, Subscribers, 10);

		logger.log(LogStatus.INFO, "Navigated to Subscribers option");

		driver.findElement(By.xpath("//input[@id='search_for']")).sendKeys("tester4wifispark@gmail.com");

		WebElement search = driver.findElement(By.xpath("//input[@id='btn_search_search_for']"));

		accountAdmin.waitForElementClickable(driver, search, 10);

		if (driver.findElements(By.xpath("//input[@id='row_0']")).size() != 0) {

			System.out.println("element is preesent");

			WebElement checkbox = driver.findElement(By.xpath("//input[@id='row_0']"));
			accountAdmin.waitForElementClickable(driver, checkbox, 10);

			WebElement dropdown = driver.findElement(By.xpath("//button[@class='btn btn dropdown-toggle'] "));
			accountAdmin.waitForElementClickable(driver, dropdown, 10);

			WebElement del = driver.findElement(By.xpath("//a[@name='del']"));
			accountAdmin.waitForElementClickable(driver, del, 10);

			WebElement modal = driver.findElement(By.xpath("//a[@id='btn_yes']"));

			accountAdmin.waitForElementClickable(driver, modal, 10);

			WebElement modal1 = driver.findElement(By.xpath("//a[@id='btn_ok_button']"));
			accountAdmin.waitForElementClickable(driver, modal1, 10);

			logger.log(LogStatus.INFO, "Deleted subscriber");

			WebElement logout = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
			accountAdmin.waitForElementClickable(driver, logout, 10);
		} else {
			System.out.println("element is not preesent");

			WebElement logout = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
			accountAdmin.waitForElementClickable(driver, logout, 10);
			logger.log(LogStatus.INFO, "Logout is performed");
		}

	}

}
