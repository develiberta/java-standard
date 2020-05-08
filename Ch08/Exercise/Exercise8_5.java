/* Exercise 8-5. 아래의 코드가 수행되었을 때의 실행결과를 적으시오.
 *
 * [실행결과]
 * (i)	method(true) 수행
 *		1 출력
 *		ArithmeticException 발생 (ArithmeticException 은 RuntimeException 의 자손)
 *		3 출력
 *		return 에 의해 메서드를 빠져나가게 됨
 *		빠져나가기 전에 5 출력
 * (ii)	method(false) 수행
 *		1 출력
 *		2 출력
 *		5 출력
 *		6 출력
 */
class Exercise8_5 {
	static void method(boolean b) {
		try {
			System.out.println(1);
			if(b) throw new ArithmeticException();
			System.out.println(2);
		} catch(RuntimeException r) {
			System.out.println(3);
			return;
		} catch(Exception e) {
			System.out.println(4);
			return;
		} finally {
			System.out.println(5);
		}
		
		System.out.println(6);
	}
	
	public static void main(String[] args) {
		method(true);
		method(false);
	}	// main
}