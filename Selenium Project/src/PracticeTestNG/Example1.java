package PracticeTestNG;

public class Example1 {
	public static void main(String[] args) {
		String s = "Test1234";
		String [] s1 = s.split("t");
		System.out.println("Splited Output is "+s1[1]);
		System.out.println(s.replace("Test", ""));
	}

}
