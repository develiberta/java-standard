/* Exercise 14-3. 아래의 괄호 안에 알맞은 함수형 인터페이스는?
 * 
 * (     ) f;	// 함수형 인터페이스 타입의 참조변수
 * f = (int a, int b) -> a > b ? a : b;
 *
 * [보기]
 * a. Function
 * b. BiFunction
 * c. Predicate
 * d. BinaryOperator
 * e. IntFunction
 *
 * [답안] d. BinaryOperator<Integer> (엄밀히는 틀림)
 *
 * [해설] IntBinaryOperator(BinaryOperator의 자식)를 사용해야 함
 * BinaryOperator 의 메서드 T apply(T t, T t) 를 참고
 * BiFunction은 두 개의 매개변수를 갖지만, int와 같은 기본형은 사용할 수 없음
 * 만일 매개변수의 타입을 생략했다면, BinaryOperator<Integer>로 다룰 수도 있음
 * 아래의 두 문장은 동일
 * BinaryOperator<Integer> f = (a, b) -> a > b ? a : b;
 * BinaryOperator<Integer> f = (Integer a, Integer b) -> a > b ? a : b;
 */