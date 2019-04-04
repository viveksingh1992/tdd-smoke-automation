package com.PageObjects.Admin;

import org.openqa.selenium.WebElement;

import com.utilities.WebDriverUtils;

public class Calendar_PageObjects {

	public static WebElement FromDateCal_TLWnT() throws Exception {
		return WebDriverUtils.FindElementByXpath("//img[@id='body:tddAdminReportSelect:wearAndTearReportSelect:j_id_jsp_841307206_12pc15PopupButton']");
	}
	
	public static WebElement ToDateCal_TLWnT() throws Exception {
		return WebDriverUtils.FindElementByXpath("//img[@id='body:tddAdminReportSelect:wearAndTearReportSelect:j_id_jsp_841307206_22pc15PopupButton']");
	}
	
	public static WebElement LeftYearFromCal_TLWnT() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[@id='body:tddAdminReportSelect:wearAndTearReportSelect:j_id_jsp_841307206_12pc15Header']//div[text()='<<']");
	}
	
	public static WebElement RightYearFromCal_TLWnT() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[@id='body:tddAdminReportSelect:wearAndTearReportSelect:j_id_jsp_841307206_12pc15Header']//div[text()='>>']");
	}
	
	public static WebElement LeftYearToCal_TLWnT() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[@id='body:tddAdminReportSelect:wearAndTearReportSelect:j_id_jsp_841307206_22pc15Header']//div[text()='<<']");
	}
	
	public static WebElement RightYearToCal_TLWnT() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[@id='body:tddAdminReportSelect:wearAndTearReportSelect:j_id_jsp_841307206_22pc15Header']//div[text()='>>']");
	}
		
	public static WebElement LeftMonthFromCal_TLWnT() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[@id='body:tddAdminReportSelect:wearAndTearReportSelect:j_id_jsp_841307206_12pc15Header']//div[text()='<']");
	}
	
	public static WebElement RightMonthFromCal_TLWnT() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[@id='body:tddAdminReportSelect:wearAndTearReportSelect:j_id_jsp_841307206_12pc15Header']//div[text()='>']");
	}
	
	public static WebElement LeftMonthToCal_TLWnT() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[@id='body:tddAdminReportSelect:wearAndTearReportSelect:j_id_jsp_841307206_22pc15Header']//div[text()='<']");
	}
	
	public static WebElement RightMonthToCal_TLWnT() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[@id='body:tddAdminReportSelect:wearAndTearReportSelect:j_id_jsp_841307206_22pc15Header']//div[text()='>']");
	}
	
	public static WebElement DayzeroFromCal_TLWnT() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[@id='body:tddAdminReportSelect:wearAndTearReportSelect:j_id_jsp_841307206_12pc15DayCell0']");
	}
	
	public static WebElement DayzeroToCal_TLWnT() throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[@id='body:tddAdminReportSelect:wearAndTearReportSelect:j_id_jsp_841307206_22pc15DayCell0']");
	}
	
	public static WebElement DayFromCal_TLWnT(int index) throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[@id='body:tddAdminReportSelect:wearAndTearReportSelect:j_id_jsp_841307206_12pc15DayCell" + index + "']");
	}
	
	public static WebElement DayToCal_TLWnT(int index) throws Exception {
		return WebDriverUtils.FindElementByXpath("//td[@id='body:tddAdminReportSelect:wearAndTearReportSelect:j_id_jsp_841307206_22pc15DayCell" + index + "']");
	}
}
