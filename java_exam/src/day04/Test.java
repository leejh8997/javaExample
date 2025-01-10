package day04;
import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// Quiz1
//		String name = "홍길동";
//		int age = 30;
//		String addr = "인천";
//		System.out.println(name + "의 나이는 " + age + "," + " 주소는 " + addr + " 입니다.");
		
		// Quiz2
//		Scanner scan = new Scanner(System.in);
//		System.out.print("숫자 입력 : ");
//		int num = scan.nextInt();
//		if(num >= 50) {System.out.println("50 이상 입니다.");}
//		else{System.out.println("50 미만 입니다.");}
		
		// Quiz3
//		Scanner scan = new Scanner(System.in);
//		System.out.print("숫자 입력 : ");
//		int num = scan.nextInt();
//		if(num < 0 || num>10) {System.out.println("계산할 수 없습니다.");}
//		else if(num % 2 != 0) {System.out.println("홀수");}
//		else{System.out.println("짝수");}
		
		// Quiz4
//		Scanner scan = new Scanner(System.in);
//		System.out.print("숫자 입력 : ");
//		int num = scan.nextInt();
//		for(int i=1; i<10; i++) {
//			System.out.print(num + " * " + i + " = " + (num*i));
//			System.out.print('\t');
//		}
		
		// Quiz5
//		for(int i=1; i<=30; i++) {
//			if(i<10 || i>19) {System.out.print(i + " ");}
//		}
		
		// Quiz6
//		for(int i=2; i<10; i++) {
//			if(i == 5 || i ==8) continue;
//			for(int j=1; j<10; j++) {
//				System.out.print(i + " * " + j + " = " + (i*j));
//				System.out.print('\t');
//			}
//			System.out.println();
//		}
		
		// Quiz7
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int x = ran.nextInt(100)+1;
		int count = 0;
		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			int num = scan.nextInt();
			if(x == num) {
				System.out.println("정답입니다!");
				System.out.println(count + "번 만에 맞추셨습니다.");
				break;
			} else if(x > num) {
				System.out.println("Up!");
				count++;
			} else {
				System.out.println("Down!");
				count++;
			}
			
		}
		
		
		
	}

}
