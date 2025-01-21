package day17;

public interface Calculator {
	static double PI = 3.14;
	// 숫자 2개를 받아서 더한 후 리턴
	int sum(int x, int y);
	// 숫자 3개를 받아서 더한 후 리턴
	int sum(int x, int y, int z);
	// 숫자 2개를 받아서 곱한 후 리턴
	int mul(int x, int y);
	// 숫자 2개를 받아서 나눈 후 리턴
	int div(int x, int y);
}
