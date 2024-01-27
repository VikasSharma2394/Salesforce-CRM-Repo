package PracticeFolder;

public class Prime_Number {
		public static void findPrimeNumberStatus(){
		int num = 5;
		boolean flag = false;
		for(int i=2; i<=num/2;++i) {
			if(num %i==0) {
				flag = true;
				break;
		  }
		}
		if(flag==false) {
			System.out.println(num+" is a prime number");
		}else {
			System.out.println(num+" is not a prime number");
		}
		}
		public static void main(String[] args) {
			findPrimeNumberStatus();
	}

}
