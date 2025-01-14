package day13;

public class Debugging1 {

	public static void main(String[] args) {
		// F6 한줄 실행, F8 다음 브레이크포인트(없을 시에는 끝까지)까지 실행
		int num1 = 10;
		int num2 = 20;
		int num3 = num1 + num2;
		
		System.out.println(num3);
		
		for(int i=1; i<10; i++) {
			System.out.println(i);
		}
	}

}
