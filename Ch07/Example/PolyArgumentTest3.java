import java.util.*;		// Vector 클래스를 사용하기 위해서 추가

class Product {
	int price;			// 제품의 가격
	int bonusPoint;		// 제품 구매 시 제공하는 보너스 점수
	
	Product(int price) {
		this.price = price;
		bonusPoint = price/10;
	}
	
	Product() {
		price = 0;
		bonusPoint = 0;
	}
}

class Tv extends Product {
	Tv() { super(100); }
	public String toString() { return "Tv"; }
}

class Computer extends Product {
	Computer() { super(200); }
	public String toString() { return "Computer"; }
}

class Audio extends Product {
	Audio() { super(50); }
	public String toString() { return "Audio"; }
}

class Buyer {					// 고객, 물건을 사는 사람
	int money = 1000;			// 소유 금액
	int bonusPoint = 0;			// 보너스 점수
	Vector item = new Vector();	// 구입한 제품을 저장하는 데 사용될 Vector 객체
	
	void buy(Product p) {		// 제품 구입
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money -= p.price;							// 가진 돈에서 구입한 제품의 가격 차감
		bonusPoint += p.bonusPoint;					// 가진 보너스 점수에 제품의 보너스 점수 추가
		item.add(p);								// 구입한 제품을 Vector에 저장
		System.out.println(p + "을/를 구입하셨습니다.");
	}
	
	void refund(Product p) {	// 제품 환불
		if(item.remove(p)) {						// 제품을 Vector에서 제거
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "을/를 반품하셨습니다.");
		} else {									// 제거에 실패한 경우
			System.out.println("구입하신 제품중 해당 제품이 없습니다.");
		}
	}
	
	void summary() {			// 구매한 물품에 대한 정보 요약, 출력
		int sum = 0;			// 구입한 물품의 가격 합계
		String itemList = "";	// 구입한 물품 목록
		
		if(item.isEmpty()) {	// Vector가 비어있는지 확인
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		
		// 반복문을 이용해서 구입한 물품의 총 가격과 목록을 생성
		for (int i=0; i<item.size(); i++) {
			Product p = (Product)item.get(i);		// Vector의 i번째에 있는 객체를 얻음 (Product로 형변환했음을 관찰)
			sum += p.price;
			itemList += (i==0) ? "" + p : ", " + p;
		}
		System.out.println("구입하신 물품의 총 금액은 " + sum + "만원 입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}

class PolyArgumentTest3 {
	public static void main(String args[]) {
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		Audio audio = new Audio();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		System.out.println();
		b.refund(com);
		b.summary();
	}
}