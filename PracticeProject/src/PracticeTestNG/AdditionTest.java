package PracticeTestNG;

public class AdditionTest {
	static int a = 30;
	static int b = 40;
	static int sum = a+b;
	public static void Addition(int a, int b) {
		int sum = a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		Addition(6, 7);
		sum = a+b;
		System.out.println(sum);
	}
}
