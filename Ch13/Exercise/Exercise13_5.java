/* Exercise 13-5. 다음의 코드를 실행한 결과를 예측하고, 직접 실행한 결과와 비교하라.
 * 만일 예측한 결과와 실행한 결과의 차이가 있다면 그 이유를 설명하라.
 */
class Exercise13_5 {
	public static void main(String[] args) throws Exception {
		Thread2 th1 = new Thread2();
		th1.start();
		
		try {
			Thread.sleep(5*1000);
		} catch (Exception e) {}
		
		throw new Exception("꽝");
	}
}

class Thread2 extends Thread {
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
		}
	}
}
/*
 * [결과예측]
 * 0
 * 1
 * 2
 * 3
 * 4
 * 꽝 에러메시지
 *
 * [실행결과]
 * 0
 * 1
 * 2
 * 3
 * 4
 * 꽝 에러메시지
 * 5
 * 6
 * 7
 * 8
 * 9
 *
 * [다른이유]
 * main 스레드가 종료되었다고 해도 다른 스레드는 종료되지 않는다.
 */