package day3;

public class GuGudan {

	public static void main(String[] args) {
		//구구단
		for(int i=2; i<=9; i++) {
			System.out.println("==================================" + i + "단==================================");
			for(int j=1; j<=9; j++) {
				System.out.print(i + "*" + j + "=" + (i*j));
				System.out.print('\t');
			}
			System.out.println();
			System.out.println();
		}
		
		// 구구단 역순
//		for(int i=9; i>=2; i--) {
//			for(int j=1; j<=9; j++) {
//				System.out.println(i + "*" + j + "=" + (i*j));
//			}
//		}
		
		// 구구단 홀수단만 출력
//		for(int i=2; i<=9; i++) {
//			if(i % 2 == 1){ // if(i%2 == 0) continue;
//				for(int j=1; j<=9; j++) {
//					System.out.println(i + "*" + j + "=" + (i*j));
//				}
//			}
//		}
		
		
		
	}

}
