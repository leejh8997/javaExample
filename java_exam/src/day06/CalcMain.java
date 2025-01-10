package day06;

public class CalcMain {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		calc.sum(1, 2);
		int a = calc.sum2(1, 2);
		System.out.println("합 : " + a);
		System.out.println("sum : " + a);
		
		//오버로딩
		int b = calc.multiple(5,2,3);
		System.out.println(b);
		int c = calc.multiple(10,20);
		System.out.println(c);
		double d = calc.multiple(5, 7.5);
		System.out.println(d);
		
	}

}
