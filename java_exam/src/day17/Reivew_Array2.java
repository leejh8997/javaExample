package day17;

import java.util.Arrays;

public class Reivew_Array2 {

	public static void main(String[] args) {
		
		int arr[] = {1,5,4,2,6,3};
		
//		for(int i=0;i<arr.length-1;i++) {
//			int index = i;
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[index]>arr[j]) {
//					index = j;
//				}
//			}
//			int temp = arr[index];
//			arr[index] = arr[i];
//			arr[i] = temp;
//		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
