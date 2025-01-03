package day6;

import java.util.Arrays;
import java.util.Random;

public class Array5 {

	public static void main(String[] args) {
		
		// arr의 모든 요소에 값을 1~20사이의
		// 랜덤한 값을 넣기
		// 그 다음에 모든 수의 평균 구하기
		int arr[][] = new int[3][3];
		int sum = 0;
		Random ran = new Random();
		
		int save[] = new int[arr.length*arr[0].length];
		int index = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = ran.nextInt(1,20);
				
				//중복제거
				save[index]=arr[i][j];
				boolean dup = false;
				for(int l=0; l<index; l++) {
					if(save[l] == save[index]){
						dup = true;
						break;
					}
				}
				if(dup){
					System.out.println("중복");
					j--;
					continue;
				}
				index++;
				
				sum += arr[i][j];
				
			}
		}
		System.out.println((double)sum/(arr.length*arr[0].length));
		for(int i=0; i<arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}
