
public class Test {
	public static void main(String[] args) {
		String s1 = "Test";
		String reverse = "";
		int size = s1.length()-1;
		for(int i=size;i>+0;i--) {
			reverse = reverse + s1.charAt(0);
		}
		System.out.println(reverse);
	}
}
