package day04;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		

		//5개의 공간을 가지는 arr 배열 선언
		//인덱스는 0부터 시작, 최대는 선언 값-1 까지
//		int arr[] = new int[5];  		//int []arr = new int[5];
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
		// arr[] = {10,20,30,40,50};
//		System.out.println(Arrays.toString(arr));
		
		int arr[] = {10,20,30,40,50};
//		System.out.println(arr[3]);
//		System.out.println(arr.length);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
