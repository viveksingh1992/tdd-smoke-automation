package com.PageObjects.Admin;

import org.openqa.selenium.WebElement;

import com.utilities.WebDriverUtils;

public class Home_PageObjects {

	public static WebElement HomeLink() throws Exception {
		return WebDriverUtils.FindElementByXpath("//li/a[text()='Home']");
	}

}
