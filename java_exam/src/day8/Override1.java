package day8;

public class Override1 {

	public static void main(String[] args) {
		
		Orange orange = new Orange();
		orange.name = "오렌지";
		orange.color = "주황색";
		orange.price = 100000;
		
		System.out.println(orange); // System.out.println(orange.toString()); toString()은 생략 가능
		
	}

}
