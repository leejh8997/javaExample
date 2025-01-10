package day10;

public class Test {
	
	static void addNum(int n) {
		n++;
	}
	
	static void addArr(int[] arr) {
		arr[0] = 100;
	}
	
	public static void main(String[] args) {
		
		int n = 10;
		addNum(n);
		System.out.println(n); // 10
		
//		int arr[] = {1,3,5};
//		addArr(arr);
//		System.out.println(arr[0]); // {100,3,5}
		
//		String heung[] = {"라면","쌀","과자"};
		
	}
	
}
