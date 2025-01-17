package test;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int []x = new int[6];
		for(int i=0; i<x.length; i++) {
			System.out.println("1~100 사이의 숫자 입력");
			int input = scan.nextInt();
			if(input<=100 && input>0 && input%5!=0) {
				x[i]=input;
			} else {
				i--;
			}
		}
		System.out.println(Arrays.toString(x));
	}

}
