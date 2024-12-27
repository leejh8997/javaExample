package day2;

public class If_3 {

	public static void main(String[] args) {
		
		// 다중 else ~ if
		
		int score = 85;
		if(score >= 90) {
			System.out.println("A");
		}
		else if(score >= 80) {
			System.out.println("B");
		}
		else if(score >= 70) {
			System.out.println("C");
		}
		else{
			System.out.println("F");
		}
		
	}

}
