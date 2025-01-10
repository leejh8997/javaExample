package day04;

import java.util.Arrays;

public class Array7 {

	public static void main(String[] args) {
		
		int arr[] = {1, 4, 5, 2, 3};
		int maxIndex = 0;
		int minIndex = 0;
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > arr[maxIndex]) {
				// 가장 큰 값의 위치
				maxIndex = i;
			}
		}
		for(int i=1; i<arr.length; i++) {
			// 가장 작은 값의 위치
			minIndex = arr[i] < arr[minIndex] ? i : minIndex;
		}
		System.out.println(Arrays.toString(arr));
		int temp = arr[maxIndex];
		arr[maxIndex] = arr[minIndex];
		arr[minIndex] = temp;
		// {1, 4, 5, 2, 3}
		// {5, 4, 1, 2, 3}
		System.out.println((maxIndex+1) + "번째 숫자가 가장 크다");
		System.out.println((minIndex+1) + "번째 숫자가 가장 작다");
		System.out.println(Arrays.toString(arr));
	}
}
