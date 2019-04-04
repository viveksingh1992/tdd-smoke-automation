package com.Actions.Admin;

import com.PageObjects.Admin.AdminMasterMenuNavigationPageObjects;
import com.PageObjects.Admin.MasterMenuNavigationVerificationPageObjects;
import com.utilities.Environment;
import com.utilities.Log;
import com.utilities.TestBase;
import com.utilities.WebDriverUtils;

public class Business_PhysicalAuctionLocationsActions extends TestBase{

	static boolean status = false;

	public static boolean PhysicalAuctionLocationsNavigation() throws Exception {
		WebDriverUtils.moveToElement(AdminMasterMenuNavigationPageObjects.BusinessHoverLink());
		WebDriverUtils.ClickAction(AdminMasterMenuNavigationPageObjects.Business_PhysicalAuctionLocationsLink(), "PhysicalAuctionLocationsLink");
		if (WebDriverUtils
				.TextChecker(MasterMenuNavigationVerificationPageObjects.Business_PhysicalAuctionLocationsVerificationText())
				.contentEquals(Environment.ReadExcelData("Business_Validator", 1, 1))) {
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
