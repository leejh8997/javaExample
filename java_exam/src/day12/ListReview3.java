package day12;
import java.util.ArrayList;
import java.util.Scanner;

public class ListReview3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		
		while(true) {
			System.out.print("문자 입력 : ");
			String input = scan.next();
			if(input.equals("-1")) {
				break;
			} else {
				list.add(input);
			}
		}
//		String a;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).length() > 2) {
				System.out.print(list.get(i).substring(0,2));
				for(int j=0; j<list.get(i).length()-2; j++) {
					System.out.print("*");
				}
//				a = list.get(i).substring(0, 2);
//				for(int j=0; j<list.get(i).length()-2; j++) {
//					a += "*";
//				}
//				list.remove(i);
//				list.add(i, a);
//				System.out.println(list.get(i));
			}
			System.out.println(" ");
		}
	}

}
