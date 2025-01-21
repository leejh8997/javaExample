package day17;

public class GoodCalc implements Calculator{
	
	public static void main(String[] args) {

		
	}

	@Override
	public int sum(int x, int y) {
		return x + y;
	}

	@Override
	public int sum(int x, int y, int z) {
		return x + y + z;
	}

	@Override
	public int mul(int x, int y) {
		return x * y;
	}

	@Override
	public int div(int x, int y) {
		int z = 0;
		try {
			z = x/y;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		return z;
	}
	// 숫자 2개를 받아서 큰 수를 리턴해주는 함수
	// 함수명은 max, 리턴, 매개변수는 모두 int
	int max(int x, int y) {
		return x > y ? x : y;
	}
}
