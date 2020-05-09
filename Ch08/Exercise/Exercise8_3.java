/* Exercise 8-3. 다음 중 오버라이딩이 잘못된 것은? (모두 고르시오)
 * void add(int a, int b)
 * 		throws InvalidNumberException, NotANumberException {}
 *
 * class NumberException extends Exception {}
 * class InvalidNumberException extends NumberException {}
 * class NotANumberException extends NumberException {}
 *
 * [보기]
 * a. void add(int a, int b) throws InvalidNumberException, NotANumberException {}
 * b. void add(int a, int b) throws InvalidNumberException {}
 * c. void add(int a, int b) throws NotANumberException {}
 * d. void add(int a, int b) throws Exception {}
 * e. void add(int a, int b) throws NumberException {}
 *
 * [정답] d, e
 * (인스턴스 메서드) 오버라이딩 시에 원래 정의되어 있던 예외의 범위를 벗어나는 예외는 추가할 수 없다.
 *
 * [해설]
 * 오버라이딩(overriding)을 할 떄, 조상클래스의 메서드보다 많은 수의 예외를 선언할 수 없다.
 * 아래의 코드로 이 문제를 직접 테스트할 수 있다.
 */
class Exercise8_3 {
	public static void main(String[] args) {
	}
}

class Parent {
	int a;
	int b;
	
	Parent() {
		this(0,0);
	}
	
	Parent(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	void add(int a, int b)
		throws InvalidNumberException, NotANumberException {}
}

class Child extends Parent {
	Child() {}
	Child(int a, int b) {
		super(a, b);
	}
	
	void add(int a, int b)
		throws InvalidNumberException, NotANumberException {}
}
 
class NumberException extends Exception {}
class InvalidNumberException extends NumberException {}
class NotANumberException extends NumberException {}