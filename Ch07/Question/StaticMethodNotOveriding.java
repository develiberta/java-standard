class StaticMethodNotOveriding {
	public static void main(String[] args) {
		Sub s = new Sub();
		Super s2 = new Sub();
		Super s3 = new Super();
		
		System.out.println(s.a);		// 10
		System.out.println(s.m());		// Sub의 m 호출
		System.out.println(s2.a);		// 5
		System.out.println(s2.m());		// Super의 m 호출 (오버라이딩 안됨)
		System.out.println(s3.a);		// 5
		System.out.println(s3.m());		// Super의 m 호출
	}
}

class Super {
	static int a = 5;
	static String m() {
		return "Super의 m 호출";
	}
}

class Sub extends Super {
	static int a = 10;
	static String m() {
		return "Sub의 m 호출";
	}
}