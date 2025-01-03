package day6;

public class Food {
	
	private String name;
	private int price;
	// 화면 우클릭 > source > generate getter and setter > get(), set() 생성
	Food(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	void sell() {
		System.out.println(price + "원에 판매했습니다.");
	}
	
//	void setPrice(int price) {
//		if(price < 0) {
//			System.out.println("가격을 다시 확인해주세요.");
//			return; // 리턴 값이 없는 메소드에서 리턴을 쓰면 메소드를 수행하지 않고 빠져나감.
//		}
//		System.out.println("정말 " + price + "가 맞습니까?");
//		this.price = price;
//	}
//	
//	int getPrice() {
//		return price;
//	}
}
