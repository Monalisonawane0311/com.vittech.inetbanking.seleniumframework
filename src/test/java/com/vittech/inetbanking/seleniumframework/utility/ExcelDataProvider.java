package com.vittech.inetbanking.seleniumframework.utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	public static XSSFWorkbook workbook;
	
	public ExcelDataProvider(String excelName) {
		try {
			File  fs = new File("./TestData/"+ excelName+".xlsx");
			FileInputStream fins = new FileInputStream(fs);
			workbook = new XSSFWorkbook(fins);
			
		}catch(Exception e) {
			e.printStackTrace();
			}
		}
	
	public int getRowCount(String sheetname) {
		return workbook.getSheet(sheetname).getLastRowNum();
		
	}
	
	public int getRowCount(int index) {
		return workbook.getSheetAt(index).getLastRowNum();
	}
	
	public int getColCount(String sheetname, int row) {
		return workbook.getSheet(sheetname).getRow(row).getLastCellNum();
	}
	
	public int getColCount(int index, int row) {
		return workbook.getSheetAt(index).getRow(row).getLastCellNum();
		
	}
	
	public String getStringCellData(String sheetname, int row, int col) {
		return workbook.getSheet(sheetname).getRow(row).getCell(col).getStringCellValue();
	}
	
	public String getStringCellData(int index, int row, int col) {
		return workbook.getSheetAt(index).getRow(row).getCell(col).getStringCellValue();
	}
	
	public int getNumericCellData(String sheetname, int row, int col)
	{
		return (int)workbook.getSheet(sheetname).getRow(row).getCell(col).getNumericCellValue();
	}
	
	public int getNumericCellData(int index, int row, int col)
	{
		return (int)workbook.getSheetAt(index).getRow(row).getCell(col).getNumericCellValue();
	}
	
	
	
	
	public String[][] getCellData(String sheetname){
		int rows = getRowCount(sheetname);		// get row from excel sheet 
		int col = getColCount(sheetname, 0);	//get column from excel sheet
		
		System.out.println(rows);
		System.out.println(col);
		
		
		 String[][] data = new String[rows][col];	//
		 
		 for(int i=0; i<rows;i++) {			// outer for fetch row
			 for(int j=0; j<col; j++){			// inner for fetch column
				 data[i][j]= workbook.getSheet(sheetname).getRow(i+1).getCell(j).toString();		//toString get content of string and return is string
				 
			 }
		 }
		return data;
	}
	
	
	public String[][] getCellData(int index){
		int rows = getRowCount(index);
		 int col = getColCount(index,0);
		 String[][] data = new String[rows][col];
		 
		 for(int i=0; i<rows;i++) {
			 for(int j=0; j<col; j++) {
				 data[i][j]= workbook.getSheetAt(index).getRow(i+1).getCell(j).toString();
				 
			 }
		 }
		return data;
	}
	
	
	public static void main(String[] args) {
		ExcelDataProvider excelDataProvider =new ExcelDataProvider("datasheet");
		//System.out.println(excelDataProvider.getRowCount("Sheet1"));
		//System.out.println(excelDataProvider.getRowCount(1));
		//	System.out.println(excelDataProvider.getNumericCellData("Sheet1",0,0));
		
		//System.out.println(excelDataProvider.getStringCellData(Sheet1", 1,0));
		//System.out.println(excelDataProvider.getStringCellData("Sheet1", 1,1));
		
		//System.out.println(excelDataProvider.getStringCellData(0, 0, 0));
		//System.out.println(excelDataProvider.getNumericCellData(0, 0, 0));
		
		String[][] data = excelDataProvider.getCellData(2);
		for(String[] data1: data) {
			for (String data2:data1) {
				System.out.print(data2 +"  ");
			}
			System.out.println();
		}
		
		/*String[][] data = excelDataProvider.getCellData("New Customer Page");
		for(String[] data1: data) {
			for (String data2:data1) {
				System.out.print(data2 +"  ");
			}
			System.out.println();
		}*/
		
		
		
		
		
		
	}


}
