package PracticeTestNG;

public class ArrayTest {
	public static void main(String[] args) {
		String test = "Vikas";
		System.out.println(test.length());
		String s [] = new String[3];
		s[0]="Vikas";
		s[1]="Vikas1";
		s[2]="Vikas2";
		System.out.println(s.length);
		String [] getArrayValue = ArrayTest.Test();
		for(String y:getArrayValue) {
			System.out.println(y);
		}
		for(String x:s) {
			System.out.println(x);
		}
		for(int i=0; i<s.length; i++) {
			s[2]="Pinky";
			System.out.println(s[i]);
		}
		for(int j=0;j<=s.length-1;j++) {
			System.out.println(s[j]);
		}
	}
	public static String [] Test() {
		String [] v = {"Test1","Test2","Test3"};
		return v;
	}
}
