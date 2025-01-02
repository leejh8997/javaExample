package day5;

public class AnimalMain {

	public static void main(String[] args) {
		
		Animal lion = new Animal();
		lion.name = "lion";
		lion.age = 1;
		lion.eat();
		lion.speak("어흥");
		lion.love();
		
		Animal bear = new Animal();
		bear.name = "bear";
		bear.age = 2;

	}

}
