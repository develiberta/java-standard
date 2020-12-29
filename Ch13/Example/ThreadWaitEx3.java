import java.util.ArrayList;

class ThreadWaitEx3 {
	public static void main(String[] args) throws Exception {
		Table table = new Table();
		
		new Thread(new Cook(table), "COOK1").start();
		new Thread(new Customer(table, "donut"), "CUST1").start();
		new Thread(new Customer(table, "burger"), "CUST2").start();
		
		Thread.sleep(5000);
		System.exit(0);
	}
}

class Customer implements Runnable {
	private Table table;
	private String food;
	
	Customer(Table table, String food) {
		this.table = table;
		this.food = food;
	}
	
	public void run() {
		while (true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
			String name = Thread.currentThread().getName();
			
			table.remove(food);
			System.out.println(name + " ate a " + food);
		}
	}
}

class Cook implements Runnable {
	private Table table;
	
	Cook(Table table) {
		this.table = table;
	}
	
	public void run() {
		while (true) {
			int idx = (int)(Math.random() * table.dishNum());
			table.add(table.dishNames[idx]);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
		}
	}
}

class Table {
	String[] dishNames = { "donut", "donut", "burger" };
	final int MAX_FOOD = 6;
	
	private ArrayList<String> dishes = new ArrayList<>();
	
	public synchronized void add(String dish) {
		while (dishes.size() >= MAX_FOOD) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " is waiting.");
			try {
				wait();	// COOK 스레드를 기다리게 한다.
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
		dishes.add(dish);
		notify();	// 기다리고 있는 CUST 스레드를 깨운다.
		System.out.println("Dishes : " + dishes.toString());
	}
	
	public void remove(String dishName) {
		synchronized(this) {
			String name = Thread.currentThread().getName();

			while (dishes.size() == 0) {
				System.out.println(name + " is waiting.");
				try {
					wait();	// CUST 스레드를 기다리게 한다.
					Thread.sleep(500);
				} catch (InterruptedException e) {}
			}
			while(true) {
				for (int i=0; i<dishes.size(); i++) {
					if (dishName.equals(dishes.get(i))) {
						dishes.remove(i);
						notify();	// 기다리고 있는 COOK 스레드를 꺠운다.
						return;
					}
				}
				
				try {
					System.out.println(name + " is waiting.");
					wait();	// 원하는 음식이 없는 CUST 스레드를 기다리게 한다.
					Thread.sleep(500);
				} catch (InterruptedException e) {}
			}
		}
	}
	
	public int dishNum() {
		return dishNames.length;
	}
}