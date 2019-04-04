package com.PageObjects.Admin;

import org.openqa.selenium.WebElement;

import com.utilities.WebDriverUtils;

public class Inventory_ManageInventoryPageObjects {

	public static WebElement AdminStatusSelectorDropDown() throws Exception {
		return WebDriverUtils
				.FindElementByXpath("//select[@name='body:ManageInventorySearchFrm:j_id_jsp_2122481835_40pc6']");
	}

	public static WebElement SubStatusSelectorDropDown() throws Exception {
		return WebDriverUtils
				.FindElementByXpath("//select[@name='body:ManageInventorySearchFrm:j_id_jsp_2122481835_45pc6']");
	}

	public static WebElement SearchButtonManageInventory() throws Exception {
		return WebDriverUtils.FindElementByXpath("//input[@id='body:ManageInventorySearchFrm:search']");
	}

	public static WebElement OpenVehicleDetailsScreenLink() throws Exception {
		return WebDriverUtils.FindElementByXpath(
				"//a[@id='body:ManageInventorySearchFrm:searchResultPage:j_id_jsp_1794528343_7pc7:0:searchResults:0:j_id_jsp_1794528343_41pc7']");
	}

	public static WebElement VehicleDetailsScreenVerificationText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//span[contains(text(),'GROUNDING')]");
	}

	public static WebElement CloseVehicleDetailsScreen() throws Exception {
		return WebDriverUtils.FindElementByXpath("//a[contains(text(),'Close Window X')]");
	}

	public static WebElement VINOnManageInventory() throws Exception {
		return WebDriverUtils.FindElementByXpath(
				"//body[@onkeydown='javascript:handleEnterEvent(event);']/div[@class='wrapper']/form[@name='body:ManageInventorySearchFrm']/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/div/table[@class='tableA']/tbody/tr/td/table[@class='tableHeaderRedLink']/tr[@class='rowA']/td[1]/a");
	}

	public static WebElement VINFieldManageInventory() throws Exception {
		return WebDriverUtils.FindElementByXpath("input[@id='vintext']");
	}

	public static WebElement WrenchIcon() throws Exception {
		return WebDriverUtils.FindElementByXpath(
				"//*[@id='body:ManageInventorySearchFrm:searchResultPage:j_id_jsp_1794528343_7pc7:0:searchResults:tbody_element']/tr/td[7]/a[1]");
	}

	public static WebElement PriceEditTabVerificationText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//tr[1]/td[1]/span[contains(text(),'Market Price:')]");
	}

	public static WebElement VehicleHistoryTab() throws Exception {
		return WebDriverUtils.FindElementByXpath("//a[contains(text(),'Vehicle History')]");
	}

	public static WebElement VehicleHistoryTabVerificationText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//span[contains(text(),'Vehicle History')]");
	}

	public static WebElement AdminNotesTab() throws Exception {
		return WebDriverUtils.FindElementByXpath("//a[contains(text(),'ADMIN NOTES')]");
	}

	public static WebElement AdminNotesTabVerificationText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//span[contains(text(),'ADMIN NOTES')]");
	}

	public static WebElement LeaseInfoTab() throws Exception {
		return WebDriverUtils.FindElementByXpath("//a[contains(text(),'Lease Info')]");
	}

	public static WebElement LeaseInfoTabVerificationText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//th[contains(text(),'LEASE INFO')]");
	}

	public static WebElement ReGenTab() throws Exception {
		return WebDriverUtils.FindElementByXpath("//a[contains(text(),'RE-GEN')]");
	}

	public static WebElement ReGenTabVerificationText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//span[contains(text(),'Original Grounding Mileage:')]");
	}

	public static WebElement ReListTab() throws Exception {
		return WebDriverUtils.FindElementByXpath("//a[contains(text(),'Re-List')]");
	}

	public static WebElement ReListTabVerificationText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//span[contains(text(),'Order Inspection')]");
	}

	public static WebElement UnWindTab() throws Exception {
		return WebDriverUtils.FindElementByXpath("//a[contains(text(),'Un-Wind')]");
	}

	public static WebElement UnWindTabVerificationText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//span[contains(text(),'COMMENTS')]");
	}

	public static WebElement UnGroundTab() throws Exception {
		return WebDriverUtils.FindElementByXpath("//a[contains(text(),'Un-Ground')]");
	}

	public static WebElement UnGroundTabVerificationText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[contains(text(),'Ability to Re-Ground')]");
	}

	public static WebElement CancelInspectionTab() throws Exception {
		return WebDriverUtils.FindElementByXpath("//a[contains(text(),'Cancel Inspection')]");
	}

	public static WebElement CancelInspectionTabVerificationText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[contains(text(),'Reason for cancelling inspection?')]");
	}

}
