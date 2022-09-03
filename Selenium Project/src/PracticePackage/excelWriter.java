package PracticePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class excelWriter {
	public static void main(String[] args) throws Exception, IOException {
		XSSFWorkbook wrk = new XSSFWorkbook();
		XSSFSheet sheet = wrk.createSheet("Vikas");
		Row row1 = sheet.createRow(0);
		Cell cell1 = row1.createCell(0);
		cell1.setCellValue("I am the best");
		Cell cell2 = row1.createCell(1);
		cell2.setCellValue("vikas");
		Row row2 = sheet.createRow(1);
		Cell cell3 = row2.createCell(0);
		cell3.setCellValue("Sharma");
		wrk.write(new FileOutputStream("D:\\Excel Data\\Test Excel.xlsx"));
		wrk.close();
		XSSFWorkbook wrk1 = new XSSFWorkbook();  
		wrk1.write(new FileOutputStream("D:\\Excel Data\\Magic Excel.xlsx"));
		XSSFSheet sheet1 = wrk1.createSheet("Sharma");
		Row row3 = sheet1.createRow(0);
		Cell cell4 = row3.createCell(0);
		cell4.setCellValue("I am the best");
		Cell cell5 = row3.createCell(1);
		cell5.setCellValue("vikas");
		Row row4 = sheet1.createRow(1);
		Cell cell6 = row4.createCell(0);
		cell6.setCellValue("Sharma");
		wrk1.write(new FileOutputStream("D:\\Excel Data\\Magic Excel.xlsx"));
		wrk1.close();
	    wrk1.getSheet("Sharma");
	    System.out.println("Cell value is "+row3.getCell(0));
		System.out.println("Executed");
	}

}
