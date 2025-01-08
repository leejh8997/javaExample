package day3;

import java.util.Random;
import java.util.Scanner;

public class RandomGuGudan3 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int total = 0;		
				
//		while(true){
//			System.out.println("문제 수를 입력해주세요. 0이하 숫자 입력 시 종료됩니다.");
//			total = scan.nextInt();
//			if(total<=0) {
//				System.out.println("종료되었습니다.");
//				break;
//			}
//			int count = 0;
//			int i = 0;
//			while(i<total) {
//				int num1 = ran.nextInt(2,10);
//				int num2 = ran.nextInt(1,10);
//				System.out.print(num1 + " * " + num2 + " = ");
//				int answer = scan.nextInt();                                     // while - while
//				
//				if(answer == num1*num2) {
//					System.out.println("정답입니다.");
//					System.out.println('\t');
//					count++;
//					i++;
//				} else {
//					System.out.println("오답! 정답은 : " + num1*num2 + " 입니다.");
//					System.out.println('\t');	
//					i++;
//				}
//			}
//			System.out.println("총 " + total + "문제 중 "+ count + "개 맞추셨습니다.");
//			}
//			
//		}
		
			while(true){
				System.out.println("문제 수를 입력해주세요. 0이하 숫자 입력 시 종료됩니다.");
				total = scan.nextInt();
				if(total<=0) {
					System.out.println("종료되었습니다.");
					break;
				}
				int count = 0;
				for(int i=1;i<=total;i++) {
					int num1 = ran.nextInt(2,10);
					int num2 = ran.nextInt(1,10);
					System.out.print(num1 + " * " + num2 + " = ");
					int answer = scan.nextInt();                                   // while-for
					
					if(answer == num1*num2) {
						System.out.println("정답입니다.");
						System.out.println('\t');
						count++;
					} else {
						System.out.println("오답! 정답은 : " + num1*num2 + " 입니다.");
						System.out.println('\t');	
					}
				}
				System.out.println("총 " + total + "문제 중 "+ count + "개 맞추셨습니다.");
			}
				
	}
}


