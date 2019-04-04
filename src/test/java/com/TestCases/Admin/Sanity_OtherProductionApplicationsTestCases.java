package com.TestCases.Admin;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.utilities.TestBase;
import com.utilities.TestStatistics;

public class Sanity_OtherProductionApplicationsTestCases extends TestBase {

	String TestCaseName = null;

	@BeforeTest
	public void init() throws Exception {
		TestCaseName = this.getClass().getSimpleName();
		initExtentReport(TestCaseName);
		test = report.startTest("All report selection Test");
	}

	@Test(retryAnalyzer = TestStatistics.class)
	public void OtherProductionApplicationsTestCase() throws Exception {
		ProductionApplicationsTestCases.TDDNavigationTest();
		ProductionApplicationsTestCases.TDDForgotPasswordTest();
		ProductionApplicationsTestCases.TDDInvalidLoginTest();
		ProductionApplicationsTestCases.LDDNavigationTest();
		ProductionApplicationsTestCases.LDDForgotPasswordTest();
		ProductionApplicationsTestCases.LDDInvalidLoginTest();
	}
}
