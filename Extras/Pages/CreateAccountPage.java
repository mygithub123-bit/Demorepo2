package Pages;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Factory.DataProviderFactory;
import utility.BaseClass;

public class CreateAccountPage {

	WebDriver driver;

	public CreateAccountPage(WebDriver ldriver) {
		driver = ldriver;
	}

	@FindBy(xpath = "//*[@id=\"form_tcs\"]/div[1]/label/span")
	WebElement checkbox1;

	@FindBy(xpath = "//*[@id=\"form_tcs\"]/div[2]/label/span")
	WebElement checkbox2;

	// @FindBy(xpath="//*[@id=\"confirm") WebElement loginButton;

	@FindBy(xpath = "//a[contains(text(),'Create account')]")
	WebElement loginButton;

	@FindBy(xpath = "//a[@id='connecting']")
	WebElement Connectbutton;

	@FindBy(id = "email")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "password2")
	WebElement confpassword;

	@FindBy(xpath = "//a[contains(text(),'Continue')]")
	WebElement ContinueButton;

	public void clickOnContinueButton() {
		ContinueButton.click();

		System.out.println("clicked on Continue button");
	}

	public void LoginToApplication() throws InterruptedException {
		username.sendKeys(DataProviderFactory.getExcelconfig().getStringData("Login", 0, 0));

		System.out.println("username entered");

		password.sendKeys(DataProviderFactory.getExcelconfig().getStringData("Login", 0, 1));

		System.out.println("password entered");

		confpassword.sendKeys(DataProviderFactory.getExcelconfig().getStringData("Login", 0, 2));

		System.out.println("conf password entered");

		ContinueButton.click();

		System.out.println("clicked on Continue button");

		Thread.sleep(9000);
		verifyPageTitle();

	}

	public void verifyPageTitle() {

		String expectedTitle = "You now have 15 minutes to validate your account";

		String actualTitle = driver
				.findElement(By.xpath("//h4[contains(text(),'You now have 15 minutes to validate your account')]"))
				.getText();

		System.out.println(actualTitle);

		Assert.assertEquals(actualTitle, expectedTitle, "Page Title is displaying as :");

	}

	public void clickOncheckbox1() {
		checkbox1.click();

		System.out.println("clicked on checkbox1 button");
	}

	public void clickOncheckbox2() {
		checkbox2.click();

		System.out.println("clicked on checkbox2 button");
	}

	public void clickOnLoginButton() {
		loginButton.click();

		System.out.println("clicked on login button");
	}

	public void clickOnConnectButton() throws InterruptedException {
		Connectbutton.click();
		// verifyPageTitle1();
		// Thread.sleep(4000);

	}

}
