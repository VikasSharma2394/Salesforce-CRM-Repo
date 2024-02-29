package PracticeFolder;

public class Prime_Number {
	static int num = 23;
	static boolean flag = false;
		public static boolean findPrimeNumberStatus(){
		for(int i=2; i<=num/2;i++) {
			if(num%i==0) {
				flag = true;
				break;
		  }
		}
		if(flag==false) {
			System.out.println(num+" is a prime number");
		}else {
			System.out.println(num+" is not a prime number");
		}
		return flag;
		}
		public static void main(String[] args) {
			System.out.println("Main Says "+findPrimeNumberStatus());
	}

}
