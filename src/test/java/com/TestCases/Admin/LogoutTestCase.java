package com.TestCases.Admin;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.Actions.Admin.LogoutActions;
import com.utilities.Environment;
import com.utilities.Log;
import com.utilities.TestBase;
import com.utilities.TestStatistics;
import com.utilities.WebDriverUtils;

public class LogoutTestCase extends TestBase {

	@Test(retryAnalyzer = TestStatistics.class)
	public static void LogoutTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Logout Test");
			tempTest = report.startTest("Logout Test");
			boolean status = LogoutActions.LogoutAction();
			Assert.assertTrue(status);
			Log.endTestCase("Logout Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Logout Test");
			Assert.fail(e.getMessage());
		}
	}
}
