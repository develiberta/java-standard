/* Exercise 7-23. 문제 7-22에서 정의한 클래스들의 면적을 구하는 메서드를 작성하고 테스트하시오.
 * 1. 	메서드명	:	sumArea
 * 		기능		:	주어진 배열에 담긴 도형들의 넓이를 모두 더해서 반환한다.
 *		반환타입	:	double
 *		매개변수	:	Shape[] arr
 */
class Exercise7_23 {
	
	/* (1) sumArea메서드를 작성하시오. */
	static double sumArea(Shape[] arr) {
		double sum = 0.0d;
		for (int i=0; i<arr.length; i++) {
			sum += arr[i].calcArea();
			// Shape타입의 배열에는 Shape의 자손 인스턴스가 들어있기 때문에,
			// Shpae클래스의 추상메서드 calcArea()를 호출해도
			// 실제로는 각 인스턴스에 완전히 구현된 calcArea()가 호출된다.
		}
		return sum;
	}
	
	public static void main(String args[]) {
		Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
		System.out.println("면적의 합 : " + sumArea(arr));
	}
}

abstract class Shape {
	Point p;
	
	Shape() {
		this(new Point(0,0));
	}
	
	Shape(Point p) {
		this.p = p;
	}
	
	abstract double calcArea();	// 도형의 면적을 계산해서 반환하는 메서드
	
	Point getPosition() {
		return p;
	}
	
	void setPosition(Point p) {
		this.p = p;
	}
}

class Point {
	int x;
	int y;
	
	Point() {
		this(0, 0);
	}
	
	Point (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "["+x+","+y+"]";
	}
}

/* Circle 클래스 */
class Circle extends Shape {
	double r;
	
	// [by LSH] 생성자는 하나에 몰아주는 방식으로 만들기
	// 그리고 몰아받은 생성자가 조상생성자를 호출하는 방식으로 만들기
	Circle() {								// 답안에는 이 생성자 없음
		this(0.0d);
	}
	
	Circle(double r) {
		this(new Point(0, 0), r);
	}
	
	Circle(Point p) {						// 답안에는 이 생성자 없음
		this(p, 0.0d);
	}
	
	Circle(Point p, double r) {
		// 조상의 멤버는 조상의 생성자가 초기화하도록 한다.
		super(p);
		this.r = r;
	}
	
	double calcArea() { return Math.PI*Math.pow(r,2); }
}

/* Rectangle 클래스 */
class Rectangle extends Shape {
	double width;
	double height;
	
	// [by LSH] 생성자는 하나에 몰아주는 방식으로 만들기
	// 그리고 몰아받은 생성자가 조상생성자를 호출하는 방식으로 만들기
	Rectangle() {								// 답안에는 이 생성자 없음
		this(0, 0);
	}
	
	Rectangle(double width, double height) {
		this(new Point(0,0), width, height);
	}
	
	Rectangle(Point p) {						// 답안에는 이 생성자 없음
		this(p, 0, 0);
	}
	
	Rectangle(Point p, double width, double height) {
		// 조상의 멤버는 조상의 생성자가 초기화하도록 한다.
		super(p);
		this.width = width;
		this.height = height;
	}
	
	double calcArea() { return width*height; }
	
	boolean isSquare() {
		// if (width==height) { return true; }
		// return false;
		/* 답안이 더 적절해서 첨부 */
		return width*height!=0 && width==height;
	}
}