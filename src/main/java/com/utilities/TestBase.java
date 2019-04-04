package com.utilities;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class TestBase {
	public static ExtentReports report;
	public static ExtentTest test;
	public static ExtentTest tempTest;
	public static ExtentTest getTest() {
		return test;
	}

	public static void setTest(ExtentTest test) {
		TestBase.test = test;
	}

	public static WebDriver driver;
	
	public static void initExtentReport(String TestCaseName) {
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		report = new ExtentReports(System.getProperty("user.dir") + "\\"+"report"+"\\"+TestCaseName+"("+timeStamp+")"+".html");
	}

	@BeforeMethod(alwaysRun = true)
	public void setUp(Method method) throws Exception {
		driver = WebDriverUtils.openBrowser();
		
	}

	@AfterMethod(alwaysRun = true)
	public static void tearDown() throws Exception {

		if (driver != null) {
			try {
				driver.quit();
				Log.info(Environment.ReadExcelData("Global_Validater", 4, 1));
				report.endTest(test);
				report.flush();
			} catch (Exception x) {
				Log.error(x);
				Log.info(Environment.ReadExcelData("Global_Validater", 3, 1));
			}
		}
	}

//	@AfterSuite(alwaysRun = true)
//	public void suiteTearDown() throws IOException {
//		EmailReport.sendReportByGMail(Environment.ReadExcelData("EmailData", 0, 1),
//				Environment.ReadExcelData("EmailData", 1, 1), Environment.ReadExcelData("EmailData", 2, 1),
//				Environment.ReadExcelData("EmailData", 3, 1) + "( " + WebDriverUtils.getCurrentTimeUsingCalendar()
//						+ " )");
//		Log.info(Environment.ReadExcelData("Global_Validater", 7, 1));
//	}
}