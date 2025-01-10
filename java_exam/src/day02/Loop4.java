package day02;

import java.util.Scanner;

public class Loop4 {

	public static void main(String[] args) {
		
		// 스캐너로 숫자하나 입력받아서
		// 1부터 입력받은 숫자까지의 합 구하기

		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int num = s.nextInt(), sum = 0 ;
		for(int i = 1; i<=num; i++) sum += i;
		System.out.println("합 : " + sum);
	}

}
