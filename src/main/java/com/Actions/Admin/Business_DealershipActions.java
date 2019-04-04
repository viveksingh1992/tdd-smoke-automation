package com.Actions.Admin;

import com.PageObjects.Admin.AdminMasterMenuNavigationPageObjects;
import com.PageObjects.Admin.Businesses_DealershipPageObjects;
import com.PageObjects.Admin.MasterMenuNavigationVerificationPageObjects;
import com.utilities.Environment;
import com.utilities.Log;
import com.utilities.TestBase;
import com.utilities.WebDriverUtils;

public class Business_DealershipActions extends TestBase {
	static boolean status = false;

	public static boolean DealershipsNavigation() throws Exception {

		WebDriverUtils.moveToElement(AdminMasterMenuNavigationPageObjects.BusinessHoverLink());
		WebDriverUtils.ClickAction(AdminMasterMenuNavigationPageObjects.Business_DealershipsLink(), "DealershipsLink");
		if (WebDriverUtils
				.TextChecker(MasterMenuNavigationVerificationPageObjects.Business_DealershipsVerificationText())
				.contentEquals(Environment.ReadExcelData("Business_Validator", 1, 0))) {
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			status = true;
			test.appendChild(tempTest);
		} else {
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			status = false;
			test.appendChild(tempTest);
		}
		return status;
	}

	public static boolean Dealership_Sanity_SearchDealerUser() throws Exception {
		WebDriverUtils.InputValues(Businesses_DealershipPageObjects.DealerNumberField(), "20114", "Dealership Number");
		WebDriverUtils.ClickAction(Businesses_DealershipPageObjects.SearchDealerButton(), "Search Dealer Button");
		WebDriverUtils.ClickAction(Businesses_DealershipPageObjects.DealerNumberLink(), "Dealer Number Link");
		if (WebDriverUtils.TextChecker(Businesses_DealershipPageObjects.DealerNavigationVerificationText())
				.contentEquals("CURRENT USERS")) {
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			status = true;
			test.appendChild(tempTest);
		} else {
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			status = false;
			test.appendChild(tempTest);
		}
		return status;
	}

	public static boolean Dealership_Sanity_SelectUserView() throws Exception {

		WebDriverUtils.ClickAction(Businesses_DealershipPageObjects.ViewDealerUserLink(), "View Dealer User link");
		WebDriverUtils.switchToWindow();
		if (WebDriverUtils.TextChecker(Businesses_DealershipPageObjects.ViewDealerUserVerificationText())
				.contentEquals("My Purchase %")) {
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			status = true;
			test.appendChild(tempTest);
		} else {
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			status = false;
			test.appendChild(tempTest);
		}
		return status;
	}

	public static boolean Dealership_Sanity_GroundedAtMyDealershipNavigationFromAdmin() throws Exception {
		WebDriverUtils.ClickAction(Businesses_DealershipPageObjects.GroundedAtMyDealershipLink(),
				"Grounded At My Dealership Link");
		if (WebDriverUtils.TextChecker(Businesses_DealershipPageObjects.GroundedAtMyDealershipLinkVerificationText())
				.contentEquals("Awaiting Pricing / Not Priced")) {
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			status = true;
			test.appendChild(tempTest);
		} else {
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			status = false;
			test.appendChild(tempTest);
		}
		return status;
	}

	public static boolean Dealership_Sanity_DealerView() throws Exception {

		WebDriverUtils.ClickAction(Businesses_DealershipPageObjects.VINLinkPassed(), "VIN Link");
		WebDriverUtils.switchToWindow();
		if (WebDriverUtils.TextChecker(Businesses_DealershipPageObjects.ConditionReport_DealerViewText())
				.contentEquals("CONDITION REPORT (DEALER VIEW)")
				&& WebDriverUtils.TextChecker(Businesses_DealershipPageObjects.ConditionReport_VehicleInformationText())
						.contentEquals("Vehicle Information")
				&& WebDriverUtils.TextChecker(Businesses_DealershipPageObjects.ConditionReport_AccessoriesText())
						.contentEquals("Accessories")
				&& WebDriverUtils.TextChecker(Businesses_DealershipPageObjects.ConditionReport_WheelsandTiresText())
						.contentEquals("Wheels and Tires")
				&& WebDriverUtils.TextChecker(Businesses_DealershipPageObjects.ConditionReport_VehicleConditionText())
						.contains("Vehicle Condition")
				&& WebDriverUtils.TextChecker(Businesses_DealershipPageObjects.ConditionReport_BuildDataText())
						.contentEquals("Build Data")) {
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			status = true;
			test.appendChild(tempTest);
		} else {
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			status = false;
			test.appendChild(tempTest);
		}
		return status;
	}

