package com.Actions.Admin;

import com.PageObjects.Admin.AdminMasterMenuNavigationPageObjects;
import com.PageObjects.Admin.MasterMenuNavigationVerificationPageObjects;
import com.utilities.Environment;
import com.utilities.Log;
import com.utilities.TestBase;
import com.utilities.WebDriverUtils;

public class ContentManagementActions extends TestBase {

	static boolean status = false;

	public static boolean ContentManagementNavigation() throws Exception {

		WebDriverUtils.ClickAction(AdminMasterMenuNavigationPageObjects.ContentManagementLink(), "ContentManagement");
		WebDriverUtils.switchToWindow();
		if (WebDriverUtils.TextChecker(MasterMenuNavigationVerificationPageObjects.ContentManagementVerificationText())
				.contentEquals(Environment.ReadExcelData("ContentManagement_Validator", 0, 0))) {
			WebDriverUtils.closeCurrentWindow();
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			status = true;
			test.appendChild(tempTest);
			
		} else {
			WebDriverUtils.closeCurrentWindow();
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			status = false;
			test.appendChild(tempTest);
		}
		return status;
	}
}
