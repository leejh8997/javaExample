package day12;
import java.util.ArrayList;
import java.util.Scanner;

public class ListReview2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		
		while(true) {
			System.out.println("문자 입력 : ");
			String input = scan.next();
			if(input.equals("-1")) {
				break;
			} else {
				list.add(input);
			}
		}
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).length() >4) {
				System.out.println(list.get(i));
			}
		}
		
	}

}
