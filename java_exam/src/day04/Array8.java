package day04;

import java.util.Arrays;
import java.util.Scanner;

public class Array8 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 몇개 저장하시겠습니까?");
		int size;
		int arr[];
		while(true) {
			size = scan.nextInt();
			if(size < 1) {
				System.out.print("1이상의 수를 입력하세요.");	
			} 
			else {
				break;
			} 
			
		}
		arr = new int[size];   // int arr[] = new int[scan.nextInt()];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1) + "번째 숫자 입력 : ");
//			int input = scan.nextInt();
//			if(input>0) {arr[i] = input;}
//			else {
//				System.out.println("양수를 입력해주세요")
//				i--;
//			}
			arr[i] = scan.nextInt();
			if(arr[i] <= 0) {
				System.out.println("양수를 입력하세요.");
				i--;	
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		scan.close();
	}

}
