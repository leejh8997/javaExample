package day02;

import java.util.Scanner;

public class Loop6 {

	public static void main(String[] args) {
		
		//스캐너로 숫자하나 입력받아서
		// 1부터 입력받은 수자까지의
		// 홀수들의 합, 짝수들의 합 구하기
		// 홀수의 합 : 000, 짝수의 합 : 000

		Scanner s = new Scanner (System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int num = s.nextInt(), sum1 = 0, sum2 = 0 ;
		for(int i = 1; i<=num; i++) {
			if(i % 2 ==1)sum1 += i;
			else sum2 += i;			
		}
		System.out.println("홀수들의 합 : " + sum1);
		System.out.println("짝수들의 합 : " + sum2);
	}

}
