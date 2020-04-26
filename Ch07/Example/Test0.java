class Test0 {
	public static void main(String[] args) {
		Sub s = new Sub();
		Super s2 = new Sub();
		System.out.println(s.a);		// 정상적으로 실행됨
//		System.out.println(s.m);		// 컴파일 에러. 메서드를 못찾음
		System.out.println(s2.a);		// 정상적으로 실행됨
//		System.out.println(s2.m);		// 컴파일 에러. 메서드를 못찾음
	}
}

class Super {
	static int a = 5;
	static void m() {
		System.out.println("m 호출");
	}
}

class Sub extends Super {
}