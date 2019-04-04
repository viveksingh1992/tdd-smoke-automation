package com.TestCases.Admin;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Actions.Admin.Functional_AddVINsToDDOActions;
import com.utilities.Environment;
import com.utilities.Log;
import com.utilities.TestBase;
import com.utilities.TestStatistics;
import com.utilities.WebDriverUtils;

@Listeners(com.utilities.TestStatistics.class)
public class Functional_AddVINsToDDOTestCase extends TestBase{

	@Test(retryAnalyzer = TestStatistics.class)
	public static void AddVINsToDDOTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("Add VINs To DDO Test");
			tempTest = report.startTest("Add VINs To DDO Test");
			boolean status = Functional_AddVINsToDDOActions.createExeclFileToUpload();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("Add VINs To DDO Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("Add VINs To DDO Test");
			Assert.fail(e.getMessage());
		}
	}
	
	@Test(retryAnalyzer = TestStatistics.class)
	public static void uploadDDOVINlistTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("uploadDDOVINlistTest");
			tempTest = report.startTest("uploadDDOVINlist Test");
			boolean status = Functional_AddVINsToDDOActions.uploadExcelFileForDDO();
			Assert.assertTrue(status);
			Log.info(Environment.ReadExcelData("Global_Validater", 1, 1));
			Log.endTestCase("uploadDDOVINlist Test");
		} catch (Exception e) {
			WebDriverUtils.TakeScreenShot();
			Log.error(e);
			Log.info(Environment.ReadExcelData("Global_Validater", 2, 1));
			Log.endTestCase("uploadDDOVINlist Test");
			Assert.fail(e.getMessage());
		}
	}
}
