package test2;

public class Human {
	private String name;
	private int age;
	private String phone;
	Human(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name + "의 나이는 " + age + " 입니다.";
	}
	public boolean setPhone(String phone) {
		if(phone.length() == 11) {
			this.phone = phone;
			return false;
		} else {
			System.out.println("핸드폰번호는 11글자로 입력해주세요. ( - 제외)");
			return true;
		}
	}
}
