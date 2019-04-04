package com.Actions.Admin;

import com.PageObjects.Admin.AdminMasterMenuNavigationPageObjects;
import com.PageObjects.Admin.MasterMenuNavigationVerificationPageObjects;
import com.utilities.Environment;
import com.utilities.Log;
import com.utilities.TestBase;
import com.utilities.WebDriverUtils;

public class SaleEvents_HolidayProcessingActions extends TestBase {

	static boolean status = false;

	public static boolean HolidayProcessingNavigation() throws Exception {

		WebDriverUtils.moveToElement(AdminMasterMenuNavigationPageObjects.SaleEventsHoverLink());
		WebDriverUtils.ClickAction(AdminMasterMenuNavigationPageObjects.SaleEvents_HolidayProcessingLink(), "HolidayProcessing");
		if (WebDriverUtils.TextChecker(MasterMenuNavigationVerificationPageObjects.SaleEvents_HolidayProcessingVerificationText())
				.contentEquals(Environment.ReadExcelData("SaleEvents_Validator", 2, 0))) {
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
