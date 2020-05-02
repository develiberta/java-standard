/* Exercise 7-18. 다음과 같은 실행결과를 얻도록 코드를 완성하시오.
 * [Hint] instanceof연산자를 사용해서 형변환한다.
 * 메서드명	:	action
 * 기능		:	주어진 객체의 메서드를 호출한다.
 *				DanceRobot인 경우, dance()를 호출하고,
 *				SingRobot인 경우, sing()를 호출하고,
 *				DrawRobot인 경우, draw()를 호출한다.
 * 반환타입	:	없음
 * 매개변수	:	Robot r - Robot인스턴스 또는 Robot의 자손인스턴스
 */
class Exercise7_18 {
	
	/* (1) action메서드를 작성하시오. */
	static void action(Robot r) {
		// action메서드 내에서는 실제로 받아온 인스턴스가 어떤 것인지 알 수 없다.
		// 단지 Robot클래스 또는 그 자손클래스의 인스턴스일 것이라는 것만 알 수 있다.
		// 그래서 instanceof연산자를 이용해야만 실제 인스턴스의 타입을 확인할 수 있다.
		if(r instanceof DanceRobot) {
			DanceRobot dr = (DanceRobot)r;
			dr.dance();
		} else if(r instanceof SingRobot) {
			SingRobot sr = (SingRobot)r;
			sr.sing();
		} else if(r instanceof DrawRobot) {
			DrawRobot dr = (DrawRobot)r;
			dr.draw();
		}
	}
	
	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
		
		for (int i=0; i<arr.length; i++)
			action(arr[i]);
	}	// main
}

class Robot {}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}