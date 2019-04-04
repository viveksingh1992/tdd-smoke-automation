package com.Actions.Admin;

import com.PageObjects.Admin.LoginPageObjectsAdmin;
import com.utilities.*;

public class LoginActions extends TestBase {
	static boolean status = false;

	public static boolean LoginActionAdmin() throws Exception {
		WebDriverUtils.goToURL(Environment.ReadExcelData("URL", 1, 0));
		WebDriverUtils.InputValues(LoginPageObjectsAdmin.UsernameField(),
				Environment.ReadExcelData("Credentials", 1, 0), "Username");
		WebDriverUtils.InputValues(LoginPageObjectsAdmin.PasswordField(),
				Environment.ReadExcelData("Credentials", 1, 1), "Password");
		WebDriverUtils.ClickAction(LoginPageObjectsAdmin.LoginButton(), "Login Button");
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