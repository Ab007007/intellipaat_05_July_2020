package com.intellipaat.selenium.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtils {

	public static File file = null;
	public static FileInputStream fis = null;
	public static Workbook wb = null;
	public static Sheet sh = null;
	public static Row row = null;
	public static Cell cell = null;

	public static Sheet getSheet(String sheetName) {
		System.out.println("Getting sheet Object for " + sheetName);
		try {
			file = new File(FileUtils.getPropertyValue("data_source"));
			fis = new FileInputStream(file);

			wb = WorkbookFactory.create(fis);
			sh = wb.getSheet(sheetName);
		} catch (Exception ex) {
			System.out.println("Exception while reading Excel sheet");
		}
		return sh;
	}
	
	public static int getRowCount(String sheetName) {
		System.out.println("Getting row count for the sheet " + sheetName);
		sh = getSheet(sheetName);
		int row_count = sh.getLastRowNum() +1;
		
		return row_count;
		
	}
	
	public static String getCellData(String sheetName, int rowNumber, int columnNumber) {
		System.out.println("Getting cell data from " + sheetName +  " row num " + rowNumber + " col num " + columnNumber );
		String data  = null;
		sh = getSheet(sheetName);
		row = sh.getRow(rowNumber);
		cell = row.getCell(columnNumber);
		data = cell.toString();
		try {
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
		
	}

	public static void main(String[] args) throws IOException {


	}

	public static String getPropertyValue(String name) {
		File file = null;
		FileInputStream fis = null;
		String value = null;
		try {
			file = new File("data/globaldata.properties");
			fis = new FileInputStream(file);
			Properties props = new Properties();
			props.load(fis);
			value = props.getProperty(name);

		} catch (Exception ex) {
			System.out.println("Exception while reading a property file");
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Returning value from props file-------------> " + value);
		return value;

	}
}
