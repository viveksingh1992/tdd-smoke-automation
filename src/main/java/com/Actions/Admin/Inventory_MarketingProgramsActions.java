package com.Actions.Admin;

import com.PageObjects.Admin.AdminMasterMenuNavigationPageObjects;
import com.PageObjects.Admin.MasterMenuNavigationVerificationPageObjects;
import com.utilities.Environment;
import com.utilities.Log;
import com.utilities.TestBase;
import com.utilities.WebDriverUtils;

public class Inventory_MarketingProgramsActions extends TestBase {

	static boolean status = false;

	public static boolean MarketingProgramsNavigation() throws Exception {

		WebDriverUtils.moveToElement(AdminMasterMenuNavigationPageObjects.InventoryHoverLink());
		WebDriverUtils.ClickAction(AdminMasterMenuNavigationPageObjects.Inventory_MarketingProgramsLink(), "MarketingPrograms");
		if (WebDriverUtils
				.TextChecker(MasterMenuNavigationVerificationPageObjects.Inventory_MarketingProgramsVerificationText())
				.contentEquals(Environment.ReadExcelData("Inventory_Validator", 5, 0))) {
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
