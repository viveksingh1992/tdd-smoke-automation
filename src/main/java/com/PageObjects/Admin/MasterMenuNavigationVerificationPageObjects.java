package com.PageObjects.Admin;

import org.openqa.selenium.WebElement;

import com.utilities.WebDriverUtils;

public class MasterMenuNavigationVerificationPageObjects {

	public static WebElement AccountTools_DealershipMaintenanceVerificationText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//span[contains(text(),'Dealership Maintenance')]");
	}

	public static WebElement AccountTools_ManageAMSVerificationText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//h1[contains(text(),'MANAGE AMS')]");
	}

	public static WebElement AccountTools_PaymentMaintenanceVerificationText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//div[contains(text(),'PAYMENT MAINTENANCE')]");
	}

	public static WebElement Business_DealershipsVerificationText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//label[contains(text(),'MANAGE DEALERS')]");
	}

	public static WebElement Business_PhysicalAuctionLocationsVerificationText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[contains(text(),'New Auction Code')]");
	}

	public static WebElement ContentManagementVerificationText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//div[@class='infoLeft']");
	}

	public static WebElement FeesAndTaxes_FeesVerificationText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//h1[contains(text(),'Manage Fees')]");
	}

	public static WebElement Inventory_AutoIMSVINreUploadVerificationText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//*[text()='RE-UPLOAD AUTOIMS VIN']");
	}

	public static WebElement Inventory_BaloonfileUploadVerificationText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//span[contains(text(),'Balloon File Upload')]");
	}

	public static WebElement Inventory_GuarenteedBuybackProgramsVerificationText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//*[text()='GUARANTEED BUYBACK PROGRAM']");
	}

	public static WebElement Inventory_ManageArbitrationsVerificationText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//*[text()='MANAGE ARBITRATIONS']");
	}

	public static WebElement Inventory_ManageInventoryVerificationText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//div[@class='topTitle']");
	}

	public static WebElement Inventory_MarketingProgramsVerificationText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//*[text()='Manage Marketing Program']");
	}

	public static WebElement Inventory_MBPRequestsVerificationText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//*[text()='AWAITING USER PRICING ']");
	}

	public static WebElement Inventory_TitleSearchVerificationText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//span[contains(text(),'Title Search')]");
	}

	public static WebElement Inventory_UploadRewardsGoalVerificationText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//span[contains(text(),'Upload Rewards Goals')]");
	}

	public static WebElement Notifications_DistributionListVerificationText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//h1[contains(text(),'Distribution Lists')]");
	}

	public static WebElement Notifications_EventNotificationsVerificationText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//div[@class='topTitle']");
	}

	public static WebElement Reports_AdminReportsVerificationText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//*[text()='VIEW REPORTS']");
	}

	public static WebElement SaleEvents_EditPricingVerificationText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//div[@class='topTitle']");
	}

	public static WebElement SaleEvents_HolidayProcessingVerificationText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//h1[@class='page_title']");
	}

	public static WebElement SaleEvents_IfDealsVerificationText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//h1[contains(text(),'Search If Deals')]");
	}

	public static WebElement SaleEvents_ManageEventsVerificationText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//h1[contains(text(),'Search Sale Event')]");
	}

	public static WebElement Users_AdminUsersVerificationText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//h1[contains(text(),'Manage Admin Users')]");
	}

	public static WebElement YourPreferencesVerificationText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[contains(text(),'My Preferences')]");
	}
}
