package day6;

public class FoodMain {

	public static void main(String[] args) {
		
		Food beer = new Food("맥주", 3000);
//		System.out.println(beer.price);    // 접근 지정자가 private이라 사용 불가
		
		beer.setPrice(3500);
		System.out.println(beer.getPrice());
	}

}
