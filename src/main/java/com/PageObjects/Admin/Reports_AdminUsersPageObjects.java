package com.PageObjects.Admin;

import org.openqa.selenium.WebElement;

import com.utilities.WebDriverUtils;

public class Reports_AdminUsersPageObjects {

	public static WebElement ReportSelectorDropDown() {
		return WebDriverUtils.FindElementByID("body:tddAdminReportSelect:selectedReport");
	}

}
