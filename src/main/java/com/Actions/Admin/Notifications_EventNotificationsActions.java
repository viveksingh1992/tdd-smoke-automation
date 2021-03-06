package com.Actions.Admin;

import com.PageObjects.Admin.AdminMasterMenuNavigationPageObjects;
import com.PageObjects.Admin.MasterMenuNavigationVerificationPageObjects;
import com.utilities.Environment;
import com.utilities.Log;
import com.utilities.TestBase;
import com.utilities.WebDriverUtils;

public class Notifications_EventNotificationsActions extends TestBase {

	static boolean status = false;

	public static boolean EventNotificationsNavigation() throws Exception {

		WebDriverUtils.moveToElement(AdminMasterMenuNavigationPageObjects.NotificationsHoverLink());
		WebDriverUtils.ClickAction(AdminMasterMenuNavigationPageObjects.Notifications_EventNotificationsLink(),
				"EventNotifications");
		if (WebDriverUtils
				.TextChecker(
						MasterMenuNavigationVerificationPageObjects.Notifications_EventNotificationsVerificationText())
				.contentEquals(Environment.ReadExcelData("Notifications_Validator", 0, 0))) {
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
