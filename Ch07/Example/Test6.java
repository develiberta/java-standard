class Test6 {

	int varMember = 2;
	
	{ int varInBlock = 3; }
	
	Test6() {
		int varInConst = 5;
	}
		
	public static void main(String[] args) {
		
		Test6 test = new Test6();
		System.out.println(test.varMember);
		System.out.println(test.varInBlock);
//		System.out.println(test.varInConst);	// 컴파일 에러.
	}
}