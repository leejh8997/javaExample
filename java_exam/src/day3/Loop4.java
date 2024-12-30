package day3;

import java.util.Scanner;

public class Loop4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int result = 0;
		
		while(true) {
			System.out.println("메뉴를 선택");
			System.out.println("(1) 덧셈 (2) 뺄셈 ) (3) 결과 (4) 종료");
			int menu = scan.nextInt();
			if(menu == 1) {
				// 값을 입력받아서 result에 더하기
				System.out.println("더할 숫자를 입력 : ");
				result += scan.nextInt(); 
			} else if(menu == 2) {
				// 값을 입력받아서 result에 빼기
				System.out.println("뺄 숫자를 입력 : ");
				result -= scan.nextInt();
			} else if(menu == 3) {
				// result에 있는 값 출력
				System.out.println("결과는 " + result + "입니다.");
			} else if(menu == 4) {
				// 프로그램 종료
				System.out.println("종료되었습니다.");
				break;
			} else {
				System.out.println("1~4중 하나를 입력해주세요.");
			}
		}

	}

}
