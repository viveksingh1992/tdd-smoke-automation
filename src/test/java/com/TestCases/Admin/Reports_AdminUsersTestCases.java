package com.TestCases.Admin;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Actions.Admin.Reports_AdminReportsActions;
import com.utilities.Environment;
import com.utilities.Log;
import com.utilities.TestBase;
import com.utilities.TestStatistics;
import com.utilities.WebDriverUtils;

@Listeners(com.utilities.TestStatistics.class)
public class Reports_AdminUsersTestCases extends TestBase {

	@Test(retryAnalyzer = TestStatistics.class)
	public static void ACHPaymentReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("ACH Payment Report test");
			tempTest = report.startTest("ACH Payment Report test");
			boolean status = Reports_AdminReportsActions.ACHPaymentReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("ACH Payment Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("ACH Payment Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void ACHRejectReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("ACH Reject Report test");
			tempTest = report.startTest("ACH Reject Report test");
			boolean status = Reports_AdminReportsActions.ACHRejectReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("ACH Reject Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("ACH Reject Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void AdminUserReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Admin User Report test");
			tempTest = report.startTest("Admin User Report test");
			boolean status = Reports_AdminReportsActions.AdminUserReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Admin User Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Admin User Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void AuditReportInvisibleVisibleVehicleSaletoDealerReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Audit Report Invisible Visible Vehicle Sale to Dealer Report test");
			tempTest = report.startTest("Audit Report Invisible Visible Vehicle Sale to Dealer Report test");
			boolean status = Reports_AdminReportsActions
					.AuditReportInvisibleVisibleVehicleSaletoDealerReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Audit Report Invisible Visible Vehicle Sale to Dealer Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Audit Report Invisible Visible Vehicle Sale to Dealer Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void AuditReportSalePriceBelowFloorPriceReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Audit Report Sale Price Below Floor Price Report test");
			tempTest = report.startTest("Audit Report Sale Price Below Floor Price Report test");
			boolean status = Reports_AdminReportsActions.AuditReportSalePriceBelowFloorPriceReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Audit Report Sale Price Below Floor Price Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Audit Report Sale Price Below Floor Price Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void AuditReporttoMonitorVehiclePricingReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Audit Report to Monitor Vehicle Pricing Report test");
			tempTest = report.startTest("Audit Report to Monitor Vehicle Pricing Report test");
			boolean status = Reports_AdminReportsActions.AuditReporttoMonitorVehiclePricingReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Audit Report to Monitor Vehicle Pricing Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Audit Report to Monitor Vehicle Pricing Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void CreditReturnsReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Credit Returns Report test");
			tempTest = report.startTest("Credit Returns Report test");
			boolean status = Reports_AdminReportsActions.CreditReturnsReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Credit Returns Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Credit ReturnsReport test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void DailyDetailGroundingReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Daily Detail Grounding Report test");
			tempTest = report.startTest("Daily Detail Grounding Report test");
			boolean status = Reports_AdminReportsActions.DailyDetailGroundingReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Daily Detail Grounding Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Daily Detail Grounding Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void DailyDetailGroundingReportArchiveReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Daily Detail Grounding Report Archive Report test");
			tempTest = report.startTest("Daily Detail Grounding Report Archive Report test");
			boolean status = Reports_AdminReportsActions.DailyDetailGroundingReportArchiveReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Daily Detail Grounding Report Archive Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Daily Detail Grounding Report Archive Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void DailyToyotaMotorSalesTMSAttemptedCompanyCarReturnsReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Daily Toyota Motor Sales TMS Attempted Company Car Returns Report test");
			tempTest = report.startTest("Daily Toyota Motor Sales TMS Attempted Company Car Returns Report test");
			boolean status = Reports_AdminReportsActions
					.DailyToyotaMotorSalesTMSAttemptedCompanyCarReturnsReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Daily Toyota Motor Sales TMS Attempted Company Car Returns Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Daily Toyota Motor Sales TMS Attempted Company Car Returns Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void DealerActivityReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Dealer Activity Report test");
			tempTest = report.startTest("Dealer Activity Report test");
			boolean status = Reports_AdminReportsActions.DealerActivityReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Dealer Activity Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Dealer Activity Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void DealerDirectCSCManagedReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Dealer Direct CSC Managed Report test");
			tempTest = report.startTest("Dealer Direct CSC Managed Report test");
			boolean status = Reports_AdminReportsActions.DealerDirectCSCManagedReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Dealer Direct CSC Managed Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Dealer Direct CSC Managed Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void DealerDirectCSCManagedReportArchiveReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Dealer Direct CSC Managed Report Archive Report test");
			tempTest = report.startTest("Dealer Direct CSC Managed Report Archive Report test");
			boolean status = Reports_AdminReportsActions.DealerDirectCSCManagedReportArchiveReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Dealer Direct CSC Managed Report Archive Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Dealer Direct CSC Managed Report Archive Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void DealerDirectStatusReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Dealer Direct Status Report test");
			tempTest = report.startTest("Dealer Direct Status Report test");
			boolean status = Reports_AdminReportsActions.DealerDirectStatusReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Dealer Direct Status Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Dealer Direct Status Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void DealerDirectTransportReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Dealer Direct Transport Report test");
			tempTest = report.startTest("Dealer Direct Transport Report test");
			boolean status = Reports_AdminReportsActions.DealerDirectTransportReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Dealer Direct Transport Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Dealer Direct Transport Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void DealerDirectTransportReportArchiveReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Dealer Direct Transport Report Archive Report test");
			tempTest = report.startTest("Dealer Direct Transport Report Archive Report test");
			boolean status = Reports_AdminReportsActions.DealerDirectTransportReportArchiveReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Dealer Direct Transport Report Archive Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Dealer Direct Transport Report Archive Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void DealerExclusivityReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Dealer Exclusivity Report test");
			tempTest = report.startTest("Dealer Exclusivity Report test");
			boolean status = Reports_AdminReportsActions.DealerExclusivityReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Dealer Exclusivity Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Dealer Exclusivity Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void DealerExclusivityUsageReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Dealer Exclusivity Usage Report test");
			tempTest = report.startTest("Dealer Exclusivity Usage Report test");
			boolean status = Reports_AdminReportsActions.DealerExclusivityUsageReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Dealer Exclusivity Usage Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Dealer Exclusivity Usage Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void DealerRewardsProgramReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Dealer Rewards Program Report test");
			tempTest = report.startTest("Dealer Rewards Program Report test");
			boolean status = Reports_AdminReportsActions.DealerRewardsProgramReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Dealer Rewards Program Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Dealer Rewards Program Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void DealerStatusHistoricReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Dealer Status Historic Report test");
			tempTest = report.startTest("Dealer Status Historic Report test");
			boolean status = Reports_AdminReportsActions.DealerStatusHistoricReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Dealer Status Historic Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Dealer Status Historic Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void DetailedWearandTearbyInspectorReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Detailed Wear and Tear by Inspector Report test");
			tempTest = report.startTest("Detailed Wear and Tear by Inspector Report test");
			boolean status = Reports_AdminReportsActions.DetailedWearandTearbyInspectorReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Detailed Wear and Tear by Inspector Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Detailed Wear and Tear by Inspector Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void FeeTransactionReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Fee Transaction Report test");
			tempTest = report.startTest("Fee Transaction Report test");
			boolean status = Reports_AdminReportsActions.FeeTransactionReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Fee Transaction Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Fee Transaction Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void FinancialAdjustmentReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Financial Adjustment Report test");
			tempTest = report.startTest("Financial Adjustment Report test");
			boolean status = Reports_AdminReportsActions.FinancialAdjustmentReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Financial Adjustment Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Financial Adjustment Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void GroundingtoSaleandGroundingtoTransportReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Grounding to Sale and Grounding to Transport Report test");
			tempTest = report.startTest("Grounding to Saleand Grounding to Transport Report test");
			boolean status = Reports_AdminReportsActions.GroundingtoSaleandGroundingtoTransportReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Grounding to Sale and Grounding to Transport Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Grounding to Sale and Grounding to Transport Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void InspectionCompletionReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Inspection Completion Report test");
			tempTest = report.startTest("Inspection Completion Report test");
			boolean status = Reports_AdminReportsActions.InspectionCompletionReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Inspection Completion Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Inspection Completion Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void InspectionReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Inspection Report Report test");
			tempTest = report.startTest("Inspection Report Report test");
			boolean status = Reports_AdminReportsActions.InspectionReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Inspection Report Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Inspection Report Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void InspectionReportForAdminReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Inspection Report For Admin Report test");
			tempTest = report.startTest("Inspection Report For Admin Report test");
			boolean status = Reports_AdminReportsActions.InspectionReportForAdminReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Inspection Report For Admin Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Inspection Report For Admin Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void PassReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Pass Report test");
			tempTest = report.startTest("Pass Report test");
			boolean status = Reports_AdminReportsActions.PassReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Pass Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Pass Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void PassedColumnPotentialIssuesReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Passed Column Potential Issues Report test");
			tempTest = report.startTest("Passed Column Potential Issues Report test");
			boolean status = Reports_AdminReportsActions.PassedColumnPotentialIssuesReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Passed Column Potential Issues Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Passed Column Potential Issues Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void PricingReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Pricing Report test");
			tempTest = report.startTest("Pricing Report test");
			boolean status = Reports_AdminReportsActions.PricingReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Pricing Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Pricing Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void PurchaseReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Purchase Report test");
			tempTest = report.startTest("Purchase Report test");
			boolean status = Reports_AdminReportsActions.PurchaseReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Purchase Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Purchase Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void PurchaseReportArchiveReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Purchase Report Archive Report test");
			tempTest = report.startTest("Purchase Report Archive Report test");
			boolean status = Reports_AdminReportsActions.PurchaseReportArchiveReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Purchase Report Archive Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Purchase Report Archive Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void ReListUnWindUnGroundReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("ReListUnWindUnGround Report test");
			tempTest = report.startTest("Re-List/Un-Wind/Un-Ground Report test");
			boolean status = Reports_AdminReportsActions.ReListUnWindUnGroundReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Re-List/Un-Wind/Un-Ground Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Re-List/Un-Wind/Un-Ground Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void ReviewAdminVehiclesNoteReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Review Admin Vehicles Note Report test");
			tempTest = report.startTest("Review Admin Vehicles Note Report test");
			boolean status = Reports_AdminReportsActions.ReviewAdminVehiclesNoteReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Review Admin Vehicles Note Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Review Admin Vehicles Note Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void SalesConversionReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Sales Conversion Report test");
			tempTest = report.startTest("Sales Conversion Report test");
			boolean status = Reports_AdminReportsActions.SalesConversionReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Sales Conversion Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Sales Conversion Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void TitleFundsReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Title Funds Report test");
			tempTest = report.startTest("Title Funds Report test");
			boolean status = Reports_AdminReportsActions.TitleFundsReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Title Funds Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Title Funds Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void ToyotaLexusArbitrationReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Toyota Lexus Arbitration Report test");
			tempTest = report.startTest("Toyota Lexus Arbitration Report test");
			boolean status = Reports_AdminReportsActions.ToyotaLexusArbitrationReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Toyota Lexus Arbitration Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Toyota Lexus Arbitration Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void ToyotaLexusArbitrationHistoricReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Toyota Lexus Arbitration Historic Report test");
			tempTest = report.startTest("Toyota Lexus Arbitration Historic Report test");
			boolean status = Reports_AdminReportsActions.ToyotaLexusArbitrationHistoricReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Toyota Lexus Arbitration Historic Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Toyota Lexus Arbitration Historic Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void ToyotaLexusDailyReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Toyota Lexus Daily Report test");
			tempTest = report.startTest("Toyota Lexus Daily Report test");
			boolean status = Reports_AdminReportsActions.ToyotaLexusDailyReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Toyota Lexus Daily Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Toyota Lexus Daily Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void ToyotaLexusPerformancebyRegionReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Toyota Lexus Performance by Region Report test");
			tempTest = report.startTest("Toyota Lexus Performance by Region Report test");
			boolean status = Reports_AdminReportsActions.ToyotaLexusPerformancebyRegionReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Toyota Lexus Performance by Region Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Toyota Lexus Performance by Region Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void ToyotaLexusSalesPenetrationReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Toyota Lexus Sales Penetration Report test");
			tempTest = report.startTest("Toyota Lexus Sales Penetration Report test");
			boolean status = Reports_AdminReportsActions.ToyotaLexusSalesPenetrationReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Toyota Lexus Sales Penetration Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Toyota Lexus Sales Penetration Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void ToyotaLexusWearandTearReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Toyota Lexus Wear and Tear Report test");
			tempTest = report.startTest("Toyota Lexus Wear and Tear Report test");
			boolean status = Reports_AdminReportsActions.ToyotaLexusWearandTearReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Toyota Lexus Wear and Tear Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Toyota Lexus Wear and Tear Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void TransportVarianceReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Transport Variance Report test");
			tempTest = report.startTest("Transport Variance Report test");
			boolean status = Reports_AdminReportsActions.TransportVarianceReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Transport Variance Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Transport Variance Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void TransportationAuditReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Transportation Audit Report test");
			tempTest = report.startTest("Transportation Audit Report test");
			boolean status = Reports_AdminReportsActions.TransportationAuditReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Transportation Audit Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Transportation Audit Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void TransportationStatusReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Transportation Status Report test");
			tempTest = report.startTest("Transportation Status Report test");
			boolean status = Reports_AdminReportsActions.TransportationStatusReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Transportation Status Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Transportation Status Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void UpstreamBiddingReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Upstream Bidding Report test");
			tempTest = report.startTest("Upstream Bidding Report test");
			boolean status = Reports_AdminReportsActions.UpstreamBiddingReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Upstream Bidding Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Upstream Bidding Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void UpstreamDetailedReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Upstream Detailed Report test");
			tempTest = report.startTest("Upstream Detailed Report test");
			boolean status = Reports_AdminReportsActions.UpstreamDetailedReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Upstream Detailed Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Upstream Detailed Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void UpstreamMonthlySaleReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Upstream Monthly Sale Report test");
			tempTest = report.startTest("Upstream Monthly Sale Report test");
			boolean status = Reports_AdminReportsActions.UpstreamMonthlySaleReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Upstream Monthly Sale Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Upstream Monthly Sale Report test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void UpstreamSummaryReportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Upstream Summary Report test");
			tempTest = report.startTest("Upstream Summary Report test");
			boolean status = Reports_AdminReportsActions.UpstreamSummaryReportSelection();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Upstream Summary Report test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Upstream Summary Report test");
			Assert.fail(e.getMessage());
		}
	}
}
