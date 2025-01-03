package day6;

public class Calculator {
	
	void sum(int x, int y) {
		System.out.println("두 수의 합은 " + (x+y));
	}
	
	int sum2(int x,  int y) {
		int a = x + y;
		return a;
	}
	
	int multiple(int x, int y) {
		int a = x*y;
		return a;
	}

	double multiple(double x, double y) {
		double a = x*y;
		return a;
	}
	
	int multiple(int x, int y, int z) {
		int a = x*y*z;
		return a;
	}
}
