class ThreadEx21 {
	public static void main(String args[]) {
		Runnable r = new RunnableEx21();
		new Thread(r).start();	// ThreadGroup 에 의해 참조되므로 gc 대상이 아님
		new Thread(r).start();	// ThreadGroup 에 의해 참조되므로 gc 대상이 아님
	}
}

class Account {
	private int balance = 1000;
	
	public int getBalance() {
		return balance;
	}
	
	public void withdraw(int money) {
		if (balance >= money) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			balance -= money;
		}
	}
}

class RunnableEx21 implements Runnable {
	Account acc = new Account();
	
	public void run() {
		while (acc.getBalance() > 0) {
			// 100, 200, 300 중의 한 값을 임의로 선택해서 출금(withdraw)
			int money = (int)(Math.random() * 3 + 1) * 100;
			acc.withdraw(money);
			System.out.println("balance : " + acc.getBalance());
		}
	}	// run()
}