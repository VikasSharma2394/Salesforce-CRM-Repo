import java.io.File;
import java.io.IOException;



public class ReadDataFromPDF {
public static void main(String[] args) throws IOException {
	String text1 =null;
	String path = "C:\\Users\\vikas.sharma\\Downloads\\SO-0000154 (1).pdf";
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
