package day8;

public class PersonMain {

	public static void main(String[] args) {
		
		Person hong = new Person("홍길동", 30, "서울");
//		hong.study(); // hong이 Person의 객체이기 때문에 서브클래스에 있는 study() 사용 불가
		
		Student kim = new Student("김철수", 25, "인천");
//		kim.name = "김철수"; // name은 Person에 있는 요소이지만 상속받았으므로 사용 가능
		kim.eat(); // eat은 Person에 있는 요소이지만 상속받았으므로 사용 가능
		kim.study();
		
		Student park = new Student("박영희", 20, "제주도", "21354");
		
		
	}
}
