package day9;

public class ColorTV extends TV{
	int color;
	ColorTV(int size, int color){
		super(size);
		this.color = color;
	}
	void printProperty(){
		System.out.println("결과 : " + this.getSize() + "인치 " + color + "컬러");
	}
}
