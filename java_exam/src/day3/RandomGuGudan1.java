package day3;

import java.util.Random;
import java.util.Scanner;

public class RandomGuGudan1 {

	public static void main(String[] args) {
		
//		Random ran = new Random();
//		
//		for(int i=1;i<=30;i++) {
//			
//			int x = ran.nextInt(4,10);
//			
//			System.out.println(x);
//		}
//		
//		int x = ran.nextInt(10); //0~9
//		int x = ran.nextInt(10)+1; //1~10
		// 0=>1, 1=>2, 2=> .... 9=>10		
		
//		int x = ran.nextInt(8)+2; // 2~9
//		int y = ran.nextInt(9)+1; // 1~9
//		
//		System.out.print(x + " * " + y + " = ");
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int score = 0;
			
			int num1 = ran.nextInt(2,10);
			int num2 = ran.nextInt(1,10);
			
			System.out.println(num1 + " * " + num2 + " = ");
			int answer = scan.nextInt();
			
			if(answer == num1*num2) {
				System.out.println("정답입니다.");
				System.out.println('\t');
			} else {
				System.out.println("오답! 정답은 : " + num1*num2 + " 입니다.");
				System.out.println('\t');
			}		
	}

}
