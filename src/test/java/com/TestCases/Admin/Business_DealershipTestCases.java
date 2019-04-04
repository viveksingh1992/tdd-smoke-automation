package com.TestCases.Admin;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.Actions.Admin.Business_DealershipActions;
import com.utilities.Environment;
import com.utilities.Log;
import com.utilities.TestBase;
import com.utilities.TestStatistics;
import com.utilities.WebDriverUtils;

@Listeners(com.utilities.TestStatistics.class)
public class Business_DealershipTestCases extends TestBase {

	@Test(retryAnalyzer = TestStatistics.class)
	public static void DealershipSanitySearchDealerUserTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Search Dealer Users Test");
			tempTest = report.startTest("Search Dealer Users Test");
			boolean status = Business_DealershipActions.Dealership_Sanity_SearchDealerUser();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Search Dealer Users Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Search Dealer Users Test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void DealershipSanityGroundedAtMyDealershipNavigationFromAdminTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Dealership Sanity Grounded At MyDealership Navigation From Admin Test");
			tempTest = report.startTest("Dealership Sanity Grounded At MyDealership Navigation From Admin Test");
			boolean status = Business_DealershipActions.Dealership_Sanity_GroundedAtMyDealershipNavigationFromAdmin();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Dealership Sanity Grounded At MyDealership Navigation From Admin Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Dealership Sanity Grounded At MyDealership Navigation From Admin Test");
			Assert.fail(e.getMessage());
		}
	}
	
	@Test(retryAnalyzer = TestStatistics.class)
	public static void DealershipSanitySelectUserView() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Dealership Sanity Select User View Test");
			tempTest = report.startTest("Dealership Sanity Select User View Test");
			boolean status = Business_DealershipActions.Dealership_Sanity_SelectUserView();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Dealership Sanity Select User View Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Dealership Sanity Select User View Test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void DealershipSanityDealerViewTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Dealership Sanity Dealer View Test");
			tempTest = report.startTest("Dealership Sanity Dealer View Test");
			boolean status = Business_DealershipActions.Dealership_Sanity_DealerView();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Dealership Sanity Dealer View Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Dealership Sanity Dealer View Test");
			Assert.fail(e.getMessage());
		}
	}
	
	@Test(retryAnalyzer = TestStatistics.class)
	public static void DealershipSanityRetailViewTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Dealership Sanity Retail View Test");
			tempTest = report.startTest("Dealership Sanity Retail View Test");
			boolean status = Business_DealershipActions.Dealership_Sanity_RetailView();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Dealership Sanity Retail View Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Dealership Sanity Retail View Test");
			Assert.fail(e.getMessage());
		}
	}
	
	@Test(retryAnalyzer = TestStatistics.class)
	public static void DealershipSanityCustomerViewTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Dealership Sanity Customer View Test");
			tempTest = report.startTest("Dealership Sanity Customer View Test");
			boolean status = Business_DealershipActions.Dealership_Sanity_CustomerView();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Dealership Sanity Customer View Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Dealership Sanity Customer View Test");
			Assert.fail(e.getMessage());
		}
	}
	
	@Test(retryAnalyzer = TestStatistics.class)
	public static void DealershipSanityDealerDirectOnlineNavigationTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Dealership Sanity Dealer Direct Online Navigation Test");
			tempTest = report.startTest("Dealership Sanity Dealer Direct Online Navigation Test");
			boolean status = Business_DealershipActions.Dealership_Sanity_DealerDirectOnlineNavigation();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Dealership Sanity Dealer Direct Online Navigation Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Dealership Sanity Dealer Direct Online Navigation Test");
			Assert.fail(e.getMessage());
		}
	}
	
	@Test(retryAnalyzer = TestStatistics.class)
	public static void DealershipSanityDealerDirectOnlineVINBuyNowAndBidTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Dealership Sanity Dealer Direct Online VIN Buy Now And Bid Test");
			tempTest = report.startTest("Dealership Sanity Dealer Direct Online VIN Buy Now And Bid Test");
			boolean status = Business_DealershipActions.Dealership_Sanity_DealerDirectOnlineVINBuyNowAndBid();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Dealership Sanity Dealer Direct Online VIN Buy Now And Bid Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Dealership Sanity Dealer Direct Online VIN Buy Now And Bid Test");
			Assert.fail(e.getMessage());
		}
	}
	
	@Test(retryAnalyzer = TestStatistics.class)
	public static void DealershipSanityAccountSettingTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Dealership Sanity Account Settings Test");
			tempTest = report.startTest("Dealership Sanity Account Settings Test");
			boolean status = Business_DealershipActions.Dealership_Sanity_AccountSettings();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Dealership Sanity Account Settings Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Dealership Sanity Account Settings Test");
			Assert.fail(e.getMessage());
		}
	}
	
	@Test(retryAnalyzer = TestStatistics.class)
	public static void DealershipSanityLogOutTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Dealership Sanity Log Out Test");
			tempTest = report.startTest("Dealership Sanity Log Out Test");
			boolean status = Business_DealershipActions.Dealership_Sanity_LogOut();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Dealership Sanity Log Out Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Dealership Sanity Log Out Test");
			Assert.fail(e.getMessage());
		}
	}

}
