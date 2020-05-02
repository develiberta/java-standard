class instanceToStatic {

	public static void main(String[] args) {
		System.out.println(Parent.s);	// 5
		System.out.println(Child.i);	// 15
		
		System.out.println(Parent.parentMethod1());	// parentMethod1
		System.out.println(Child.childMethod1());	// childMethod1
		
		Parent test1 = new Parent();	
		Parent test2 = new Child();
		Child test3 = new Child();
		
		System.out.println(test1.i);	// 10
		System.out.println(test2.i);	// 10
		System.out.println(test3.s);	// 20
		
		System.out.println(test1.parentMethod2());	// parentMethod2
		System.out.println(test2.parentMethod2());	// parentMethod2
		System.out.println(test3.childMethod2());	// childMethod2
		
	}

}

class Parent {
	static int s = 5;
	int i = 10;
	
	static String parentMethod1() {
		return "parentMethod1";
	}
	
	String parentMethod2() {
		return "parentMethod2";
	}
	
	static String method1() {
		return "method1 in Parent";
	}
	
	String method2() {
		return "method2 in Parent";
	}
}

class Child extends Parent {
	static int i = 15;		// 가능. 컴파일 에러 없음
	int s = 20;				// 가능. 컴파일 에러 없음
	
	static String childMethod1() {
		return "childMethod1";
	}
	
	String childMethod2() {
		return "childMethod2";
	}
	
//	String method1() {				// 불가능. 컴파일 에러 (오버라이딩 불가능)
//		return "method1 in Child";
//	}
	
//	static String method2() {		// 불가능. 컴파일 에러 (오버라이딩 불가능)
//		return "method2 in Child";
//	}
}