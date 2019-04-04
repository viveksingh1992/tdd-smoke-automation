package com.TestCases.Admin;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.Actions.Admin.Home_Actions;
import com.utilities.Environment;
import com.utilities.Log;
import com.utilities.TestBase;
import com.utilities.TestStatistics;
import com.utilities.WebDriverUtils;

public class Home_TestCases extends TestBase {

	@Test(retryAnalyzer = TestStatistics.class)
	public static void HomepageNavigationTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Homepage Navigation Test");
			tempTest = report.startTest("Homepage Navigation Test");
			boolean status = Home_Actions.HomePageNavigation();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Homepage Navigation Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Homepage Navigation Test");
			Assert.fail(e.getMessage());
		}
	}
}
