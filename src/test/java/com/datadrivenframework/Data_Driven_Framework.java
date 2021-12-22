package com.datadrivenframework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven_Framework {
	public static void particular_Data() throws Throwable {
		File f = new File("C:\\Users\\ameea\\eclipse-workspace\\Maven_Project\\Excel File\\Data Driven Framework.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		Row row = sheetAt.getRow(1);
		Cell cell = row.getCell(1);
		CellType cellType = cell.getCellType();
		System.out.println("Particular Data:");
		if(cellType.equals(CellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
		}
		else if(cellType.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int value = (int) numericCellValue;
			System.out.println(value);
		}
	}
	public static void all_Data() throws Throwable {
		File f = new File("C:\\Users\\ameea\\eclipse-workspace\\Maven_Project\\Excel File\\Data Driven Framework.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		System.out.println("All Data:");
		for(int i=0;i<numberOfRows;i++) {
			Row row = sheetAt.getRow(i);
			int numberOfCells = row.getPhysicalNumberOfCells();
			for(int j=0;j<numberOfCells;j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				if(cellType.equals(CellType.STRING)) {
					String value = cell.getStringCellValue();
					System.out.println(value);
				}
				else if(cellType.equals(CellType.NUMERIC)) {
					double cellValue = cell.getNumericCellValue();
					int value = (int) cellValue;
					System.out.println(value);
				}
			}
		}
	}
	public static void particular_Row_Data() throws Throwable {
		File f = new File("C:\\Users\\ameea\\eclipse-workspace\\Maven_Project\\Excel File\\Data Driven Framework.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		Row row = sheetAt.getRow(1);
		int numberOfCells = row.getPhysicalNumberOfCells();
		System.out.println("Particular Row Data:");
		for(int i=0;i<numberOfCells;i++) {
			Cell cell = row.getCell(i);
			CellType cellType = cell.getCellType();
			if(cellType.equals(CellType.STRING)) {
				String value = cell.getStringCellValue();
				System.out.println(value);
			}
			else if(cellType.equals(CellType.NUMERIC)) {
				double cellValue = cell.getNumericCellValue();
				int value = (int) cellValue;
				System.out.println(value);
			}
		}		
	}
	public static void particular_Column_Data() throws Throwable {
		File f = new File("C:\\Users\\ameea\\eclipse-workspace\\Maven_Project\\Excel File\\Data Driven Framework.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		System.out.println("Particular Column Data:");
		for(int i=0;i<numberOfRows;i++) {
			Row row = sheetAt.getRow(i);
			Cell cell = row.getCell(1);
			CellType cellType = cell.getCellType();
			if(cellType.equals(CellType.STRING)) {
				String value = cell.getStringCellValue();
				System.out.println(value);
			}
			else if(cellType.equals(CellType.NUMERIC)) {
				double cellValue = cell.getNumericCellValue();
				int value = (int) cellValue;
				System.out.println(value);
			}
		}
	}
	public static void write_Data() throws Throwable {
		File f = new File("C:\\Users\\ameea\\eclipse-workspace\\Maven_Project\\Excel File\\Data Driven Framework.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet createSheet = w.createSheet("Credentials");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		System.out.println("Write Data:");
		createCell.setCellValue("Email");
		w.getSheet("Credentials").getRow(0).createCell(1).setCellValue("Password");
		w.getSheet("Credentials").createRow(1).createCell(0).setCellValue("Starc");
		w.getSheet("Credentials").getRow(1).createCell(1).setCellValue(123);
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);
		w.close();
		System.out.println("Write Successfully");
	}
	public static void main(String[] args) throws Throwable {
		particular_Data();
		all_Data();
		particular_Row_Data();
		particular_Column_Data();
		write_Data();
	}
}
