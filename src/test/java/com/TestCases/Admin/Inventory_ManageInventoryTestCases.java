package com.TestCases.Admin;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.Actions.Admin.Inventory_ManageInventoryActions;
import com.utilities.Environment;
import com.utilities.Log;
import com.utilities.TestBase;
import com.utilities.TestStatistics;
import com.utilities.WebDriverUtils;

@Listeners(com.utilities.TestStatistics.class)
public class Inventory_ManageInventoryTestCases extends TestBase {

	@Test(retryAnalyzer = TestStatistics.class)
	public static void ManageInventorySanityVehicleDetailsTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Manage Inventory Sanity Vehicle Details Test");
			tempTest = report.startTest("Manage Inventory Sanity Vehicle Details Test");
			boolean status = Inventory_ManageInventoryActions.ManageInventorySanityVehicleDetails();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Manage Inventory Sanity Vehicle Details Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Manage Inventory Sanity Vehicle Details Test");
			Assert.fail(e.getMessage());
		}
	}
	
	@Test(retryAnalyzer = TestStatistics.class)
	public static void ManageInventorySanityVehicleEditAndPricingTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Manage Inventory Sanity Vehicle Edit And Pricing Test");
			tempTest = report.startTest("Manage Inventory Sanity Vehicle Edit And Pricing Test");
			boolean status = Inventory_ManageInventoryActions.ManageInventorySanityVehicleEditAndPricing();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Manage Inventory Sanity Vehicle Edit And Pricing Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Manage Inventory Sanity Vehicle Edit And Pricing Test");
			Assert.fail(e.getMessage());
		}
	}
	
	@Test(retryAnalyzer = TestStatistics.class)
	public static void ManageInventorySanityVehicleHistoryTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Manage Inventory Sanity Vehicle History Test");
			tempTest = report.startTest("Manage Inventory Sanity Vehicle History Test");
			boolean status = Inventory_ManageInventoryActions.ManageInventorySanityVehicleHistoryTab();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Manage Inventory Sanity Vehicle History Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Manage Inventory Sanity Vehicle History Test");
			Assert.fail(e.getMessage());
		}
	}
	
	@Test(retryAnalyzer = TestStatistics.class)
	public static void ManageInventorySanityAdminNotesTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Manage Inventory Sanity Admin Notes Test");
			tempTest = report.startTest("Manage Inventory Sanity Admin Notes Test");
			boolean status = Inventory_ManageInventoryActions.ManageInventorySanityAdminNotes();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Manage Inventory Sanity Admin Notes Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Manage Inventory Sanity Admin Notes Test");
			Assert.fail(e.getMessage());
		}
	}
	
	@Test(retryAnalyzer = TestStatistics.class)
	public static void ManageInventorySanityLeaseInfoTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Manage Inventory Sanity LeaseInfo Test");
			tempTest = report.startTest("Manage Inventory Sanity LeaseInfo Test");
			boolean status = Inventory_ManageInventoryActions.ManageInventorySanityLeaseInfo();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Manage Inventory Sanity LeaseInfo Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Manage Inventory Sanity LeaseInfo Test");
			Assert.fail(e.getMessage());
		}
	}
	
	@Test(retryAnalyzer = TestStatistics.class)
	public static void ManageInventorySanityReGenTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Manage Inventory Sanity ReGen Test");
			tempTest = report.startTest("Manage Inventory Sanity ReGen Test");
			boolean status = Inventory_ManageInventoryActions.ManageInventorySanityReGen();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Manage Inventory Sanity ReGen Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Manage Inventory Sanity ReGen Test");
			Assert.fail(e.getMessage());
		}
	}
	
	@Test(retryAnalyzer = TestStatistics.class)
	public static void ManageInventorySanityReListTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Manage Inventory Sanity ReList Test");
			tempTest = report.startTest("Manage Inventory Sanity ReList Test");
			boolean status = Inventory_ManageInventoryActions.ManageInventorySanityReList();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Manage Inventory Sanity Vehicle Edit And Pricing Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Manage Inventory Sanity Vehicle Edit And Pricing Test");
			Assert.fail(e.getMessage());
		}
	}
	
	@Test(retryAnalyzer = TestStatistics.class)
	public static void ManageInventorySanityUnWindTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Manage Inventory Sanity UnWind Test");
			tempTest = report.startTest("Manage Inventory Sanity UnWind Test");
			boolean status = Inventory_ManageInventoryActions.ManageInventorySanityUnWind();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Manage Inventory Sanity UnWind Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Manage Inventory Sanity UnWind Test");
			Assert.fail(e.getMessage());
		}
	}
	
	@Test(retryAnalyzer = TestStatistics.class)
	public static void ManageInventorySanityUnGroundTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Manage Inventory Sanity UnGround Test");
			tempTest = report.startTest("Manage Inventory Sanity UnGround Test");
			boolean status = Inventory_ManageInventoryActions.ManageInventorySanityUnGround();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Manage Inventory Sanity UnGround Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Manage Inventory Sanity UnGround Test");
			Assert.fail(e.getMessage());
		}
	}
	
	@Test(retryAnalyzer = TestStatistics.class)
	public static void ManageInventorySanityCancelInspection() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Manage Inventory Sanity Cancel Inspection Test");
			tempTest = report.startTest("Manage Inventory Sanity Cancel Inspection Test");
			boolean status = Inventory_ManageInventoryActions.ManageInventorySanityCancelInspection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Manage Inventory Sanity Cancel Inspection Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Manage Inventory Sanity Cancel Inspection Test");
			Assert.fail(e.getMessage());
		}
	}
}
