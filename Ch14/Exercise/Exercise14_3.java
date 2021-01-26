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
 * [답안] d. BinaryOperator<Integer>
 * BinaryOperator 의 메서드 T apply(T t, T t) 를 참고
 */