package com.TestCases.Admin;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.utilities.TestBase;
import com.utilities.TestStatistics;
import com.utilities.WebDriverUtils;

public class Admin_ReportsTestCases extends TestBase {

	String TestCaseName = null;

	@BeforeTest
	public void init() throws Exception {
		TestCaseName = this.getClass().getSimpleName();
		initExtentReport(TestCaseName);
		test = report.startTest("All report selection Test");
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public void AllReportSelectionTestCase() throws Exception {

		LoginTestCase.LoginTest();
		Reports_NavigationTestCase.AdminReportsNavigationTest();
		Reports_AdminUsersTestCases.ACHPaymentReportTest();
		WebDriverUtils.checkPageIsReady();
		Reports_AdminUsersTestCases.ACHRejectReportTest();
		WebDriverUtils.checkPageIsReady();
		Reports_AdminUsersTestCases.AdminUserReportTest();
		WebDriverUtils.checkPageIsReady();
		Reports_AdminUsersTestCases.AuditReportInvisibleVisibleVehicleSaletoDealerReportTest();
		WebDriverUtils.checkPageIsReady();
		Reports_AdminUsersTestCases.AuditReportSalePriceBelowFloorPriceReportTest();
		WebDriverUtils.checkPageIsReady();
		Reports_AdminUsersTestCases.AuditReporttoMonitorVehiclePricingReportTest();
		WebDriverUtils.checkPageIsReady();
		Reports_AdminUsersTestCases.CreditReturnsReportTest();
		WebDriverUtils.checkPageIsReady();
		Reports_AdminUsersTestCases.DailyDetailGroundingReportArchiveReportTest();
		WebDriverUtils.checkPageIsReady();
		Reports_AdminUsersTestCases.DailyDetailGroundingReportTest();
		WebDriverUtils.checkPageIsReady();
		Reports_DownloadTestCase.Download_ReportDailyDetailGroundingTest();
		Reports_AdminUsersTestCases.DailyToyotaMotorSalesTMSAttemptedCompanyCarReturnsReportTest();
		WebDriverUtils.checkPageIsReady();
		Reports_AdminUsersTestCases.DealerActivityReportTest();
		WebDriverUtils.checkPageIsReady();
		Reports_AdminUsersTestCases.DealerDirectCSCManagedReportArchiveReportTest();
		WebDriverUtils.checkPageIsReady();
		Reports_AdminUsersTestCases.DealerDirectCSCManagedReportTest();
		WebDriverUtils.checkPageIsReady();
		Reports_DownloadTestCase.Download_ReportDealerDirectCSCManagedTest();
		Reports_AdminUsersTestCases.DealerDirectStatusReportTest();
		WebDriverUtils.checkPageIsReady();
		Reports_DownloadTestCase.Download_ReportDealerDirectStatusTest();
		Reports_AdminUsersTestCases.DealerDirectTransportReportArchiveReportTest();
		WebDriverUtils.checkPageIsReady();
		Reports_AdminUsersTestCases.DealerDirectTransportReportTest();
		WebDriverUtils.checkPageIsReady();
		Reports_DownloadTestCase.Download_ReportDealerDirectTransportTest();
		Reports_AdminUsersTestCases.DealerExclusivityReportTest();
		WebDriverUtils.checkPageIsReady();
		Reports_AdminUsersTestCases.DealerExclusivityUsageReportTest();
		WebDriverUtils.checkPageIsReady();
		Reports_AdminUsersTestCases.DealerRewardsProgramReportTest();
		WebDriverUtils.checkPageIsReady();
		Reports_AdminUsersTestCases.DealerStatusHistoricReportTest();
		WebDriverUtils.checkPageIsReady();
		Reports_AdminUsersTestCases.DetailedWearandTearbyInspectorReportTest();
		WebDriverUtils.checkPageIsReady();
		Reports_AdminUsersTestCases.FeeTransactionReportTest();
		WebDriverUtils.checkPageIsReady();
		Reports_AdminUsersTestCases.FinancialAdjustmentReportTest();
		WebDriverUtils.checkPageIsReady();
		Reports_AdminUsersTestCases.GroundingtoSaleandGroundingtoTransportReportTest();
		WebDriverUtils.checkPageIsReady();
		Reports_AdminUsersTestCases.InspectionCompletionReportTest();
		WebDriverUtils.checkPageIsReady();
		Reports_AdminUsersTestCases.InspectionReportForAdminReportTest();
		WebDriverUtils.checkPageIsReady();
		Reports_AdminUsersTestCases.InspectionReportTest();
		WebDriverUtils.checkPageIsReady();
		Reports_AdminUsersTestCases.PassedColumnPotentialIssuesReportTest();
		WebDriverUtils.checkPageIsReady();
		Reports_AdminUsersTestCases.PassReportTest();
		WebDriverUtils.checkPageIsReady();
		Reports_AdminUsersTestCases.PricingReportTest();
		WebDriverUtils.checkPageIsReady();
		Reports_AdminUsersTestCases.PurchaseReportArchiveReportTest();
		WebDriverUtils.checkPageIsReady();
		Reports_AdminUsersTestCases.PurchaseReportTest();
		WebDriverUtils.checkPageIsReady();
		Reports_DownloadTestCase.Download_ReportPurchaseTest();
		Reports_AdminUsersTestCases.ReListUnWindUnGroundReportTest();
		WebDriverUtils.checkPageIsReady();
		Reports_AdminUsersTestCases.ReviewAdminVehiclesNoteReportTest();
		WebDriverUtils.checkPageIsReady();
		Reports_AdminUsersTestCases.SalesConversionReportTest();
		WebDriverUtils.checkPageIsReady();
		Reports_DownloadTestCase.Download_ReportSalesConversionTest();
		Reports_AdminUsersTestCases.TitleFundsReportTest();
		WebDriverUtils.checkPageIsReady();
		Reports_AdminUsersTestCases.ToyotaLexusArbitrationHistoricReportTest();
		WebDriverUtils.checkPageIsReady();
		Reports_AdminUsersTestCases.ToyotaLexusArbitrationReportTest();
		WebDriverUtils.checkPageIsReady();
		Reports_AdminUsersTestCases.ToyotaLexusDailyReportTest();
		WebDriverUtils.checkPageIsReady();
		Reports_AdminUsersTestCases.ToyotaLexusPerformancebyRegionReportTest();
		WebDriverUtils.checkPageIsReady();
		Reports_AdminUsersTestCases.ToyotaLexusSalesPenetrationReportTest();
		WebDriverUtils.checkPageIsReady();
		Reports_AdminUsersTestCases.ToyotaLexusWearandTearReportTest();
		WebDriverUtils.checkPageIsReady();
		Reports_DownloadTestCase.Download_ReportToyotaLexusWearAndTearTest();
		Reports_AdminUsersTestCases.UpstreamBiddingReportTest();
		WebDriverUtils.checkPageIsReady();
		Reports_AdminUsersTestCases.UpstreamDetailedReportTest();
		WebDriverUtils.checkPageIsReady();
		Reports_AdminUsersTestCases.UpstreamMonthlySaleReportTest();
		WebDriverUtils.checkPageIsReady();
	}
}
