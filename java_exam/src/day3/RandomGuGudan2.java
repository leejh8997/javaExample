package day3;

import java.util.Random;
import java.util.Scanner;

public class RandomGuGudan2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int total = 0;
		int count = 0;
		System.out.println("랜덤 구구단 입니다. 0을 입력하면 종료됩니다.");
		
		while(true){
			
			int num1 = ran.nextInt(2,10);
			int num2 = ran.nextInt(1,10);
			
			System.out.println(num1 + " * " + num2 + " = ");
			int answer = scan.nextInt();
			if(answer == 0) {
				System.out.println("종료되었습니다.");
				System.out.println('\t');
				System.out.println(total + "문제 중 "+ count + "개 맞추셨습니다.");
				break;
			} else if(answer == num1*num2) {
				System.out.println("정답입니다.");
				System.out.println('\t');
				count++;
				total++;
			} else {
				System.out.println("오답! 정답은 : " + num1*num2 + " 입니다.");
				System.out.println('\t');
				total++;
			}
		}
	}
}
