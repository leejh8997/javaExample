package day05;

import java.util.Arrays;

public class SelectionSort1 {

	public static void main(String[] args) {
		
		// 가장 작은 수 찾아서 첫번째로 바꾸기
		int arr[] = {3,5,2,1,4};
		int minIndex =0;
		
		for(int j=1; j<arr.length; j++) {
			if(arr[j] > arr[minIndex]) {
				minIndex = j;
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[0];
			arr[0] = minIndex;
		}
	}

}
 