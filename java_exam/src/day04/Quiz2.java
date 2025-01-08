package day4;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		
//		1. 스캐너를 통해 양수 5개를 입력받고
//		입력 받은 수 중에서 가장 작은 수를 구하시오.
		
		Scanner scan = new Scanner(System.in);
		int min = 0;
		System.out.println("숫자 5개를 입력하시오.");
		
		for(int i=1;i<=5;i++) {
			int input = scan.nextInt();
			if(i==1) {
				min = input;
				continue;
			}
			min = min < input? min : input;
		}
		System.out.println("최소 값 : " + min);

	}

}
