package day03;

import java.util.Scanner;

public class StringEx1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		System.out.println(input);
		
		// 문자열 equals() 메소드를 쓰세요
		// 숫자는 그냥 == 쓰면 됨
		if(input.equals("종료")) { // "종료".equals(input)
			System.out.println("종료되었습니다.");
		} else {
			System.out.println("실행 중입니다.");
		}
		
		
	}

}
