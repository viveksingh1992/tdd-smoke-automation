package com.TestCases.Admin;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Actions.Admin.Notifications_DistributionListActions;
import com.Actions.Admin.Notifications_EventNotificationsActions;
import com.utilities.Environment;
import com.utilities.Log;
import com.utilities.TestBase;
import com.utilities.TestStatistics;
import com.utilities.WebDriverUtils;

@Listeners(com.utilities.TestStatistics.class)
public class Notifications_NavigationTestCases extends TestBase {

	@Test(retryAnalyzer = TestStatistics.class)
	public static void EventNotificationsNavigationTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Event Notifications page navigation test");
			tempTest = report.startTest("Event Notifications page navigation test");
			boolean status = Notifications_EventNotificationsActions.EventNotificationsNavigation();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Event Notifications page navigation test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Event Notifications page navigation test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void DistributionListNavigationTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Distribution List page navigation test");
			tempTest = report.startTest("DistributionList page navigation test");
			boolean status = Notifications_DistributionListActions.DistributionListNavigation();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Distribution List page navigation test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Distribution List page navigation test");
			Assert.fail(e.getMessage());
		}
	}
}
