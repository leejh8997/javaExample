package test2;

public class Test2 {

	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			if((i%2 == 1 || i%8 ==0) && (i<50 || i>60)) {
				System.out.println(i);
				
			}
		}

	}

}
