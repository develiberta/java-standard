class ExceptionEx1 {
	public static void main(String[] args) {
		try {
			try { } catch (Exception e) { }
		} catch (Exception e) {
			try { } catch (Exception e) { }	// 컴파일 에러. 변수 e가 중복 선언되었다.
		}	// try-catch의 끝
		
		try {
		} catch (Exception e) {
		}	// try-catch의 끝
	}	// main의 끝
}