package com.utilities;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Environment {
	
	public static String home = System.getProperty("user.home");
	public static String downloadPath = home + "//Downloads";

	public static String ReadExcelData(String SheetName, int RowNumber, int CellNumber) throws IOException {

		File src = new File(
				".\\ExcelData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook excelWorkbook = new XSSFWorkbook(fis);
		XSSFSheet Sheet = excelWorkbook.getSheet(SheetName);
		String dataAtCell = Sheet.getRow(RowNumber).getCell(CellNumber).getStringCellValue();
		return dataAtCell;
	}
	
	public static void WriteExcelData(String xpathForTheVINList) throws IOException {
		int rownum = 0;
		int cellnum = 0;
		FileOutputStream out = new FileOutputStream(new File(downloadPath+"//VINforDDO.xls"));
		HSSFWorkbook excelWorkbook = new HSSFWorkbook();
		HSSFSheet sheet = excelWorkbook.createSheet("VINs");
		List<String> VINdataforDDO = WebDriverUtils.getVINlist(xpathForTheVINList);
		Iterator<String> i = VINdataforDDO.iterator();
		while(i.hasNext()) {
			Row row = sheet.createRow(rownum++);
			cellnum=0;
			Cell cell1 = row.createCell(cellnum);
			cell1.setCellValue(i.next());
			cellnum=1;
			Cell cell2 = row.createCell(cellnum);
			cell2.setCellValue("relist");
		}
		excelWorkbook.write(out);
		out.close();
	}
}