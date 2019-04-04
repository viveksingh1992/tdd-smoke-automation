package com.TestCases.Admin;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Actions.Admin.Reports_AdminReportsActions;
import com.utilities.Environment;
import com.utilities.Log;
import com.utilities.TestBase;
import com.utilities.TestStatistics;
import com.utilities.WebDriverUtils;

@Listeners(com.utilities.TestStatistics.class)
public class Reports_NavigationTestCase extends TestBase {

	@Test(retryAnalyzer = TestStatistics.class)
	public static void AdminReportsNavigationTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Admin Reports page navigation test");
			tempTest = report.startTest("Admin Reports page navigation test");
			boolean status = Reports_AdminReportsActions.AdminUsersReportNavigation();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Admin Reports page navigation test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Admin Reports page navigation test");
			Assert.fail(e.getMessage());
		}
	}

}
