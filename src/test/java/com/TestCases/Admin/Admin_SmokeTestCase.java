package com.TestCases.Admin;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.utilities.TestBase;
import com.utilities.TestStatistics;

public class Admin_SmokeTestCase extends TestBase {

	String TestCaseName = null;

	@BeforeTest
	public void init() throws Exception {
		TestCaseName = this.getClass().getSimpleName();
		initExtentReport(TestCaseName);
		test = report.startTest("Smoke Test");
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public void AdminSmokeTestCase() throws Exception {

		ResetPasswordTestCase.ResetPasswordTest();
		LoginTestCase.LoginTest();
		Business_NavigationTestCases.DealershipNavigationTest();
		Business_NavigationTestCases.PhysicalAuctionLocationsNavigationTest();
		Users_NavigationTestCase.AdminUserNavigationTest();
		Inventory_NavigationTestCases.ManageInventoryNavigationTest();
		Inventory_NavigationTestCases.MBPRequestsNavigationTest();
		Inventory_NavigationTestCases.MarketingProgramsNavigationTest();
		Inventory_NavigationTestCases.ManageArbitrationsNavigationTest();
		Inventory_NavigationTestCases.GuarenteedBuybackProgramsNavigationTest();
		Inventory_NavigationTestCases.BaloonfileUploadNavigationTest();
		Inventory_NavigationTestCases.TitleSearchNavigationTest();
		Inventory_NavigationTestCases.AutoIMSVINreUploadNavigationTest();
		Inventory_NavigationTestCases.UploadRewardsGoalNavigationTest();
		SaleEvents_NavigationTestCases.ManageEventsNavigationTest();
		SaleEvents_NavigationTestCases.EditPricingNavigationTest();
		SaleEvents_NavigationTestCases.HolidayProcessingNavigationTest();
		SaleEvents_NavigationTestCases.IfDealsNavigationTest();
		FeesAndTaxes_NavigationTestCases.FeesNavigationTest();
		Notifications_NavigationTestCases.EventNotificationsNavigationTest();
		Notifications_NavigationTestCases.DistributionListNavigationTest();
		Reports_NavigationTestCase.AdminReportsNavigationTest();
		ContentMgmt_TestCase.ContentMgmtNavigationTest();
		AccountTools_NavigationTestCases.PaymentMaintenanceNavigationTest();
		AccountTools_NavigationTestCases.DealershipMaintenanceNavigationTest();
		AccountTools_NavigationTestCases.ManageAMSNavigationTest();
		YourPreferences_TestCase.YourPreferencesNavigationTest();
		Home_TestCases.HomepageNavigationTest();
		LogoutTestCase.LogoutTest();
	}
}
