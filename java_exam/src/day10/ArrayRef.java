package day10;

import java.util.Arrays;

public class ArrayRef {

	public static void main(String[] args) {
		
		
		int arr[] = {1,3,5,4,2};
		
//		int arr2[] = arr;
//		arr2[3] = 100;
//		System.out.println(arr[3]);
//		int max = ArrayClass.maxValue(arr);
//		System.out.println(max);
//		
//		int index = ArrayClass.maxIndex(arr);
//		System.out.println(index);
		
		ArrayClass.changeArr(arr);
		int min = ArrayClass.minValue(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(min);
		
	}
	
	
	// 배열에서 가장 큰 값의 위치를 찾는(리턴) 메소드
}
