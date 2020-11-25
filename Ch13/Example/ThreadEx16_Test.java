class ThreadEx16_Test {
	public static void main(String args[]) {
		RunImplEx16_Test r1 = new RunImplEx16_Test();
		
		Thread th1 = new Thread(r1, "*");
		
		th1.start();
		
		try {
			Thread.sleep(2000);
			r1.suspend();
			Thread.sleep(3000);
			r1.resume();
			Thread.sleep(3000);
			r1.stop();
		} catch (InterruptedException e) {}
	}
}

class RunImplEx16_Test implements Runnable {
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
			/* */
//			System.out.println("now suspended");
		}
		System.out.println(Thread.currentThread().getName() + " - stopped");
	}
	
	public void suspend() { suspended = true; }
	public void resume() { suspended = false; }
	public void stop() { stopped = true; }
}