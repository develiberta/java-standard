/* Exercise 7-26. Outer클래스의 내부클래스 Inner의 멤버변수 iv의 값을 출력하시오.
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