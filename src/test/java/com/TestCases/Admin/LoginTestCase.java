package com.TestCases.Admin;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Actions.Admin.LoginActions;
import com.utilities.Environment;
import com.utilities.Log;
import com.utilities.TestBase;
import com.utilities.TestStatistics;
import com.utilities.WebDriverUtils;
import org.testng.annotations.Listeners;

@Listeners(com.utilities.TestStatistics.class)
public class LoginTestCase extends TestBase {

	@Test(retryAnalyzer = TestStatistics.class)
	public static void LoginTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Login Test");
			tempTest = report.startTest("Login Test");
			boolean status = LoginActions.LoginActionAdmin();
			Assert.assertTrue(status);
			Log.endTestCase("Login Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Login Test");
			Assert.fail(e.getMessage());
		}
	}
}