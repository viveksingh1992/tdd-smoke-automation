package com.Actions.Admin;

import com.PageObjects.Admin.AdminMasterMenuNavigationPageObjects;
import com.PageObjects.Admin.MasterMenuNavigationVerificationPageObjects;
import com.utilities.Environment;
import com.utilities.Log;
import com.utilities.TestBase;
import com.utilities.WebDriverUtils;

public class Inventory_MBPRequestsActions extends TestBase {

	static boolean status = false;

	public static boolean MBPRequestsNavigation() throws Exception {

		WebDriverUtils.moveToElement(AdminMasterMenuNavigationPageObjects.InventoryHoverLink());
		WebDriverUtils.ClickAction(AdminMasterMenuNavigationPageObjects.Inventory_MBPRequestsLink(), "MBPRequests");
		if (WebDriverUtils
				.TextChecker(MasterMenuNavigationVerificationPageObjects.Inventory_MBPRequestsVerificationText())
				.contentEquals(Environment.ReadExcelData("Inventory_Validator", 6, 0))) {
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
