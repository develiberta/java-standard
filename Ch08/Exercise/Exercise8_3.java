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
 */