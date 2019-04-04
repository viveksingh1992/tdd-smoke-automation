package com.TestCases.Admin;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.utilities.TestBase;
import com.utilities.TestStatistics;

public class Functional_TestCases extends TestBase {

	String TestCaseName = null;

	@BeforeTest
	public void init() throws Exception {
		TestCaseName = this.getClass().getSimpleName();
		initExtentReport(TestCaseName);
		test = report.startTest("Functional Test Cases");
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public void AdminFunctionalTestCases() throws Exception {
		LoginTestCase.LoginTest();
		Inventory_NavigationTestCases.ManageInventoryNavigationTest();
		Functional_AddVINsToDDOTestCase.AddVINsToDDOTest();
		Functional_AddVINsToDDOTestCase.uploadDDOVINlistTest();
	}
}
