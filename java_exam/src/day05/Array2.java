package day05;

public class Array2 {

	public static void main(String[] args) {
		
		//인덱스 위치의 수만큼 *출력
		int arr[] = {3, 5, 2, 4, 1};
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
