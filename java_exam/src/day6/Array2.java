package day6;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		
		// 음수를 제거하고 양수만 있는 배열 생성
		int arr[] = {3, 5, -4, -10, 8, -5, 6, 2};
		
		int size = 0;
		
		for(int num : arr) {
			if(num > 0) {
				size++;
			}
		}

		int arr2[] = new int[size];
		int index = 0;
		
		for(int num : arr) {
			if(num > 0) {
				arr2[index++] = num;
			}
		}
		System.out.println(Arrays.toString(arr2));
	}

}
