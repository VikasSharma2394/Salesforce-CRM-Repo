package PracticeTestNG;

public class Test1 {
	static String s = "aeiou";
	static int count = 0;
	static int count1 = 0;
	public static void main(String[] args) {
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			}else if(ch!=' ') {
				count++;
			}
		}
		System.out.println("Total numbers of consonants are "+count);
		Test1 t = new Test1();
		int value = t.findVowels();
		System.out.println("Total number of vowels are "+value);
	}
	public int findVowels() {
		for(int j=0;j<s.length();j++) {
			char ch = s.charAt(j);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count1++;
			}
		}return count1;
	}
}
