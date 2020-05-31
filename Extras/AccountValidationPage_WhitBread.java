package Testcases.whitbread_brewersfayer_autotests.pages;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.Wait;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Factory.DataProviderFactory;
import Testcases.whitbread_brewersfayer_autotests.utility.BaseClass1;

public class AccountValidationPage_WhitBread extends BaseClass1 {

	// private static final String Baseclass1 =null;

	@FindBy(xpath = "//input[@id='identifierId']")
	WebElement email_phone;

	@FindBy(id = "identifierNext")
	WebElement Nextbutton;

	@FindBy(xpath = "//input[@name='password']")
	WebElement Passwordgmail;

	@FindBy(id = "passwordNext")
	WebElement PasswordNext;

	@FindBy(className = "gb_ne")
	WebElement Google_apps;

	@FindBy(xpath = "//*[@id=\"gb23\"]/span[1]")
	WebElement gmailicon;

	
	public void GmailNextbutton() {
		Nextbutton.click();

		System.out.println("clicked on Nextbutton button");
	}

	public void GmailPasswordNext() {
		PasswordNext.click();

		System.out.println("clicked on PasswordNext button");
	}

	public void GamilGoogle_apps() {
		Google_apps.click();

		System.out.println("clicked on Google_apps button");
		WebDriverWait wait1 = new WebDriverWait(driver, 40);
	}

	public void Gmailgmailicon() throws InterruptedException {
		gmailicon.click();
		WebDriverWait wait2 = new WebDriverWait(driver, 30);
		Thread.sleep(50);

		System.out.println("clicked on gmailicon button");
	}

	public void LoginToGmailusername() {
		email_phone.sendKeys(DataProviderFactory.getExcelconfig().getStringData("Login", 0, 0));

		System.out.println("Gmail username is entered");
	}

	public void LoginToGmailpassword() {
		Passwordgmail.sendKeys(DataProviderFactory.getExcelconfig().getStringData("Login", 0, 1));

		System.out.println("Gmail password is entered");

	}

	public static void waitForElementToBeClickable(WebDriver driver, int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);

	}

	public void AccountsuccessValidation() throws InterruptedException {
		// driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//driver.navigate().refresh();

		Thread.sleep(9000);
	}

	public void getTextFromElements() throws InterruptedException {
		// TODO Auto-generated method stub
		// ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		List<WebElement> a = driver.findElements(By.xpath("//*[@class='bA4']/span"));
		System.out.println(a.size());
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i).getText());
			if (a.get(i).getText().equals("welcome")) { // if u want to click on the specific mail then here u can pass
														// it
				a.get(i).click();

				Thread.sleep(9000);
				
				
				

				driver.findElement(By.xpath("//img[@class='ajT']")).click();
				System.out.println("enter");
				Thread.sleep(4000);

				WebElement Link = driver.findElement(By.linkText("Please click here to validate your account."));

				Link.click();

				System.out.println("wait executed");
				Thread.sleep(10000);

				String MainWindow = driver.getWindowHandle();

				System.out.println(MainWindow);
				Set<String> s1 = driver.getWindowHandles();
				Iterator<String> ita = s1.iterator();
				while (ita.hasNext())

				{
					String Childwindow = ita.next();
					System.out.println(Childwindow);
					if (!MainWindow.equalsIgnoreCase(Childwindow)) {
						driver.switchTo().window(Childwindow);

						System.out.println("switched to child");

						driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

						driver.findElement(By.xpath("//a[text()='Proceed']")).click();

						System.out.println("clicked on proceed");

						Thread.sleep(8000);

						AccountsuccessValidation();

						driver.close();
					}

				}

				driver.switchTo().window(MainWindow);

			}

		}

	}

	public void waitForElementClickable(WebDriver driver, WebElement element, int timeout) {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
}
