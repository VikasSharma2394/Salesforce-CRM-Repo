package PracticeFolder;

public class CountEvenNumbers {
	static int countEvenNumber;
	static int countOddNumber;
	static int [] a = {1,4,2,5,6,7,9,};
	public static int getEvenNumbersCount(){
	for(int i=0;i<=a.length-1;i++){
	if(a[i]%2==0){
	countEvenNumber++;
	}else{
	countOddNumber++;
	}
	}
	return countEvenNumber;
	}
	public static void main(String [] args){
	System.out.println("Even number count is "+getEvenNumbersCount());
	}
}
