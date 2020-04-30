/* Exercise 6-18. 다음의 코드를 컴파일하면 에러가 발생한다.
 * 컴파일 에러가 발생하는 라인과 그 이유를 설명하시오.
 */
class MemberCall {
	int iv = 10;
	static int cv = 20;
		
	int iv2 = cv;
//	static int cv2 = iv;			// 라인 A
		
	static void staticMethod1() {
		System.out.println(cv);
//		System.out.println(iv);		// 라인 B
	}
		
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);		// 라인 C
	}
		
	static void staticMethod2() {
		staticMethod1();
//		instanceMethod1();			// 라인 D
	}
		
	void instanceMethod2() {
		staticMethod1();			// 라인E
		instanceMethod1();
	}
}
/*
 * 라인 A : static 변수는 instance 변수를 복사(대입)할 수 없음
 * 라인 B : static 메서드는 instance 변수를 호출할 수 없음
 * 라인 D : static 메서드는 instance 메서드를 호출할 수 없음
 */