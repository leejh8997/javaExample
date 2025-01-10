package day04;

import java.util.Arrays;
import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
		
		// 5개의 숫자를 입력받아서 배열에 저장
		// 0이나 음수가 입력되면 배열에 저장하지 않고
		// 다시 입력받도록
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];
		int max = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1) + "번째 값 입력 : ");
			int input = scan.nextInt();
			if(input > 0) {
				arr[i] = input;
			}
			else {
				System.out.println("0보다 큰 값을 입력하세요.");
				i--;
			}
			
			max = arr[i] > max ? arr[i] : max;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(max);
	}

}
