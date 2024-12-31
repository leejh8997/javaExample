package day4;

import java.util.Arrays;
import java.util.Random;

public class Array6_dup {

	public static void main(String[] args) {
		
		// 중복없이 로또번호 생성
		Random ran = new Random();
		int arr[] = new int[6];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = ran.nextInt(1,45);
			boolean dup = false;
			
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) {
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
