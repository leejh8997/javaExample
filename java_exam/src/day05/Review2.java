package day05;

import java.util.Arrays;

public class Review2 {

	public static void main(String[] args) {
		
		int arr[] = {3, 4, 10, 2, 4};		
		int sum = 0;	
		int max = arr[0];
		int maxIndex = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			sum += arr[i];
			// 가장 큰 값
			if(max < arr[i]) {
				max = arr[i];
			}
			// 가장 큰 값의 위치
			if(max < arr[i]) {
				maxIndex = i;
			}
		}
	}

}
