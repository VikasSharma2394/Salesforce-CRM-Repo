package TestScript;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class setRowValue {
	static FileInputStream fileInput;
	static FileOutputStream fileOut;
	static XSSFWorkbook wrk;
	static XSSFSheet sheet;
	static int actualRowNum;
	static int actualColumnNum;
public static void excelSetRowValue(String sheetName, int rowNum, int cellNum, String value)throws Exception {
	actualRowNum = rowNum-1;
	actualColumnNum = cellNum-1;
		try {
			fileInput = new FileInputStream("C:\\Users\\Vikas.Sharma\\Desktop\\ExcelTest.xlsx");
	wrk = new XSSFWorkbook(fileInput);
	sheet = wrk.getSheet("TestData");
	Row row1 = sheet.createRow(actualRowNum);
	Cell cell1 = row1.createCell(actualColumnNum);
	cell1.setCellValue(value);
		}finally{
	fileInput.close();
    fileOut = new FileOutputStream("C:\\Users\\Vikas.Sharma\\Desktop\\ExcelTest.xlsx");
	wrk.write(fileOut);
	wrk.close();
		}
		sheet = wrk.getSheet(sheetName);
		Row row1 = sheet.getRow(actualRowNum);
		Cell cell1 = row1.getCell(actualColumnNum);
		System.out.println("Value updated at row number "+rowNum+" and cell number "+cellNum+" is: "+cell1.getStringCellValue());
		ArrayList a = new ArrayList();
		Iterator itr = sheet.iterator();
		while(itr.hasNext()) {
			Row rowitr = (Row)itr.next();
			Iterator cellitr = rowitr.cellIterator();
			while(cellitr.hasNext()) {
				Cell celldata = (Cell) cellitr.next();
				switch(celldata.getCellType()) {
				case STRING:
					a.add(celldata.getStringCellValue());
					break;
				}
			}
		}
		int lastrowNumber = sheet.getLastRowNum();
		int actuallastRowNumber = lastrowNumber+1;
		System.out.println("Last row number is "+actuallastRowNumber);
		System.out.println("Values present in the cells of the excel file are: "+a);
}
	public static void main(String[] args)throws Exception {
		setRowValue.excelSetRowValue("TestData", 11, 8, "Testing Done");
	}
}
