package day05;

import java.util.Arrays;

public class SelectionSort3 {

	public static void main(String[] args) {
		
		//배열에서 가장 작은 수를 찾아서
		//인덱스 0번째 값이랑 위치 변경
		int arr[] = {3,5,2,1,4};
		
		for(int x=0; x<arr.length-1; x++) {
			int index = x;
			for(int i=x+1; i<arr.length;i++) {
				if(arr[i] < arr[index]) {
					index = i;
				}
			}
			int temp = arr[x];
			arr[x] = arr[index];
			arr[index] = temp;
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
