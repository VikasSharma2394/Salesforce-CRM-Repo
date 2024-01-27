package Practice_Nov;

public class reverseStringAndChangeCase {
	static String s = "Vikas";
	static String reverse="";
	public static void revrseString(){
	for(int i=s.length()-1;i>=0;i--){
	reverse = reverse + s.charAt(i);
	}
	}
	public static void changeCase(){
	int index = reverse.indexOf("s");
	String newInput = reverse.replace(reverse.charAt(index), Character.toUpperCase(reverse.charAt(index)));
	System.out.println("New String is "+newInput);
	}
	public static void main(String [] args){
	revrseString();
	changeCase();
	}
}
