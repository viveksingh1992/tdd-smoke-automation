package com.TestCases.Admin;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Actions.Admin.AccountTools_DealershipMaintenance;
import com.Actions.Admin.AccountTools_ManageAMS;
import com.Actions.Admin.AccountTools_PaymentMaintenance;
import com.utilities.Environment;
import com.utilities.Log;
import com.utilities.TestBase;
import com.utilities.TestStatistics;
import com.utilities.WebDriverUtils;

@Listeners(com.utilities.TestStatistics.class)
public class AccountTools_NavigationTestCases extends TestBase {

	@Test(retryAnalyzer = TestStatistics.class)
	public static void PaymentMaintenanceNavigationTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Payment Maintenance Navigation Test");
			tempTest = report.startTest("Payment Maintenance Navigation Test");
			boolean status = AccountTools_PaymentMaintenance.PaymentMaintenanceNavigation();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Payment Maintenance Navigation Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Payment Maintenance Navigation Test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void DealershipMaintenanceNavigationTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Dealership Maintenance Navigation Test");
			tempTest = report.startTest("Dealership Maintenance Navigation Test");
			boolean status = AccountTools_DealershipMaintenance.DealershipMaintenanceNavigation();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Dealership Maintenance Navigation Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Dealership Maintenance Navigation Test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void ManageAMSNavigationTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("ManageAMS Navigation Test");
			tempTest = report.startTest("ManageAMS Navigation Test");
			boolean status = AccountTools_ManageAMS.ManageAMSNavigation();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("ManageAMS Navigation Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("ManageAMS Navigation Test");
			Assert.fail(e.getMessage());
		}
	}
}
