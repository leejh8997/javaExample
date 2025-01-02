package day5;

import java.util.Arrays;

public class Array3_bubble {
	//버블정렬 오름차순
	public static void main(String[] args) {
		
		int arr[] = {9,8,4,7,2};
		for(int i=arr.length-1; i>0; i--) {
			
			for(int j=0; j<i; j++) {
				if(arr[j] > arr[j+1] ) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
//		Arrays.sort(arr);    <= 자동 정렬
		System.out.println(Arrays.toString(arr));
		
	}

}
// 89472/84972/84792/8472*9
// 48729/47829/47289
// 47289/42789
// 24789