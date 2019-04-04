package com.PageObjects.Admin;

import org.openqa.selenium.WebElement;

import com.utilities.WebDriverUtils;

public class Logout_PageObjects {

	public static WebElement LogoutLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//a[contains(text(),'Logout')]");
	}
	
	public static WebElement LogoutVerifyText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//a[contains(text(),'here')]");
	}
}
