package com.Actions.Admin;

import com.PageObjects.Admin.AdminMasterMenuNavigationPageObjects;
import com.PageObjects.Admin.MasterMenuNavigationVerificationPageObjects;
import com.PageObjects.Admin.Reports_AdminUsersPageObjects;
import com.PageObjects.Admin.Reports_AdminUsersVerificationPageObjects;
import com.utilities.Environment;
import com.utilities.Log;
import com.utilities.TestBase;
import com.utilities.WebDriverUtils;

public class Reports_AdminReportsActions extends TestBase {

	static boolean status = false;

	public static boolean AdminUsersReportNavigation() throws Exception {

		WebDriverUtils.moveToElement(AdminMasterMenuNavigationPageObjects.ReportsHoverLink());
		WebDriverUtils.ClickAction(AdminMasterMenuNavigationPageObjects.Reports_AdminReportsLink(), "AdminReports");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils
				.TextChecker(MasterMenuNavigationVerificationPageObjects.Reports_AdminReportsVerificationText())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 0, 0))) {
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

	public static boolean UpstreamSummaryReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(),
				"Upstream Summary Report");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils.TextChecker(Reports_AdminUsersVerificationPageObjects.UpstreamSummaryReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 1, 1))) {
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

	public static boolean UpstreamMonthlySaleReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(),
				"Upstream Monthly Sale Report");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils.TextChecker(Reports_AdminUsersVerificationPageObjects.UpstreamMonthlySaleReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 2, 1))) {
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

	public static boolean UpstreamDetailedReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(),
				"Upstream Detailed Report");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils.TextChecker(Reports_AdminUsersVerificationPageObjects.UpstreamDetailedReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 3, 1))) {
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

	public static boolean UpstreamBiddingReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(),
				"Upstream Bidding Report");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils.TextChecker(Reports_AdminUsersVerificationPageObjects.UpstreamBiddingReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 4, 1))) {
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

	public static boolean TransportationStatusReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(),
				"Transportation Status Report");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils.TextChecker(Reports_AdminUsersVerificationPageObjects.TransportationStatusReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 5, 1))) {
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

	public static boolean TransportationAuditReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(),
				"Transportation Audit Report");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils.TextChecker(Reports_AdminUsersVerificationPageObjects.TransportationAuditReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 6, 1))) {
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

	public static boolean TransportVarianceReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(),
				"Transport Variance Report");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils.TextChecker(Reports_AdminUsersVerificationPageObjects.TransportVarianceReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 7, 1))) {
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

	public static boolean ToyotaLexusWearandTearReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(),
				"Toyota/Lexus Wear and Tear Report");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils.TextChecker(Reports_AdminUsersVerificationPageObjects.ToyotaLexusWearandTearReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 8, 1))) {
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

	public static boolean ToyotaLexusSalesPenetrationReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(),
				"Toyota/Lexus Sales Penetration");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils.TextChecker(Reports_AdminUsersVerificationPageObjects.ToyotaLexusSalesPenetrationReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 9, 1))) {
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

	public static boolean ToyotaLexusPerformancebyRegionReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(),
				"Toyota/Lexus Performance by Region");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils.TextChecker(Reports_AdminUsersVerificationPageObjects.ToyotaLexusPerformancebyRegionReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 10, 1))) {
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

	public static boolean ToyotaLexusDailyReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(),
				"Toyota/Lexus Daily Report");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils.TextChecker(Reports_AdminUsersVerificationPageObjects.ToyotaLexusDailyReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 11, 1))) {
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

	public static boolean ToyotaLexusArbitrationHistoricReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(),
				"Toyota/Lexus Arbitration Historic Report");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils.TextChecker(Reports_AdminUsersVerificationPageObjects.ToyotaLexusArbitrationHistoricReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 12, 1))) {
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

	public static boolean ToyotaLexusArbitrationReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(),
				"Toyota/Lexus Arbitration Report");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils.TextChecker(Reports_AdminUsersVerificationPageObjects.ToyotaLexusArbitrationReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 13, 1))) {
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

	public static boolean TitleFundsReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(),
				"Title Funds Report");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils.TextChecker(Reports_AdminUsersVerificationPageObjects.TitleFundsReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 14, 1))) {
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

	public static boolean SalesConversionReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(),
				"Sales Conversion Report");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils.TextChecker(Reports_AdminUsersVerificationPageObjects.SalesConversionReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 15, 1))) {
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

	public static boolean ReviewAdminVehiclesNoteReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(),
				"Review Admin Vehicles Note");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils.TextChecker(Reports_AdminUsersVerificationPageObjects.ReviewAdminVehiclesNoteReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 16, 1))) {
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

	public static boolean ReListUnWindUnGroundReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(),
				"Re-List/Un-Wind/Un-Ground Report");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils.TextChecker(Reports_AdminUsersVerificationPageObjects.ReListUnWindUnGroundReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 17, 1))) {
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

	public static boolean PurchaseReportArchiveReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(),
				"Purchase Report (Archive)");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils.TextChecker(Reports_AdminUsersVerificationPageObjects.PurchaseReportArchiveReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 18, 1))) {
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

	public static boolean PurchaseReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(), "Purchase Report");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils.TextChecker(Reports_AdminUsersVerificationPageObjects.PurchaseReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 19, 1))) {
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

	public static boolean PricingReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(), "Pricing Report");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils.TextChecker(Reports_AdminUsersVerificationPageObjects.PricingReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 20, 1))) {
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

	public static boolean PassedColumnPotentialIssuesReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(),
				"Passed Column Potential Issues Report");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils.TextChecker(Reports_AdminUsersVerificationPageObjects.PassedColumnPotentialIssuesReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 21, 1))) {
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

	public static boolean PassReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(), "Pass Report");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils.TextChecker(Reports_AdminUsersVerificationPageObjects.PassReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 22, 1))) {
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

	public static boolean InspectionReportForAdminReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(),
				"Inspection Report For Admin");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils.TextChecker(Reports_AdminUsersVerificationPageObjects.InspectionReportForAdminReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 23, 1))) {
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

	public static boolean InspectionReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(), "Inspection Report");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils.TextChecker(Reports_AdminUsersVerificationPageObjects.InspectionReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 24, 1))) {
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

	public static boolean InspectionCompletionReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(),
				"Inspection Completion Report");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils.TextChecker(Reports_AdminUsersVerificationPageObjects.InspectionCompletionReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 25, 1))) {
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

	public static boolean GroundingtoSaleandGroundingtoTransportReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(),
				"Grounding to Sale and Grounding to Transport Report");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils
				.TextChecker(Reports_AdminUsersVerificationPageObjects.GroundingtoSaleandGroundingtoTransportReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 26, 1))) {
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

	public static boolean FinancialAdjustmentReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(),
				"Financial Adjustment Report");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils.TextChecker(Reports_AdminUsersVerificationPageObjects.FinancialAdjustmentReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 27, 1))) {
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

	public static boolean FeeTransactionReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(),
				"Fee Transaction Report");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils.TextChecker(Reports_AdminUsersVerificationPageObjects.FeeTransactionReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 28, 1))) {
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

	public static boolean DetailedWearandTearbyInspectorReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(),
				"Detailed Wear and Tear by Inspector");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils.TextChecker(Reports_AdminUsersVerificationPageObjects.DetailedWearandTearbyInspectorReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 29, 1))) {
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

	public static boolean DealerStatusHistoricReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(),
				"Dealer Status Historic Report");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils.TextChecker(Reports_AdminUsersVerificationPageObjects.DealerStatusHistoricReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 30, 1))) {
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

	public static boolean DealerRewardsProgramReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(),
				"Dealer Rewards Program Report");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils.TextChecker(Reports_AdminUsersVerificationPageObjects.DealerRewardsProgramReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 31, 1))) {
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

	public static boolean DealerExclusivityUsageReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(),
				"Dealer Exclusivity Usage Report");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils.TextChecker(Reports_AdminUsersVerificationPageObjects.DealerExclusivityUsageReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 32, 1))) {
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

	public static boolean DealerExclusivityReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(),
				"Dealer Exclusivity Report");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils.TextChecker(Reports_AdminUsersVerificationPageObjects.DealerExclusivityReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 33, 1))) {
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

	public static boolean DealerDirectTransportReportArchiveReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(),
				"Dealer Direct Transport Report (Archive)");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils
				.TextChecker(Reports_AdminUsersVerificationPageObjects.DealerDirectTransportReportArchiveReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 34, 1))) {
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

	public static boolean DealerDirectTransportReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(),
				"Dealer Direct Transport Report");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils.TextChecker(Reports_AdminUsersVerificationPageObjects.DealerDirectTransportReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 35, 1))) {
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

	public static boolean DealerDirectStatusReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(),
				"Dealer Direct Status Report");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils.TextChecker(Reports_AdminUsersVerificationPageObjects.DealerDirectStatusReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 36, 1))) {
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

	public static boolean DealerDirectCSCManagedReportArchiveReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(),
				"Dealer Direct CSC Managed Report (Archive)");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils
				.TextChecker(Reports_AdminUsersVerificationPageObjects.DealerDirectCSCManagedReportArchiveReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 37, 1))) {
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

	public static boolean DealerDirectCSCManagedReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(),
				"Dealer Direct CSC Managed Report");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils.TextChecker(Reports_AdminUsersVerificationPageObjects.DealerDirectCSCManagedReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 38, 1))) {
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

	public static boolean DealerActivityReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(),
				"Dealer Activity Report");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils.TextChecker(Reports_AdminUsersVerificationPageObjects.DealerActivityReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 39, 1))) {
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

	public static boolean DailyToyotaMotorSalesTMSAttemptedCompanyCarReturnsReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(),
				"Daily Toyota Motor Sales (TMS) Attempted Company Car Returns");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils
				.TextChecker(Reports_AdminUsersVerificationPageObjects
						.DailyToyotaMotorSalesTMSAttemptedCompanyCarReturnsReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 40, 1))) {
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

	public static boolean DailyDetailGroundingReportArchiveReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(),
				"Daily Detail Grounding Report (Archive)");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils
				.TextChecker(Reports_AdminUsersVerificationPageObjects.DailyDetailGroundingReportArchiveReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 41, 1))) {
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

	public static boolean DailyDetailGroundingReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(),
				"Daily Detail Grounding Report");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils.TextChecker(Reports_AdminUsersVerificationPageObjects.DailyDetailGroundingReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 42, 1))) {
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

	public static boolean CreditReturnsReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(),
				"Credit Returns Report");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils.TextChecker(Reports_AdminUsersVerificationPageObjects.CreditReturnsReportSelection())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 43, 1))) {
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

	public static boolean AuditReporttoMonitorVehiclePricingReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(),
				"Audit Report to Monitor Vehicle Pricing");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils
				.TextChecker(Reports_AdminUsersVerificationPageObjects.AuditReporttoMonitorVehiclePricingReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 44, 1))) {
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

	public static boolean AuditReportSalePriceBelowFloorPriceReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(),
				"Audit Report Sale Price Below Floor Price");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils
				.TextChecker(Reports_AdminUsersVerificationPageObjects.AuditReportSalePriceBelowFloorPriceReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 45, 1))) {
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

	public static boolean AuditReportInvisibleVisibleVehicleSaletoDealerReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(),
				"Audit Report Invisible/Visible Vehicle Sale to Dealer Report");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils
				.TextChecker(Reports_AdminUsersVerificationPageObjects
						.AuditReportInvisibleVisibleVehicleSaletoDealerReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 46, 1))) {
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

	public static boolean AdminUserReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(), "Admin User Report");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils.TextChecker(Reports_AdminUsersVerificationPageObjects.AdminUserReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 47, 1))) {
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

	public static boolean ACHRejectReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(), "ACH Reject Report");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils.TextChecker(Reports_AdminUsersVerificationPageObjects.ACHRejectReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 48, 1))) {
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

	public static boolean ACHPaymentReportSelection() throws Exception {

		WebDriverUtils.selectOptionByValue(Reports_AdminUsersPageObjects.ReportSelectorDropDown(),
				"ACH Payment Report");
		WebDriverUtils.checkPageIsReady();
		if (WebDriverUtils.TextChecker(Reports_AdminUsersVerificationPageObjects.ACHPaymentReport())
				.contentEquals(Environment.ReadExcelData("Reports_Validation", 49, 1))) {
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
