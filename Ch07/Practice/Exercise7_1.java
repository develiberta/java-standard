/* Exercise 7-1. 섯다카드 20장을 포함하는 섯다카드 한 벌(SutdaDeck 클래스)을 정의한 것이다.
 * 섯다카드 20장을 담는 ShutdaCard 배열을 초기화하시오.
 * 단, 섯다카드는 1부터 10까지의 숫자가 적힌 카드가 한 쌍씩 있고,
 * 숫자가 1, 3, 8인 경우에는 둘 중의 한 장은 광(Kwang)이어야 한다.
 * 즉, ShutdaCard의 인스턴스변수 isKwang의 값이 true이어야 한다.
 * [by LSH] 6장 복습용으로 이해
 */
class Exercise7_1 {
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		
		for (int i=0; i<deck.cards.length; i++)
			System.out.print(deck.cards[i]+",");
	}
}

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		/* (1) 배열 SutdaCard를 적절히 초기화 하시오. */
		for (int i=0; i<CARD_NUM; i++) {
			boolean isKwang = false;
			if ((i==1-1 || i==3-1 || i==8-1) && i/10==0) isKwang = true;
			cards[i] = new SutdaCard((i)%10+1, isKwang);
		}
	}
}

class SutdaCard {
	int num;
	boolean isKwang;

	SutdaCard()	{
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	// info() 대신 Object클래스의 toString()을 오버라이딩
	public String toString() {
		return num + ( isKwang ? "K" : "");
	}
}