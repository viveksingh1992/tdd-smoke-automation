package com.Actions.Admin;

import com.PageObjects.Admin.AdminMasterMenuNavigationPageObjects;
import com.PageObjects.Admin.MasterMenuNavigationVerificationPageObjects;
import com.utilities.Environment;
import com.utilities.Log;
import com.utilities.TestBase;
import com.utilities.WebDriverUtils;

public class Inventory_BaloonfileUploadActions extends TestBase {

	static boolean status = false;

	public static boolean BaloonfileUploadNavigation() throws Exception {

		WebDriverUtils.moveToElement(AdminMasterMenuNavigationPageObjects.InventoryHoverLink());
		WebDriverUtils.ClickAction(AdminMasterMenuNavigationPageObjects.Inventory_BaloonfileUploadLink(), "BaloonfileUpload");
		if (WebDriverUtils
				.TextChecker(MasterMenuNavigationVerificationPageObjects.Inventory_BaloonfileUploadVerificationText())
				.contentEquals(Environment.ReadExcelData("Inventory_Validator", 1, 0))) {
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
