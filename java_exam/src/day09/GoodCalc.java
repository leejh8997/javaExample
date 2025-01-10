package day09;

public class GoodCalc extends Calculator{
	
	int mul(int x, int y) {
		return x*y;
	}
	
	@Override
	int div(int x, int y) {
		return x/y;
	}
	
	int mod(int x, int y) {
		return x%y;
	}
	
}
