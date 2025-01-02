package day5;

import java.util.Arrays;
import java.util.Random;

public class Array1 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int arr[] = new int[6];
		for(int i=0; i<arr.length; i++) {
			arr[i] = ran.nextInt(1,45);
			boolean dup = false;
			
			for(int j=0; j<i; j++) {
				if(arr[j] == arr[i]) {
					System.out.println("중복된 숫자 있음." + arr[i]);
					dup = true;
					break;
				}
			}
			if(dup) {
				i--;
				continue;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
