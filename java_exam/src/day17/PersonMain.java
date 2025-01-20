package day17;

import java.util.HashMap;

public class PersonMain {
	
	public static void main(String[] args) {
		
		Person hong = new Person("홍길동", 30);
		hong.setMbti("ISTP");
		System.out.println(hong);
		
		Student kim = new Student("김철수", 25, "20201234", 3);
		kim.setMbti("INFP");
		System.out.println(kim);
		
//		System.out.println(kim.study("자바")); // "자바는 재밌다!"
		
		HashMap<String, Object> map = kim.getInfo();
		// 학번, 학년을 둘다 리턴 받고 싶다!
		System.out.println(map.get("stuNo"));
		System.out.println(map.get("grade"));
		
	}
}
