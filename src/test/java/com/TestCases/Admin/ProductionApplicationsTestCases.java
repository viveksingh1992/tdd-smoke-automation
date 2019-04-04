package com.TestCases.Admin;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.Actions.Admin.Sanity_OtherProductionApplicationsAction;
import com.utilities.Environment;
import com.utilities.Log;
import com.utilities.TestBase;
import com.utilities.TestStatistics;
import com.utilities.WebDriverUtils;

@Listeners(com.utilities.TestStatistics.class)
public class ProductionApplicationsTestCases extends TestBase {

	@Test(retryAnalyzer = TestStatistics.class)
	public static void TDDNavigationTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("TDD page navigation test");
			tempTest = report.startTest("TDD page navigation test");
			boolean status = Sanity_OtherProductionApplicationsAction.TDDNavigation();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("TDD page navigation test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("TDD page navigation test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void TDDForgotPasswordTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("TDD Forgot Password test");
			tempTest = report.startTest("TDD Forgot Password test");
			boolean status = Sanity_OtherProductionApplicationsAction.TDDForgotPassword();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("TDD Forgot Password test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("TDD Forgot Password test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void TDDInvalidLoginTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("TDDInvalidLogin test");
			tempTest = report.startTest("TDDInvalidLogin test");
			boolean status = Sanity_OtherProductionApplicationsAction.TDDInvalidLogin();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("TDDInvalidLogin test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("TDDInvalidLogin test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void LDDNavigationTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("LDD page navigation test");
			tempTest = report.startTest("LDD page navigation test");
			boolean status = Sanity_OtherProductionApplicationsAction.LDDNavigation();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("LDD page navigation test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("LDD page navigation test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void LDDForgotPasswordTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("LDD Forgot Password test");
			tempTest = report.startTest("LDD Forgot Password test");
			boolean status = Sanity_OtherProductionApplicationsAction.LDDForgotPassword();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("LDD Forgot Password test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("LDD Forgot Password test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void LDDInvalidLoginTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("LDDInvalidLogin test");
			tempTest = report.startTest("LDDInvalidLogin test");
			boolean status = Sanity_OtherProductionApplicationsAction.LDDInvalidLogin();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("LDDInvalidLogin test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("LDDInvalidLogin test");
			Assert.fail(e.getMessage());
		}
	}
}