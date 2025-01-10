package day07;

public class Calculator {
	
	
	void intro() {
		System.out.println("계산기 객체 입니다.");
	}
	
	int sum(int x, int y) {
		return x + y;
	}
	
	int sum(double x, double y) {
		return (int) (x + y);
	}
	
	int sum(int x, int y, double z) {
		return x + y + (int)z;
	}
	
}
