package test;

public class Sum {
	public static void main(String[] args) {
		
		int sum=0;
		
		for(int i=1; i<=100; i++) {
			if(i%2==0 && i%5==0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
