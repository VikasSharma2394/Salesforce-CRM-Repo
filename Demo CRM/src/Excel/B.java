package Excel;

interface B {
	default void f() {
		System.out.println("A");
	}
}
public class Test implements B{
	public static void main(String[] args)throws Exception {
		new Test().f();
	}
	@Override
	public void f() {
		System.out.println("B");
	}
}
		
