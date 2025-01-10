package day02;

public class Review {

	public static void main(String[] args) {
		// 홍길동
		String name = "홍길동";
		int age = 30;
		double height = 175.5;
		boolean isSingle = true; // false
		
		System.out.println(name);
		System.out.println(age + 1);
		
		// + - * / %
		age++; // age = age + 1;
		int num1 = 10;
		int num2 = num1++; // num2 = 10, num1 = 11
		int num3 = ++num1; // num3 = 12, num1 = 12
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3); // Ctrl + Alt + 방향키 해당 열 복사
		
		
	}

}
