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
	int num = 1;			// 카드의 숫자 (1~10 사이의 정수)
	boolean isKwang = true;	// 광이면 true, 아니면 false
	
	/* (1) 알맞은 코드를 넣어 완성하시오. */
	SutdaCard() {}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info() {
		return num + (isKwang ? "K" : "");
	}
}