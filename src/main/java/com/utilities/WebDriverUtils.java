package com.utilities;

import java.awt.Robot;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtils extends TestBase {
	private static WebElement element = null;
	static String screenShotPath = "";
	public static WebDriver driver = null;
	public static String home = System.getProperty("user.home");
	public static String downloadPath = home + "//Downloads";

	private static String testName;

	public static String getTestName() {
		return testName;
	}

	public static void setTestName(String methodName) {
		testName = methodName;
	}

	public static void maximizeWindow() throws Exception {
		try {
			driver.manage().window().maximize();
		} catch (Exception ex) {

		}
	}

	public static WebDriver openBrowser() throws Exception {
		String sBrowserName;

		try {
			testName = getTestName();
			sBrowserName = Browsers.get();
			BrowserEnum currentBrowser = BrowserEnum.valueOf(sBrowserName.toUpperCase());

			switch (currentBrowser) {

			case FIREFOX:
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;

			case CHROME:
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;

			case IE:
				WebDriverManager.iedriver().arch32().setup();
				driver = new InternetExplorerDriver();
				break;

			case REMOTE:
				String sauceUserName = "skadesa";
				String sauceAccessKey = "fd131323-e14d-4098-99ec-fc413911d169";
				String sauceURL = "http://ondemand.saucelabs.com:80/wd/hub";
				DesiredCapabilities capabilities = new DesiredCapabilities();
				capabilities.setCapability("username", sauceUserName);
				capabilities.setCapability("accessKey", sauceAccessKey);
				capabilities.setCapability("browserName", "Chrome");
				capabilities.setCapability("platform", "Windows 10");
				capabilities.setCapability("version", "73.0");
				capabilities.setCapability("name", "TDD");

				driver = new RemoteWebDriver(new URL(sauceURL), capabilities);
				break;

			default:
				String errorMessage = "The browser '" + sBrowserName + "' is not valid.";
				throw new Exception(errorMessage);
			}
			maximizeWindow();

		} catch (Exception ex) {
			System.out.println("no browser");
		}
		return driver;
	}

	public static String currentURL() {
		String URL = driver.getCurrentUrl();
		return URL;
	}

	public static void goToURL(String url) throws Exception {
		try {

			if (driver == null) {

				throw new Exception("Driver is null");
			}
			driver.get(url);

		} catch (Exception ex) {

		}
	}

	public static WebElement FindElementByXpath(String xpath) throws Exception {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		} catch (Exception e) {
			Log.error(e);
			element = null;
		}
		return element;
	}

	public static WebElement FindElementByID(String id) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.id(id)));
		} catch (Exception e) {
			Log.error(e);
		}

		return element;
	}

	public static WebElement FindElementByCSS(String css) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(css)));
		} catch (Exception e) {
			Log.error(e);
		}

		return element;
	}

	public static void ClickUsingJS(WebElement ElementToBeClicked) {
		JavascriptExecutor ex = (JavascriptExecutor) driver;
		ex.executeScript("arguments[0].click()", ElementToBeClicked);
	}

	public static void mouseMoveRobot(WebElement ElementToBeClicked) throws Exception {
		Point coordinates = ElementToBeClicked.getLocation();
		Robot robot = new Robot();
		robot.mouseMove(coordinates.getX(), coordinates.getY() + 120);
	}

	public static void moveToElement(WebElement ElementToBeHover) throws Exception {
		highlightElement(ElementToBeHover);
		Actions action = new Actions(driver);
		action.moveToElement(ElementToBeHover).build().perform();
	}

	public static boolean ClickUsingJS_Test(WebElement ElementToBeClicked) {

		boolean result = false;
		int attempts = 0;
		while (attempts < 2) {
			try {
				JavascriptExecutor ex = (JavascriptExecutor) driver;
				ex.executeScript("arguments[0].click()", ElementToBeClicked);
				result = true;
				break;
			} catch (StaleElementReferenceException e) {
			}
			attempts++;
		}
		return result;
	}

	public static void mouseHoverJScript(WebElement HoverElement) {
		try {
			if (isElementPresent(HoverElement)) {

				String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');"
						+ "evObj.initEvent('mouseover', true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
				((JavascriptExecutor) driver).executeScript(mouseOverScript, HoverElement);

			} else {
				System.out.println("Element was not visible to hover " + "\n");

			}
		} catch (

		StaleElementReferenceException e) {
			System.out.println(
					"Element with " + HoverElement + "is not attached to the page document" + e.getStackTrace());
		} catch (NoSuchElementException e) {
			System.out.println("Element " + HoverElement + " was not found in DOM" + e.getStackTrace());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error occurred while hovering" + e.getStackTrace());
		}
	}

	public static boolean isElementPresent(WebElement element) {
		boolean flag = false;
		try {
			if (element.isDisplayed() || element.isEnabled())
				flag = true;
		} catch (NoSuchElementException e) {
			flag = false;
		} catch (StaleElementReferenceException e) {
			flag = false;
		}
		return flag;
	}

	public static void InputValues(WebElement FieldElement, String StringToBeEntered, String ElementName)
			throws Exception {
		try {
			highlightElement(FieldElement);
			FieldElement.sendKeys(StringToBeEntered);
			tempTest.log(LogStatus.PASS, "Entered " + ElementName);
		} catch (Exception e) {
			tempTest.log(LogStatus.FAIL, "Failed to Enter " + ElementName);
		}

	}

	public static void ClickAction(WebElement ElementToBeClicked, String ElementName) throws Exception {
		try {
			highlightElement(ElementToBeClicked);
			ElementToBeClicked.click();
			tempTest.log(LogStatus.PASS, "Clicked " + ElementName);
		} catch (Exception e) {
			tempTest.log(LogStatus.FAIL, "Failed to Click " + ElementName);
		}
	}

	public static String TextChecker(WebElement ElementForText) throws Exception {
		String valueOfTheElement = null;
		try {
			highlightElement(ElementForText);
			valueOfTheElement = ElementForText.getText();
			tempTest.log(LogStatus.PASS, "Verifed successfully");
		} catch (Exception e) {
			tempTest.log(LogStatus.FAIL, "Failed to Verify");
		}
		return valueOfTheElement;
	}

	public static void highlightElement(WebElement element) throws Exception {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,
					"color: black; border: 2px solid red;");
		} catch (Exception e) {
			tempTest.log(LogStatus.FAIL, e.getMessage() + test.addScreenCapture(TakeScreenShot()));
		}
	}

	public static String TakeScreenShot() throws IOException {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy-h-mm-ss");
		String CurrentDate = sdf.format(date);
		try {
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			screenShotPath = System.getProperty("user.dir") + "defectScreenShots\\" + CurrentDate + ".jpeg";
			FileUtils.copyFile(scrFile, new File(screenShotPath));
			String base = System.getProperty("user.dir") + "/defectScreenShots";
			screenShotPath = new File(base).toURI().relativize(new File(screenShotPath).toURI()).getPath();
			Log.info(Environment.ReadExcelData("Global_Validater", 5, 1));
		} catch (FileNotFoundException fnfe) {
			Log.info("In takeScreenShot " + fnfe.getMessage());
			Log.info(Environment.ReadExcelData("Global_Validater", 6, 1));
			System.out.print("File not found" + fnfe);
		} catch (IOException e) {
			Log.info("In takeScreenShot " + e.getMessage());
			Log.info(Environment.ReadExcelData("Global_Validater", 6, 1));
		} catch (Exception e) {
			Log.info("In takeScreenShot " + e.getMessage());
			Log.info(Environment.ReadExcelData("Global_Validater", 6, 1));
		}
		return screenShotPath;
	}

	public static LocalDateTime getCurrentTimeUsingCalendar() {

		LocalDateTime formattedDate = LocalDateTime.now();
		return formattedDate;
	}

	public static void selectOptionByValue(WebElement element, String valueOfOption) {
		Select option = new Select(element);
		option.selectByValue(valueOfOption);
	}

	public static void switchToWindow() {
		String parentWindow = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for (String windowHandle : handles) {
			if (!windowHandle.equals(parentWindow)) {
				driver.switchTo().window(windowHandle);
			}
		}
	}

	public static void closeCurrentWindow() {
		String parentWindow = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for (String windowHandle : handles) {
			if (!windowHandle.equals(parentWindow)) {
				driver.close();
				driver.switchTo().window(windowHandle);
			}
		}
	}

	public static void checkPageIsReady() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		long wt = 2000;
		for (int i = 0; i < 30; i++) {
			try {
				Thread.sleep(wt);
			} catch (InterruptedException e) {
			}

			if (js.executeScript("return document.readyState").toString().equals("complete")) {
				break;
			}
		}
	}

	public static void taskdelay() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		long wt = 2000;
		for (int i = 0; i < 60; i++) {
			try {
				Thread.sleep(wt);
			} catch (InterruptedException e) {
			}
			if (js.executeScript("return document.readyState").toString().equals("complete")) {
				break;
			}
		}
	}

	public static void delete_File(String fileName) {
		File dir = new File(downloadPath);
		File[] dirContents = dir.listFiles();
		try {
			for (int i = 0; i < dirContents.length; i++) {
				if (dirContents[i].getName().contains(fileName)) {
					dirContents[i].delete();
					break;
				}
			}
			tempTest.log(LogStatus.PASS, "\"" + fileName + "\" Old File Deleted successfully");
		} catch (Exception e) {
			tempTest.log(LogStatus.FAIL, "\"" + fileName + "\" Old File Deletion failed");
		}
	}

	public static boolean verify_downloaded_File(String fileName) {
		File dir = new File(downloadPath);
		File[] dirContents = dir.listFiles();
		try {
			for (int i = 0; i < dirContents.length; i++) {
				if (dirContents[i].getName().contains(fileName)) {
					tempTest.log(LogStatus.PASS, "\"" + fileName + "\" New File Downloaded successfully");
					return true;
				}
			}
		} catch (Exception e) {
			tempTest.log(LogStatus.FAIL, "\"" + fileName + "\" New File Download failed");
		}
		return false;
	}

	public static boolean verify_createdExcel_File(String fileName) {
		File dir = new File(downloadPath);
		File[] dirContents = dir.listFiles();
		try {
			for (int i = 0; i < dirContents.length; i++) {
				if (dirContents[i].getName().contains(fileName)) {
					tempTest.log(LogStatus.PASS, "\"" + fileName + "\" New File Downloaded successfully");
					return true;
				}
			}
		} catch (Exception e) {
			tempTest.log(LogStatus.FAIL, "\"" + fileName + "\" New File Download failed");
		}
		return false;
	}

	public static String findElementLocator(String generalTextLocator, String TextToBeMatched) {
		String locator = null;
		WebElement list = driver.findElement(By.xpath(generalTextLocator));
		List<WebElement> names = list.findElements(By.tagName("tr"));
		int count = names.size();
		for (int i = 1; i < count; i++) {
			if (names.get(i).getText().contains(TextToBeMatched)) {
				locator = "//*[@id='body:dealerUserSrhForm:userSearchResults:tbody_element']/tr[" + (i + 1)
						+ "]/td[7]/a[1]";
				break;
			}
		}
		return locator;
	}

	public static void clickActionWithElementCheck(WebElement toBeChecked, WebElement toBeClicked) {
		try {
			if (toBeChecked.isDisplayed()) {
				toBeChecked.click();
			} else {
				toBeClicked.click();
			}
		} catch (Exception e) {
			Log.info("VIN Not Found");

		}

	}

	public static void getImageUrl() {
		List<WebElement> allImages = driver.findElements(By.tagName("img"));
		for (WebElement imageFromList : allImages) {
			String ImageUrl = imageFromList.getAttribute("src");
			System.out.println(ImageUrl);
		}
	}

	public static List<String> getVINlist(String xpathForTheVINList) {
		List<WebElement> allVINs = driver.findElements(By.xpath(xpathForTheVINList));
		List<String> VINs = new ArrayList<String>();
		for (WebElement vinFromList : allVINs) {
			String VINList = vinFromList.getText();
			VINs.add(VINList);
		}
		return VINs;
	}

	public enum BrowserEnum {
		FIREFOX, CHROME, IE, REMOTE
	}

}
