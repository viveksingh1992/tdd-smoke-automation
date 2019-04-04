package com.Actions.Admin;

import com.PageObjects.Admin.AdminMasterMenuNavigationPageObjects;
import com.PageObjects.Admin.MasterMenuNavigationVerificationPageObjects;
import com.utilities.Environment;
import com.utilities.Log;
import com.utilities.TestBase;
import com.utilities.WebDriverUtils;

public class AccountTools_PaymentMaintenance extends TestBase {

	static boolean status = false;

	public static boolean PaymentMaintenanceNavigation() throws Exception {

		WebDriverUtils.moveToElement(AdminMasterMenuNavigationPageObjects.AccountToolsHoverLink());
		WebDriverUtils.ClickAction(AdminMasterMenuNavigationPageObjects.AccountTools_PaymentMaintenanceLink(), "PaymentMaintenance");
		if (WebDriverUtils
				.TextChecker(MasterMenuNavigationVerificationPageObjects.AccountTools_PaymentMaintenanceVerificationText())
				.contentEquals(Environment.ReadExcelData("AccountTools_Validator", 1, 0))) {
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
