package day11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MapEx2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		while(true) {
			System.out.println("[ (1) 추가 (2) 확인 (3) 삭제 (4) 종료 ]");
			int menu = scan.nextInt();
			
			if(menu == 1) {
				HashMap<String, Object> map = new HashMap<>();
				System.out.print("이름 : ");
				map.put("name", scan.next());
				System.out.print("나이 : ");
				map.put("age", scan.next());
				System.out.print("주소 : ");
				map.put("addr", scan.next());
				list.add(map);
			} 
			
			else if(menu == 2) {
				// 출력
				for(int i=0; i<list.size(); i++) {
					System.out.print((i+1) + ". ");
					System.out.print("이름 : " + list.get(i).get("name") + ", ");
					System.out.print("나이 : " + list.get(i).get("age") + ", ");
					System.out.print("주소 : " + list.get(i).get("addr"));
					System.out.println();
				}
			} 
			
			else if(menu == 3) {
				System.out.println("이름을 입력해주세요.");
				String name = scan.next();
				boolean deleteFlg = false;
				for(int i=0;i<list.size(); i++) {
					if(list.get(i).get("name").equals(name)) {
						list.remove(i);
						deleteFlg = true;
						break;
					}
				}
				if(deleteFlg) {
					System.out.println("삭제되었습니다.");
				} else{
					System.out.println("해당 이름을 가진 사용자가 없습니다.");
				}
			} 
			else  if(menu == 4) {
				System.out.println("종료되었습니다.");
				break;
			} 
			
			else {
				System.out.println("1~3번 중에 선택하세요");
			}
		}
		
	}

}
