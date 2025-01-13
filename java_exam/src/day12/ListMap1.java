package day12;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ListMap1 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		for(;;) {
			HashMap<String, Object> map = new HashMap<>();
			System.out.println("[(1) 추가 (2) 확인 (3) 종료]");
			int menu = scan.nextInt();
			if(menu == 1) {
				System.out.print("이름 : ");
				String name = scan.next();			
				System.out.print("포인트 : ");
				int point = scan.nextInt();
				boolean updateFlg = false;
				for(int i=0; i<list.size(); i++) {
					if(name.equals(list.get(i).get("name"))){
						int newpoint = (int)list.get(i).get("point") + point;
						list.get(i).put("point", newpoint);
						updateFlg = true;
						break;
					}
				}
				if(!updateFlg) {
					map.put("name", name);
					map.put("point", point);
					list.add(map);
				}
			} else if(menu == 2) {
				System.out.print("이름 : ");
				String name = scan.next();
				for(int i=0; i<list.size(); i++) {
					if(name.equals(list.get(i).get("name"))){
						System.out.println(name + "님의 포인트는");
						System.out.println(list.get(i).get("point"));
						break;
					}
				}
			}
		}
		
	}
	
}
