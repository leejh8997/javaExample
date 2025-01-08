package day4;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		
//		1. 스캐너를 통해 양수 5개를 입력받고
//		입력 받은 수 중에서 가장 작은 수, 큰 수, 평균을 구하시오.
		
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int min = 0;
		int max = 0;
		int count = 0;
		
		System.out.println("양의 정수 5개를 입력하시오.");

		
		for(int i=1; i<=5; i++) {
			System.out.print(i + "번째 숫자 입력 : ");
			int input = scan.nextInt();
			sum += input;
			if(i==1){
				min = input;
				max = input;
				} else {
					if(input>max) {
						max = input;
					} else {
						min = input;
					}
				}
			// max = Math.max(max, input);
			// min = Math.min(min, input);
			count++;
		}
		
		System.out.println("가장 큰 수는 " + max + " 입니다.");
		System.out.println("가장 작은 수는 " + min + " 입니다.");
		System.out.println("입력한 수의 평균은 " + ((double) sum/count) + " 입니다.");
	}

}
