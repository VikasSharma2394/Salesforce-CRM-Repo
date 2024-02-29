package PracticeTestNG;

import java.io.File;

public final class CodeTest {
	static String s = "I code Java";
	public static void main(String[] args){
	char [] input = s.toCharArray();
	char [] result = new char[input.length];
	for(int i=0; i<input.length; i++){
	if(input[i]==' '){
	result[i]=' ';
	}
	}
	int j = input.length-1;
	for(int i=0; i<input.length; i++){
	if(input[i]!=' '){
	if(result[j]==' '){
	j--;
	}
	result[j]=input[i];
	j--;
	}
	}
	System.out.println(String.valueOf(result));
	}
	}
