/* Exercise 7-16. 다음 중 연산결과가 true가 아닌 것은? (모두 고르시오)
 * class Car {}
 * class FireEngine extends Car implements Movable {}
 * class Ambulance extends Car {}
 * FireEngine fe = new FireEngine();
 *
 * [선택지]
 * a. fe instanceof FireEngine
 * b. fe instanceof Movable
 * c. fe instanceof Object
 * d. fe instanceof Car
 * e. fe instanceof Ambulance
 *
 * [답]
 * e. FireEngine은 Ambulance와 관련없다.
 *
 * [보충]	
 * 해당 클래스의 자손객체이거나 구현객체이면 instanceof가 true를 반환한다.
 * a. fe는 FireEngine객체이다.
 * b. fe는 Movable인터페이스를 구현했다.
 * c. fe는 최고조상인 Object클래스의 자손객체이다.
 * d. fe는 Car클래스의 자손객체이다.
 *
 * [팁]
 * 클래스간의 상속관계 및 인터페이스 구현관계를 그림으로 그려보면 쉽게 알 수 있다. 
 */