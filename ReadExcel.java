package com.javabykiran.keywordFrmework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcel {

	Workbook wbWorkbook;
	Sheet shSheet;

	public void openSheet(String filePath) {
		FileInputStream fs;
		try {
			System.out.println(1);
			System.out.println(filePath);
			System.out.println(2);
			fs = new FileInputStream(filePath);
			System.out.println(3);
			System.out.println(fs);
			System.out.println(4);
			wbWorkbook = Workbook.getWorkbook(fs);
			System.out.println(5);
			System.out.println(wbWorkbook);
			System.out.println(6);
			shSheet = wbWorkbook.getSheet(0);
			System.out.println(7);
			System.out.println(shSheet);
			System.out.println(8);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getValueFromCell(int iColNumber, int iRowNumber) {
		return shSheet.getCell(iColNumber, iRowNumber).getContents();
	}

	public int getRowCount() {
		return shSheet.getRows();
	}

	public int getColumnCount() {
		return shSheet.getColumns();
	}

}