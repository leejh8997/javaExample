package day10;

public class CalcMain {

	public static void main(String[] args) {
		
		Calc calc = new Calc();
		int a,b,c,d;
		a=calc.sum(2, 3);
		b=calc.multiple(4);
		c=calc.multiple(1, 5);
		d=calc.multiple(6, 2, 4);
		System.out.println(a+" "+b+" "+c+" "+d);
	}

}
