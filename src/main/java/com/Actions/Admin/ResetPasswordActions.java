package com.Actions.Admin;

import com.PageObjects.Admin.AdminResetPasswordPageObjects;
import com.utilities.Environment;
import com.utilities.Log;
import com.utilities.TestBase;
import com.utilities.WebDriverUtils;

public class ResetPasswordActions extends TestBase {
	static boolean status = false;

	public static boolean ResetPasswordAdmin() throws Exception {
		WebDriverUtils.goToURL(Environment.ReadExcelData("URL", 1, 0));
		WebDriverUtils.ClickAction(AdminResetPasswordPageObjects.ForgotPasswordLink(), "ForgotPasswordLink");
		if (WebDriverUtils.TextChecker(AdminResetPasswordPageObjects.ForgotPasswordPageValidator())
				.contentEquals(Environment.ReadExcelData("ResetPassword_Validator", 2, 0))) {
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			status = true;
			WebDriverUtils.ClickAction(AdminResetPasswordPageObjects.ForgotPasswordPageValidator(),
					"Back To Login Page");
			test.appendChild(tempTest);
		} else {
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			WebDriverUtils.ClickAction(AdminResetPasswordPageObjects.ForgotPasswordPageValidator(),
					"Back To Login Page");
			test.appendChild(tempTest);
		}
		return status;
	}

}
