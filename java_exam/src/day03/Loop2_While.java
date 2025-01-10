package day03;

public class Loop2_While {

	public static void main(String[] args) {
		
//		int i = 1;
//		while(i<=10) {
//			System.out.println(i);
//			i++;
//		}
		
		int i = 2;
		while(i <10) {
			System.out.println(i + "단");
			int j = 1;
			while(j < 10) {
				System.out.println(i + " * " + j + " = " + (i*j));
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
