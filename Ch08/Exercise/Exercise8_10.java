/* Exercise 8-10. 아래의 코드가 수행되었을 때의 실행결과를 적으시오.
 *
 * [실행결과]
 * method1() 수행 시작
 * method2() 수행 시작
 * NullPointerException 발생
 * method1()의 catch(NullPointerException e) 블록으로 들어감
 * 2 출력
 * 예외 되던지기
 * main()으로 돌아가기 전에 finally 블록의 4 출력
 * main()의 catch(Exception e) 블록으로 들어감
 * 7 출력
 */
class Exercise8_10 {
	public static void main(String[] args) {
		try {
			method1();
			System.out.println(6);
		} catch(Exception e) {
			System.out.println(7);
		}
	}
	
	static void method1() throws Exception {
		try {
			method2();
			System.out.println(1);
		} catch(NullPointerException e) {
			System.out.println(2);
			throw e;						// 예외를 다시 발생시킴. 예외 되던지기(re-throwing)
		} catch(Exception e) {
			System.out.println(3);
		} finally {
			System.out.println(4);
		}
		
		System.out.println(5);
	}	// method1메서드의 끝

	static void method2() {
		throw new NullPointerException();
	}
}