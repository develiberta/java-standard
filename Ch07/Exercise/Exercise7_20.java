/* Exercise 7-20. 다음의 코드를 실행한 결과를 적으시오.
 *
 * [예상] 아래 소스에도 주석으로 적음
 * 100
 * Child Method
 * 200
 * Child Method
 *
 * [결과]
 * 100
 * Child Method
 * 200
 * Child Method
 *
 * [해설]
 * 조상클래스에 선언된 멤버변수와 같은 이름의 인스턴스변수를 자손클래스에 중복으로 정의했을 때,
 * 조상타입의 참조변수로 자손인스턴스를 참조하는 경우와, 자손타입의 참조변수로 자손인스턴스를 참조하는 경우는 서로 다른 결과를 얻는다.
 * (인스턴스)메서드의 경우, 조상클래스의 메서드를 자손클래스에서 오버라이딩한 경우에도
 * 참조변수의 타입에 관계없이 항상 실제 인스턴스의 메서드(실제 인스턴스가 자손 인스턴스인 경우 오버라이딩된 메서드)가 호출되지만
 * 멤버변수의 경우에는 참조변수의 타입에 따라 달라진다.
 */
class Exercise7_20 {
	public static void main(String args[]) {
		Parent p = new Child();
		Child c = new Child();
		
		System.out.println("p.x = " + p.x);		// [by LSH] Parent의 멤버변수 x = 100 출력
		p.method();								// [by LSH] 처음에 Parent의 메서드를 찾았다가, 오버라이딩된 Child의 메서드 내용 = "Child Method" 출력
		
		System.out.println("c.x = " + c.x);		// [by LSH] Child의 멤버 x = 200 출력
		c.method();								// [by LSH] Child의 메서드 내용 = "Child Method" 출력
	}
}

class Parent {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child extends Parent {
	int x = 200;
	
	void method() {
		System.out.println("Child Method");
	}
}