	public static boolean Dealership_Sanity_RetailView() throws Exception {

		WebDriverUtils.ClickAction(Businesses_DealershipPageObjects.ConditionReport_RetailViewLink(),
				"Retail View Link");
		if (WebDriverUtils.TextChecker(Businesses_DealershipPageObjects.ConditionReport_RetailViewText())
				.contentEquals("CONDITION REPORT (RETAIL VIEW)")
				&& WebDriverUtils.TextChecker(Businesses_DealershipPageObjects.ConditionReport_VehicleInformationText())
						.contentEquals("Vehicle Information")
				&& WebDriverUtils.TextChecker(Businesses_DealershipPageObjects.ConditionReport_AccessoriesText())
						.contentEquals("Accessories")
				&& WebDriverUtils.TextChecker(Businesses_DealershipPageObjects.ConditionReport_WheelsandTiresText())
						.contentEquals("Wheels and Tires")
				&& WebDriverUtils.TextChecker(Businesses_DealershipPageObjects.ConditionReport_VehicleConditionText())
						.contains("Vehicle Condition")
				&& WebDriverUtils.TextChecker(Businesses_DealershipPageObjects.ConditionReport_BuildDataText())
						.contentEquals("Build Data")) {
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			status = true;
			test.appendChild(tempTest);
		} else {
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			status = false;
			test.appendChild(tempTest);
		}
		return status;
	}

	public static boolean Dealership_Sanity_CustomerView() throws Exception {

		WebDriverUtils.ClickAction(Businesses_DealershipPageObjects.ConditionReport_CustomerViewLink(),
				"Customer View");
		if (WebDriverUtils.TextChecker(Businesses_DealershipPageObjects.ConditionReport_CustomerViewText())
				.contentEquals("CONDITION REPORT (CUSTOMER VIEW)")
				&& WebDriverUtils.TextChecker(Businesses_DealershipPageObjects.ConditionReport_VehicleInformationText())
						.contentEquals("Vehicle Information")
				&& WebDriverUtils.TextChecker(Businesses_DealershipPageObjects.ConditionReport_AccessoriesText())
						.contentEquals("Accessories")
				&& WebDriverUtils.TextChecker(Businesses_DealershipPageObjects.ConditionReport_WheelsandTiresText())
						.contentEquals("Wheels and Tires")
				&& WebDriverUtils.TextChecker(Businesses_DealershipPageObjects.ConditionReport_VehicleConditionText())
						.contains("Vehicle Condition")
				&& WebDriverUtils.TextChecker(Businesses_DealershipPageObjects.ConditionReport_BuildDataText())
						.contentEquals("Build Data")) {
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			status = true;
			test.appendChild(tempTest);
		} else {
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			status = false;
			test.appendChild(tempTest);
		}
		return status;
	}

	public static boolean Dealership_Sanity_DealerDirectOnlineNavigation() throws Exception {

		WebDriverUtils.ClickAction(Businesses_DealershipPageObjects.DealerDirectOnlineLink(),
				"Dealer Direct Online Link");
		if (WebDriverUtils.TextChecker(Businesses_DealershipPageObjects.DDOVerificationText())
				.contentEquals("Results Per Page")) {

			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			status = true;
			test.appendChild(tempTest);
		} else {
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			status = false;
			test.appendChild(tempTest);
		}
		return status;
	}

	public static boolean Dealership_Sanity_DealerDirectOnlineVINBuyNowAndBid() throws Exception {

		WebDriverUtils.ClickAction(Businesses_DealershipPageObjects.DDOVINLink(), "VIN On DDO");
		WebDriverUtils.switchToWindow();
		if (Businesses_DealershipPageObjects.DDOVINBuyNowButton().isDisplayed()
				&& Businesses_DealershipPageObjects.DDOVINBidButton().isDisplayed()) {

			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			status = true;
			test.appendChild(tempTest);
		} else {
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			status = false;
			test.appendChild(tempTest);
		}
		return status;
	}

	public static boolean Dealership_Sanity_AccountSettings() throws Exception {
		WebDriverUtils.ClickAction(Businesses_DealershipPageObjects.AccountSettingsLink(), "Account Settings Link");
		if (WebDriverUtils.TextChecker(Businesses_DealershipPageObjects.AccountSettingsVerificationText())
				.contentEquals("My Preferences")) {
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			status = true;
			test.appendChild(tempTest);
			WebDriverUtils.ClickAction(Businesses_DealershipPageObjects.AccountSettingsClosePopUpLink(),
					"Close Account Settings Pop-up");
		} else {
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			status = false;
			test.appendChild(tempTest);
			WebDriverUtils.ClickAction(Businesses_DealershipPageObjects.AccountSettingsClosePopUpLink(),
					"Close Account Settings Pop-up");
		}
		return status;
	}

	public static boolean Dealership_Sanity_LogOut() throws Exception {
		WebDriverUtils.ClickAction(Businesses_DealershipPageObjects.AccountSettingsLogoutLink(), "LogOut Link");
		if (Businesses_DealershipPageObjects.UsernameField().isDisplayed()) {
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			status = true;
			test.appendChild(tempTest);
		} else {
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			status = false;
			test.appendChild(tempTest);
		}
		return status;
	}
}
