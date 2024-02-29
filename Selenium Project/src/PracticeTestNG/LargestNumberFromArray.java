package PracticeTestNG;

public class LargestNumberFromArray  {
	static int a [] = {3,5,2,1,9,0,2,3};
	static int temp;
	static int smallestNumber;
	static int largestNumber;
	public static int getLargestNumber () {
		for(int i=0; i<=a.length-1;i++) {
			for(int j=i+1; j<=a.length-1;j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return largestNumber =  a[a.length-1];
	}
	public static void main(String[] args) {
		System.out.println("Largest number is "+getLargestNumber());
		System.out.println("Smallest number is "+getSmallestNumber());
	}
	public static int getSmallestNumber() {
		for(int i=0; i<=a.length-1;i++) {
			for(int j=i+1; j<=a.length-1;j++) {
				if(a[i]<a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			for(int x:a) {
				System.out.println(x);
			}
		}if(a[a.length-2]<a[a.length-1]) {
			smallestNumber =a[a.length-2];
		}else {
			smallestNumber =a[a.length-1];
		}
		return smallestNumber;
	}
}
