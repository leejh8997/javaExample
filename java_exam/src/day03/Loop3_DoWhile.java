package day03;

public class Loop3_DoWhile {

	public static void main(String[] args) {
		
		for(int i=100; i<=10; i++) {
			System.out.println("실행!");
		}

		int i = 100;
		while(i<10) {
			System.out.println("실행!");
		}
		
		do { // 조건에 상관없이 꼭 한번은 실행되는 반복문
			System.out.println("실행!");
		}while(i<10);
	}

}
