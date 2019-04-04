package com.Actions.Admin;

import com.PageObjects.Admin.AdminMasterMenuNavigationPageObjects;
import com.PageObjects.Admin.MasterMenuNavigationVerificationPageObjects;
import com.utilities.Environment;
import com.utilities.Log;
import com.utilities.TestBase;
import com.utilities.WebDriverUtils;

public class Users_AdminUsersActions extends TestBase {

	static boolean status = false;

	public static boolean AdminUsersNavigation() throws Exception {

		WebDriverUtils.moveToElement(AdminMasterMenuNavigationPageObjects.UsersHoverLink());
		WebDriverUtils.ClickAction(AdminMasterMenuNavigationPageObjects.Users_AdminUsersLink(), "AdminUsers");
		if (WebDriverUtils.TextChecker(MasterMenuNavigationVerificationPageObjects.Users_AdminUsersVerificationText())
				.contentEquals(Environment.ReadExcelData("Users_Validator", 1, 0))) {
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
