package day6;

public class HumanMain {

	public static void main(String[] args) {
		
		Human hong = new Human("홍길동",30,"인천"); // Human() <= 생성자
		System.out.println(hong.name + hong.age + hong.addr);
		
		Human kim = new Human("김철수",25,"제주도");
		System.out.println(kim.name);
		
		Human park = new Human("박영희",25);
		System.out.println(park.addr);
		
	}
}
