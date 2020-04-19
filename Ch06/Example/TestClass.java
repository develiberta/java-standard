class TestClass {
	void instanceMethod() {}		// 인스턴스메서드
	static void staticMethod() {}	// static메서드
	
	void instanceMethod2() {		// 인스턴스메서드
		instanceMethod();			// 다른 인스턴스메서드 호출
		staticMethod();				// 다른 static메서드 호출
	}
	
	static void staticMethod2() {	// static메서드
//		instanceMethod();			// 다른 인스턴스메서드 호출 -- 컴파일 에러: 인스턴스메서드 호출 불가능
		staticMethod();				// 다른 static메서드 호출 (가능)
	}
}	// end of class