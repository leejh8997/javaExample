package test;

public class Car implements CarManager {
	String kind;
	int speed;
	String color;
	public Car(String kind, int speed, String color) {
		this.kind = kind;
		this.speed = speed;
		this.color = color;
	}
	@Override
	public String toString() {
		
		return "차 종류는" + kind + ", 색은 " + color + " 입니다." ;
	}
	public void SpeedUp(int speed) {
		int limit = this.speed;
		limit += speed;
		if(limit>200) {
			System.out.println("200을 초과한 속도는 불가합니다. 200으로 변경됩니다.");
			this.speed = 200;
		} else {
			this.speed += speed;			
		}
	}
	public void SpeedDown(int speed) {
		int limit = this.speed;
		limit -= speed;
		if(limit<0) {
			System.out.println("0 미만의 속도는 불가합니다. 0으로 변경됩니다.");
			this.speed = 0;
		} else {
			this.speed -= speed;			
		}
	}
	public int getSpeed() {
		return this.speed;
	}
	
	public static void main(String[] args) {
		
		Car c = new Car("소나타", 0, "검정");
		System.out.println(c);
		c.SpeedUp(100);
		System.out.println(c.getSpeed());
		c.SpeedUp(150);
		System.out.println(c.getSpeed());
		c.SpeedDown(30);
		System.out.println(c.getSpeed());
	}

}
