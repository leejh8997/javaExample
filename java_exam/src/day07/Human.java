package day7;

public class Human {
	
	private String name;
	private int age;
	private String addr;
	int money = 50000;
	static int money_708 = 200000;
	
	void intro() {
		System.out.println(name + "의 나이는 "+ age + ", 주소는 " + addr + " 입니다.");
	}
	
	Human(String name, int age, String addr){
		this.name = name;
		this.age = age;
		this.addr =addr;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age <= this.age) {
			System.out.println("현재 나이보다 큰 값을 입력하세요.");
			return;
		} else {
			this.age = age;
			System.out.println("나이가 " +  age + "이 되었습니다.");
		}
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}
