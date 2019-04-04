package com.Actions.Admin;

import com.PageObjects.Admin.AdminMasterMenuNavigationPageObjects;
import com.PageObjects.Admin.MasterMenuNavigationVerificationPageObjects;
import com.utilities.Environment;
import com.utilities.Log;
import com.utilities.TestBase;
import com.utilities.WebDriverUtils;

public class FeesAndTaxes_FeesActions extends TestBase {

	static boolean status = false;

	public static boolean FeesNavigation() throws Exception {

		WebDriverUtils.moveToElement(AdminMasterMenuNavigationPageObjects.FeesAndTaxesHoverLink());
		WebDriverUtils.ClickAction(AdminMasterMenuNavigationPageObjects.FeesAndTaxes_FeesLink(), "Fees");
		if (WebDriverUtils.TextChecker(MasterMenuNavigationVerificationPageObjects.FeesAndTaxes_FeesVerificationText())
				.contentEquals(Environment.ReadExcelData("Fees&Taxes_Validator", 0, 0))) {
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
