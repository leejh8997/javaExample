package day3;

public class Loop1 {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			if(i == 5) {
				continue; // 나머지 실행문 수행 안하고 증감식으로
			}
			System.out.println(i);
		}

	}

}
