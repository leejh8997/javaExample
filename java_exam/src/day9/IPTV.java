package day9;

public class IPTV extends ColorTV {
	String addr;
	IPTV(String addr, int size, int color){
		super(size, color);
		this.addr = addr;
	}
	@Override
	void printProperty() {
		System.out.println("결과 : 나의 IPTV는 " + this.addr + " 주소의 " + this.getSize() + "인치"+ this.color + "컬러");
	}
}
