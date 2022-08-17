package Practice;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ReadExcel {
	public static void main(String[] args) throws Exception {
		
	
	ArrayList a = new ArrayList();
	FileInputStream file = new FileInputStream("C:\\Users\\vikas.sharma\\Desktop\\LeadSuite.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook(file);
	XSSFSheet sheet = wb.getSheet("TestData");
	Iterator itr = sheet.iterator();
	while (itr.hasNext()) {
		Row rowitr = (Row)itr.next();
	  Iterator cellitr = rowitr.cellIterator();
	  while(cellitr.hasNext()) {
		  Cell celldata = (Cell)cellitr.next();
		  switch(celldata.getCellType()) {
		  case STRING:
			  a.add(celldata.getStringCellValue());
			  break;
		  case NUMERIC:
			  a.add(celldata.getNumericCellValue());
			  break;
		  case BOOLEAN:
			  a.add(celldata.getBooleanCellValue());
			  break;
		  }
	  }
	}
	System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\SSTS\\OpKey\\OpKey Execution Agent\\AgentData\\Plugins\\libs\\Drivers\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://cresconnect.crestechglobal.com/");
	driver.manage().window().maximize();
	WebElement loginForm = driver.findElement(By.xpath("//form[@id=\'frmSignIn\']//*[@type='text']"));
	loginForm.sendKeys("vikas.sharma@sstsinc.com");
	loginForm.sendKeys("7503197340@Vs");
	driver.wait(5000);
	driver.quit();
	}
}
