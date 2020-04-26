class Product {
	int price;			// 제품의 가격
	int bonusPoint;		// 제품 구매 시 제공하는 보너스 점수
	
	Product(int price) {
		this.price = price;
		bonusPoint = price/10;		// 보너스 점수는 제품 가격의 10%
	}
}

class Tv extends Product {
	Tv() {
		// 조상클래스의 생성자 Product(int price)를 호출
		super(100);		// Tv의 가격 100만원
	}
	
	// Object 클래스의 toString()을 오버라이딩
	public String toString() { return "Tv"; }
}

class Computer extends Product {
	Computer() { super(200); }
	
	public String toString() { return "Computer"; }
}
	
class Buyer {			// 고객, 물건을 사는 사람
	int money = 1000;	// 소유 금액
	int bonusPoint = 0;	// 보너스 점수
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;				// 가진 돈에서 구입한 제품의 가격 차감
		bonusPoint += p.bonusPoint;		// 가진 보너스 점수에 제품의 보너스 점수 추가
		System.out.println(p + "을/를 구입하셨습니다.");
	}
}

class PolyArgumentTest {
	public static void main(String args[]) {
		Buyer b = new Buyer();
		
		b.buy(new Tv());
		b.buy(new Computer());
		
		System.out.println("현재 남은 돈은 " + b.money + "만원 입니다.");
		System.out.println("현재 보너스 점수는 " + b.bonusPoint + "점 입니다.");
	}
}