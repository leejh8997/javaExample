package test2;

import java.util.ArrayList;

public class Student extends Human {
	private String stuNo;
	Student(String name, int age, String stuNo){
		super(name, age);
		this.stuNo = stuNo;
	}
	public ArrayList<String> subjectList() {
		ArrayList<String> a = new ArrayList<>();
		a.add("자바");
		a.add("오라클");
		a.add("HTML");
		return a;
	}
	@Override
	public String toString() {
		return super.toString() + " 학번은 " + stuNo + " 입니다.";
	}
}
