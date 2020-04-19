class TestClass2 {
	int iv;				// 인스턴스변수
	static int cv;		// 클래스변수
	
	void instanceMethod() {			// 인스턴스메서드
		System.out.println(iv);		// 인스턴스변수 사용 가능
		System.out.println(cv);		// 클래스변수 사용 가능
	}
	
	static void staticMethod() {	// static메서드
//		System.out.println(iv);		// 인스턴스메서드 사용 불가능 -- 컴파일 에러
		System.out.println(cv);		// 클래스변수 사용 가능
	}
}	// end of class