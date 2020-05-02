/* Exercise 7-25. Outer클래스의 내부클래스 Inner의 멤버변수 iv의 값을 출력하시오.
 *
 * [해설]
 * 내부 인스턴스 클래스의 인스턴스를 생성하기 위해서는 먼저 외부클래스의 인스턴스를 생성해야 한다.
 * 왜냐하면 '인스턴스 클래스'는 외부클래스의 '인스턴스 변수'처럼 외부클래스의 인스턴스가 생성돼야 쓸 수 있기 때문이다.
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