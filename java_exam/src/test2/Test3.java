package test2;

import java.util.Arrays;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int []arr = new int[6];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("숫자 입력 : ");
			int x = s.nextInt();
			if(x > 0 && x <100) {
				boolean flg = false;
				for(int j=0; j<arr.length; j++) {
					if(arr[j] == x) {
						flg = true;
						System.out.println("중복");
						i--;
						break;
					}
				}
				if(!flg) {
					arr[i] = x;
				}
			}
		}
		
		for(int i=0; i<arr.length-1; i++) {
			int max = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[max]<arr[j]) {
					max = j;
				} 
			}
			int temp = arr[i];
			arr[i] = arr[max];
			arr[max] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
