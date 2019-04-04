package com.TestCases.Admin;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Actions.Admin.ResetPasswordActions;
import com.utilities.Environment;
import com.utilities.Log;
import com.utilities.TestBase;
import com.utilities.TestStatistics;
import com.utilities.WebDriverUtils;
import org.testng.annotations.Listeners;

@Listeners(com.utilities.TestStatistics.class)
public class ResetPasswordTestCase extends TestBase {

	@Test(retryAnalyzer = TestStatistics.class)
	public static void ResetPasswordTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Reset Password Test");
			tempTest = report.startTest("Reset Password Test");
			boolean status = ResetPasswordActions.ResetPasswordAdmin();
			Assert.assertTrue(status, "Test case failed");
			Log.endTestCase("Reset Password Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Forgot Password Test");
			Assert.fail(e.getMessage());
		}
	}
}