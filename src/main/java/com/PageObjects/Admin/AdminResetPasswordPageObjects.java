package com.PageObjects.Admin;

import org.openqa.selenium.WebElement;

import com.utilities.WebDriverUtils;

public class AdminResetPasswordPageObjects {

	public static WebElement ForgotPasswordLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//a[contains(text(),'Forgot Password')]");
	}

	public static WebElement ForgotPasswordPageValidator() throws Exception {
		return WebDriverUtils.FindElementByXpath("//a[contains(text(),'Back to Login Page')]");
	}

}
