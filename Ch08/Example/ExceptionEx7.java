class ExceptionEx7 {
	public static void main(String args[]) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);	// 고의로 ArithmeticcException 발생시킴
			System.out.println(4);	// 실행되지 않는다.
		} catch (ArithmeticException ae) {
			if (ae instanceof ArithmeticException)
				System.out.println("true");
			System.out.println("ArithmeticException");
		} catch (Exception e) {
			System.out.println("Exception");	// ArithmeticException을 제외한 모든 예외 처리
		}	// try-catch의 끝
		System.out.println(6);
	}	// main메서드의 끝
}