package com.Actions.Admin;

import com.PageObjects.Admin.Sanity_OtherProductionApplicationsPageObjects;
import com.utilities.Environment;
import com.utilities.Log;
import com.utilities.TestBase;
import com.utilities.WebDriverUtils;

public class Sanity_OtherProductionApplicationsAction extends TestBase {

	static boolean status = false;

	public static boolean TDDNavigation() throws Exception {
		WebDriverUtils.goToURL(Environment.ReadExcelData("URL", 2, 0));
		if (WebDriverUtils.TextChecker(Sanity_OtherProductionApplicationsPageObjects.TDDForgotPasswordLink())
				.contentEquals("Forgot Password?")) {
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

	public static boolean TDDForgotPassword() throws Exception {
		WebDriverUtils.ClickAction(Sanity_OtherProductionApplicationsPageObjects.TDDForgotPasswordLink(),
				"Forgot Password Link");
		if (WebDriverUtils
				.TextChecker(Sanity_OtherProductionApplicationsPageObjects.TDDForgotPasswordVerificationText())
				.contentEquals("Email Address:")) {
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

	public static boolean TDDInvalidLogin() throws Exception {
		WebDriverUtils.ClickAction(Sanity_OtherProductionApplicationsPageObjects.TDDBackToLoginLink(),
				"Back to login page");
		WebDriverUtils.ClickAction(Sanity_OtherProductionApplicationsPageObjects.TDDLoginLink(), "Login Link");
		if (WebDriverUtils.TextChecker(Sanity_OtherProductionApplicationsPageObjects.TDDInvalidLoginVerificationText())
				.contentEquals("Invalid User ID or Password. Please try again.")) {
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

	public static boolean LDDNavigation() throws Exception {
		WebDriverUtils.goToURL(Environment.ReadExcelData("URL", 3, 0));
		if (WebDriverUtils.TextChecker(Sanity_OtherProductionApplicationsPageObjects.TDDForgotPasswordLink())
				.contentEquals("Forgot Password?")) {
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

	public static boolean LDDForgotPassword() throws Exception {
		WebDriverUtils.ClickAction(Sanity_OtherProductionApplicationsPageObjects.TDDForgotPasswordLink(),
				"Forgot Password Link");
		if (WebDriverUtils
				.TextChecker(Sanity_OtherProductionApplicationsPageObjects.TDDForgotPasswordVerificationText())
				.contentEquals("Email Address:")) {
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

	public static boolean LDDInvalidLogin() throws Exception {
		WebDriverUtils.ClickAction(Sanity_OtherProductionApplicationsPageObjects.TDDBackToLoginLink(),
				"Back to login page");
		WebDriverUtils.ClickAction(Sanity_OtherProductionApplicationsPageObjects.TDDLoginLink(), "Login Link");
		if (WebDriverUtils.TextChecker(Sanity_OtherProductionApplicationsPageObjects.TDDInvalidLoginVerificationText())
				.contentEquals("Invalid User ID or Password. Please try again.")) {
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
