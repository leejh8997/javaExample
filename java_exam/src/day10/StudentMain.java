package day10;

public class StudentMain {

	public static void main(String[] args) {
		
		Student hong = new Student(123, "홍길동");
		Student yu = new Student(1357, "유재석", "컴퓨터학과");
		hong.setInfo(20, "남");
		System.out.println(hong.getAge());
		System.out.println(yu);

	}

}
