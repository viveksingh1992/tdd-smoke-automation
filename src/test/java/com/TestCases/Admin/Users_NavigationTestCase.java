package com.TestCases.Admin;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Actions.Admin.Users_AdminUsersActions;
import com.utilities.*;

@Listeners(com.utilities.TestStatistics.class)
public class Users_NavigationTestCase extends TestBase {

	@Test(retryAnalyzer = TestStatistics.class)
	public static void AdminUserNavigationTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Admin users page navigation test");
			tempTest = report.startTest("Admin users page navigation test");
			boolean status = Users_AdminUsersActions.AdminUsersNavigation();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Admin users page navigation test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Admin users page navigation test");
			Assert.fail(e.getMessage());
		}
	}
}
