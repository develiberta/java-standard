class Super {
    int x = 1;
	int y = 2;
}

class Sub1 extends Super {
    int x = 3;
	int y = 4;
	int z = 5;
	
	Sub1() {
		super();	// 생략 가능
		super.x = 6;
		System.out.println(super);
	}
	
}

class Sub2 extends Super {
	int x = 3;
	int y = 4;
	int z = 5;
	
	Sub2() {
		super();
		super.x = 7;
		System.out.println(super);
	}
}

class Test5 {
    public static void main(String[] args) {
		Super s1 = new Sub1();
		Super s2 = new Sub2();
		
		System.out.println(s1.x);
		System.out.println(s2.x);
		System.out.println(s1);
		System.out.println(s2);
    }
}

/* this와 super는 모두 참조변수로 인스턴스 자신을 가리킨다.
 * 근본적으로 둘은 같지만 부모로부터 상속받은 멤버와 자신이 재정의한 멤버를 구분할 때 사용한다.
 */