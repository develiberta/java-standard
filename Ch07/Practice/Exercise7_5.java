/* Exercise 7-5. 다음의 코드는 컴파일하면 에러가 발생한다.
 * 그 이유를 설명하고 에러를 수정하기 위해서는 코드를 어떻게 바꾸어야 하는지 변경해보라.
 */
class Exercise7_5 {
	public static void main(String[] args) {
		Tv t = new Tv();
	}
}
 
class Product {
	int price;			// 제품의 가격
	int bonusPoint;		// 제품 구매 시 제공하는 보너스 점수
	
	Product(int price) {
		this.price = price;
		bonusPoint = price/10;
	}
}

class Tv extends Product {
//	Tv() {}				/* [답] 컴파일 에러 발생하는 부분 */
	// 컴파일러가 생성자의 첫 줄에 super();를 추가하는데,
	// 조상 클래스인 Product에는 Product()가 정의되어 있지 않으며,
	// 다른 생성자가 있어서 컴파일러는 이 생성자를 자동 추가해주지 않는다.
	// 여기에서는 원래의 코드를 쓰고, Product 클래스에 Product() 생성자를 선언해도 되고,
	// 다음과 같이 super(100)을 직접 추가해도 된다.
	Tv() { super(100); }
	
	public String toString() {
		return "Tv";
	}
}