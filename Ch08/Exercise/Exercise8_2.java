/* Exercise 8-2. 다음은 실행 도중 예외가 발생하여 화면에 출력된 내용이다.
 * 이에 대한 설명 중 옳지 않은 것은?
 * java.lang.ArithmeticException : / by zero
 *		at ExceptionEx18.method2(ExceptionEx18.java:12)
 *		at ExceptionEx18.method1(ExceptionEx18.java:8)
 *		at ExceptionEx18.main(Exception18.java:4)
 *
 * [보기]
 * a. 위의 내용으로 예외가 발생했을 당시 호출스택에 존재했던 메서드를 알 수 있다.
 * b. 예외가 발생한 위치는 method2 메서드이며, Exception18.java 파일의 12번째 줄이다.
 * c. 발생한 예외는 ArithmeticException이며, 0으로 나누어서 예외가 발생했다.
 * d. method2메서드가 method1메서드를 호출했고 그 위치는 ExceptionEx18.java 파일의 8번째 줄이다.
 *
 * [정답] d
 * d. method1메서드가 method2메서드를 호출했고 그 위치는 ExceptionEx18.java 파일의 8번째 줄이다.
 *
 * [해설]
 * 예외의 종류는 ArithmeticException이고 0으로 나눠서 발생하였다.
 * 예외가 발생한 곳은 method2이고 ExceptionEx18.java의 12번째 줄이다.
 * 예외가 발생했을 당시의 호출스택을 보면 main-method1-method2의 순서로 호출되었음을 알 수 있다.
 */