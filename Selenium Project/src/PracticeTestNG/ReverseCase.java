package PracticeTestNG;


public class ReverseCase {
	public static void main(String[] args) {
	String input = "I code Java";
	String reverse = "";
	int size = input.length()-1;
	for(int i=size;i>=0;i--) {
		reverse = reverse + input.charAt(i);
	}
	System.out.println(reverse);
	int index = reverse.indexOf("a");
	int index1 = reverse.indexOf("J");
	String newInput = reverse.replace(reverse.charAt(index), Character.toUpperCase(reverse.charAt(index)));
	String newInput1 = newInput.replace(newInput.charAt(index1), Character.toLowerCase(newInput.charAt(index1)));
	System.out.println(newInput1);
	}
}
