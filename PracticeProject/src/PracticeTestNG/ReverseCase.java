package PracticeTestNG;

public class ReverseCase {
	public static void main(String[] args) {
	String input = "inpUtu";
	String reverse = "";
	int size = input.length()-1;
	for(int i=size;i>=0;i--) {
		reverse = reverse + input.charAt(i);
	}
	System.out.println(reverse);
	int index = reverse.indexOf("p");
	String newInput = reverse.replace(reverse.charAt(index), Character.toUpperCase(reverse.charAt(index)));
	System.out.println(newInput);
	int index1 = newInput.indexOf("U");
	String newInput1 = newInput.replace(newInput.charAt(index1), Character.toLowerCase(newInput.charAt(index1)));
	System.out.println(newInput1);
	}
}
