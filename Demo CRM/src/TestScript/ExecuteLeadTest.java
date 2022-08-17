package TestScript;

import java.io.FileInputStream;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.junit.Test;



public class ExecuteLeadTest {
	static FileInputStream propFile;
	static Properties prop;
	@Test
	public void LeadTest () throws Exception {
		propFile = new FileInputStream("D:\\Workspace Eclipse\\Demo CRM\\src\\OBRepository\\SalesforceOR.properties");
		prop = new Properties();
		prop.load(propFile);
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		Keywords key = new Keywords();
		ArrayList data= new ArrayList();
		FileInputStream file = new FileInputStream("C:\\Users\\vikas.sharma\\Desktop\\LeadSuite.xlsx");
		XSSFWorkbook wrbk = new XSSFWorkbook(file);
		XSSFSheet s = wrbk.getSheet("TestData");
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			Row rowitr = (Row)itr.next();
			Iterator cellitr = rowitr.cellIterator();
			while(cellitr.hasNext()) {
				Cell celldata = (Cell)cellitr.next();
				switch(celldata.getCellType()) {
				case STRING:
					data.add(celldata.getStringCellValue());
					break;
				case NUMERIC:
					data.add(celldata.getNumericCellValue());
				case BOOLEAN:
					data.add(celldata.getBooleanCellValue());
				}
			}
			
		}
		for(int i=0; i<data.size();i++) {
			if(data.get(i).equals("OpenBrowser")){
				String keyword = (String)data.get(i);
				String snapshotPath = (String)data.get(i+4);
				String wantSnapshot = (String)data.get(i+5);
				String runmode = (String)data.get(i+6);
				System.out.println(timestamp+" Keyword name is "+keyword);
				if(runmode.equals("Yes")) {
					key.openBrowser(snapshotPath, keyword, wantSnapshot);
				System.out.println(timestamp+" Runmode is "+runmode);
				System.out.println(timestamp+" Want snapshot is "+wantSnapshot);
				if(wantSnapshot.equals("Yes")) {
					System.out.println(timestamp+" Taking SnapShot");
					System.out.println(timestamp+" Snapshot path is "+snapshotPath+keyword+".png");
					}else {
						System.out.println(timestamp+" Value of Want Snaphot is No. No Need to Take Snapshot");
					}
				}else {
					System.out.println("Keyword skipped during execution as its runmode value is NO");
				}
				System.out.println();
			}
		}
		for(int i=0; i<data.size();i++) {
			if(data.get(i).equals("Navigate URL")){
				String keyword = (String)data.get(i);
				String value = (String)data.get(i+1);
				String object1 = (String)data.get(i+2);
				String object2 = (String)data.get(i+3);
				String snapshotPath = (String)data.get(i+4);
				String wantSnapshot = (String)data.get(i+5);
				String runmode = (String)data.get(i+6);
				System.out.println(timestamp+" Keyword name is "+keyword);
				if(runmode.equals("Yes")) {
					key.NavigateURL(value, snapshotPath, keyword, wantSnapshot);
				System.out.println(timestamp+" Runmode is "+runmode);
				System.out.println(timestamp+" Test Data is "+value);
				System.out.println(timestamp+" First object name is "+object1+" and property value is "+prop.getProperty(object1));
				System.out.println(timestamp+" Second object name is "+object2+" and property value is "+prop.getProperty(object2));
				System.out.println(timestamp+" Want snapshot is "+wantSnapshot);
				if(wantSnapshot.equals("Yes")) {
					System.out.println(timestamp+" Taking SnapShot");
					System.out.println(timestamp+" Snapshot path is "+snapshotPath+keyword+".png");
					}else {
						System.out.println(timestamp+" Value of Want Snaphot is No. No Need to Take Snapshot");
					}
				}else {
					System.out.println(timestamp+" Keyword skipped during execution as its runmode value is NO");
				}
				System.out.println();
			}
		}
		for(int i=0; i<data.size();i++) {
			if(data.get(i).equals("TypeText")){
				String keyword = (String)data.get(i);
				String value = (String)data.get(i+1);
				String object1 = (String)data.get(i+2);
				String object2 = (String)data.get(i+3);
				String snapshotPath = (String)data.get(i+4);
				String wantSnapshot = (String)data.get(i+5);
				String runmode = (String)data.get(i+6);
				System.out.println(timestamp+" Keyword name is "+keyword);
				System.out.println(timestamp+" Runmode is "+runmode);
				if(runmode.equals("Yes")) {
					key.TypeText(value, object1, snapshotPath, keyword, wantSnapshot);
				System.out.println(timestamp+" Test Data is "+value);
				System.out.println(timestamp+" First object name is "+object1+" and property value is "+prop.getProperty(object1));
				System.out.println(timestamp+" Second object name is "+object2+" and property value is "+prop.getProperty(object2));
				System.out.println(timestamp+" Want snapshot is "+wantSnapshot);
				if(wantSnapshot.equals("Yes")) {
					System.out.println(timestamp+" Taking SnapShot");
					System.out.println(timestamp+" Snapshot path is "+snapshotPath+keyword+".png");
					}else {
						System.out.println(timestamp+" Value of Want Snaphot is No. No Need to Take Snapshot");
					}
				}else {
					System.out.println(timestamp+" Keyword skipped during execution as its runmode value is NO");
				}
				System.out.println();
			}
		}
		for(int i=0; i<data.size();i++) {
			if(data.get(i).equals("PasteTextOnEditBox")){
				String keyword = (String)data.get(i);
				String value = (String)data.get(i+1);
				String object1 = (String)data.get(i+2);
				String object2 = (String)data.get(i+3);
				String snapshotPath = (String)data.get(i+4);
				String wantSnapshot = (String)data.get(i+5);
				String runmode = (String)data.get(i+6);
				System.out.println(timestamp+" Keyword name is "+keyword);
				System.out.println(timestamp+" Runmode is "+runmode);
				if(runmode.equals("Yes")) {
					key.PasteTextOnEditBox(value, object1, snapshotPath, keyword, wantSnapshot);
				System.out.println(timestamp+" Test Data is "+value);
				System.out.println(timestamp+" First object name is "+object1+" and property value is "+prop.getProperty(object1));
				System.out.println(timestamp+" Second object name is "+object2+" and property value is "+prop.getProperty(object2));
				System.out.println(timestamp+" Want snapshot is "+wantSnapshot);
				if(wantSnapshot.equals("Yes")) {
					System.out.println(timestamp+" Taking SnapShot");
					System.out.println(timestamp+" Snapshot path is "+snapshotPath+keyword+".png");
					}else {
						System.out.println(timestamp+" Value of Want Snaphot is No. No Need to Take Snapshot");
					}
				}else {
					System.out.println(timestamp+" Keyword skipped during execution as its runmode value is NO");
				}
				System.out.println();
			}
		}
		for(int i=0; i<data.size();i++) {
			if(data.get(i).equals("VerifyTextOnEditBox")){
				String keyword = (String)data.get(i);
				String value = (String)data.get(i+1);
				String object1 = (String)data.get(i+2);
				String object2 = (String)data.get(i+3);
				String snapshotPath = (String)data.get(i+4);
				String wantSnapshot = (String)data.get(i+5);
				String runmode = (String)data.get(i+6);
				String continueOnError = (String)data.get(i+7);
				System.out.println(timestamp+" Keyword name is "+keyword);
				System.out.println(timestamp+" Continue on Error is "+continueOnError);
				try {
				if(runmode.equals("Yes")) {
					String actualValue = key.VerifyTextOnEditBox(object1, snapshotPath, keyword, wantSnapshot, continueOnError);
					Assert.assertEquals(value, actualValue);
				System.out.println(timestamp+" Runmode is "+runmode);
				System.out.println(timestamp+" Test Data is "+value);
				System.out.println(timestamp+" First object name is "+object1+" and property value is "+prop.getProperty(object1));
				System.out.println(timestamp+" Second object name is "+object2+" and property value is "+prop.getProperty(object2));
				System.out.println(timestamp+" Want snapshot is "+wantSnapshot);
				if(wantSnapshot.equals("Yes")) {
					System.out.println(timestamp+" Taking SnapShot");
					System.out.println(timestamp+" Snapshot path is "+snapshotPath+keyword+".png");
					}else {
						System.out.println(timestamp+" Value of Want Snaphot is No. No Need to Take Snapshot");
					}
				}else {
					System.out.println(timestamp+" Keyword skipped during execution as its runmode value is NO");
				}
				}catch(AssertionError e) {
					System.out.println("Exception occured at target plugin "+e);
				}
				System.out.println();
			}
		}
		for(int i=0; i<data.size();i++) {
			if(data.get(i).equals("TypeSecureText")){
				String keyword = (String)data.get(i);
				String value = (String)data.get(i+1);
				String object1 = (String)data.get(i+2);
				String object2 = (String)data.get(i+3);
				String snapshotPath = (String)data.get(i+4);
				String wantSnapshot = (String)data.get(i+5);
				String runmode = (String)data.get(i+6);
				System.out.println(timestamp+" Keyword name is "+keyword);
				System.out.println(timestamp+" Runmode is "+runmode);
				if(runmode.equals("Yes")) {
					key.TypeSecureText(value, object1, snapshotPath, keyword, wantSnapshot);
				System.out.println(timestamp+" Test Data is "+value);
				System.out.println(timestamp+" First object name is "+object1+" and property value is "+prop.getProperty(object1));
				System.out.println(timestamp+" Second object name is "+object2+" and property value is "+prop.getProperty(object2));
				System.out.println(timestamp+" Want snapshot is "+wantSnapshot);
				if(wantSnapshot.equals("Yes")) {
					System.out.println(timestamp+" Taking SnapShot");
					System.out.println(timestamp+" Snapshot path is "+snapshotPath+keyword+".png");
					}else {
						System.out.println(timestamp+" Value of Want Snaphot is No. No Need to Take Snapshot");
					}
				}else {
					System.out.println(timestamp+" Keyword skipped during execution as its runmode value is NO");
				}
				System.out.println();
			}
		}
		for(int i=0; i<data.size();i++) {
			if(data.get(i).equals("ClickButton")){
				String keyword = (String)data.get(i);
				String value = (String)data.get(i+1);
				String object1 = (String)data.get(i+2);
				String object2 = (String)data.get(i+3);
				String snapshotPath = (String)data.get(i+4);
				String wantSnapshot = (String)data.get(i+5);
				String runmode = (String)data.get(i+6);
				String continueOnError = (String)data.get(i+7);
				System.out.println(timestamp+" Keyword name is "+keyword);
				System.out.println(timestamp+" Runmode is "+runmode);
				System.out.println(timestamp+" Test Data is "+value);
				System.out.println(timestamp+" First object name is "+object1+" and property value is "+prop.getProperty(object1));
				System.out.println(timestamp+" Second object name is "+object2+" and property value is "+prop.getProperty(object2));
				System.out.println(timestamp+" Want snapshot is "+wantSnapshot);
				if(wantSnapshot.equals("Yes")) {
					System.out.println(timestamp+" Taking SnapShot");
					System.out.println(timestamp+" Snapshot path is "+snapshotPath+keyword+".png");
					}else {
						System.out.println(timestamp+" Value of Want Snaphot is No. No Need to Take Snapshot");
					}
				System.out.println();
				if(runmode.equals("Yes")) {
					key.ClickButton(object1, snapshotPath, keyword, wantSnapshot, continueOnError);
				}
			}
		}
		for(int i=0; i<data.size();i++) {
			if(data.get(i).equals("SwitchToLightning")){
				String keyword = (String)data.get(i);
				String value = (String)data.get(i+1);
				String object1 = (String)data.get(i+2);
				String object2 = (String)data.get(i+3);
				String snapshotPath = (String)data.get(i+4);
				String wantSnapshot = (String)data.get(i+5);
				String runmode = (String)data.get(i+6);
				System.out.println(timestamp+" Keyword name is "+keyword);
				System.out.println(timestamp+" Runmode is "+runmode);
				System.out.println(timestamp+" Test Data is "+value);
				System.out.println(timestamp+" First object name is "+object1+" and property value is "+prop.getProperty(object1));
				System.out.println(timestamp+" Second object name is "+object2+" and property value is "+prop.getProperty(object2));
				System.out.println(timestamp+" Want snapshot is "+wantSnapshot);
				if(wantSnapshot.equals("Yes")) {
					System.out.println(timestamp+" Taking SnapShot");
					System.out.println(timestamp+" Snapshot path is "+snapshotPath+keyword+".png");
					}else {
						System.out.println(timestamp+" Value of Want Snaphot is No. No Need to Take Snapshot");
					}
				if(runmode.equals("Yes")) {
				   key.SwitchToLightning(object1, snapshotPath, keyword, wantSnapshot);
				}
				System.out.println();
			}
		}
		for(int i=0; i<data.size();i++) {
			if(data.get(i).equals("LauchAppAndClickViewAll")){
				String keyword = (String)data.get(i);
				String value = (String)data.get(i+1);
				String object1 = (String)data.get(i+2);
				String object2 = (String)data.get(i+3);
				String snapshotPath = (String)data.get(i+4);
				String wantSnapshot = (String)data.get(i+5);
				String runmode = (String)data.get(i+6);
				System.out.println(timestamp+" Keyword name is "+keyword);
				System.out.println(timestamp+" Runmode is "+runmode);
				System.out.println(timestamp+" Test Data is "+value);
				System.out.println(timestamp+" First object name is "+object1+" and property value is "+prop.getProperty(object1));
				System.out.println(timestamp+" Second object name is "+object2+" and property value is "+prop.getProperty(object2));
				System.out.println(timestamp+" Want snapshot is "+wantSnapshot);
				if(wantSnapshot.equals("Yes")) {
					System.out.println(timestamp+" Taking SnapShot");
					System.out.println(timestamp+" Snapshot path is "+snapshotPath+keyword+".png");
					}else {
						System.out.println(timestamp+" Value of Want Snaphot is No. No Need to Take Snapshot");
					}
				System.out.println();
				if(runmode.equals("Yes")) {
					key.LauchAppAndClickViewAll(object1, object2, snapshotPath, keyword, wantSnapshot);
				}
			}
		}
		for(int i=0; i<data.size();i++) {
			if(data.get(i).equals("LaunchApp")){
				String keyword = (String)data.get(i);
				String value = (String)data.get(i+1);
				String object1 = (String)data.get(i+2);
				String object2 = (String)data.get(i+3);
				String snapshotPath = (String)data.get(i+4);
				String wantSnapshot = (String)data.get(i+5);
				String runmode = (String)data.get(i+6);
				String continueOnError = (String)data.get(i+7);
				System.out.println(timestamp+" Keyword name is "+keyword);
				System.out.println(timestamp+" Runmode is "+runmode);
				if(runmode.equals("Yes")) {
					key.ClickButton(object1, snapshotPath, keyword, wantSnapshot, continueOnError);
				System.out.println(timestamp+" Test Data is "+value);
				System.out.println(timestamp+" First object name is "+object1+" and property value is "+prop.getProperty(object1));
				System.out.println(timestamp+" Second object name is "+object2+" and property value is "+prop.getProperty(object2));
				System.out.println(timestamp+" Want snapshot is "+wantSnapshot);
				if(wantSnapshot.equals("Yes")) {
					System.out.println(timestamp+" Taking SnapShot");
					System.out.println(timestamp+" Snapshot path is "+snapshotPath+keyword+".png");
					}else {
						System.out.println(timestamp+" Value of Want Snaphot is No. No Need to Take Snapshot");
					}
				}else {
					System.out.println(timestamp+" Keyword skipped during execution as its runmode value is NO");
				}
				System.out.println();
			}
		}
		for(int i=0; i<data.size();i++) {
			if(data.get(i).equals("ClickViewAll")){
				String keyword = (String)data.get(i);
				String value = (String)data.get(i+1);
				String object1 = (String)data.get(i+2);
				String object2 = (String)data.get(i+3);
				String snapshotPath = (String)data.get(i+4);
				String wantSnapshot = (String)data.get(i+5);
				String runmode = (String)data.get(i+6);
				String continueOnError = (String)data.get(i+7);
				System.out.println(timestamp+" Keyword name is "+keyword);
				System.out.println(timestamp+" Runmode is "+runmode);
				if(runmode.equals("Yes")) {
					key.ClickButton(object1, snapshotPath, keyword, wantSnapshot, continueOnError);
				System.out.println(timestamp+" Test Data is "+value);
				System.out.println(timestamp+" First object name is "+object1+" and property value is "+prop.getProperty(object1));
				System.out.println(timestamp+" Second object name is "+object2+" and property value is "+prop.getProperty(object2));
				System.out.println(timestamp+" Want snapshot is "+wantSnapshot);
				if(wantSnapshot.equals("Yes")) {
					System.out.println(timestamp+" Taking SnapShot");
					System.out.println(timestamp+" Snapshot path is "+snapshotPath+keyword+".png");
					}else {
						System.out.println(timestamp+" Value of Want Snaphot is No. No Need to Take Snapshot");
					}
				}else {
					System.out.println(timestamp+" Keyword skipped during execution as its runmode value is NO");
				}
				System.out.println();
			}
		}
		for(int i=0; i<data.size();i++) {
			if(data.get(i).equals("ScrollToElementofPage")){
				String keyword = (String)data.get(i);
				String value = (String)data.get(i+1);
				String object1 = (String)data.get(i+2);
				String object2 = (String)data.get(i+3);
				String snapshotPath = (String)data.get(i+4);
				String wantSnapshot = (String)data.get(i+5);
				String runmode = (String)data.get(i+6);
				System.out.println(timestamp+" Keyword name is "+keyword);
				System.out.println(timestamp+" Runmode is "+runmode);
				System.out.println(timestamp+" Test Data is "+value);
				System.out.println(timestamp+" First object name is "+object1+" and property value is "+prop.getProperty(object1));
				System.out.println(timestamp+" Second object name is "+object2+" and property value is "+prop.getProperty(object2));
				System.out.println(timestamp+" Want snapshot is "+wantSnapshot);
				if(wantSnapshot.equals("Yes")) {
					System.out.println(timestamp+" Taking SnapShot");
					System.out.println(timestamp+" Snapshot path is "+snapshotPath+keyword+".png");
					}else {
						System.out.println(timestamp+" Value of Want Snaphot is No. No Need to Take Snapshot");
					}
				System.out.println();
				if(runmode.equals("Yes")) {
					key.ScrollToElementofPage(object1, snapshotPath, keyword, wantSnapshot);
				}
			}
		}
		for(int i=0; i<data.size();i++) {
			if(data.get(i).equals("ClickLeads")){
				String keyword = (String)data.get(i);
				String value = (String)data.get(i+1);
				String object1 = (String)data.get(i+2);
				String object2 = (String)data.get(i+3);
				String snapshotPath = (String)data.get(i+4);
				String wantSnapshot = (String)data.get(i+5);
				String runmode = (String)data.get(i+6);
				String continueOnError = (String)data.get(i+7);
				System.out.println(timestamp+" Keyword name is "+keyword);
				System.out.println(timestamp+" Runmode is "+runmode);
				System.out.println(timestamp+" Test Data is "+value);
				System.out.println(timestamp+" First object name is "+object1+" and property value is "+prop.getProperty(object1));
				System.out.println(timestamp+" Second object name is "+object2+" and property value is "+prop.getProperty(object2));
				System.out.println(timestamp+" Want snapshot is "+wantSnapshot);
				if(wantSnapshot.equals("Yes")) {
					System.out.println(timestamp+" Taking SnapShot");
					System.out.println(timestamp+" Snapshot path is "+snapshotPath+keyword+".png");
					}else {
						System.out.println(timestamp+" Value of Want Snaphot is No. No Need to Take Snapshot");
					}
				System.out.println();
				if(runmode.equals("Yes")) {
					key.ClickButton(object1, snapshotPath, keyword, wantSnapshot, continueOnError );
				}
			}
		}
		for(int i=0; i<data.size();i++) {
			if(data.get(i).equals("ClickNew")){
				String keyword = (String)data.get(i);
				String value = (String)data.get(i+1);
				String object1 = (String)data.get(i+2);
				String object2 = (String)data.get(i+3);
				String snapshotPath = (String)data.get(i+4);
				String wantSnapshot = (String)data.get(i+5);
				String runmode = (String)data.get(i+6);
				String continueOnError = (String)data.get(i+7);
				System.out.println(timestamp+" Keyword name is "+keyword);
				System.out.println(timestamp+" Runmode is "+runmode);
				System.out.println(timestamp+" Test Data is "+value);
				System.out.println(timestamp+" First object name is "+object1+" and property value is "+prop.getProperty(object1));
				System.out.println(timestamp+" Second object name is "+object2+" and property value is "+prop.getProperty(object2));
				System.out.println(timestamp+" Want snapshot is "+wantSnapshot);
				System.out.println(timestamp+" Continue On Error is "+continueOnError);
				if(wantSnapshot.equals("Yes")) {
					System.out.println(timestamp+" Taking SnapShot");
					System.out.println(timestamp+" Snapshot path is "+snapshotPath+keyword+".png");
					}else {
						System.out.println(timestamp+" Value of Want Snaphot is No. No Need to Take Snapshot");
					}
				System.out.println();
				if(runmode.equals("Yes")) {
					key.ClickButton(object1, snapshotPath, keyword, wantSnapshot, continueOnError);
				}
			}
		}
		for(int i=0; i<data.size();i++) {
			if(data.get(i).equals("CloseAllBrowsers")){
				String keyword = (String)data.get(i);
				String wantSnapshot = (String)data.get(i+5);
				String runmode = (String)data.get(i+6);
				System.out.println(timestamp+" Keyword name is "+keyword);
				System.out.println(timestamp+" Runmode is "+runmode);
				if(runmode.equals("Yes")) {
					key.CloseAllBrowsers();
				}
			}
		}
	}
	}
//Vikas Sharma Test 1




  