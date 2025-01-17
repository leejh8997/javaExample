package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StudentManager {

	static Scanner s = new Scanner(System.in);
	
	public static HashMap<String, Object> name(ArrayList<HashMap<String, Object>> list, String name) {
		for(int i=0; i<list.size(); i++) {
			if(name.equals(list.get(i).get("name"))) {
				return list.get(i);
			}
		}
		return null;
	}
	public static int setScore() {
		while(true) {
			int score = s.nextInt();
			if(score >= 0 && score <= 100) {
				return score;
			} else {
				System.out.println("0~100 값을 입력해주세요.");
			}
		}
	}
	public static void main(String[] args) {
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		while(true) {
			System.out.print("[(1) 학생추가 (2) 성적입력 (3) 조회 (4) 성적수정 (5) 종료]");	
			HashMap<String, Object> map = new HashMap<>();
			int menu = s.nextInt();
			if(menu == 1) {
				System.out.print("이름 입력 : ");
				String str = s.next();
				
				HashMap<String, Object> x = name(list,str);
				if(x == null){
					map.put("name", str);
					list.add(map);
					System.out.println("학생이 추가되었습니다.");
				} else {
					System.out.println("이미 존재하는 학생입니다. 처음으로 이동 합니다.");
				}

			} else if(menu == 2) {
				System.out.print("이름 입력 : ");
				String str = s.next();
				if(null != name(list, str)) {
					System.out.print("java: ");
					name(list,str).put("java",setScore());
					System.out.print("oracle: ");
					name(list,str).put("orcle",setScore());
				} else {
					System.out.println("해당 학생이 존재하지 않습니다.");
				}
			} else if(menu == 3) {
				System.out.println("ArrayList 객체를 그대로 출력합니다.");
				System.out.println(list);
			} else if(menu == 4) {
				System.out.print("이름 입력 : ");
				String str = s.next();
				if(null != name(list, str)) {
					System.out.print("수정할 과목명(java, oracle) : ");
					String sub = s.next();
					if(sub.equals("java")) {
						System.out.print("java :");
						int score = s.nextInt();
						name(list,str).put("java", score);
						
					} else if(sub.equals("oracle")) {
						System.out.print("oracle :");
						int score = s.nextInt();
						name(list,str).put("oracle", score);
						
					} else {
						System.out.println("없는 과목입니다. 메뉴로 이동 합니다.");
					}
				} else {
					System.out.println("해당 학생이 존재하지 않습니다.");
				}
			} else if(menu == 5) {
				System.out.println("종료되었습니다.");
				break;
			} 
		}
	}

}
