package day1;

public class Operator1 {

	public static void main(String[] args) {
		
//		int a = 1;
//		a += 1;
//		a++; // a = a+1;
//		a--; // a = a-1;
//		System.out.println(a);

		
//		int x = 1;
//		int y = x++;
//		System.out.println(y);
//		System.out.println(x);
//		y = ++x;
//		System.out.println(y);
//		int x = 10;
//		++x; // x = 11
//		int y = x++; // x = 12, y = 11
//		int z = --y; // y = 10
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);

//		int a = 10;
//		a = a + 1; // a++
//		++a; // a = a + 1, a = 12
//		
//		int b = a++; // b = 12, a = 13
//		b = --a; // a = 12, b = 12
		
		int x = 5;
		int y = ++x; // x = 6, y = 6
		y = x--; // y = 6, x = 5
		int z = x + y; // z = 11
		++x; // x = 6
		x = z++; // x = 11, z = 12
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

}
