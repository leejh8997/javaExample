package day03;

public class Review3 {

	public static void main(String[] args) {
		
		// 1~30 중에 3의 배수이면서 5의 배수면 숫자 출력
		for(int i=1; i<=30; i++) {
			if(i%3 == 0 && i%5 == 0) System.out.println(i);
		}
		
		// 1~30 중에 3의 배수 또는 5의 배수면 숫자 출력
		for(int i=1; i<=30; i++) {
			if(i%3 == 0 || i%5 == 0) System.out.println(i);
		}
	}

}
