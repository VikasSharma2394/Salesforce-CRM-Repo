package PracticeFolder;

public class EvenOdd_Test {
	static int evenCount;
	static int oddCount;
	public static void main(String[] args) {
		int [] a = {1,2,3,4,2,6,7,8,9};
		for(int i =0;i<=a.length-1;i++) {
			if(a[i]%2==0) {
				evenCount++;
			}else {
				oddCount++;
			}
		}
		System.out.println("Even number count is "+evenCount);
		System.out.println("Odd number count is "+oddCount);
		EvenOdd_Test e = new EvenOdd_Test();
		e.getEvenOddStatus();
		String s = "Vikas";
		String s1 = " Sharma";
		String s3 = s+s1;
		System.out.println(s3);
	}
	public void getEvenOddStatus() {
		int j = 25;
		if(j%2==0) {
			System.out.println(j+" is even");
		}else {
			System.out.println(j+" is odd");
		}
	}

}
