package day10;

public class Car_Test {
	
	String name;
	String color;
	int speed;
	
	Car_Test(){
		this.name = "기본차";
		this.color = "하얀색";
		this.speed = 0;
	}
	Car_Test(String name, String color, int speed){
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	void carInfo() {
		System.out.println("자동차의 이름은 " + name + ", 색상은 " + color + " 입니다.");
	}
	void setInfo(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		if(speed>=0) {
			return;
		}
		this.speed = speed;
	}
	void speedUp(int speed) {
		int limit = this.speed;
		limit += speed;
		if(limit>200) {
			System.out.println("200을 초과한 속도는 불가합니다. 200으로 변경됩니다.");
			this.speed = 200;
		} else {
			this.speed += speed;			
		}
//		else if(speed<0) {
//			System.out.println("0 미만의 속도는 불가합니다. 0으로 변경됩니다.");
//		}
	}
	void speedDown(int speed) {
		int limit = this.speed;
		limit -= speed;
		if(limit<0) {
			System.out.println("0 미만의 속도는 불가합니다. 0으로 변경됩니다.");
			this.speed = 0;
		} else {
			this.speed -= speed;			
		}
	}
	int getSpeed() {
		return speed;
	}
}
