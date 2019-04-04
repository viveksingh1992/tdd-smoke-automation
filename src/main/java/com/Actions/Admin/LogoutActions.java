package com.Actions.Admin;

import com.PageObjects.Admin.Logout_PageObjects;
import com.utilities.Environment;
import com.utilities.Log;
import com.utilities.TestBase;
import com.utilities.WebDriverUtils;

public class LogoutActions extends TestBase {

	public static boolean status = false;

	public static boolean LogoutAction() throws Exception {
		WebDriverUtils.ClickAction(Logout_PageObjects.LogoutLink(), "Logout Link");
		if (WebDriverUtils.TextChecker(Logout_PageObjects.LogoutVerifyText()).contentEquals("here")) {
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
