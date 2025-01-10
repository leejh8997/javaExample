package day11;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx1 {
	public static void main(String[] args) {
		// 가장 긴 이름이 동일 값이 있을 경우
		// 동일한 길이의 이름 모두 출력
		Scanner scan = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		
		for(int i=0; i<4; i++) {
			System.out.print("이름을 입력하세요 >>");
			String name = scan.next();
			list.add(name);			
		}
		
		System.out.println(list);
		
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i) + "\t");
//		}
		
		String longName = "";
		String sameName;
		for(int i=0; i<list.size(); i++) {
			if(longName.length()<list.get(i).length()) {
				longName = list.get(i);
			} 
			else if(longName.length()==list.get(i).length()) {
				if(list2.size()==0) {
					list2.add(longName);
				}
				sameName = list.get(i);
				list2.add(sameName);
			}
		}
		System.out.print("\n가장 긴 이름 : " +list2);
	}
	
}