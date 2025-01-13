package day12;
import java.util.ArrayList;
import java.util.Scanner;

public class ListReview1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
//		list.add(1);
//		list.add(3);
//		list.add(5);
//		list.add(4);
//		list.add(2);
//		list.add(1, 10);
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		while(true) {
			System.out.println("숫자 입력 : ");
			int input = scan.nextInt();
			if(input != -1) {
				list.add(input);
				sum += input;
			} else {
			break;
			}
		}
		System.out.println(list);
		System.out.println(sum);

	}

}
