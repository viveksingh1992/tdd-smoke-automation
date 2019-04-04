package com.PageObjects.Admin;

import org.openqa.selenium.WebElement;

import com.utilities.WebDriverUtils;

public class Reports_DownloadPageObjects {

	public static WebElement fromDateDailyDetailGrounding() throws Exception {

		return WebDriverUtils.FindElementByXpath("//input[@name='date33']");

	}

	public static WebElement toDateDailyDetailGrounding() throws Exception {

		return WebDriverUtils.FindElementByXpath("//input[@name='date44']");

	}

	public static WebElement SubmitButtonDateDailyDetailGrounding() throws Exception {

		return WebDriverUtils.FindElementByXpath("//input[@id=\"body:tddAdminReportSelect:submitBtn\"]");

	}

	public static WebElement fromDateDealerDirectCSCManaged() throws Exception {

		return WebDriverUtils.FindElementByXpath("//input[@name='cscDate1']");

	}

	public static WebElement toDateDealerDirectCSCManaged() throws Exception {

		return WebDriverUtils.FindElementByXpath("//input[@name='cscDate2']");

	}

	public static WebElement SubmitButtonDealerDirectCSCManaged() throws Exception {

		return WebDriverUtils.FindElementByXpath("//input[@id='body:tddAdminReportSelect:submitBtn']");

	}

	public static WebElement fromDateDealerDirectStatus() throws Exception {

		return WebDriverUtils.FindElementByXpath("//input[@name='ddStatusDdate1']");

	}

	public static WebElement toDateDealerDirectStatus() throws Exception {

		return WebDriverUtils.FindElementByXpath("//input[@name='ddStatusDdate2']");

	}

	public static WebElement SubmitButtonDealerDirectStatus() throws Exception {

		return WebDriverUtils.FindElementByXpath("//input[@id='body:tddAdminReportSelect:submitBtn']");

	}

	public static WebElement fromDateDealerDirectTransport() throws Exception {

		return WebDriverUtils.FindElementByXpath("//input[@id='transportDate1']");

	}

	public static WebElement toDateDealerDirectTransport() throws Exception {

		return WebDriverUtils.FindElementByXpath("//input[@id='transportDate2']");

	}

	public static WebElement SubmitButtonDealerDirectTransport() throws Exception {

		return WebDriverUtils.FindElementByXpath("//input[@id='body:tddAdminReportSelect:submitBtn']");

	}

	public static WebElement fromDatePurchase() throws Exception {

		return WebDriverUtils.FindElementByXpath("//input[@name='purdateFrom']");

	}

	public static WebElement toDatePurchase() throws Exception {

		return WebDriverUtils.FindElementByXpath("//input[@id='purdateTo']");

	}

	public static WebElement SubmitButtonPurchase() throws Exception {

		return WebDriverUtils.FindElementByXpath("//input[@id='body:tddAdminReportSelect:submitBtn']");

	}
	
	public static WebElement fromDateSalesConversion() throws Exception {

		return WebDriverUtils.FindElementByXpath("//input[@name='dateDiv19']");

	}

	public static WebElement toDateSalesConversion() throws Exception {

		return WebDriverUtils.FindElementByXpath("//input[@id='dateDiv6']");

	}
	
	public static WebElement dealerNumberFieldSalesConversion() throws Exception {

		return WebDriverUtils.FindElementByXpath("//input[@name='body:tddAdminReportSelect:salesConversionReportSelect:dealertext']");

	}

	public static WebElement SubmitButtonSalesConversion() throws Exception {

		return WebDriverUtils.FindElementByXpath("//input[@id='body:tddAdminReportSelect:submitBtn']");

	}

}
