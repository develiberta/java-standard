/* Exercise 8-6. 아래의 코드가 수행되었을 때의 실행결과를 적으시오.
 *
 * [실행결과]
 * main메서드에서 method1() 수행
 * method1메서드에서 method2() 수행
 * method2메서드에서 NullPointerException 발생, method2메서드에 try-catch 없으므로 method1메서드(호출한 메서드)로 돌아감
 * method1의 catch 괄호 중에는 NullPointerException 타입의 클래스가 없으므로 main메서드(호출한 메서드)로 돌아감
 * 돌아가기 전에 method1의 finally 블록에 있는 3 출력
 * main메서드에서 catch 괄호의 Exception 타입의 클래스에 대해 true를 반환하므로 catch 블록 안으로 들어가서 5 출력
 */
class Exercise8_6 {
	public static void main(String[] args) {
		try {
			method1();
		} catch(Exception e) {
			System.out.println(5);
		}
	}
	
	static void method1() {
		try {
			method2();
			System.out.println(1);
		} catch(ArithmeticException e) {
			System.out.println(2);
		} finally {
			System.out.println(3);
		}
		
		System.out.println(4);
	}	// method1의 끝
	
	static void method2() {
		throw new NullPointerException();
	}
}