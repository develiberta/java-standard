class Product {
	int price;		// 제품의 가격
	int bonusPoint;	// 제품 구매 시 제공하는 보너스 점수
	
	Product(int price) {
		this.price = price;
		bonusPoint = price/10;
	}
	
	Product() {}	// 기본 생성자
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

class Buyer {							// 고객, 물건을 사는 사람
	int money = 1000;					// 소유 금액
	int bonusPoint = 0;					// 보너스 점수
	Product[] item = new Product[10];	// 구입한 제품을 저장하기 위한 배열
	int i = 0;							// Product 배열에 사용될 카운터

	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족해서 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;				// 가진 돈에서 구입한 제품의 가격 차감
		bonusPoint += p.bonusPoint;		// 제품의 보너스 포인트 추가
		item[i++] = p;					// 제품을 Product[] item 에 저장
		System.out.println(p + "을/를 구입하셨습니다.");
	}
	
	void summary() {					// 구입한 물품에 대한 정보를 요약해서 출력
		int sum = 0;					// 구입한 물품의 가격 합계
		String itemList = "";			// 구입한 물품 목록
		
		// 반복문을 이용해서 구입한 물품의 총 가격과 목록을 저장
		for (int i=0; i<item.length; i++) {
			if(item[i]==null) break;
			sum += item[i].price;
//			itemList += item[i] + ", ";
			itemList += (i==0) ? item[i] : ", " + item[i];
		}
		System.out.println("구입하신 물품의 총 금액은 " + sum + "만원 입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}

class PolyArgumentTest2 {
	public static void main(String args[]) {
		Buyer b = new Buyer();
		
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		b.summary();
	}
}