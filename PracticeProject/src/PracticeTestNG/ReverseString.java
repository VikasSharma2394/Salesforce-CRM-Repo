package PracticeTestNG;

public class ReverseString {
	static String s = "My name is Vikas";
public static void main(String[] args) {	
	char input[] = s.toCharArray();
	char res[] = new char[input.length];
	for(int i=0;i<input.length;i++) {
		if(input[i]==' ') {
			res[i]=' ';
		}
	}
	int j = input.length-1;
	for(int i=0;i<input.length;i++) {
		if(input[i]!=' ') {
			if(res[j]==' ') {
				j--;
			}
			res[j]=input[i];
			j--;
		}
	}
	System.out.println(String.valueOf(res));
}
}
