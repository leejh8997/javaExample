package day11;

import java.util.Scanner;

public class StringSub {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열 입력 : ");
		String s = scan.next();
		s.trim();
		for(int i=0; i<s.length(); i++) {
			System.out.println(s.substring(i+1)+s.substring(0,i+1));
//			String first = s.substring(0, 1);
//			String last = s.substring(1);
//			s = first + last;
//			System.out.println(s);
		}
	}

}
