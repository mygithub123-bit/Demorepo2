/*package Testcases.whitbread_brewersfayer_autotests.utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.Proxy.ProxyType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.beust.jcommander.internal.Nullable;
import com.google.common.base.Function;
import com.google.common.base.Predicate;

public class WhitBreadCommonMethods extends BaseClass {

	public static Properties prop = null;
	//public static  WebDriver driver=null;
	
	//static WebDriverWait wait = new WebDriverWait(driver, 120);

	public void clickOnAlert() {
		System.out.println("In click");
		Alert alert = driver.switchTo().alert();
		System.out.println("window");
		alert.accept();

	}

	public static void deleteCookiesIe() {
		try {
			Runtime.getRuntime().exec("RunDll32.exe InetCpl.cpl,ClearMyTracksByProcess 255");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	*//**
	 * Description: Method to check whether an object exists or not
	 * 
	 * 
	 * 
	 *//*
	public boolean exists(By by) {
		try {
			return driver.findElement(by) != null;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	*//**
	 * Description: Method to set value in any edit box
	 * 
	 * 
	 * 
	 *//*
	public static void setTextInEditBox(WebElement e, String text) {
		try {
			//waitForAnyObject(e);
			e.clear();
			e.click();
			wait(1000);
			e.sendKeys(text);
		} catch (NoSuchElementException ex) {
			ex.printStackTrace();
		}
	}

	*//**
	 * Description: Method to get text from list of elements
	 * 
	 * 
	 * 
	 *//*
	public static List<String> getTextFromElements(List<WebElement> elements) {
		List<String> values = new ArrayList<String>();
		try {
			for (WebElement e : elements) {
				values.add(e.getText());
			}
		} catch (NoSuchElementException ex) {
			ex.printStackTrace();
		}
		return values;
	}

	*//**
	 * Description: Method to get text from element
	 * 
	 * 
	 * 
	 *//*
	public String getTextFromElement(WebElement e) {
		String textValue = null;
		try {
			textValue = e.getText();
		} catch (NoSuchElementException ex) {
			ex.printStackTrace();
		}
		return textValue;
	}

	*//**
	 * Description: Method to set value in any check box
	 * 
	 * 
	 * 
	 *//*
	public static void setAnyCheckBox(WebElement e, String toSet) {
		try {
			if (toSet.toLowerCase() == "on") {
				if (!e.isSelected()) {
					e.click();
				}
			} else if (toSet.toLowerCase() == "off") {
				if (e.isSelected()) {
					e.click();
				}
			}
		} catch (NoSuchElementException ex) {
			ex.printStackTrace();
		}
	}
	
	
	public static void Select_The_CheckBox_from_List(WebElement element, String valueToSelect) {
		List<WebElement> allOptions = element.findElements(By.tagName("input"));
		for (WebElement option : allOptions) {
			   System.out.println("Option value "+option.getText());
			        if (valueToSelect.equals(option.getText())) {
			            option.click();
			            break;
			        }
			    }
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	*//**
	 * Description: Method to select any radio button
	 * 
	 * 
	 * 
	 *//*
	public void selectAnyRadioButton(WebElement e, String toSet) {
		try {
			if (toSet.toLowerCase() == "on") {
				if (!e.isSelected()) {
					e.click();
				}
			} else if (toSet.toLowerCase() == "off") {
				if (e.isSelected()) {
					e.click();
				}
			}
		} catch (NoSuchElementException ex) {
			ex.printStackTrace();
		}
	}

	*//**
	 * Description: Method to click any object
	 * 
	 * 
	 * 
	 *//*
	public static void clickAnyObject(WebElement e) {
		try {
			//waitForAnyObject(e);
			e.click();
		} catch (NoSuchElementException ex) {
			ex.printStackTrace();
		}

	}
	
	public static void Select_The_Checkbox(WebElement element) {
		try {
            if (element.isSelected()) {
               System.out.println("Checkbox: " + element + "is already selected");
            } else {
            	// Select the checkbox
                element.click();
            }
        } catch (Exception e) {
        	System.out.println("Unable to select the checkbox: " + element);
        }
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	*//**
	 * Description: Method to find an element by text
	 * 
	 * 
	 * 
	 *//*
	public WebElement findElementByText(List<WebElement> elements, String text) {
		try {
			for (WebElement e : elements) {
				if (text.equals(e.getText())) {
					return e;
				}
			}
		} catch (NoSuchElementException ex) {
			ex.printStackTrace();
		}
		return null;
	}

	*//**
	 * Description: Method to select a value from weblist
	 * 
	 * 
	 * 
	 *//*
	public void selectOptionFromList(WebElement e, String option) {
		// waitForAnyObject(e);
		Select select = new Select(e);
		try {
			select.selectByVisibleText(option);
		} catch (NoSuchElementException ex) {
			ex.printStackTrace();
		}
	}

	*//**
	 * Description: Method to find list of elements
	 * 
	 * 
	 * 
	 *//*
	public List<WebElement> findElements(By by) {
		List<WebElement> elements = new ArrayList<WebElement>();
		try {
			elements = driver.findElements(by);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		return elements;
	}

	*//**
	 * Description: Method to find an element by reference
	 * 
	 * 
	 * 
	 *//*
	public WebElement findElement(By by, int index) {
		List<WebElement> elements = findElements(by);
		try {
			if (elements.size() > 0 && index < elements.size()) {
				return elements.get(index);
			}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		return null;
	}

	*//**
	 * Description: Method to wait till any object exists
	 * 
	 * 
	 * 
	 *//*
	public static WebElement waitForAnyObject(WebElement element,WebDriverWait wait) {		
		return wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOf(element));

	}

	public static void waitForAnyObject_1(WebDriverWait wait) {

		 wait.ignoring(StaleElementReferenceException.class).until(new Predicate<WebDriver>() {
			
			@Override
			public boolean apply(@Nullable WebDriver input) {
				
				return true;
			}
		});
		

	}

	//public static WebElement waitForAnyObject(By by, int waitTime) {

		//WebDriverWait wait = new WebDriverWait(driver, waitTime);
		//return wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(by));

	//}

	public static void waitForPresenceOfElement(By by, int waitTime) {
		//WebDriverWait wait = new WebDriverWait(driver, waitTime);
		//wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.presenceOfElementLocated(by));

	}

	public static void waitForElementClickable(By by, int waitTime) {
		//WebDriverWait wait = new WebDriverWait(driver, waitTime);
		//wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(by));

	}

	public static WebElement fluentWait(final By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(180, TimeUnit.SECONDS)
				.pollingEvery(15, TimeUnit.SECONDS).ignoring(NoSuchElementException.class).ignoring(StaleElementReferenceException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(locator);
			}
		});
		return foo;
	};

	//public static WebElement fluentWait(final By locator, int waitTime) {
		//Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(waitTime, TimeUnit.SECONDS)
				//.pollingEvery(15, TimeUnit.SECONDS).ignoring(NoSuchElementException.class).ignoring(StaleElementReferenceException.class);

		//WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(locator);
			}
		});
	//	return foo;
	//};

	//public List<WebElement> waitForListOffObjects(By by) {
		//WebDriverWait wait = new WebDriverWait(driver, 60);
		//List<WebElement> Elements = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
		//return Elements;
	//}

	*//**
	 * Description: Method to exit driver
	 * 
	 * 
	 * 
	 *//*
	public void quitDriver() {
		if (driver != null) {
			driver.close();
			// driver.quit();
			driver = null;
		}
	}

	*//**
	 * Description: Method for generic wait
	 * 
	 * 
	 * 
	 *//*
	public static void wait(int millisecs) {
		try {
			Thread.sleep(millisecs);
		} catch (InterruptedException e) {
		}
	}

	public WebElement findElement(By by) {
		return findElement(by, 0);
	}

	public static void setTextInEditBoxwithWait(WebElement e, String text) {
		e.clear();
		e.click();
		e.sendKeys(text);
		// wait(Integer.parseInt(readPropertiesFile("career.page.load.time")));
		e.sendKeys(Keys.ARROW_LEFT);
	}

	public static void clickAndSaveFileIE(WebElement element) throws InterruptedException {
		try {
			Robot robot = new Robot();
			// get the focus on the element..don't use click since it stalls the
			// driver
			element.sendKeys("");
			// simulate pressing enter
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			// wait for the modal dialog to open
			Thread.sleep(2000);
			// press s key to save
			robot.keyPress(KeyEvent.VK_S);
			robot.keyRelease(KeyEvent.VK_S);
			Thread.sleep(2000);
			// press enter to save the file with default name and in default
			// location
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

	public void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public void navigateToUrl(String url) {

		String methodname = Thread.currentThread().getStackTrace()[1].getMethodName();
		// ExtentReports.add(methodname, false);

		driver.get(url);
		waitForPageLoad(driver);

	}

	 date month format 

	public String getCurrentDate() {
		return new SimpleDateFormat("dd/MM/yyyy").format(new Date());
	}

	 to check presence of webelement 

	public boolean isWebElementPresent(String objectIdentification) {
		List<WebElement> element = driver.findElements(By.xpath(objectIdentification));
		if (element.size() > 0) {
			return true;
		}
		return false;
	}

	 Page Navigation 
	public void waitForPageToNavigate() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	 waitForPageToNavigate 

	public void waitForPageToNavigate(int waitTime) {
		driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
	}

	 waitForPageLoad 

	public static void waitForPageLoad(WebDriver driver) {
		ExpectedCondition<Boolean> pageLoadCondition = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
			}
		};

		 WebDriver wait 

		//WebDriverWait wait = new WebDriverWait(driver, 180);
		//wait.ignoring(StaleElementReferenceException.class).until(pageLoadCondition);
	}

	 takeScreenShot 
	public void takeScreenShot(String screenshot) {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(scrFile, new File("D:\\ScreenShotsNTMK\\" + screenshot + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	 Alert popup 
	public void aLert() {
		boolean a = false;
		try {
			Alert alert = driver.switchTo().alert();
			String AlertText = alert.getText();
			System.out.println(AlertText);
			alert.accept();
			a = true;
		} catch (Exception e) {
			a = false;
		} finally {
			if (a != true) {
				// take ur screenshot or whatever
				driver.findElement(By.id("information-ok")).click();
			}
		}

	}

	 JsClick 

	public void JsClick(WebElement E) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0]).click();", E);
	}

	static int temp1 = 1;;

	@SuppressWarnings("unused")
	public void selectSchedule() {
		driver.switchTo().frame(fluentWait(By.xpath(("iframe.xpath"))));
		while (temp1 < 2) {
			temp1 = driver.findElements(By.xpath(".//*[@id='sitesData']//tbody//tr")).size();
		}
		wait(2000);
		List<WebElement> result = findElements(By.cssSelector(("SelectSearchResult.css")));
		for (int i = 1; i <= result.size(); i++) {

			clickAnyObject(findElement(By.xpath(".//*[@id='sitesData']//tbody/tr[" + i + "]//a")));
			break;

		}

	}

	 initChromeDriver 
	public void initChromeDriver() {
		// System.setProperty("webdriver.chrome.driver",WINDOWS_CHROME_DRIVER_PATH);
		driver = new ChromeDriver();

	}
	 scrollToPageEnd 

	public void scrollToPageEnd() {
		wait(3000);
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		actions.release();
	}

	 doubleClick on element 

	public void doubleClick(WebElement element) {
		// wait(3000);

		Actions actions = new Actions(driver);
		actions.doubleClick(element).build().perform();
	}

	public void doubleClick(By by) {
		// wait(3000);
		WebElement element = driver.findElement(by);
		Actions actions = new Actions(driver);
		actions.doubleClick(element).build().perform();
	}

	public void highlightElement(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='2px groove green'", ele);
	}

	 Click on the Online Customer Service 
	public void clickOnlineCustomerService() {
		wait(2000);
		clickAnyObject(fluentWait(By.xpath(("OnlineCustomerService.xpath"))));
	}

	public void clickReprintSchedule() {
		wait(2000);
		clickAnyObject(fluentWait(By.xpath(("OnlineCustomerServiceRepSchedule.xpath"))));
	}

	public void clickUpdateEMail() {
		wait(2000);
		clickAnyObject(fluentWait(By.xpath(("OnlineCustomerServiceUpdateEmail.xpath"))));
	}

	public void clickContactUs() {
		wait(2000);
		clickAnyObject(fluentWait(By.xpath(("OCSContactUs.xpath"))));
	}

	private String trimSSN(String ssn) {
		String number = ssn;
		int len = number.length() - 4;
		return number.substring(len);
	}
	
	
	public static boolean genericClick(WebElement elementToBeClicked)
	{

	    try{

	     elementToBeClicked.click();

	     return true;
	}
	catch(Exception e){

	     return false;
	}

	}

}
*/