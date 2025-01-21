package day17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Review_ListMap2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		for(int i =0; i<3; i++) {
			HashMap<String, Object> map = new HashMap<>();
			System.out.print("이름 : ");
			String name = scan.next();
			map.put("name", name);
			System.out.print("나이 : ");
			int age = scan.nextInt();
			map.put("age", age);
			System.out.print("주소 : ");
			String addr = scan.next();
			map.put("addr", addr);
			list.add(map);
		}
		// 수정 할 사용자 입력 : 홍길동
		// 리스트안에 맵에 홍길동이 있으면 => 주소 수정할수 있게
		// 없으면 => 없는 사용자 입니다.
		System.out.print("수정 할 사용자 입력 : ");
		String name = scan.next();
		boolean checkFlg = false;
		for(int i=0; i<list.size(); i++) {
			HashMap<String, Object> map = list.get(i);
			if(map.get("name").equals(name)) {
				System.out.println("주소 : ");
				String addr = scan.next();
				map.put("addr", addr);
				System.out.println(map);		
				checkFlg = true;
				break;
			}
		}
		if(!checkFlg) {
			System.out.println("없는 사용자");
		}
	}
}
