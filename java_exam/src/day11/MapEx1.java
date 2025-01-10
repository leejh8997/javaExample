package day11;

import java.util.ArrayList;
import java.util.HashMap;

public class MapEx1 {

	public static void main(String[] args) {
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		HashMap<String, Object> map = new HashMap<>();
		map.put("name", "홍길동");
		map.put("age", 30);
		map.put("height", 180.5);
		list.add(map);
		
		HashMap<String, Object> kim = new HashMap<>();
		kim.put("name", "김철수");
		kim.put("age", 25);
		kim.put("height", 175.5);
		list.add(kim);
		
		System.out.println(list);
		System.out.println(list.get(0).get("name"));
		 
	}

}
