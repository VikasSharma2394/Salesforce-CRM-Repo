package PracticeTestNG;

public class CountNumberOfConsonants {
	static String s = "I will take a leave today";
	static int countConsonants = 0;
	static int countVowels = 0;
	public static int getNumberOfConsonants() {
		for(int i=0; i<=s.length()-1; i++) {
			char ch = s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				countVowels++;
			}else if(ch!=' '){
				countConsonants++;
			}
		}
		return countConsonants;
	}
	public static void main(String[] args) {
		System.out.println("Consonants count is "+getNumberOfConsonants());
		System.out.println("Vowels count is "+countVowels);
	}
}
