/* Exercise 7-26. Outer클래스의 내부클래스 Inner의 멤버변수 iv의 값을 출력하시오.
 *
 * [해설]
 * 내부 스태틱 클래스(static inner class)는 인스턴스 클래스와 달리
 * 외부클래스의 인스턴스를 생성하지 않고도 사용할 수 있다.
 * 이는 클래스의 static멤버를 인스턴스 생성없이 사용할 수 있는 것과 같은 원리이다.
 */
class Exercise7_26 {
	public static void main(String[] args) {
		/* (1) 알맞은 코드를 넣어 완성하시오. */
		Outer.Inner inner = new Outer.Inner();
		System.out.println(inner.iv);
		System.out.println(new Outer.Inner().iv);	// 위의 두 줄을 한 줄로 축약
	}
}

class Outer {
	static class Inner {
		int iv = 200;
	}
}