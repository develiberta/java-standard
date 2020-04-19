class MemberCall {
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
//	static int cv2 = iv;					// 컴파일 에러. 클래스변수는 인스턴수변수를 사용할 수 없음
	static int cv2 = new MemberCall().iv;	// 이처럼 객체를 생성해야 사용 가능
	
	static void staticMethod1() {
		System.out.println(cv);
//		System.out.println(iv);				// 컴파일 에러. 클래스메서드에서 인스턴스변수 사용 불가
		MemberCall c = new MemberCall();
		System.out.println(c.iv);			// 이처럼 객체를 생성해야 사용 가능
	}
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);				// 인스턴스메서드에서는 인스턴스변수를 바로 사용 가능
	}
	
	static void staticMethod2() {
		staticMethod1();
//		instanceMethod1();					// 컴파일 에러. 클래스메서드에서는 인스턴스메서드 호출 불가
		MemberCall c = new MemberCall();
		c.instanceMethod1();				// 이처럼 객체를 생성해야 호출 가능
	}
	
	void instanceMethod2() {				// 인스턴스메서드에서는
		staticMethod1();					// 인스턴스메서드와 클래스메서드 모두
		instanceMethod1();					// (객체를 생성하지 않고도) 바로 호출 가능
	}
}