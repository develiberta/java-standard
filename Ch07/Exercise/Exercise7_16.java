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
 *
 * [해설]
 * instanceof연산자는 실제 인스턴스의 모든 조상이나 구현한 인터페이스에 대해 true를 반환한다.
 * 어떤 타입에 대해 instanceof 연산결과가 true라는 것은 그 타입으로 형변환이 가능하다는 것을 뜻한다.
 * 참조변수의 형변환을 하기에 앞서 instanceof연산자로 형변환이 가능한지 미리 확인해 보는 것이 좋다.
 */