class NoStaticInMethod {
	void method1() {
//		static int a = 5;	// 컴파일 에러. 메서드 내에 static 선언 불가
	}
	
	public static void main(String args[]) {
		NoStaticInMethod test = new NoStaticInMethod();
		test.method1();
	}
}