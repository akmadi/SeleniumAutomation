package com.anil.automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static void readExcel(FileInputStream fis) {
		
		try {
			XSSFWorkbook book = new XSSFWorkbook(fis);
			XSSFSheet sh = book.getSheetAt(0);
			Iterator<Row> it = sh.iterator();
			
			while(it.hasNext()) {
				Row row = it.next();
				Iterator<Cell> cell = row.cellIterator();
				
			while (cell.hasNext()) {
				Cell cellValue = cell.next();
				System.out.print(cellValue+ "\t\t\t");
			}
				System.out.println();			
			}
			book.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	
	public static void writeExcel(FileInputStream fis) {
		
		//yet to implement 
		
		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sh = book.createSheet("C:\\JavaProject\\Automation\\data\\SampleWrite");
		int rownum=0;
		Row row = sh.createRow(rownum++);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			File file = new File("C:\\JavaProject\\Automation\\data\\TestData.xlsx");
			FileInputStream fis = new FileInputStream(file);
			readExcel(fis);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
