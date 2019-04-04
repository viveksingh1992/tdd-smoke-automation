package com.PageObjects.Admin;

import org.openqa.selenium.WebElement;

import com.utilities.WebDriverUtils;

public class Sanity_OtherProductionApplicationsPageObjects {

	public static WebElement TDDVerificationElement() throws Exception {
		return WebDriverUtils.FindElementByXpath("//input[@id='Username']");
	}

	public static WebElement TDDForgotPasswordLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//a[contains(text(),'Forgot Password?')]");
	}

	public static WebElement TDDForgotPasswordVerificationText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//label[contains(text(),'Email Address:')]");
	}

	public static WebElement TDDBackToLoginLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//a[contains(text(),'Back to Login Page')]");
	}

	public static WebElement TDDLoginLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//input[@id='bodyView:adesaLogin:login']");
	}

	public static WebElement TDDInvalidLoginVerificationText() throws Exception {
		return WebDriverUtils
				.FindElementByXpath("//strong[contains(text(),'Invalid User ID or Password. Please try again.')]");
	}

}
