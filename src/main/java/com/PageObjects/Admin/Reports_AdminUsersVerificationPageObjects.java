package com.PageObjects.Admin;

import org.openqa.selenium.WebElement;

import com.utilities.WebDriverUtils;

public class Reports_AdminUsersVerificationPageObjects {

	public static WebElement UpstreamSummaryReport() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[contains(text(),'Account Type:')]");
	}

	public static WebElement UpstreamMonthlySaleReport() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[contains(text(),'Dealer #:')]");
	}

	public static WebElement UpstreamDetailedReport() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[contains(text(),'Sale Event:')]");
	}

	public static WebElement UpstreamBiddingReport() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[contains(text(),'Model #')]");
	}

	public static WebElement TransportationStatusReport() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[contains(text(),'Transportation Ordered Date')]");
	}

	public static WebElement TransportationAuditReport() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[contains(text(),'Cars Arrive Delivery Date')]");
	}

	public static WebElement TransportVarianceReport() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[contains(text(),'Grounding Date Range:')]");
	}

	public static WebElement ToyotaLexusWearandTearReport() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[contains(text(),'Inspection Type')]");
	}

	public static WebElement ToyotaLexusSalesPenetrationReport() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[contains(text(),'DSSO')]");
	}

	public static WebElement ToyotaLexusPerformancebyRegionReport() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[contains(text(),'(Month To Date) and CYTD')]");
	}

	public static WebElement ToyotaLexusDailyReport() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[contains(text(),'Account Type:')]");
	}

	public static WebElement ToyotaLexusArbitrationHistoricReport() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[contains(text(),'Report Type')]");
	}

	public static WebElement ToyotaLexusArbitrationReport() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[contains(text(),'Date Selection')]");
	}

	public static WebElement TitleFundsReport() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[contains(text(),'Open')]");
	}

	public static WebElement SalesConversionReport() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[contains(text(),'DSSO')]");
	}

	public static WebElement ReviewAdminVehiclesNoteReport() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[contains(text(),'VIN:')]");
	}

	public static WebElement ReListUnWindUnGroundReport() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[contains(text(),'To:')]");
	}

	public static WebElement PurchaseReportArchiveReport() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[contains(text(),'Report Run Date:')]");
	}

	public static WebElement PurchaseReport() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[contains(text(),'Purchase Date')]");
	}

	public static WebElement PricingReport() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[contains(text(),'Priced Date')]");
	}

	public static WebElement PassedColumnPotentialIssuesReport() throws Exception {
		return WebDriverUtils
				.FindElementByXpath("//label[contains(text(),'Print All Vehicles having Potential Issues:')]");
	}

	public static WebElement PassReport() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[contains(text(),'DSSO')]");
	}

	public static WebElement InspectionReportForAdminReport() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[contains(text(),'Inspection Provider:')]");
	}

	public static WebElement InspectionReport() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[contains(text(),'Region:')]");
	}

	public static WebElement InspectionCompletionReport() throws Exception {
		return WebDriverUtils
				.FindElementByXpath("//span[contains(text(),'Show Vehicle Inspections Open Greater Than Busines')]");
	}

	public static WebElement GroundingtoSaleandGroundingtoTransportReport() throws Exception {
		return WebDriverUtils
				.FindElementByXpath("//span[contains(text(),'List Vehicles Grounded to Not Sold/Not Transported')]");
	}

	public static WebElement FinancialAdjustmentReport() throws Exception {
		return WebDriverUtils.FindElementByXpath("//span[contains(text(),'Date')]");
	}

	public static WebElement FeeTransactionReport() throws Exception {
		return WebDriverUtils.FindElementByXpath("//label[contains(text(),'Transaction Date')]");
	}

	public static WebElement DetailedWearandTearbyInspectorReport() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[contains(text(),'Inspection Company:')]");
	}

	public static WebElement DealerStatusHistoricReport() throws Exception {
		return WebDriverUtils.FindElementByXpath("//label[contains(text(),'Date Range')]");
	}

	public static WebElement DealerRewardsProgramReport() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[contains(text(),'Dealer Number')]");
	}

	public static WebElement DealerExclusivityUsageReport() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[contains(text(),'From')]");
	}

	public static WebElement DealerExclusivityReport() throws Exception {
		return WebDriverUtils
				.FindElementByXpath("//span[contains(text(),'Show Vehicles In Exclusivity Greater Than Business')]");
	}

	public static WebElement DealerDirectTransportReportArchiveReport() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[contains(text(),'Report Run Date:')]");
	}

	public static WebElement DealerDirectTransportReport() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[contains(text(),'Transportation Ordered Date')]");
	}

	public static WebElement DealerDirectStatusReport() throws Exception {
		return WebDriverUtils.FindElementByXpath("//label[contains(text(),'Date Range')]");
	}

	public static WebElement DealerDirectCSCManagedReportArchiveReport() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[contains(text(),'Report Run Date:')]");
	}

	public static WebElement DealerDirectCSCManagedReport() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[contains(text(),'CSC Managed Date')]");
	}

	public static WebElement DealerActivityReport() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[contains(text(),'Dealer #')]");
	}

	public static WebElement DailyToyotaMotorSalesTMSAttemptedCompanyCarReturnsReport() throws Exception {
		return WebDriverUtils.FindElementByXpath("//span[contains(text(),'Attempted Grounding Date:')]");
	}

	public static WebElement DailyDetailGroundingReportArchiveReport() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[contains(text(),'Report Run Date:')]");
	}

	public static WebElement DailyDetailGroundingReport() throws Exception {
		return WebDriverUtils.FindElementByXpath("//span[contains(text(),'Date')]");
	}

	public static WebElement CreditReturnsReportSelection() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[contains(text(),'From:')]");
	}

	public static WebElement AuditReporttoMonitorVehiclePricingReport() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[contains(text(),'Date')]");
	}

	public static WebElement AuditReportSalePriceBelowFloorPriceReport() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[contains(text(),'To:')]");
	}

	public static WebElement AuditReportInvisibleVisibleVehicleSaletoDealerReport() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[contains(text(),'Sale Date Range')]");
	}

	public static WebElement AdminUserReport() throws Exception {
		return WebDriverUtils.FindElementByXpath("//label[contains(text(),'One User')]");
	}

	public static WebElement ACHRejectReport() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[contains(text(),'From:')]");
	}

	public static WebElement ACHPaymentReport() throws Exception {
		return WebDriverUtils.FindElementByXpath("//span[contains(text(),'Date')]");
	}
}
