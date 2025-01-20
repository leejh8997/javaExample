package day17;

public class Person {
	private String name;
	private int age;
	private String mbti;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void eat(String food) {
		System.out.println(food + "를 먹는다.");
	}
	
	@Override
	public String toString() {
		return name +  "의 mbti는 " + mbti + " 입니다.";
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
		this.age = age;
	}

	public void setMbti(String mbti) {
		this.mbti = mbti;
	}
	public String getMbti() {
		return mbti;
	}
}
