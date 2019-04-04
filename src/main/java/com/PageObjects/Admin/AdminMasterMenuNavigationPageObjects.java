package com.PageObjects.Admin;

import org.openqa.selenium.WebElement;

import com.utilities.WebDriverUtils;

public class AdminMasterMenuNavigationPageObjects {

	public static WebElement AccountToolsHoverLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//*[text()='Account Tools']");
	}

	public static WebElement AccountTools_DealershipMaintenanceLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//*[text()='Dealership Maintenance']");
	}

	public static WebElement AccountTools_ManageAMSLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//*[text()='Manage AMS']");
	}

	public static WebElement AccountTools_PaymentMaintenanceLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//*[text()='Payment Maintenance']");
	}

	public static WebElement BusinessHoverLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//a[text()='Businesses']");
	}

	public static WebElement Business_DealershipsLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//a[text()='Dealerships']");
	}

	public static WebElement Business_PhysicalAuctionLocationsLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//*[text()='Physical Auction Locations']");
	}

	public static WebElement ContentManagementLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//*[text()='Content Mgmt']");
	}

	public static WebElement FeesAndTaxesHoverLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//*[text()='Fees & Taxes']");
	}

	public static WebElement FeesAndTaxes_FeesLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//*[text()='Fees']");
	}

	public static WebElement InventoryHoverLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//*[text()='Inventory']");
	}

	public static WebElement Inventory_AutoIMSVINreUploadLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//*[text()='AutoIMS VIN Re-Upload']");
	}

	public static WebElement Inventory_BaloonfileUploadLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//*[text()='Balloon File Upload']");
	}

	public static WebElement Inventory_GuarenteedBuybackProgramsLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//*[text()='Guaranteed Buyback Program']");
	}

	public static WebElement Inventory_ManageArbitrationsLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//*[text()='Manage Arbitrations']");
	}

	public static WebElement Inventory_ManageInventoryLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//*[text()='Manage Inventory']");
	}

	public static WebElement Inventory_MarketingProgramsLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//*[text()='Marketing Programs']");
	}

	public static WebElement Inventory_MBPRequestsLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//*[text()='MBP Requests']");
	}

	public static WebElement Inventory_TitleSearchLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//*[text()='Title Search']");
	}

	public static WebElement Inventory_UploadRewardsGoalLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//*[text()='Upload Rewards Goals']");
	}

	public static WebElement NotificationsHoverLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//*[text()='Notifications']");
	}

	public static WebElement Notifications_DistributionListLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//*[text()='Distribution List']");
	}

	public static WebElement Notifications_EventNotificationsLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//*[text()='Event Notifications']");
	}

	public static WebElement ReportsHoverLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//*[text()='Reports']");
	}

	public static WebElement Reports_AdminReportsLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//*[text()='Admin Reports']");
	}

	public static WebElement SaleEventsHoverLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//*[text()='Sale Events']");
	}

	public static WebElement SaleEvents_EditPricingLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//*[text()='Edit Pricing']");
	}

	public static WebElement SaleEvents_HolidayProcessingLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//*[text()='Holiday Processing']");
	}

	public static WebElement SaleEvents_IfDealsLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//*[text()='If Deals']");
	}

	public static WebElement SaleEvents_ManageEventsLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//*[text()='Manage Events']");
	}

	public static WebElement UsersHoverLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//*[text()='Users']");
	}

	public static WebElement Users_AdminUsersLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//*[text()='Admin Users']");
	}

	public static WebElement YourPreferencesLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//a[text()='Your Preferences']");
	}

}
