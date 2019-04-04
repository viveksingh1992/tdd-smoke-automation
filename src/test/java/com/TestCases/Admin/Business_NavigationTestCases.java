package com.TestCases.Admin;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Actions.Admin.Business_DealershipActions;
import com.Actions.Admin.Business_PhysicalAuctionLocationsActions;
import com.utilities.Environment;
import com.utilities.Log;
import com.utilities.TestBase;
import com.utilities.TestStatistics;
import com.utilities.WebDriverUtils;

@Listeners(com.utilities.TestStatistics.class)
public class Business_NavigationTestCases extends TestBase {

	@Test(retryAnalyzer = TestStatistics.class)
	public static void DealershipNavigationTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Dealership Navigation Test");
			tempTest = report.startTest("Dealership Navigation Test");
			boolean status = Business_DealershipActions.DealershipsNavigation();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Dealership Navigation Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Dealership Navigation Test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void PhysicalAuctionLocationsNavigationTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Physical Auction Locations Navigation Test");
			tempTest = report.startTest("Physical Auction Locations Navigation Test");
			boolean status = Business_PhysicalAuctionLocationsActions.PhysicalAuctionLocationsNavigation();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Physical Auction Locations Navigation Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Physical Auction Location Navigation Test");
			Assert.fail(e.getMessage());
		}
	}

}