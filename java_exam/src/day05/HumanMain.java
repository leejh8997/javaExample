package day05;

public class HumanMain {

	public static void main(String[] args) {
//			Human hong = new Human("홍길동",20,"인천",170.5,false);
//			Human kim = new Human("김철수",30,"서울",180.2,true);
			Human hong = new Human();
			hong.name = "홍길동";
			hong.age = 30;
			hong.addr = "인천";
			hong.height = 170.5;
			hong.isSingle = true;
				
			
			System.out.println(hong.name);
			hong.eat();
			hong.speak("길동이");
			hong.intro2("길동이");
			
//			Human kim = new Human();
//			kim.name = "김철수";
//			kim.speak("철수");
//			System.out.println(kim.name);
//			kim.intro("철수", 25, "제주도");
			

	}

}
