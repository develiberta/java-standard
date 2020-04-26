/* Exercise 7-14. 문제 7-1에 나오는 섯다카드의 숫자와 종류(isKwang)는 사실
 * 한 번 값이 지정되면 변경되어서는 안되는 값이다.
 * 카드의 숫자가 한 번 잘못 바뀌면 똑같은 카드가 두 장이 될 수도 있기 때문이다.
 * 이러한 문제점이 발생하지 않도록 아래의 SutdaCard를 수정하시오.
 */
class Exercise7_14 {
	public static void main(String args[]) {
		SutdaCard card = new SutdaCard(1, true);
	}
}

class SutdaCard {
	final int num;			// 수정한 부분
	final boolean isKwang;	// 수정한 부분
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String toString() {
		return num + ( isKwang ? "K":"");
	}
}