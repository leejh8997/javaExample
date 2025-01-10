package day06;

public class Array1 {

	public static void main(String[] args) {
		
		// for - each문
		int arr[] = {3,5,2,1,4};
		int sum = 0;
		for(int num : arr) {
			sum += num;
		}
//		for(int i=0; i<arr.length; i++) {
//			sum += arr[i];
//		}
		System.out.println(sum);
	}

}
