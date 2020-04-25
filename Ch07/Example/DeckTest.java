class DeckTest {
	public static void main(String args[]) {
		Deck d = new Deck();				// 카드 한 벌 생성
		Card c = d.pick(0);					// 섞기 전에 제일 위의 카드 뽑음
		System.out.println(c);				// System.out.println(c.toString()); 과 같은 의미
		
		d.shuffle();						// 카드 섞음
		c = d.pick(0);						// 섞은 후의 제일 위의 카드 뽑음
		System.out.println(c);
	}
}

class Deck {
	final int CARD_NUM = 52;				// 카드의 개수
	Card cardArr[] = new Card[CARD_NUM];	// Card 객체 배열을 포함
	
	Deck() { 								// Deck의 카드를 초기화하는 생성자
		int i = 0;
		
		for (int k=Card.KIND_MAX; k>0; k--)		// 무늬의 개수만큼
			for (int n=0; n<Card.NUM_MAX; n++)	// 무늬별 카드의 개수만큼
				cardArr[i++] = new Card(k, n+1);
	}
	
	Card pick (int index) {					// 지정된 위치(index)에 있는 카드 하나를 꺼내서 반환
		return cardArr[index];
	}
	
	Card pick() {							// 랜덤으로 카드 하나를 꺼내서 반환
		int index = (int)(Math.random() * CARD_NUM);
		return pick(index);
	}
	
	void shuffle() {						// 카드의 순서 섞음
		for (int i=0; i<cardArr.length; i++) {
			int r = (int)(Math.random() * CARD_NUM);
			
			Card tmp = cardArr[i];
			cardArr[i] = cardArr[r];
			cardArr[r] = tmp;
		}
	}
}	// Deck 클래스의 끝

class Card {
	static final int KIND_MAX	= 4;	// 카드 무늬의 개수
	static final int NUM_MAX	= 13;	// 무늬별 카드의 개수
	
	static final int SPADE		= 4;
	static final int DIAMOND	= 3;
	static final int HEART		= 2;
	static final int CLOVER		= 1;
	
	int kind;
	int number;
	
	Card() {
		this(SPADE, 1);
	}
	
	Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
		String numbers = "0123456789XJQK";	// 숫자 10은 X로 표현
		return "kind : " + kinds[this.kind] + ", number : " + numbers.charAt(this.number);
	}
}	// Card 클래스의 끝