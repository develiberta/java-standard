class RepairableTest {
	public static void main(String[] args) {
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		
		Marine marine = new Marine();
		SCV scv = new SCV();
		
		scv.repair(tank);	// SCV가 Tank 수리
		scv.repair(dropship);
//		scv.repair(marine);	// 컴파일 에러
	}
}

interface Repairable {}

class Unit {
	int hitPoint;
	final int MAX_HP;
	Unit(int hp) {
		MAX_HP = hp;
		hitPoint = MAX_HP;	// 리팩토링. 부모의 멤버변수는 부모의 생성자가 초기화하도록 함
	}
	// ...
}

class GroundUnit extends Unit {
	GroundUnit(int hp) {
		super(hp);
	}
}

class AirUnit extends Unit {
	AirUnit(int hp) {
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable {
	Tank() {
		super(150);	// Tank의 HP는 150
//		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Tank";
	}
	// ...
}

class Dropship extends AirUnit implements Repairable {
	Dropship() {
		super(125);	// Dropship의 HP는 125
//		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Dropship";
	}
	// ...
}

class Marine extends GroundUnit {
	Marine() {
		super(40);
//		hitPoint = MAX_HP;
	}
	// ...
}

class SCV extends GroundUnit implements Repairable {
	SCV() {
		super(60);
//		hitPoint = MAX_HP;
	}
	
	void repair(Repairable r) {
		if (r instanceof Unit) {
			Unit u = (Unit)r;
			while(u.hitPoint!=u.MAX_HP) {
				/* Unit의 HP를 증가시킴 */
				u.hitPoint++;
			}
			System.out.println(u.toString() + "의 수리가 끝났습니다.");
		}
	}
	// ...
}