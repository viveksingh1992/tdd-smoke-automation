package com.PageObjects.Admin;

import org.openqa.selenium.WebElement;

import com.utilities.WebDriverUtils;

public class Functional_DDOPageObjects {

	public static WebElement bulkRelistButton() throws Exception {
		return WebDriverUtils.FindElementByXpath("//input[@value='Bulk Relist']");
	}

	public static WebElement reListLocationOptionDropDown() throws Exception {
		return WebDriverUtils.FindElementByXpath("//select[@id='body:bulkRelistPage:Reason']");
	}

	public static WebElement uploadFileButton() throws Exception {
		return WebDriverUtils.FindElementByXpath("//input[@id='body:bulkRelistPage:bulkRelistUploadedFile']");
	}

	public static WebElement continueButton() throws Exception {
		return WebDriverUtils.FindElementByXpath("//input[@value='Continue']");
	}

	public static WebElement reListButton() throws Exception {
		return WebDriverUtils.FindElementByXpath("//input[@value='Re-List']");
	}

	public static WebElement relistVerification() throws Exception {
		return WebDriverUtils
				.FindElementByXpath("//th[contains(text(),'COMMENTS')]");
	}

}
