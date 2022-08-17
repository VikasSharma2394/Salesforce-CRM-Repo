import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;


public class ReadDataFromPDF {
public static void main(String[] args) throws IOException {
	String text1 =null;
	String path = "C:\\Users\\vikas.sharma\\Downloads\\SO-0000154 (1).pdf";
	PDDocument doc = PDDocument.load(new File(path));
	text1 = (new PDFTextStripper().getText(doc));
	text1 = text1.trim().replaceAll("[\\t\\n\\r]+","");
	text1 = text1.trim().replaceAll("  ", " ");
	System.out.println(text1);
	String userText = "MNT-LIrtC-SCFG-VE-100K-1-9";
	userText = userText.trim().replaceAll("[\\t\\n\\r]+","");
	userText = userText.trim().replaceAll("  ", " ");
	System.out.println("User text is **************** "+userText);
	if(text1.contains(userText)) {
		System.out.println(true);
	}else {
		System.out.println(false);
	}
}
}
