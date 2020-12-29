/* Exercise 13-1. 스레드를 구현하는 방법에는 Thread클래스로부터 상속받는 것과 Runnable인터페이스를 구현하는 두 가지가 있는데,
 * 다음의 코드는 Thread클래스를 상속받아서 스레드를 구현한 것이다.
 * 이 코드를 Runnable인터페이스를 구현하도록 변경하시오.
 */
class Exercise13_1 {
	public static void main(String[] args) {
		Thread1 th1 = new Thread1();
		th1.start();
		
		Runnable r = new Thread2();
		Thread t2 = new Thread(r);
		t2.start();
	}
}

class Thread1 extends Thread {
	public void run() {
		for (int i=0; i<300; i++) {
			System.out.print('-');
		}
	}
}

class Thread2 implements Runnable {
	public void run() {
		for (int i=0; i<300; i++) {
			System.out.print('|');
		}
	}
}