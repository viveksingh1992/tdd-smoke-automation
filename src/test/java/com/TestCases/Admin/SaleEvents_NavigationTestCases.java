package com.TestCases.Admin;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Actions.Admin.SaleEvents_EditPricingActions;
import com.Actions.Admin.SaleEvents_HolidayProcessingActions;
import com.Actions.Admin.SaleEvents_IfDealsActions;
import com.Actions.Admin.SaleEvents_ManageEventsActions;
import com.utilities.Environment;
import com.utilities.Log;
import com.utilities.TestBase;
import com.utilities.TestStatistics;
import com.utilities.WebDriverUtils;

@Listeners(com.utilities.TestStatistics.class)
public class SaleEvents_NavigationTestCases extends TestBase {

	@Test(retryAnalyzer = TestStatistics.class)
	public static void ManageEventsNavigationTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Manage Events page navigation test");
			tempTest = report.startTest("Manage Events page navigation test");
			boolean status = SaleEvents_ManageEventsActions.ManageEventsNavigation();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Manage Events page navigation test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Manage Events page navigation test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void EditPricingNavigationTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Edit Pricing page navigation test");
			tempTest = report.startTest("Edit Pricing page navigation test");
			boolean status = SaleEvents_EditPricingActions.EditPricingNavigation();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Edit Pricing page navigation test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Edit Pricing page navigation test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void HolidayProcessingNavigationTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Holiday Processing page navigation test");
			tempTest = report.startTest("Holiday Processing page navigation test");
			boolean status = SaleEvents_HolidayProcessingActions.HolidayProcessingNavigation();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Holiday Processing page navigation test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Holiday Processing page navigation test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void IfDealsNavigationTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("If Deals page navigation test");
			tempTest = report.startTest("If Deals page navigation test");
			boolean status = SaleEvents_IfDealsActions.IfDealsNavigation();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("If Deals page navigation test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("If Deals page navigation test");
			Assert.fail(e.getMessage());
		}
	}

}
