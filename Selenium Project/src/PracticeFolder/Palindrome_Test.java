package PracticeFolder;

public class Palindrome_Test {
	static String s = "madam";
	static String reverse = "";
	static int j = s.length()-1;
	static int count = 0;
	public void palindromeTest() {
		for(int i=s.length()-1;i>=0;i--) {
			reverse = reverse + s.charAt(i);
		}
		if(s.equalsIgnoreCase(reverse)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}
	public void palindromeTestWithCount() {
		for(int i=0; i<=s.length()-1;i++) {
			if(s.charAt(i)==s.charAt(j--)) {
				count++;
			}
		}
		if (count==s.length()) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}
	public static void main(String[] args) {
		Palindrome_Test p = new Palindrome_Test();
		//p.palindromeTest();
		p.palindromeTestWithCount();
	}
}
