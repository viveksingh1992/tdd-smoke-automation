package com.PageObjects.Admin;

import org.openqa.selenium.WebElement;

import com.utilities.WebDriverUtils;

public class Businesses_DealershipPageObjects {

	public static WebElement DealerNumberField() throws Exception {
		return WebDriverUtils.FindElementByXpath("//input[@id='body:manageDealershipForm:searchDealerNumber']");
	}

	public static WebElement SearchDealerButton() throws Exception {
		return WebDriverUtils.FindElementByXpath("//input[@value='Search']");
	}

	public static WebElement DealerNumberLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[3]/div[1]/a[1]");
	}

	public static WebElement DealerNavigationVerificationText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[@class='btLeft']");
	}

	public static WebElement ViewDealerUserLink() throws Exception {
		return WebDriverUtils.FindElementByXpath(WebDriverUtils
				.findElementLocator("//*[@id='body:dealerUserSrhForm:userSearchResults:tbody_element']", "Jim"));
	}

	public static WebElement ViewDealerUserVerificationText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//label[contains(text(),'My Purchase %')]");
	}

	public static WebElement GroundedAtMyDealershipLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//img[@class='btn-gamd']");
	}

	public static WebElement GroundedAtMyDealershipLinkVerificationText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[contains(text(),'Awaiting Pricing / Not Priced')]");
	}

	public static WebElement VINLinkPassed() throws Exception {
		return WebDriverUtils.FindElementByXpath(
				"//*[@id='view1passed:0:passedVehicleDetails:j_id_jsp_1918952618_87pc14']/table/tbody/tr[3]/td/table/tbody/tr/td[2]/a");
	}

	public static WebElement VINLinkPriced() throws Exception {
		return WebDriverUtils.FindElementByXpath(
				"//*[@id='view1inspected:0:inspectedVehicleDetails:j_id_jsp_1918952618_87pc13']/table/tbody/tr[3]/td/table/tbody/tr/td[2]/a");
	}

	public static WebElement ConditionReport_DealerViewText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//h1[contains(text(),'CONDITION REPORT (DEALER VIEW)')]");
	}

	public static WebElement ConditionReport_RetailViewLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//img[@title='Retail View']");
	}

	public static WebElement ConditionReport_CustomerViewLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//img[@title='customer View']");
	}

	public static WebElement ConditionReport_RetailViewText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//h1[contains(text(),'CONDITION REPORT (RETAIL VIEW)')]");
	}

	public static WebElement ConditionReport_CustomerViewText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//h1[contains(text(),'CONDITION REPORT (CUSTOMER VIEW)')]");
	}

	public static WebElement ConditionReport_VehicleInformationText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//th[contains(text(),'Vehicle Information')]");
	}

	public static WebElement ConditionReport_AccessoriesText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//th[contains(text(),'Accessories')]");
	}

	public static WebElement ConditionReport_WheelsandTiresText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//th[contains(text(),'Wheels and Tires')]");
	}

	public static WebElement ConditionReport_VehicleConditionText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//th[contains(text(),'Vehicle Condition')]");
	}

	public static WebElement ConditionReport_BuildDataText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//th[contains(text(),'Build Data')]");
	}

	public static WebElement DealerDirectOnlineLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//img[@id='ddonline2']");
	}

	public static WebElement DDOVINLink() throws Exception {
		return WebDriverUtils.FindElementByXpath(
				"//*[@id=\"bodyView:searchResultsTable:searchResultsDataTableForm:searchResults:0:j_id_jsp_1409510236_252pc12\"]/a");
	}

	public static WebElement DDOVerificationText() throws Exception {
		return WebDriverUtils.FindElementByXpath(
				"//td[@colspan='3']//div[@class='tinyText']//span[@class='hiddendiv']//span//span[@class='tinyText'][contains(text(),'Results Per Page')]");
	}

	public static WebElement DDOVINBuyNowButton() throws Exception {
		return WebDriverUtils.FindElementByXpath("//a[@class='btn_buyNow inactive']");
	}

	public static WebElement DDOVINBidButton() throws Exception {
		return WebDriverUtils.FindElementByXpath("//a[@class='btn_bid inactive']");
	}

	public static WebElement AccountSettingsLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//a[contains(text(),'Account Settings')]");
	}

	public static WebElement AccountSettingsVerificationText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//div[contains(text(),'My Preferences')]");
	}

	public static WebElement AccountSettingsClosePopUpLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//form/div/a[@class='cboxCloseEx']");
	}

	public static WebElement AccountSettingsLogoutLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//a[contains(text(),'Log Out')]");
	}

	public static WebElement UsernameField() throws Exception {
		return WebDriverUtils.FindElementByXpath("//input[@name='Username']");
	}
}
