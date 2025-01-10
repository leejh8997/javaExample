package day06;

public class Human {
	
	String name;
	int age;
	String addr;
	
	Human() {
		// 클래스와 이름 동일, 리턴 타입을 갖지 않는다.
		System.out.println("생성자를 호출했습니다.");
	}
	
	Human(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	Human(String name, int age) {
		this(name, age, "알 수 없음"); // this()는 무조건 제일 첫번째에 와야 함.
//		this.name = name;
//		this.age = age;
//		this.addr = "알 수 없음";
	}
	
	void study() {
		System.out.println("공부를 합니다.");
	}
	String eat(String food) {
		return food + "를(을) 먹습니다.";
	}
		
}
