package com.TestCases.Admin;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Actions.Admin.Inventory_AutoIMSVINreUploadActions;
import com.Actions.Admin.Inventory_BaloonfileUploadActions;
import com.Actions.Admin.Inventory_GuarenteedBuybackProgramActions;
import com.Actions.Admin.Inventory_MBPRequestsActions;
import com.Actions.Admin.Inventory_ManageArbitrationsActions;
import com.Actions.Admin.Inventory_ManageInventoryActions;
import com.Actions.Admin.Inventory_MarketingProgramsActions;
import com.Actions.Admin.Inventory_TitleSearchActions;
import com.Actions.Admin.Inventory_UploadRewardsGoalActions;
import com.utilities.Environment;
import com.utilities.Log;
import com.utilities.TestBase;
import com.utilities.TestStatistics;
import com.utilities.WebDriverUtils;

@Listeners(com.utilities.TestStatistics.class)
public class Inventory_NavigationTestCases extends TestBase {

	@Test(retryAnalyzer = TestStatistics.class)
	public static void ManageInventoryNavigationTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Manage Inventory Navigation Test");
			tempTest = report.startTest("Manage Inventory Navigation Test");
			boolean status = Inventory_ManageInventoryActions.ManageInventoryNavigation();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Manage Inventory Navigation Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Manage Inventory Navigation Test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void MBPRequestsNavigationTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("MBPRequests Navigation Test");
			tempTest = report.startTest("MBPRequests Navigation Test");
			boolean status = Inventory_MBPRequestsActions.MBPRequestsNavigation();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("MBPRequests Navigation Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			// getTest().log(LogStatus.FAIL, Environment.ReadExcelData("Global_Validator",
			// 3, 1));
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("MBPRequests Navigation Test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void MarketingProgramsNavigationTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Marketing Program Navigation Test");
			tempTest = report.startTest("Marketing Program Navigation Test");
			boolean status = Inventory_MarketingProgramsActions.MarketingProgramsNavigation();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Marketing Program Navigation Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Marketing Program Navigation Test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void ManageArbitrationsNavigationTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Manage Arbitrations Navigation Test");
			tempTest = report.startTest("Manage Arbitrations Navigation Test");
			boolean status = Inventory_ManageArbitrationsActions.ManageArbitrationsNavigation();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Manage Arbitrations Navigation Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Manage Arbitrations Navigation Test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void GuarenteedBuybackProgramsNavigationTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Guarenteed Buyback Programs Navigation Test");
			tempTest = report.startTest("Guarenteed Buyback Programs Navigation Test");
			boolean status = Inventory_GuarenteedBuybackProgramActions.GuarenteedBuybackProgramsNavigation();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Guarenteed Buyback Programs Navigation Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Guarenteed Buyback Programs Navigation Test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void BaloonfileUploadNavigationTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Baloon file Upload Navigation Test");
			tempTest = report.startTest("Baloon file Upload Navigation Test");
			boolean status = Inventory_BaloonfileUploadActions.BaloonfileUploadNavigation();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Baloon file Upload Navigation Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Baloon file Upload Navigation Test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void TitleSearchNavigationTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Title Search Navigation Test");
			tempTest = report.startTest("Title Search Navigation Test");
			boolean status = Inventory_TitleSearchActions.TitleSearchNavigation();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Title Search Navigation Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Title Search Navigation Test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void AutoIMSVINreUploadNavigationTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("AutoIMS VIN re-Upload Navigation Test");
			tempTest = report.startTest("AutoIMS VIN re-Upload Navigation Test");
			boolean status = Inventory_AutoIMSVINreUploadActions.AutoIMSVINreUploadNavigation();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("AutoIMS VIN re-Upload Navigation Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("AutoIMS VIN re-Upload Navigation Test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void UploadRewardsGoalNavigationTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Upload Rewards Goal Navigation Test");
			tempTest = report.startTest("Upload Rewards Goal Navigation Test");
			boolean status = Inventory_UploadRewardsGoalActions.UploadRewardsGoalNavigation();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Upload Rewards Goal Navigation Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Upload Rewards Goal Navigation Test");
			Assert.fail(e.getMessage());
		}
	}
}
