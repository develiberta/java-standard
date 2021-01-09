/* Exercise 13-6. 다음의 코드를 실행한 결과를 예측하고, 직접 실행한 결과와 비교하라.
 * 만일 예측한 결과와 실행한 결과의 차이가 있다면 그 이유를 설명하라.
 */
class Exercise13_6 {
	public static void main(String[] args) throws Exception {
		Thread4 th1 = new Thread4();
		th1.setDaemon(true);
		th1.start();
		
		try {
			Thread.sleep(5*1000);
		} catch (Exception e) {}
		
		throw new Exception("꽝");
	}
}

class Thread4 extends Thread {
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
 *
 * [해설]
 * 데몬 스레드는 일반 스레드(데몬 스레드가 아닌 스레드)가 모두 종료되면 자동 종료되므로,
 * main 스레드(일반 스레드)가 종료됨과 동시에 데몬 스레드인 th1 이 자동 종료된다.
 */