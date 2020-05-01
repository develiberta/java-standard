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