class ThreadEx20 {
	public static void main(String args[]) {
		ThreadEx20_1 gc = new ThreadEx20_1();
		gc.setDaemon(true);
		gc.start();
		
		int requiredMemory = 0;
		
		for (int i=0; i<20; i++) {
			requiredMemory = (int) (Math.random() * 10) * 20;
			
			// 필요한 메모리가 사용할 수 있는 양보다 크거나 전체 메모리의 60% 이상을 사용했을 경우 gc를 깨움
			if (gc.freeMemory() < requiredMemory || gc.freeMemory() < gc.totalMemory() * 0.4) {
				gc.interrupt();		// 잠자고 있는 스레드 gc를 깨움
				/* (추가) gc가 작업할 시간을 어느 정도 주고 main 스레드가 기다리게 해서, 사용할 수 있는 메모리가 확보된 다음에 작업하도록 함 */
				try {
					gc.join(100);
				} catch(InterruptedException e) {}
			}
			
			gc.usedMemory += requiredMemory;
			System.out.println("usedMemory : " + gc.usedMemory);
		}
	}
}

class ThreadEx20_1 extends Thread {
	final static int MAX_MEMORY = 1000;
	int usedMemory = 0;
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(10 * 1000);	// 10초 기다림
			} catch(InterruptedException e) {
				System.out.println("Awaken by interrupt().");
			}
			
			gc();	// garbage collection 수행
			System.out.println("Garbage Collected. Free Memory : " + freeMemory());
		}
	}
	
	public void gc() {
		usedMemory -= 300;
		if (usedMemory < 0 ) usedMemory = 0;
	}
	
	public int totalMemory()	{ return MAX_MEMORY;				}
	public int freeMemory()		{ return MAX_MEMORY - usedMemory;	}
}