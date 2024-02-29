import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import TestScript.Keywords;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReverseText{
	public static void main(String[] args)throws Exception {
		KeywordsCreation k = new KeywordsCreation();
		Keywords key = new Keywords();
		ArrayList list = new ArrayList<>();
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
					list.add(celldata.getStringCellValue());
					break;
				case BOOLEAN:
					list.add(celldata.getBooleanCellValue());
				case NUMERIC:
					list.add(celldata.getNumericCellValue());
				}
			}
		}
		for(int i=0;i<list.size();i++) {
			if(list.get(i).equals("OpenBrowser")) {
				String keyword = (String)list.get(i);
				String snapshotPath = (String)list.get(i+4);
				String wantSnapshot = (String)list.get(i+5);
				String runmode = (String)list.get(i+6);
				System.out.println("Keyword name is "+keyword);
				System.out.println("Data is "+list);
				key.openBrowser(snapshotPath, keyword, wantSnapshot);
			}
		}
	}
	
}
