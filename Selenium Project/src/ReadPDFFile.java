import java.io.IOException;

import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

public class ReadPDFFile {
	public static void main(String[] args) throws IOException {
		PdfReader reader = new PdfReader("C:\\Users\\vikas.sharma\\Downloads\\SO-0000154 (1).pdf");
		int numberOfPages = reader.getNumberOfPages();
		for(int i=1; i<=numberOfPages; i++) {
		System.out.println("*****************Page Number "+ i+"******************");
		String textFromPage = PdfTextExtractor.getTextFromPage(reader, i);
		String myText = textFromPage.trim().replaceAll("[\\t\\n\\r]+","");
		String newText = myText.trim().replaceAll("  "," ");
		System.out.println(newText);
		String userText = "SteelTest Flowrte Gateway Virtual Edition\r\n"
				+ "100K FPM License; 1-9 users\r\n"
				+ "Billing Frequency : Annually\r\n"
				+ "Start Date : 6/7/2023 - End Date : 5/7/2024";
		userText = userText.trim().replaceAll("[\\t\\n\\r]+","");
		userText = userText.trim().replaceAll("  "," ");
		System.out.println(userText);
		System.out.println(textFromPage);
		if(newText.contains(userText)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		}
	}

}

