package com.Actions.Admin;

import com.PageObjects.Admin.AdminMasterMenuNavigationPageObjects;
import com.PageObjects.Admin.Inventory_ManageInventoryPageObjects;
import com.PageObjects.Admin.MasterMenuNavigationVerificationPageObjects;
import com.utilities.Environment;
import com.utilities.Log;
import com.utilities.TestBase;
import com.utilities.WebDriverUtils;

public class Inventory_ManageInventoryActions extends TestBase {

	static boolean status = false;

	public static boolean ManageInventoryNavigation() throws Exception {

		WebDriverUtils.moveToElement(AdminMasterMenuNavigationPageObjects.InventoryHoverLink());
		WebDriverUtils.ClickAction(AdminMasterMenuNavigationPageObjects.Inventory_ManageInventoryLink(),
				"ManageInventory");
		if (WebDriverUtils
				.TextChecker(MasterMenuNavigationVerificationPageObjects.Inventory_ManageInventoryVerificationText())
				.contentEquals(Environment.ReadExcelData("Inventory_Validator", 4, 0))) {
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

	public static boolean ManageInventorySanityVehicleDetails() throws Exception {
		WebDriverUtils.selectOptionByValue(Inventory_ManageInventoryPageObjects.AdminStatusSelectorDropDown(), "27249");
		WebDriverUtils.selectOptionByValue(Inventory_ManageInventoryPageObjects.SubStatusSelectorDropDown(), "27250");
		WebDriverUtils.ClickAction(Inventory_ManageInventoryPageObjects.SearchButtonManageInventory(), "Search Button");
		WebDriverUtils.ClickAction(Inventory_ManageInventoryPageObjects.OpenVehicleDetailsScreenLink(),
				"Vehicle Details Link");
		if (WebDriverUtils.TextChecker(Inventory_ManageInventoryPageObjects.VehicleDetailsScreenVerificationText())
				.contentEquals("GROUNDING")) {
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			status = true;
			test.appendChild(tempTest);
			WebDriverUtils.ClickAction(Inventory_ManageInventoryPageObjects.CloseVehicleDetailsScreen(),
					"Close Vehicle Details Screen");
		} else {
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			status = false;
			test.appendChild(tempTest);
			WebDriverUtils.ClickAction(Inventory_ManageInventoryPageObjects.CloseVehicleDetailsScreen(),
					"Close Vehicle Details Screen");
		}
		return status;
	}
	
	public static boolean ManageInventorySanityVehicleEditAndPricing() throws Exception {
		WebDriverUtils.ClickAction(Inventory_ManageInventoryPageObjects.WrenchIcon(), "Wrench Icon");
		if (WebDriverUtils.TextChecker(Inventory_ManageInventoryPageObjects.PriceEditTabVerificationText())
				.contentEquals("Market Price:")) {
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

	public static boolean ManageInventorySanityVehicleHistoryTab() throws Exception {
		WebDriverUtils.ClickAction(Inventory_ManageInventoryPageObjects.VehicleHistoryTab(), "Vehicle History Tab");
		if (WebDriverUtils.TextChecker(Inventory_ManageInventoryPageObjects.VehicleHistoryTabVerificationText())
				.contentEquals("VEHICLE HISTORY")) {
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
	
	public static boolean ManageInventorySanityAdminNotes() throws Exception {
		WebDriverUtils.ClickAction(Inventory_ManageInventoryPageObjects.AdminNotesTab(), "Admin Notes");
		if (WebDriverUtils.TextChecker(Inventory_ManageInventoryPageObjects.AdminNotesTabVerificationText())
				.contentEquals("ADMIN NOTES")) {
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
	
	public static boolean ManageInventorySanityLeaseInfo() throws Exception {
		WebDriverUtils.ClickAction(Inventory_ManageInventoryPageObjects.LeaseInfoTab(), "LEASE INFO");
		if (WebDriverUtils.TextChecker(Inventory_ManageInventoryPageObjects.LeaseInfoTabVerificationText())
				.contentEquals("LEASE INFO")) {
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
	
	public static boolean ManageInventorySanityReGen() throws Exception {
		WebDriverUtils.ClickAction(Inventory_ManageInventoryPageObjects.ReGenTab(), "Re-Gen");
		if (WebDriverUtils.TextChecker(Inventory_ManageInventoryPageObjects.ReGenTabVerificationText())
				.contentEquals("Original Grounding Mileage:")) {
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
	
	public static boolean ManageInventorySanityReList() throws Exception {
		WebDriverUtils.ClickAction(Inventory_ManageInventoryPageObjects.ReListTab(), "Re-List");
		if (WebDriverUtils.TextChecker(Inventory_ManageInventoryPageObjects.ReListTabVerificationText())
				.contentEquals("Order Inspection")) {
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
	
	public static boolean ManageInventorySanityUnWind() throws Exception {
		WebDriverUtils.ClickAction(Inventory_ManageInventoryPageObjects.UnWindTab(), "Un-Wind");
		if (WebDriverUtils.TextChecker(Inventory_ManageInventoryPageObjects.UnWindTabVerificationText())
				.contentEquals("COMMENTS")) {
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
	
	public static boolean ManageInventorySanityUnGround() throws Exception {
		WebDriverUtils.ClickAction(Inventory_ManageInventoryPageObjects.UnGroundTab(), "Un-Ground");
		if (WebDriverUtils.TextChecker(Inventory_ManageInventoryPageObjects.UnGroundTabVerificationText())
				.contentEquals("Ability to Re-Ground")) {
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
	
	public static boolean ManageInventorySanityCancelInspection() throws Exception {
		WebDriverUtils.ClickAction(Inventory_ManageInventoryPageObjects.CancelInspectionTab(), "Cancel Inspection");
		if (WebDriverUtils.TextChecker(Inventory_ManageInventoryPageObjects.CancelInspectionTabVerificationText())
				.contentEquals("Reason for cancelling inspection?")) {
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
