package PracticeTestNG;

public class childInterface implements parentInterface {
	public void Test() {
		System.out.println("Interface method Implemented");
	}
	public static void main(String[] args) {
	    int i = 30;
	    System.out.println(childInterface.i);
	    System.out.println(i);
		childInterface child = new childInterface();
		child.Test();
	}
}
