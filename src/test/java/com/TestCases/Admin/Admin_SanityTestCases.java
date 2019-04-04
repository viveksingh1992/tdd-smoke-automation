package com.TestCases.Admin;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.utilities.TestBase;
import com.utilities.TestStatistics;
import com.utilities.WebDriverUtils;

public class Admin_SanityTestCases extends TestBase {

	String TestCaseName = null;

	@BeforeTest
	public void init() throws Exception {
		TestCaseName = this.getClass().getSimpleName();
		initExtentReport(TestCaseName);
		test = report.startTest("Sanity Test");
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public void AdminSanityTestCases() throws Exception {
		LoginTestCase.LoginTest();
		Inventory_NavigationTestCases.ManageInventoryNavigationTest();
		Inventory_ManageInventoryTestCases.ManageInventorySanityVehicleDetailsTest();
		Inventory_ManageInventoryTestCases.ManageInventorySanityVehicleEditAndPricingTest();
		Inventory_ManageInventoryTestCases.ManageInventorySanityVehicleHistoryTest();
		Inventory_ManageInventoryTestCases.ManageInventorySanityAdminNotesTest();
		Inventory_ManageInventoryTestCases.ManageInventorySanityLeaseInfoTest();
		Inventory_ManageInventoryTestCases.ManageInventorySanityReGenTest();
		Inventory_ManageInventoryTestCases.ManageInventorySanityReListTest();
		Inventory_ManageInventoryTestCases.ManageInventorySanityUnWindTest();
		Inventory_ManageInventoryTestCases.ManageInventorySanityUnGroundTest();
		Inventory_ManageInventoryTestCases.ManageInventorySanityCancelInspection();
		Business_NavigationTestCases.DealershipNavigationTest();
		Business_DealershipTestCases.DealershipSanitySearchDealerUserTest();
		Business_DealershipTestCases.DealershipSanitySelectUserView();
		Business_DealershipTestCases.DealershipSanityGroundedAtMyDealershipNavigationFromAdminTest();
		Business_DealershipTestCases.DealershipSanityDealerViewTest();
		Business_DealershipTestCases.DealershipSanityCustomerViewTest();
		Business_DealershipTestCases.DealershipSanityRetailViewTest();
		WebDriverUtils.switchToWindow();
		Business_DealershipTestCases.DealershipSanityDealerDirectOnlineNavigationTest();
		Business_DealershipTestCases.DealershipSanityAccountSettingTest();
		Business_DealershipTestCases.DealershipSanityLogOutTest();
	}
}
