package PracticeTestNG;

public class UseOfArrayInMethod {
	public static void main(String[] args){
		UseOfArrayInMethod a = new UseOfArrayInMethod();
		UseOfArrayInMethod a1 = new UseOfArrayInMethod();
		a1 = null;
		System.gc();
		Object [] data = a.arrayTest();
		for(Object x:data){
		System.out.println(x);
		}
		for(int i=0; i<=data.length-1; i++) {
			System.out.println(data[i]);
		}
		}
		public Object [] arrayTest(){
        Object [] array = new Object[4];
		array[0] = 10;
		array[1] = 11;
		array[2] = "Vikas Sharma";
		array[3] = 13.45;
		return array;
		}
		protected void finalize() {
			System.out.println("From Finalize");
		}
}
