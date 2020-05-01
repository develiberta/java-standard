class NoDefinitionInInitBlockAndConstructor {

	int varMember = 2;
	
	{ int varInBlock = 3; }
	
	NoDefinitionInInitBlockAndConstructor() {
		int varInConst = 5;
	}
		
	public static void main(String[] args) {
		
		NoDefinitionInInitBlockAndConstructor test = new NoDefinitionInInitBlockAndConstructor();
		System.out.println(test.varMember);
//		System.out.println(test.varInBlock);	// 컴파일 에러.
//		System.out.println(test.varInConst);	// 컴파일 에러.
	}
}