/* Exercise 7-15. 클래스가 다음과 같이 정의되어 있을 떄,
 * 형변환을 올바르게 하지 않은 것은? (모두 고르시오.)
 * class Unit {}
 * class AirUnit extends Unit {}
 * class GroundUnit extends Unit {}
 * class Tank extends Ground Unit {}
 * class AirCraft extends AirUnit {}
 *
 * Unit u = new GroundUnit();
 * Tank t = new Tank();
 * AirCraft ac = new AirCraft();
 *
 * a. u = (Unit)ac;
 * b. u = ac;
 * c. GroundUnit gu = (GroundUnit)u;
 * d. AirUnit au = ac;
 * e. t = (Tank)u;
 * f. GroundUnit gu = t;
 * [답]		e. 자손의 매개변수 타입에 조상을 담을 수는 없다.
 *			f. GroundUnit과 Tank는 상속관계가 아니므로 서로 형변환 불가능하다.
 * [보충]	a. 명시적 형변환 안해도 된다.
 *			b. 가능하다.
 *			c. 명시적 형변환 해야 하며, 가능하다.
 *			d. 가능하다.
 *			e. 자손의 매개변수 타입에 조상을 담을 수는 없다.
 *			f. GroundUnit과 Tank는 상속관계가 아니므로 서로 형변환 불가능하다.
 */