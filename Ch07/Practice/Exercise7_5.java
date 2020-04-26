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
	// 컴파일러가 생성자의 첫 줄에 super();를 삽입하는데,
	// 조상 클래스인 Product에는 Product()가 존재하지 않으며,
	// 다른 생성자가 있어서 컴파일러는 이 생성자를 자동 추가해주지 않는다.
	// 코드를 수정하면 아래의 한 줄과 같다.
	Tv() { super(100); }
	
	public String toString() {
		return "Tv";
	}
}