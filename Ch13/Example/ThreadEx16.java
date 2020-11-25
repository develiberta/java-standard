class ThreadEx16 {
	public static void main(String args[]) {
		RunImplEx16 r1 = new RunImplEx16();
		RunImplEx16 r2 = new RunImplEx16();
		RunImplEx16 r3 = new RunImplEx16();
		
		Thread th1 = new Thread(r1, "*");
		Thread th2 = new Thread(r2, "**");
		Thread th3 = new Thread(r3, "***");
		// [by LSH] 다음과 같이 하나의 객체를 생성한 후,
		//			그 객체를 매개변수로 새로운 객체를 여러 개 생성하면,
		// 			매개변수 객체의 인스턴스 변수가 달라짐에 따라, 새로운 객체들이 모두 영향을 받는다.
		// RunImplEx16 testR = new RunImplEx16();
		// Thread testTh1 = new Thread(testR);
		// Thread testTh2 = new Thread(testR);
		// Thread testTh3 = new Thread(testR);
		//			그러므로 Runable 객체를 여러 개 생성한 것이다.
		
		th1.start();
		th2.start();
		th3.start();
		
		try {
			Thread.sleep(2000);	// [by LSH] main 이 흐르는 시간 관장
			r1.suspend();
			Thread.sleep(2000);
			r2.suspend();
			Thread.sleep(3000);
			r1.resume();
			Thread.sleep(3000);
			r1.stop();
			r2.stop();
			Thread.sleep(2000);
			r3.stop();
		} catch (InterruptedException e) {}
	}
}

class RunImplEx16 implements Runnable {
	volatile boolean suspended = false;
	volatile boolean stopped = false;
	
	public void run() {
		while(!stopped) {
			if(!suspended) {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(1000);	// [by LSH] 출력하는 단위 시간 관장
				} catch(InterruptedException e) {}
			}
//			System.out.print("");
		}
		System.out.println(Thread.currentThread().getName() + " - stopped");
	}
	
	public void suspend() { suspended = true; }
	public void resume() { suspended = false; }
	public void stop() { stopped = true; }
}