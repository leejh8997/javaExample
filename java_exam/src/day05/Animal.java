package day5;

public class Animal {
	String name;
	int age;
	void eat() {
		System.out.println("먹는다");
	}
	void speak(String s) {
		System.out.println(name+"(은)는 " + s + "이라고 짖는다.");
	}
	void love() {
		System.out.println("love");
	}
}
