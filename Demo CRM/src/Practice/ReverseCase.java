package Practice;

public class ReverseCase {
	public static void main(String[] args) {
		String s1 = "Test";
		String input = "";
		int size = s1.length()-1;
		for(int i=size;i>=0;i--) {
			input = input + s1.charAt(i);
		}
		int index = input.indexOf('t');
		int index1 = input.indexOf("T");
		String newInput = input.replace(input.charAt(index), Character.toUpperCase(input.charAt(index)));
		System.out.println(newInput);
		String newInput1 = newInput.replace(newInput.charAt(index1), Character.toLowerCase(newInput.charAt(index1)));
		System.out.println(newInput1);
}
}