package day3;

import java.util.Scanner;

public class WhileSample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("정수(양수)를 입력하고 마지막에 -1을 입력하세요");
		int max = 0;
		while(true) {
			int input = scan.nextInt();
			
			if(input == -1) {
				System.out.println(max);
				break;
			} else if(input < -1) {
				System.out.println("0 이상의 숫자를 입력해주세요.");
			} else {
				max = input > max ? input : max;
//				if(input > max) {max = input;}
			}
			
		}

		
	}

}
