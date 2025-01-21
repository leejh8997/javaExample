package day17;

import java.util.HashMap;

public class Student extends Person{
	
	private String stuNo;
	private int grade;
	
	public Student(String name, int age, String stuNo, int grade){
		super(name, age);
		this.stuNo = stuNo;
		this.grade = grade;
	}
	
	public String toString() {
		return super.toString() + "\n학번은 " + stuNo + ", 학년은 " + grade + "학년 입니다.";
	}
	public String study(String sub) {
		return sub + "는 재밌다!";
	}
	public HashMap<String, Object> getInfo(){
		HashMap<String, Object> map = new HashMap<>();
		map.put("sutNo", stuNo);
		map.put("grade", grade);
		return map;
	}
	
	void temp() {
		for(int i=0; i<100; i++) {
			if(i > 50) {
				return;
			}
			System.out.println(i);
		}
		System.out.println("test1");
		System.out.println("test2");
	}
}
