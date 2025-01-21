package test2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Test5 {
	static Scanner s = new Scanner(System.in);
	static public int setNumber(String msg, int max, int min) {
		while(true) {
			System.out.print(msg + " : ");
			int num = s.nextInt();
			if(num <= max && num >= min) {
				return num;
			}else {
				System.out.println(min + "~" + max + "사이 값을 입력하시오");
			}
		}
	}
	static public HashMap<String, Object> selectFruit(ArrayList<HashMap<String, Object>> list, String name){
		for(int i=0; i<list.size(); i++) {
			if(name.equals(list.get(i).get("name"))) {
				return list.get(i);
			} 
		}
		return null;
	}
	public static void main(String[] args) {
		
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		while(true) {
			System.out.print("=== (1) 과일 추가 (2) 과일 삭제 (3) 가격수정 (4) 현황 파악 (그외) 종료 ===");
			int menu = s.nextInt();
			HashMap<String, Object> map = new HashMap<String, Object>();
			
			if(menu == 1) {
				System.out.print("과일명 : ");
				String name = s.next();
				map.put("name", name);
				
				HashMap<String, Object> fruit = selectFruit(list, name);
				if(fruit != null) {
					int num = setNumber("개수", 100 - (int) fruit.get("num"), 1);
					fruit.put("num", (int) fruit.get("num") + num);
				} else {
					int price = setNumber("가격", 10000, 100);
					map.put("price", price);
					int num = setNumber("개수", 100, 1);
					map.put("num", num);
					list.add(map);
				}
				
			} else if(menu == 2) {
				System.out.print("삭제할 이름 : ");
				String name = s.next();
				HashMap<String, Object> fruit = selectFruit(list, name);
				if(fruit != null) {
					list.remove(fruit);
				} else {
					System.out.println("삭제할 데이터가 없습니다.");
				}
			} else if(menu == 3) {
				System.out.print("수정할 과일 이름 : ");
				String name = s.next();
				HashMap<String, Object> fruit = selectFruit(list, name);
				if(fruit != null) {					
					System.out.print("가격을 수정해주세요(기존가격 "+ fruit.get("price") + ") : ");
					int price = s.nextInt();
					fruit.put("price", price);
					System.out.println("수정되었습니다.");
				} else {
					System.out.println("없는 과일입니다.");
				}
			} else if(menu == 4) {
				for(int i=0; i<list.size(); i++) {
					System.out.println(list.get(i).get("name") + "의 가격은 " + list.get(i).get("price") + "원, 개수는 " 
							+ list.get(i).get("num") + "개 남았습니다.");
					
				}
			} else {
				System.out.println("프로그램 종료");
				break;
			}
			
		}
		
	}

}
