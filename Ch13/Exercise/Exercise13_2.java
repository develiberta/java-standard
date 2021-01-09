/* Exercise 13-2. 다음 코드의 실행결과로 옳은 것은?
 *
 * [보기]
 * a. 01021233454567689789처럼 0부터 9까지의 숫자가 섞여서 출력된다.
 * b. 01234567890123456789처럼 0부터 9까지의 숫자가 순서대로 출력된다.
 * c. IllegalThreadStateException이 발생한다.
 *
 * [정답] b
 * b. 01234567890123456789처럼 0부터 9까지의 숫자가 순서대로 출력된다.
 *
 * [해설]
 * t1.start()을 수행해야 스레드를 실행 즉, 새로운 호출스택을 생성한 후 run()을 수행하는데,
 * 다음 코드에서는 t1.run()을 수행해서 단순히 현재 호출스택(main스레드)에서 다른 객체의 run() 메서드를 호출한 것이 되고,
 * 싱글스레드로 숫자를 출력하는 작업이 순차적으로 진행되는 것이다.
 */
class Exercise13_2 {
	public static void main(String[] args) {
		Thread2 t1 = new Thread2();
		t1.run();
		
		for (int i=0; i<10; i++) {
			System.out.print(i);
		}
	}
}

class Thread2 extends Thread {
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.print(i);
		}
	}
}