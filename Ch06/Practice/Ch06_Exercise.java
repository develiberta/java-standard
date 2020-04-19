import java.util.*;
import java.lang.Math;

/*
 * Chapter6. Object-oriented Programming I
 * Answer about Exercise
 * 2020. 04. 19
 * written by LSH
 */

class Ch06_Exercise {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		outer:
		while(true) {
			System.out.print("문제 번호(1~24)를 입력하세요.(종료:0)>");
			int num = scanner.nextInt();
			switch(num) {
				case  0: break outer;
				case  1: Exercise1(); break;
				case  2: Exercise2(); break;
				case  3: Exercise3(); break;
				case  4: Exercise4(); break;
				case  5: Exercise5(); break;
				case  6: Exercise6(); break;
				case  7: Exercise7(); break;
				case  8: Exercise8(); break;
				case  9: Exercise9(); break;
				case 10: Exercise10(); break;
				case 11: Exercise11(); break;
				case 12: Exercise12(); break;
				case 13: Exercise13(); break;
				case 14: Exercise14(); break;
				case 15: Exercise15(); break;
				case 16: Exercise16(); break;
				case 17: Exercise17(); break;
				case 18: Exercise18(); break;
				case 19: Exercise19(); break;
				case 20: Exercise20(); break;
				case 21: Exercise21(); break;
				case 22: Exercise22(); break;
				case 23: Exercise23(); break;
				case 24: Exercise24(); break;
			}
		}
	}
	
	/* Exercise 6-1. 다음과 같은 멤버변수를 갖는 SutdaCard 클래스를 정의하시오.
	 * int num 카드의 숫자 (1~10 사이의 정수)
	 * boolean isKwang 광이면 true, 아니면 false
	 */
	private static void Exercise1() {
		System.out.println("[Exercise6_2 class]");
	}
	
	/* Exercise 6-2. 문제 6-1에서 정의한 SutdaCard 클래스에
	 * 두 개의 생성자와 info()를 추가해서 실행결과와 같은 결과를 얻도록 하시오.
	 * [실행결과]
	 * 3
	 * 1K
	 */
	private static void Exercise2() {
		System.out.println("[Exercise6_2 class]");
	}
	
	/* Exercise 6-3. 다음과 같은 멤버변수를 갖는 Student 클래스를 정의하시오.
	 * 타입		변수명		설명
	 * String	name		학생이름
	 * int		ban			반
	 * int		no			번호
	 * int		kor			국어점수
	 * int		eng			영어점수
	 * int		math		수학점수
	 */
	private static void Exercise3() {
		System.out.println("[Exercise6_4 class]");
	}
	
	/* Exercise 6-4. 문제 6-3에서 정의한 Student 클래스에
	 * 다음과 같이 정의된 두 개의 메서드 getTotal()과 getAverage()를 추가하시오.
	 * 1.	메서드명	:	getTotal
	 *		기능		:	국어(kor), 영어(eng), 수학(math)의 점수를 모두 더해서 반환
	 *		반환타입	:	int
	 *		매개변수	:	없음
	 * 2.	메서드명	:	getAverage
	 *		기능		:	총점(국어점수+영어점수+수학점수)을 과목 수로 나눈 평균을 구함
	 *					(소수점 둘째자리에서 반올림)
	 *		반환타입	:	float
	 *		매개변수	:	없음
	 */
	private static void Exercise4() {
		System.out.println("[Exercise6_4 class]");
	}
	
	/* Exercise 6-5. 다음과 같은 실행결과를 얻도록 Student 클래스에 생성자와 info()를 추가하시오.
	 * [실행결과]
	 * 홍길동,1,1,100,60,76,236,78.7
	 */
	private static void Exercise5() {
		System.out.println("[Exercise6_5 class]");
	}
	
	/* Exercis 6-6. 두 점의 거리를 계산하는 getDistance()를 완성하시오.
	 * [Hint] 제곱근 계산은 Math.sqrt(double a)를 사용하면 된다.
	 */
	private static void Exercise6() {
		System.out.println("[Exercise6_6 class]");
	}
	
	/* Exercise 6-7. 문제 6-6에서 작성한 클래스 메서드 getDistance()를
	 * MyPoint 클래스의 인스턴스 메서드로 정의하시오.
	 */
	private static void Exercise7() {
		System.out.println("[MyPoint class]");
	}
	
	/* Exercise 6-8. 다음의 코드에 정의된 변수들을 종류별로 구분해서 적으시오.
	 * 클래스변수 (static변수)	:
	 * 인스턴스변수				:
	 * 지역변수				:
	 */
	private static void Exercise8() {
		System.out.println("[PlayingCard class]");
		int kind;
		int num;
	
		static int width;
		static int height;
	
		PlayingCard(int k, int n) {
			kind = k;
			num = n;
		}
	
		public static void main(String args[]) {
			PlayingCard card = new PlayingCard(1,1);
		}
	}
	/*
	 * 클래스변수 (static변수)	: width, height
	 * 인스턴스변수				: kind, num
	 * 지역변수				: k, n
	 */
	
	/* Exercise 6-9. 다음은 컴퓨터 게임의 병사(marine)를 클래스로 정의한 것이다.
	 * 이 클래스의 멤버 중에 static을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가?
	 * (단, 모든 병사의 공격력과 방어력은 같아야 한다.)
	 */
	private static void Exercise9() {
		System.out.println("[Marine class]");
		int	x = 0, y = 0;			// Marine의 위치좌표(x,y)
		int hp		 = 60;			// 현재 체력
		int weapon	 = 6;			// 공격력
		int armor	 = 0;			// 방어력
	
		void weaponUp() {
			weapon++;
		}
	
		void armorUp() {
			armor++;
		}
		
		void move(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	/*
	 * weaponUp() 메서드와 armorUp() 메서드에 static을 붙여야 한다.
	 * 왜냐하면 모든 병사의 공격력과 방어력이 같아야 하기 때문이다.
	 * (붙이지 않는 경우 각 병사의 공격력과 방어력이 따로 설정된다.)
	 */
	
	/***************************************************************/
	/* Exercise 6-10. 다음 중 생성자에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
	 * a. 모든 생성자의 이름은 클래스의 이름과 동일해야 한다.
	 * b. 생성자는 객체를 생성하기 위한 것이다.
	 * c. 클래스에는 생성자가 반드시 하나 이상 있어야 한다.
	 * d. 생성자가 없는 클래스는 컴파일러가 기본 생성자를 추가한다.
	 * e. 생성자는 오버로딩 할 수 없다.
	 */
	private static void Exercise10() {
		/* (답) c (하나 이상 있어야 하는데, 생략할 경우 컴파일러가 자동 생성)*/
	}
	
	/* Exercise 6-11. 다음 중 this에 대한 설명으로 맞지 않은 것은? (모두 고르시오)
	 * a. 객체 자신을 가리키는 참조변수이다.
	 * b. 클래스 내에서라면 어디서든 사용할 수 있다.
	 * c. 지역변수와 인스턴스변수를 구별할 때 사용한다.
	 * d. 클래스 메서드 내에서는 사용할 수 없다.
	 */
	private static void Exercise11() {
		/* (답) d (클래스 메서드 내에서도 사용 가능) */
	}
	
	/* Exercise 6-12. 다음 중 오버로딩이 성립하기 위한 조건이 아닌 것은? (모두 고르시오)
	 * a. 메서드의 이름이 같아야 한다.
	 * b. 매개변수의 개수나 타입이 달라야 한다.
	 * c. 리턴타입이 달라야 한다.
	 * d. 매개변수의 이름이 달라야 한다.
	 */
	private static void Exercise12() {
		/* (답) c (리턴타입 상관없음), d (매개변수 이름은 메서드 내에서의 이름일 뿐 상관없음) */
	}
	
	/* Exercise 6-13. 다음 중 아래의 add 메서드를 올바르게 오버로딩 한 것은? (모두 고르시오)
	 * long add(int a, int b) { return a+b; }
	 * a. long add(int x, int y) { return x+y; }
	 * b. long add(long a, long b) { return a+b; }
	 * c. int add(byte a, byte b) { return a+b; }
	 * d. int add(long a, int b) { return (int)(a+b); }
	 */
	private static void Exercise13() {
		/* (답) a (매개변수의 개수, 타입을 확인) */
	}
	
	/* Exercise 6-14. 다음 중 초기화에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
	 * a. 멤버변수는 자동 초기화되므로 초기화하지 않고도 값을 참조할 수 있다.
	 * b. 지역변수는 사용하기 전에 반드시 초기화해야 한다.
	 * c. 초기화 블럭보다 생성자가 먼저 수행된다.
	 * d. 명시적 초기화를 제일 우선적으로 고려해야 한다.
	 * e. 클래스변수보다 인스턴스변수가 먼저 초기화된다.
	 */
	private static void Exercise14() {
		/* (답) 확인 필요 */
	}
	
	/* Exercise 6-15. 다음 중 인스턴스 변수의 초기화 순서가 올바른 것은?
	 * a. 기본값-명시적초기화-초기화블럭-생성자
	 * b. 기본값-명시적초기화-생성자-초기화블럭
	 * c. 기본값-초기화블럭-명시적초기화-생성자
	 * d. 기본값-초기화블럭-생성자-명시적초기화
	 */
	private static void Exercise15() {
		/* (답) 확인 필요 */
	}
	
	/* Exercise 6-16. 다음 중 지역변수에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
	 * a. 자동 초기화되므로 별도의 초기화가 필요없다.
	 * b. 지역변수가 선언된 메서드가 종료되면 지역변수도 함께 소멸된다.
	 * c. 메서드의 매개변수로 선언된 변수도 지역변수이다.
	 * d. 클래스변수나 인스턴스변수보다 메모리 부담이 적다.
	 * e. 힙(heap) 영역에 생성되며 가비지 컬렉터에 의해 소멸된다.
	 */
	private static void Exercise16() {
		/* (답) 확인 필요 */
	}
	
	/* Exercise 6-17. 호출스택이 다음과 같은 상황일 때 옳지 않은 설명은? (모두 고르시오)
	 * println
	 * method1
	 * method2
	 * main
	 * a. 제일 먼저 호출 스택에 저장된 것은 main 메서드이다.
	 * b. println 메서드를 제외한 나머지 메서드들은 모두 종료된 상태이다.
	 * c. method2 메서드를 호출한 것은 main 메서드이다.
	 * d. println 메서드가 종료되면 method1 메서드가 수행을 재개한다.
	 * e. main-method2-method1-println 의 순서로 호출되었다.
	 * f. 현재 실행 중인 메서드는 println 뿐이다.
	 */
	private static void Exercise17() {
		/* (답) b (대기 중인 상태) */
	}
	
	/* Exercise 6-18. 다음의 코드를 컴파일하면 에러가 발생한다.
	 * 컴파일 에러가 발생하는 라인과 그 이유를 설명하시오.
	 */
	private static void Exercise18() {
		System.out.println("[MemberCall class]");
		int iv = 10;
		static int cv = 20;
		
		int iv2 = cv;
//		static int cv2 = iv;			// 라인 A
		
		static void staticMethod1() {
			System.out.println(cv);
//			System.out.println(iv);		// 라인 B
		}
		
		void instanceMethod1() {
			System.out.println(cv);
			System.out.println(iv);		// 라인 C
		}
		
		static void staticMethod2() {
			staticMethod1();
//			instanceMethod1();			// 라인 D
		}
		
		void instanceMethod2() {
			staticMethod1();			// 라인E
			instanceMethod1();
		}
	}
	/*
	 * 라인 A : static 변수는 instance 변수를 복사(대입)할 수 없음
	 * 라인 B : static 메서드는 instance 변수를 호출할 수 없음
	 * 라인 D : static 메서드는 instance 메서드를 호출할 수 없음
	 */
	/***************************************************************/
	
	/* Exercise 6-19. 다음 코드의 실행 결과를 예측하여 적으시오.
	 */
	private static void Exercise19() {
		System.out.println("[Exercise6_19 class]");
	}
	
	/* Exercise 6-20. 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
	 * [주의] Math.random()을 사용하는 경우 실행결과와 다를 수 있음
	 * 메서드명	:	shuffle
	 * 기능		:	주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 함
	 *				처리한 배열을 반환
	 * 반환타입	:	int[]
	 * 매개변수	:	int[] arr (정수 값이 담긴 배열)
	 */
	private static void Exercise20() {
		System.out.println("[Exercise6_20 class]");	
	}
	
	/* Exercise 6-21. Tv 클래스를 주어진 로직대로 완성하시오.
	 * 완성한 후에 실행해서 주어진 실행결과와 일치하는지 확인하라.
	 * [참고] 코드를 단순하게 하기 위해서 유효성검사는 로직에서 제외했다.
	 * [실행결과]
	 * CH:100, VOL:0
	 * CH:99, VOL:0
	 * CH:100, VOL:100
	 */
	private static void Exercise21() {
		System.out.println("[MyTv class]");
	}
	
	/* Exercise 6-22. 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
	 * 메서드명	:	isNumber
	 * 기능		:	주어진 문자열이 모두 숫자로만 이루어져 있는지 확인
	 *				모두 숫자로만 이루어져 있으면 true 반환, 그렇지 않으면 false 반환
	 *				만일 주어진 문자열이 null이거나 빈 문자열 "" 이라면 false 반환
	 * 반환타입	:	boolean
	 * 매개변수	:	String str (검사할 문자열)
	 * [Hint] String 클래스의 charAt(int i) 메서드를 사용하면 문자열의 i번째 위치한 문자를 얻을 수 있다.
	 */
	private static void Exercise22() {
		System.out.println("[Exercise6_22 class]");
	}
	
	/* Exercise 6-23. 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
	 * 메서드명	:	max
	 * 기능		:	주어진 itn형 배열의 값 중에서 제일 큰 값을 반환
	 *				만일 주어진 배열이 null 이거나 크기가 0 인 경우, -999999 를 반환
	 * 반환타입	:	int
	 * 매개변수	:	int[] arr (최대값을 구할 배열)
	 */
	private static void Exercise23() {
		System.out.println("[Exercise6_23 class]");
	}
	
	/* Exercise 6-24. 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
	 * 메서드명	:	abs
	 * 기능		:	주어진 값의 절대값을 반환
	 * 반환타입	:	int
	 * 매개변수	:	int value
	 */
	private static void Exercise24() {
		System.out.println("[Exercise6_24 class]");
	}
	
}