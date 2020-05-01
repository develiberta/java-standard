/* Exercise 7-25. Outer클래스의 내부클래스 Inner의 멤버변수 iv의 값을 출력하시오.
 */
class Exercise7_25 {
	public static void main(String[] args) {
		/* (1) 알맞은 코드를 넣어 완성하시오. */
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		System.out.println(inner.iv);
		System.out.println(outer.new Inner().iv);	// 위의 두 줄을 한 줄로 축약
	}
}

class Outer {
	class Inner {
		int iv = 100;
	}
}