package day6;

import java.util.Arrays;

public class Array3 {

	public static void main(String[] args) {
		// 음수 양수 상관없이 절대값 순서대로 재배열
		int arr[] = {3, 5, -4, -10, 8, -15, 6, 2};
		
		// 선택정렬
		for(int i=0; i<arr.length-1; i++) {
			int index = i;
			for(int j=i+1;j<arr.length; j++) {
				int orgNum = arr[j] > 0 ? arr[j] : -arr[j];
				int indexNum = arr[index] > 0 ? arr[index] : -arr[index];
				if(orgNum < indexNum) {
					index = j;
				}
				
				// 제곱연산으로 비교
//				if(arr[j]*arr[j] < arr[index]*arr[index]) {
//					index = j;
//				}
				
				// Math연산
//				if(Math.abs(arr[j]) < Math.abs(arr[index])) {
//					index = j;
//				}
			}
			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
		
		// 버블정렬
//		for(int i=arr.length-1; i>0; i--) {
//			for(int j=0; j<i; j++) {
//				int abs1 = arr[j] > 0 ? arr[j] : -arr[j];
//				int abs2 = arr[j+1] > 0 ? arr[j+1] : -arr[j+1];
//				if(abs1>abs2) {
//					int temp=arr[j+1];
//					arr[j+1]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
		
		
		System.out.println(Arrays.toString(arr));

	}

}
