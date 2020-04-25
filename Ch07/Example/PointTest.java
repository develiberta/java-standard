class PointTest {
	public static void main(String args[]) {
		Point3D p3 = new Point3D(1,2,3);
	}
}

class Point {
	int x, y;
	
	Point(int x, int y) {	// 이미 생성자가 추가되어 있으므로 컴파일러가 기본 생성자를 추가하지 않음
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x : " + x + ", y : " + y;
	}
}

class Point3D extends Point {
	int z;
	
	Point3D(int x, int y, int z) {
		// 첫 줄이 생성자(조상의 것이든 자신의 것이든)를 호출하는 문장이 아닐 때
		// 컴파일러는 자동적으로 super();를 이 줄에 넣어줌
		
		// 컴파일 에러를 겪은 뒤, 다음의 한 줄 추가
		super(x, y);
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	String getLocation() {
		return "x : " + x + ", y : " + y + ", z : " + z;
	}
}