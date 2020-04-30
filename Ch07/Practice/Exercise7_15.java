/* Exercise 7-15. 클래스가 다음과 같이 정의되어 있을 떄,
 * 형변환을 올바르게 하지 않은 것은? (모두 고르시오.)
 * class Unit {}
 * class AirUnit extends Unit {}
 * class GroundUnit extends Unit {}
 * class Tank extends GroundUnit {}
 * class AirCraft extends AirUnit {}
 *
 * Unit u = new GroundUnit();
 * Tank t = new Tank();
 * AirCraft ac = new AirCraft();
 *
 * [선택지]
 * a. u = (Unit)ac;
 * b. u = ac;
 * c. GroundUnit gu = (GroundUnit)u;
 * d. AirUnit au = ac;
 * e. t = (Tank)u;
 * f. GroundUnit gu = t;
 * [답]		e. 자손의 참조변수 타입에 조상을 담을 수는 없다.
 * [보충]	a. 명시적 형변환 안해도 된다.
 *			b. 가능하다.
 *			c. 명시적 형변환 해야 하며, 가능하다.
 *			d. 가능하다.
 *			e. 자손의 매개변수 타입에 조상을 담을 수는 없다.
 *			f. Tank클래스는 GroundUnit클래스의 자손클래스이므로 조상클래스 타입의 변수에 담을 수 있다.
 * [팁]		클래스간의 상속관계를 그림으로 그려보면 쉽게 알 수 있다.
 * [해설]	조상인스턴스를 자손타입으로 형변환하는 것은 허용하지 않는다.
 */