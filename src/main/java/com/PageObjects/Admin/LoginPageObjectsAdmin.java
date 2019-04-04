package com.PageObjects.Admin;

import org.openqa.selenium.WebElement;

import com.utilities.WebDriverUtils;

public class LoginPageObjectsAdmin {
	public static WebElement UsernameField() {
		return WebDriverUtils.FindElementByID("body:adesaLogin:Username");
	}

	public static WebElement PasswordField() {
		return WebDriverUtils.FindElementByID("body:adesaLogin:Password");
	}

	public static WebElement LoginButton() {
		return WebDriverUtils.FindElementByID("body:adesaLogin:login");
	}

	public static WebElement WelcomeText() throws Exception {
		return WebDriverUtils.FindElementByXpath("//h4[contains(text(),'Welcome to your store administration site.')]");
	}

}
