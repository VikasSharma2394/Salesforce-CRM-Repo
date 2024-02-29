package InheritanceTest;

public class parentClass extends childClass {
	int i = 20;
	public void Test() {
		System.out.println();
	}
	void Test4() {
		
	}
	public static void main(String[] args) {
		parentClass p =  new parentClass();
		System.out.println(p.i);
		childClass c = new childClass();
		System.out.println(c.i);
	}
}
