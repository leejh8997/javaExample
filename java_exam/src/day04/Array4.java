package day04;

import java.util.Arrays;
import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];
		int max = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1) + "번째 값 입력 : ");
			arr[i] = scan.nextInt();
			max = arr[i] > max ? arr[i] : max;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(max);
	}

}
