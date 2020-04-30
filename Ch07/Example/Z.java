class X {
	int i;

	X() { i = 10;}
	
	void print() { System.out.print(i+","); }
}


class Y extends X {
	int i = 15;
	int j = 10;
	
	Y() { j = 20; }
	
	void print() { System.out.print(j+","); }
	
	void superprint() { super.print(); }
}

class Z extends Y {
	int k;

	Z() { super(); k=30; j=30;}
	
	public static void main(String args[]) {
		Z z = new Z();
		z.test();
	}

	void print() {System.out.print(k+","); }

	void test(){
		print( );	
		super.superprint();
		System.out.print(super.j+",");
		System.out.println(i);
	}
}
/* [출력] 30, 10, 30, 15 */