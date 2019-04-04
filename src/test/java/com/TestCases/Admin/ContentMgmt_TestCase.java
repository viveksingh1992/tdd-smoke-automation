package com.TestCases.Admin;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.Actions.Admin.ContentManagementActions;
import com.utilities.Environment;
import com.utilities.Log;
import com.utilities.TestBase;
import com.utilities.TestStatistics;
import com.utilities.WebDriverUtils;

@Listeners(com.utilities.TestStatistics.class)
public class ContentMgmt_TestCase extends TestBase {

	@Test(retryAnalyzer = TestStatistics.class)
	public static void ContentMgmtNavigationTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Content Mgmt Navigation Test");
			tempTest = report.startTest("Content Mgmt Navigation Test");
			boolean status = ContentManagementActions.ContentManagementNavigation();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Content Mgmt Navigation Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Content Mgmt Navigation Test");
			Assert.fail(e.getMessage());
		}
	}
}