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

/* (1) Circle 클래스 */
class Circle extends Shape {
	double r;
	
	Circle(double r) {
		this.r = r;
	}
	
	Circle() {
		this(0.0d);
	}
	
	Circle(Point p) {
		super(p);
		this.r = 0.0d;
	}
	
	Circle(Point p, double r) {
		super(p);
		this.r = r;
	}
	
	double calcArea() { return Math.PI*Math.pow(r,2); }
}

/* (2) Rectangle 클래스 */
class Rectangle extends Shape {
	double width;
	double height;
	
	Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	Rectangle() {
		this(0, 0);
	}
	
	Rectangle(Point p) {
		super(p);
		this.width = 0;
		this.height = 0;
	}
	
	Rectangle(Point p, int width, int height) {
		super(p);
		this.width = width;
		this.height = height;
	}
	
	double calcArea() { return width*height; }
	
	boolean isSquare() {
		if (width==height) { return true; }
		return false;
	}
}