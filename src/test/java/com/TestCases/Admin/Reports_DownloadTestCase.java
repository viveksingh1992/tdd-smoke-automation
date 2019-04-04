package com.TestCases.Admin;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.Actions.Admin.Reports_DownloadActions;
import com.utilities.Environment;
import com.utilities.Log;
import com.utilities.TestBase;
import com.utilities.TestStatistics;
import com.utilities.WebDriverUtils;

public class Reports_DownloadTestCase extends TestBase {

	@Test(retryAnalyzer = TestStatistics.class)
	public static void Download_ReportDailyDetailGroundingTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Download_ReportDailyDetailGrounding Test");
			tempTest = report.startTest("Download_ReportDailyDetailGrounding Test");
			boolean status = Reports_DownloadActions.Download_ReportDailyDetailGrounding();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Download_ReportDailyDetailGrounding Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Download_ReportDailyDetailGrounding Test");
			Assert.fail(e.getMessage());
		}
	}
	
	@Test(retryAnalyzer = TestStatistics.class)
	public static void Download_ReportToyotaLexusWearAndTearTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Download_ReportToyotaLexusWearAndTear Test");
			tempTest = report.startTest("Download_ReportToyotaLexusWearAndTear Test");
			boolean status = Reports_DownloadActions.Download_ReportToyotaLexusWearAndTear();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Download_ReportToyotaLexusWearAndTear Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Download_ReportToyotaLexusWearAndTear Test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void Download_ReportDealerDirectCSCManagedTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Download_ReportDealerDirectCSCManaged Test");
			tempTest = report.startTest("Download_ReportDealerDirectCSCManaged Test");
			boolean status = Reports_DownloadActions.Download_ReportDealerDirectCSCManaged();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Download_ReportDealerDirectCSCManaged Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Download_ReportDealerDirectCSCManaged Test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void Download_ReportDealerDirectStatusTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Download_ReportDealerDirectStatus Test");
			tempTest = report.startTest("Download_ReportDealerDirectStatus Test");
			boolean status = Reports_DownloadActions.Download_ReportDealerDirectStatus();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Download_ReportDealerDirectStatus Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Download_ReportDealerDirectStatus Test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void Download_ReportDealerDirectTransportTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Download_ReportDealerDirectTransport Test");
			tempTest = report.startTest("Download_ReportDealerDirectTransport Test");
			boolean status = Reports_DownloadActions.Download_ReportDealerDirectTransport();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Download_ReportDealerDirectTransport Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Download_ReportDealerDirectTransport Test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void Download_ReportDetailedWearAndTearTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Download_ReportDetailedWearAndTear Test");
			tempTest = report.startTest("Download_ReportDetailedWearAndTear Test");
			boolean status = Reports_DownloadActions.Download_ReportToyotaLexusWearAndTear();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Download_ReportDetailedWearAndTear Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Download_ReportDetailedWearAndTear Test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void Download_ReportPurchaseTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Download_ReportPurchase Test");
			tempTest = report.startTest("Download_ReportPurchase Test");
			boolean status = Reports_DownloadActions.Download_ReportPurchase();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Download_ReportPurchase Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Download_ReportPurchase Test");
			Assert.fail(e.getMessage());
		}
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public static void Download_ReportSalesConversionTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Download_ReportSalesConversion Test");
			tempTest = report.startTest("Download_ReportSalesConversion Test");
			boolean status = Reports_DownloadActions.Download_ReportSalesConversion();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Download_ReportSalesConversion Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Download_ReportSalesConversion Test");
			Assert.fail(e.getMessage());
		}
	}

}
