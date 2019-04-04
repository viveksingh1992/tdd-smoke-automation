package com.Actions.Admin;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import com.PageObjects.Admin.Calendar_PageObjects;
import com.PageObjects.Admin.Reports_DownloadPageObjects;
import com.utilities.AutomateJsfCalendar;
import com.utilities.Environment;
import com.utilities.Log;
import com.utilities.TestBase;
import com.utilities.WebDriverUtils;

public class Reports_DownloadActions extends TestBase {

	static boolean status = false;

	public static boolean Download_ReportDailyDetailGrounding() throws IOException, Exception {

		WebDriverUtils.delete_File("Grounding_Report");
		WebDriverUtils.InputValues(Reports_DownloadPageObjects.fromDateDailyDetailGrounding(), "03/01/2019",
				"From Date");
		WebDriverUtils.InputValues(Reports_DownloadPageObjects.toDateDailyDetailGrounding(), "03/10/2019", "To Date");
		WebDriverUtils.ClickAction(Reports_DownloadPageObjects.SubmitButtonDateDailyDetailGrounding(), "Submit Button");
		WebDriverUtils.taskdelay();
		if (WebDriverUtils.verify_downloaded_File("Grounding_Report")) {
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

	public static boolean Download_ReportDealerDirectCSCManaged() throws IOException, Exception {

		WebDriverUtils.delete_File("CSC_Managed_Report");
		WebDriverUtils.InputValues(Reports_DownloadPageObjects.fromDateDealerDirectCSCManaged(), "03/01/2019",
				"From Date");
		WebDriverUtils.InputValues(Reports_DownloadPageObjects.toDateDealerDirectCSCManaged(), "03/10/2019", "To Date");
		WebDriverUtils.ClickAction(Reports_DownloadPageObjects.SubmitButtonDealerDirectCSCManaged(), "Submit Button");
		WebDriverUtils.taskdelay();
		if (WebDriverUtils.verify_downloaded_File("CSC_Managed_Report")) {
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

	public static boolean Download_ReportDealerDirectStatus() throws IOException, Exception {

		WebDriverUtils.delete_File("Dealer_Direct_Status_Report");
		WebDriverUtils.InputValues(Reports_DownloadPageObjects.fromDateDealerDirectStatus(), "03/01/2019", "From Date");
		WebDriverUtils.InputValues(Reports_DownloadPageObjects.toDateDealerDirectStatus(), "03/10/2019", "To Date");
		WebDriverUtils.ClickAction(Reports_DownloadPageObjects.SubmitButtonDealerDirectStatus(), "Submit Button");
		WebDriverUtils.taskdelay();
		if (WebDriverUtils.verify_downloaded_File("Dealer_Direct_Status_Report")) {
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

	public static boolean Download_ReportDealerDirectTransport() throws IOException, Exception {

		WebDriverUtils.delete_File("Transport_Report");
		WebDriverUtils.InputValues(Reports_DownloadPageObjects.fromDateDealerDirectTransport(), "03/01/2019",
				"From Date");
		WebDriverUtils.InputValues(Reports_DownloadPageObjects.toDateDealerDirectTransport(), "03/10/2019", "To Date");
		WebDriverUtils.ClickAction(Reports_DownloadPageObjects.SubmitButtonDealerDirectTransport(), "Submit Button");
		WebDriverUtils.taskdelay();
		if (WebDriverUtils.verify_downloaded_File("Transport_Report")) {
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

	public static boolean Download_ReportToyotaLexusWearAndTear() throws IOException, Exception {
		WebDriverUtils.delete_File("Wear_And_Tear_Report");
		Calendar_PageObjects.FromDateCal_TLWnT().click();
		WebElement monthIncrementerxPath = Calendar_PageObjects.RightMonthFromCal_TLWnT();
		WebElement monthDecrementerxPath = Calendar_PageObjects.LeftMonthFromCal_TLWnT();
		WebElement yearIncrementerxPath = Calendar_PageObjects.RightYearFromCal_TLWnT();
		WebElement yearDecrementerxPath = Calendar_PageObjects.LeftYearFromCal_TLWnT();
		WebElement dayZeroxPath = Calendar_PageObjects.DayzeroFromCal_TLWnT();
		int index = AutomateJsfCalendar.datePicker("03/01/2019", monthIncrementerxPath, monthDecrementerxPath,
				dayZeroxPath, yearIncrementerxPath, yearDecrementerxPath);
		Calendar_PageObjects.DayFromCal_TLWnT(index).click();
		Calendar_PageObjects.ToDateCal_TLWnT().click();
		monthIncrementerxPath = Calendar_PageObjects.RightMonthToCal_TLWnT();
		monthDecrementerxPath = Calendar_PageObjects.LeftMonthToCal_TLWnT();
		yearIncrementerxPath = Calendar_PageObjects.RightYearToCal_TLWnT();
		yearDecrementerxPath = Calendar_PageObjects.LeftYearToCal_TLWnT();
		dayZeroxPath = Calendar_PageObjects.DayzeroToCal_TLWnT();
		index = AutomateJsfCalendar.datePicker("03/10/2019", monthIncrementerxPath, monthDecrementerxPath, dayZeroxPath,
				yearIncrementerxPath, yearDecrementerxPath);
		Calendar_PageObjects.DayToCal_TLWnT(index).click();
		WebDriverUtils.ClickAction(Reports_DownloadPageObjects.SubmitButtonDateDailyDetailGrounding(), "Submit Button");
		WebDriverUtils.taskdelay();
		if (WebDriverUtils.verify_downloaded_File("Wear_And_Tear_Report")) {
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

	public static boolean Download_ReportPurchase() throws IOException, Exception {

		WebDriverUtils.delete_File("Purchase_Report");
		WebDriverUtils.InputValues(Reports_DownloadPageObjects.fromDatePurchase(), "03/01/2019", "From Date");
		WebDriverUtils.InputValues(Reports_DownloadPageObjects.toDatePurchase(), "03/10/2019", "To Date");
		WebDriverUtils.ClickAction(Reports_DownloadPageObjects.SubmitButtonPurchase(), "Submit Button");
		WebDriverUtils.taskdelay();
		if (WebDriverUtils.verify_downloaded_File("Purchase_Report")) {
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

	public static boolean Download_ReportSalesConversion() throws IOException, Exception {

		WebDriverUtils.delete_File("Sales_Conversion_Report");
		WebDriverUtils.InputValues(Reports_DownloadPageObjects.fromDateSalesConversion(), "03/01/2019", "From Date");
		WebDriverUtils.InputValues(Reports_DownloadPageObjects.toDateSalesConversion(), "03/10/2019", "To Date");
		WebDriverUtils.InputValues(Reports_DownloadPageObjects.dealerNumberFieldSalesConversion(), "20114",
				"Dealer Number");
		WebDriverUtils.ClickAction(Reports_DownloadPageObjects.SubmitButtonPurchase(), "Submit Button");
		WebDriverUtils.taskdelay();
		if (WebDriverUtils.verify_downloaded_File("Sales_Conversion_Report")) {
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
