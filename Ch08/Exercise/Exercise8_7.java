/* Exercise 8-7. 아래의 코드가 수행되었을 때의 실행결과를 적으시오.
 *
 * [실행결과]
 * (i)	method(true) 수행
 *		1 출력
 *		System.exit(0) 수행
 *		try문을 빠져나가며 5 출력 -- 라고 예측했지만 5는 출력되지 않음
 *		(예외 상황이 발생하지 않고 정상 수행되거나 예외 상황의 발생으로 try문을 빠져나가는 경우에만 수행됨)
 * (ii)	method(false) 수행
 *		는 수행되지 않음 (시스템이 종료되었기 때문)
 */
class Exercise8_7 {
	public static void main(String[] args) {
		method(true);
		method(false);
	}
	
	static void method(boolean b) {
		try {
			System.out.println(1);
			if(b) System.exit(0);		// 이 경우에는 finally블럭이 수행되지 않음
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
}