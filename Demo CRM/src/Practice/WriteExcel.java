package Practice;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
	public static void main(String[] args)throws Exception {
		XSSFWorkbook wrk = new XSSFWorkbook();
		XSSFSheet sheet = wrk.createSheet("Vikas");
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("Test");
		Cell cell01 = row.createCell(1);
		cell01.setCellValue(123);
		Row row1 = sheet.createRow(1);
		Cell cell1 = row1.createCell(0);
		cell1.setCellValue("Opkey");
		wrk.write(new FileOutputStream("C:\\Users\\vikas.sharma\\Desktop\\Utility.xlsx"));
		wrk.close();
		
	}

}
