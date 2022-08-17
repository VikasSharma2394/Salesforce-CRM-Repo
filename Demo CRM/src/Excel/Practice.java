package Excel;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Practice {
	public static void main(String[] args) throws Exception {
		ArrayList a = new ArrayList();
		System.out.println("Keyword Name is");
		FileInputStream f = new FileInputStream("C:\\Users\\vikas.sharma\\Desktop\\LeadSuite.xlsx");
		XSSFWorkbook wrk = new XSSFWorkbook(f);
		XSSFSheet sheet = wrk.getSheet("TestData");
		Iterator itr = sheet.iterator();
		while(itr.hasNext()){
			Row rowitr = (Row)itr.next();
			Iterator cellitr = rowitr.cellIterator();
			while(cellitr.hasNext()){
				Cell celldata = (Cell)cellitr.next();
				switch(celldata.getCellType()) {
				case STRING:
					a.add(celldata.getStringCellValue());
					break;
				case BOOLEAN:
					a.add(celldata.getBooleanCellValue());
				case NUMERIC:
					a.add(celldata.getNumericCellValue());
				}
			}
		}
		for(int i=0; i<=a.size();i++) {
			if(a.equals("OpenBrowser")) {
				String keyword = (String) a.get(i);
				String data = (String) a.get(i+1);
				String object1 = (String) a.get(i+2);
				String object2 = (String) a.get(i+3);
				String snapshotPath = (String) a.get(i+4);
				System.out.println("Keyword Name is "+keyword);
				System.out.println("Data is "+data);
				System.out.println("Primary Object is "+object1);
				System.out.println("Secondary Object is "+object2);
			}
		}
	}

}
