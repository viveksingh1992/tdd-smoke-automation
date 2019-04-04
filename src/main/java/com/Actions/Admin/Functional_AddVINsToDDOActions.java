package com.Actions.Admin;

import com.PageObjects.Admin.Functional_DDOPageObjects;
import com.PageObjects.Admin.Inventory_ManageInventoryPageObjects;
import com.utilities.Environment;
import com.utilities.Log;
import com.utilities.TestBase;
import com.utilities.WebDriverUtils;

public class Functional_AddVINsToDDOActions extends TestBase {

	static boolean status = false;
	public static String home = System.getProperty("user.home");
	public static String filepath = home + "\\Downloads\\VINforDDO.xls";

	public static boolean createExeclFileToUpload() throws Exception {
		WebDriverUtils.delete_File("VINforDDO.xls");
		WebDriverUtils.selectOptionByValue(Inventory_ManageInventoryPageObjects.AdminStatusSelectorDropDown(), "27249");
		WebDriverUtils.selectOptionByValue(Inventory_ManageInventoryPageObjects.SubStatusSelectorDropDown(), "27250");
		WebDriverUtils.ClickAction(Inventory_ManageInventoryPageObjects.SearchButtonManageInventory(), "Search Button");
		Environment.WriteExcelData("//a[@target='_blank']");
		if (WebDriverUtils.verify_createdExcel_File("VINforDDO.xls")) {
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

	public static boolean uploadExcelFileForDDO() throws Exception {
		WebDriverUtils.ClickAction(Functional_DDOPageObjects.bulkRelistButton(), "Bulk Relist Button");
		WebDriverUtils.selectOptionByValue(Functional_DDOPageObjects.reListLocationOptionDropDown(), "Toyota Upstream");
		WebDriverUtils.InputValues(Functional_DDOPageObjects.uploadFileButton(), filepath, "Upload File");
		WebDriverUtils.ClickAction(Functional_DDOPageObjects.continueButton(), "Continue Button");
		WebDriverUtils.ClickAction(Functional_DDOPageObjects.reListButton(), "Re-List Button");
		if (WebDriverUtils.TextChecker(Functional_DDOPageObjects.relistVerification()).contentEquals("COMMENTS")) {
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
