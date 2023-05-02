import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
public static void main(String[] args)throws Exception {
	B key = new B();
	ArrayList data = new ArrayList(); 
	XSSFWorkbook wrk = new XSSFWorkbook(new FileInputStream("C:\\Users\\vikas.sharma\\Desktop\\LeadSuite.xlsx"));
	XSSFSheet sheet = wrk.getSheet("TestData");
	Iterator itr = sheet.iterator();
	while(itr.hasNext()) {
		Row rowitr = (Row)itr.next();
		Iterator cellitr = rowitr.cellIterator();
		while(cellitr.hasNext()) {
			Cell celldata = (Cell)cellitr.next();
			switch(celldata.getCellType()) {
			case STRING:
				data.add(celldata.getStringCellValue());
				break;
			case BOOLEAN:
				data.add(celldata.getBooleanCellValue());
				break;
			case NUMERIC:
				data.add(celldata.getNumericCellValue());
				break;
			}
		}
		
	}
    for(int i=0;i<data.size();i++) {
    	if(data.get(i).equals("OpenBrowser")) {
    		String keyowrd = (String)data.get(i);
    		System.out.println("Keyword Name is "+keyowrd);
    		key.OpenBrowser();
    	}
    }
    for(int i=0;i<data.size();i++) {
    	if(data.get(i).equals("TypeText")) {
    		String keyowrd = (String)data.get(i);
    		String data1 = (String)data.get(i+1);
    		System.out.println("Keyword Name is "+keyowrd);
    		System.out.println("Data is "+data1);
    		String actualvalue = key.TypeText(data1);
    		System.out.println("Extracted text is "+actualvalue);
    	}
    }
}
}
