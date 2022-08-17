package TestScript;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExecuteCaseTest {
	public static void main(String[] args)throws Exception {
		Keywords key = new Keywords();
		FileInputStream file = new FileInputStream("C:\\Users\\vikas.sharma\\Desktop\\CaseSuite.xlsx");
		ArrayList data1 = new ArrayList();
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("TestData");
		Iterator itr = sheet.iterator();
		while(itr.hasNext()) {
			Row rowitr = (Row) itr.next();
			Iterator cellitr = rowitr.cellIterator();
			while(cellitr.hasNext()) {
				Cell celldata = (Cell)cellitr.next();
				switch(celldata.getCellType()){
				case STRING:
					data1.add(celldata.getStringCellValue());
					break;
				case NUMERIC:
					data1.add(celldata.getNumericCellValue());
				case BOOLEAN:
					data1.add(celldata.getBooleanCellValue());
				}
			}
		}
		for(int i=0; i<data1.size();i++) {
			if(data1.get(i).equals("OpenBrowser")) {
				String keyword = (String) data1.get(i);
				String data = (String) data1.get(i+1);
				String object1 = (String) data1.get(i+2);
				String object2 = (String) data1.get(i+3);
				String snapShotpath = (String) data1.get(i+4);
				String wantSnapshot = (String) data1.get(i+5);
				String runmode = (String) data1.get(i+6);
				System.out.println("Keyword name is"+keyword);
				if(runmode.equals("Yes")) {
					key.openBrowser(snapShotpath, keyword, wantSnapshot);
					if(wantSnapshot.equals("Yes")) {
						System.out.println("Taking Snapshot");
						System.out.println("Snapshot path is "+snapShotpath+keyword+".png");
					}else {
						System.out.println("Value of wantsnapshot is NO");
					}
				}else {
					System.out.println("Runmode is NO");
				}
				
			}
		}
		for(int i=0; i<data1.size();i++) {
			if(data1.get(i).equals("Navigate URL")) {
				String keyword = (String) data1.get(i);
				String value = (String) data1.get(i+1);
				String object1 = (String) data1.get(i+2);
				String object2 = (String) data1.get(i+3);
				String snapShotpath = (String) data1.get(i+4);
				String wantSnapshot = (String) data1.get(i+5);
				String runmode = (String) data1.get(i+6);
				System.out.println("Keyword name is"+keyword);
				System.out.println(" Runmode is "+runmode);
				System.out.println(" Test Data is "+value);
				System.out.println(" First object name is "+object1+" and property value is ");
				System.out.println(" Second object name is "+object2+" and property value is ");
				System.out.println(" Want snapshot is "+wantSnapshot);
				if(runmode.equals("Yes")) {
					key.NavigateURL(value, snapShotpath, keyword, wantSnapshot);
					if(wantSnapshot.equals("Yes")) {
						System.out.println("Taking Snapshot");
						System.out.println("Snapshot path is "+snapShotpath+keyword+".png");
					}else {
						System.out.println("Value of wantsnapshot is NO");
					}
				}else {
					System.out.println("Runmode is NO");
				}
			}
		}
		key.CloseAllBrowsers();
	}

}
