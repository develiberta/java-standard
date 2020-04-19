class Exercise6_2 {
	public static void main(String args[]) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}
}

/* Exercise 6-1. 다음과 같은 멤버변수를 갖는 SutdaCard 클래스를 정의하시오.
 * int num 카드의 숫자 (1~10 사이의 정수)
 * boolean isKwang 광이면 true, 아니면 false
 */
/* Exercise 6-2. 문제 6-1에서 정의한 SutdaCard 클래스에
 * 두 개의 생성자와 info()를 추가해서 실행결과와 같은 결과를 얻도록 하시오.
 * [실행결과]
 * 3
 * 1K
 */
class SutdaCard {
//	int num = 1;			// 카드의 숫자 (1~10 사이의 정수)
//	boolean isKwang = true;	// 광이면 true, 아니면 false

	/* 답안이 더 적합해보여서 첨부 */
	int num;
	boolean isKwang;
	
	/* (1) 알맞은 코드를 넣어 완성하시오. */
	/* 답안이 더 적합해보여서 첨부 */
//	SutdaCard() {}
	SutdaCard() {
		this(1, true);	// SutdaCard(1, true)를 호출
	}
	// 해설 : 매개변수가 없는 기본 생성자를 정의할 때, 명시적 초기화를 할 수도 있지만
	// 위의 코드와 같이 기존의 코드를 호출하는 것이 더 좋은 코드
	// 재사용성이 더 높고 나중에 코드를 수정할 때도 유리
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info() {
		return num + (isKwang ? "K" : "");
	}
}