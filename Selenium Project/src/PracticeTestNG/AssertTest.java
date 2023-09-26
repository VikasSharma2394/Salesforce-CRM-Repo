package PracticeTestNG;

public class AssertTest {
public static void main(String[] args) {
	int age =10;
	try {
	assert age>61;
	System.out.println("Register Yourself");
		//System.out.println(e);
		System.out.println("Too Young To Register");
	}catch(AssertionError e) {
		System.out.println(e);
		System.out.println("Too Young To Register");
	}
	finally{
		System.out.println("Finally Executed");
	}
}
}
