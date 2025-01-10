package day02;

import java.util.Scanner;

public class If_2 {

	public static void main(String[] args) {
		
		// 스캐너로 값을 입력받아서
		// 입력받은 숫자가 홀수인지 짝수인지 판별
		// 홀수면 "홀수 입니다."
		// 짝수면 "짝수 입니다."
		
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력하시오.");
		int num = s.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("짝수 입니다.");
		}
		else {
			System.out.println("홀수 입니다.");
		}
		
		
	}

}
