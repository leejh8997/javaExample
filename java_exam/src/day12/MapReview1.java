package day12;

import java.util.HashMap;
import java.util.Scanner;

public class MapReview1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		HashMap<String, Object> map = new HashMap<>();
		map.put("name", "홍길동");
		map.put("java", 80);
		map.put("oracle", 70);
		
		System.out.println("과목 : ");
		String subject = scan.next();
		if(map.containsKey(subject)) { // 입력한 값이 키에 존재하면 true
			System.out.println("새 점수");
			int score = scan.nextInt();
			map.put(subject, score);		
		} else {
			System.out.println("없는 과목임");
		}
		
		System.out.println(map);

	}

}
