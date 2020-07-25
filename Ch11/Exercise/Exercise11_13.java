import java.util.*;

/* Exercise 11-13. 다음 코드는 문제11-12를 발전시킨 것으로
 * 각 Player들의 점수를 계산하고, 점수가 제일 높은 사람을 출력하는 코드이다.
 * TreeMap의 정렬기준을 점수가 제일 높은 사람부터 내림차순이 되도록 아래의 코드를 완성하시오.
 * 단, 동점자 처리는 하지 않는다.
 */
class Exercise11_13 {
	public static void main(String[] args) throws Exception {
		SutdaDeck deck = new SutdaDeck();
		
		deck.shuffle();
		
		Player[] pArr = {
			new Player("타짜", deck.pick(), deck.pick()),
			new Player("고수", deck.pick(), deck.pick()),
			new Player("물주", deck.pick(), deck.pick()),
			new Player("중수", deck.pick(), deck.pick()),
			new Player("하수", deck.pick(), deck.pick())
		};
		
		TreeMap rank = new TreeMap(new Comparator() {
			public int compare(Object o1, Object o2) {
				if(o1 instanceof Player && o2 instanceof Player) {
					Player p1 = (Player)o1;
					Player p2 = (Player)o2;
					
					return p2.point - p1.point;	// 점수 내림차순 정렬
				} else {
					return -1;
				}
			}
		});
		
		for(int i=0; i<pArr.length; i++) {
			Player p = pArr[i];
			rank.put(p, deck.getPoint(p));	// [by LSH] 일단 이렇게 put 한 후 자리가 결정됨
			System.out.println(p + " " + deck.getPoint(p));
		}
		
		System.out.println();
		System.out.println("1위는 " + rank.firstKey() + "입니다.");
	}
}

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	int pos = 0;					// 다음에 가져올 카드의 위치
	HashMap jokbo = new HashMap();	// 족보를 저장할 HashMap
	
	SutdaDeck() {
		for(int i=0; i<cards.length; i++) {
			int num = i%10 + 1;
			boolean isKwang = i<10 && (num==1 || num==3 || num==8);
			
			cards[i] = new SutdaCard(num, isKwang);
		}
		registerJokbo();	// 족보를 등록한다.
	}
	
	void registerJokbo() {
		/* (1) 아래의 로직에 맞게 코드를 작성하시오.
		 *	1. jokbo(HashMap)에 족보를 저장한다.
		 *	   두 카드의 값을 문자열로 붙여서 key로, 점수를 value로 저장한다.
		 */
		 jokbo.put("KK", 4000);
		 jokbo.put("1010", 3100);
		 jokbo.put("99", 3090);
		 jokbo.put("88", 3080);
		 jokbo.put("77", 3070);
		 jokbo.put("66", 3060);
		 jokbo.put("55", 3050);
		 jokbo.put("44", 3040);
		 jokbo.put("33", 3030);
		 jokbo.put("22", 3020);
		 jokbo.put("11", 3010);
		 jokbo.put("12", 2060);
		 jokbo.put("21", 2060);
		 jokbo.put("14", 2050);
		 jokbo.put("41", 2050);
		 jokbo.put("19", 2040);
		 jokbo.put("91", 2040);
		 jokbo.put("110", 2030);
		 jokbo.put("101", 2030);
		 jokbo.put("104", 2020);
		 jokbo.put("410", 2020);
		 jokbo.put("46", 2010);
		 jokbo.put("64", 2010);
	}
	
	int getPoint(Player p) {
		if(p==null) return 0;
		
		SutdaCard c1 = p.c1;
		SutdaCard c2 = p.c2;
		
		Integer result = 0;
		
		/* (2) 아래의 로직에 맞게 코드를 작성하시오.
		 *	1. 카드 두 장이 모두 광이면, jokbo에서 키를 "KK"로 해서 점수를 조회한다.
		 *	2. 두 카드의 숫자(num)로 jokbo에서 등급을 조회한다.
		 *	3. 해당하는 등급이 없으면, 아래의 공식으로 점수를 계산한다.
		 *	   (c1.num + c2.num) & 10 + 1000
		 *	4. Player의 점수(point)에 계산한 값을 저장한다.
		 */
		 if(c1.isKwang && c2.isKwang) {
			 result = (Integer)jokbo.get("KK");
		 } else {
			 result = (Integer)jokbo.get(""+c1.num+c2.num);
			 if(result==null) {
				 result = new Integer((c1.num + c2.num) % 10 + 1000);
			 }
		 }
		 
		 p.point = result.intValue();
		 
		 return result.intValue();
	}
	
	SutdaCard pick() throws Exception {
		SutdaCard c = null;
		
		if(0<=pos && pos<CARD_NUM) {
			c = cards[pos];
			cards[pos++] = null;
		} else {
			throw new Exception("남아있는 카드가 없습니다.");
		}
		
		return c;
	}
	
	void shuffle() {
		for(int x=0; x<CARD_NUM*2; x++) {
			int i = (int)(Math.random() * CARD_NUM);
			int j = (int)(Math.random() * CARD_NUM);
			
			SutdaCard tmp = cards[i];
			cards[i] = cards[j];
			cards[j] = tmp;
		}
	}
}	// SutdaDeck클래스의 끝

class Player {
	String name;
	SutdaCard c1;
	SutdaCard c2;
	
	int point;	// 카드의 등급에 따른 점수
	
	Player(String name, SutdaCard c1, SutdaCard c2) {
		this.name = name;
		this.c1 = c1;
		this.c2 = c2;
	}
	
	public String toString() {
		return "[" + name + "]" + c1.toString() + ", " + c2.toString();
	}
}	// Player클래스의 끝

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String toString() {
		return num + (isKwang ? "K":"");
	}
}