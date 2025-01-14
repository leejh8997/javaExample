package day13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ListMap2 {

	static Scanner scan = new Scanner(System.in);
	public static int setNumber(String msg, int min, int max) {
		while(true) {
			System.out.print(msg + " : ");
			int number = scan.nextInt();
			if(number < min || number > max) {
				System.out.println(min + "~" + max + "값을 입력해주세요");				
			} else {
				return number;
			}
		}	
	}
	
	public static void main(String[] args) {
		
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		// 과일 과게
		// 1번 메뉴 - 과일 추가, 2번 메뉴 - 과일 판매, 3번 메뉴 - 과일 확인, 4번 메뉴 - 종료
		while(true) {
			HashMap<String, Object> map = new HashMap<>();
			System.out.println("[(1) 추가 (2) 판매 (3) 확인 (4) 종료]");
			int menu = scan.nextInt();
			if(menu == 1) { // 추가
				// map에 과일명(name), 가격(price), 개수(num)를 입력받아 list에 저장
				System.out.print("과일명 : ");
				String name = scan.next();
				map.put("name", name);
				
				// 동일한 이름의 과일을 선택 할 경우 개수를 누적해 준다.
				boolean updateFlg = false;
				for(int i=0; i<list.size(); i++) {
					HashMap<String, Object> fruit = list.get(i);
					if(name.equals(fruit.get("name"))) {
						int num = setNumber("개수", 1, 300 - (int)fruit.get("num"));
						fruit.put("num", (int)fruit.get("num")+num);
						updateFlg = true;
						break;
					}
				}
				
				if(!updateFlg) {
					map.put("price", setNumber("가격",100,100000));
					map.put("num", setNumber("개수", 1, 300));
					list.add(map);
				}				
				
			} else if(menu == 2) { // 판매
				// '10개를 판매하여 30개 남았습니다.'
				// 없는 과일 입력할 경우? => 없는 과일 입니다.
				// 보유 개수보다 많은 개수를 선택할 경우 => '현재 사과는 5개 있습니다.'
				System.out.print("과일명 : ");
				String name = scan.next();
				
				boolean updateFlg = false;
				for(int i=0; i<list.size(); i++) {
					HashMap<String, Object> fruit = list.get(i);
					if(name.equals(fruit.get("name"))) {
						System.out.print("구매개수 :");
						int num = scan.nextInt();
						if((int) fruit.get("num") < num) {
							System.out.println("현재 " + name + "은(는) " + fruit.get("num") + "개 있습니다.");
						} else {
							fruit.put("num", (int)fruit.get("num")-num);
							System.out.println(num + "개를 판매하여 " + ((int)fruit.get("num")) + "개 남았습니다.");
						}
						updateFlg = true;
						break;
					} 
				}
				if(!updateFlg) {	
					System.out.println("없는 과일입니다.");
				}
				
			} else if(menu == 3) { // 확인
				// "사과의 가격은 1000, 개수는 5개 남았습니다.
				System.out.print("과일명 : ");
				String name = scan.next();
				for(int i=0; i<list.size(); i++) {
					HashMap<String, Object> fruit = list.get(i);
					if(name.equals(fruit.get("name"))) {
						System.out.println(name + "의 가격은" + fruit.get("price") + ", 개수는 " + fruit.get("num") + "남았습니다.");
					}
				}
			} else if(menu == 4) { // 종료 
				System.out.println("종료되었습니다.");
				break;
			} else { // 다시시도
				System.out.println("메뉴 중에서 고르세요.");
			}
		}
		
	}

}
				// 가격, 개수 메소드 안쓰는 코드
//				//100~100000
//				System.out.println("가격 : ");
//				while(true) {
//					int price = scan.nextInt();
//					if(price >= 100 && price <= 100000) {
//						map.put("price", price);
//						break;
//					}
//					System.out.println("100~100000 사이");
//				}
//				//1~300
//				System.out.println("개수 :");
//				while(true) {
//					int num = scan.nextInt();
//					if(num >= 1 && num <= 300) {
//						map.put("num", num);
//						break;
//					}
//					System.out.println("1~300 사이");
//				}