package day09;

public class Point3D extends Point {
	
	int z;
	
	Point3D(int x, int y, int z){
		super(x,y);
		this.z = z;
	}
	void moveUp() {
		z++;
	}
	void moveDown() {
		z--;
	}
	void move(int x, int y, int z) {
		super.move(x,y);
		this.z = z;
	}

	public String toString() {
		return "(" + getX() + "," + getY() + "," + z +") 의 점";
	}
	
}
