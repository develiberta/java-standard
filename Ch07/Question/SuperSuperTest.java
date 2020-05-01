class SuperSuper {
	int i;

	SuperSuper() { i = 10;}
	
	void print() { System.out.print(i+", "); }
}


class Super extends SuperSuper {
	int i = 15;
	int j = 10;
	
	Super() { j = 20; }
	
	void print() { System.out.print(j+", "); }
	
	void superprint() { super.print(); }
}

class Sub extends Super {
	int k;

	Sub() { super(); k = 30; j = 30;}

	void print() {System.out.print(k+", "); }

	void test(){
		print();	
		super.superprint();
		System.out.print(super.j+", ");
		System.out.println(i);
	}
}

class SuperSuperTest {
	public static void main(String args[]) {
		Sub sub = new Sub();
		sub.test();
	}
}
/* [출력] 30, 10, 30, 15 */