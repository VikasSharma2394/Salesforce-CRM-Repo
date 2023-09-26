package PracticeFolder;

public class IIB {
	int j =20;
	{
		int i =10;
		System.out.println(i);
	}
	public static void main(String[] args) {
		IIB i = new IIB();
		i.Test();
		String s = "Vikas";
		System.out.println(s.concat(" Sharma"));
	}
	public void Test() {
		System.out.println(this.j);
	}
}
