package com.Actions.Admin;

import com.PageObjects.Admin.Home_PageObjects;
import com.PageObjects.Admin.LoginPageObjectsAdmin;
import com.utilities.Environment;
import com.utilities.Log;
import com.utilities.TestBase;
import com.utilities.WebDriverUtils;

public class Home_Actions extends TestBase {

	public static boolean status = false;

	public static boolean HomePageNavigation() throws Exception {
		WebDriverUtils.ClickAction(Home_PageObjects.HomeLink(), "Home Link");
		if (WebDriverUtils.TextChecker(LoginPageObjectsAdmin.WelcomeText())
				.contentEquals(Environment.ReadExcelData("Login_Validator", 1, 0))) {
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
