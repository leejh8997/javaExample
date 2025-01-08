package day5;

import java.util.Arrays;

public class SelectionSort2 {

	public static void main(String[] args) {
		
		// 선택정렬 오름차순
		int arr[] = {3,2,5,4,1};
		
		for(int i=0;i<arr.length-1;i++) {
			int minIndex = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
