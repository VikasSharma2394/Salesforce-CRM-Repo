package PracticeFolder;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static void main(String[] args)throws Exception {
	ArrayList a = new ArrayList();
	FileInputStream file = new FileInputStream("C:\\Users\\vikas.sharma\\Desktop\\LeadSuite.xlsx");
	XSSFWorkbook wrk = new XSSFWorkbook(file);
	XSSFSheet sheet = wrk.getSheet("TestData");
	Iterator itr = sheet.iterator();
	while(itr.hasNext()) {
		Row rowitr = (Row)itr.next();
		Iterator cellitr = rowitr.cellIterator();
		while(cellitr.hasNext()) {
			Cell celldata = (Cell)cellitr.next();
			switch(celldata.getCellType()) {
			case STRING:
				a.add(celldata.getStringCellValue());
				break;
			case BOOLEAN:
				a.add(celldata.getBooleanCellValue());
				break;
			case NUMERIC:
				a.add(celldata.getNumericCellValue());
				break;
			}
		}
	}
	for(int i=0;i<a.size();i++) {
		if(a.get(i).equals("TypeText")) {
			String keyword = (String)a.get(i);
			String data = (String)a.get(i+1);
			System.out.println(keyword);
			System.out.println(data);
		}
	}
}
}