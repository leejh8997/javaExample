package day4;

public class Array3 {

	public static void main(String[] args) {
		//배열의 합, 가장 큰 값 구하기
		int arr[] = {3, 5, 12, 7, 10};
		int sum = 0;		
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			sum += arr[i];
			if(arr[i]>max) {max=arr[i];}
			
		}
		System.out.println(sum);
		System.out.println(max);
	}

}
