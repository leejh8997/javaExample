package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Map2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		for(int i=0; i<3; i++) {
			HashMap<String, Object> map = new HashMap<>();
			System.out.print("이름 : ");
			map.put("name", scan.next());
			System.out.print("나이 : ");
			map.put("age", scan.nextInt());
			System.out.print("키 : ");
			map.put("height", scan.nextDouble());
			list.add(map);
		}
		System.out.println(list);
		
	}
}
