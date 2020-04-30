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

class SutdaCard {		// 변수명 대문자로
//	final int num;			// 수정한 부분
//	final boolean isKwang;	// 수정한 부분
	/* final 만 붙일 게 아니라 변수의 이름도 대문자로 변경하기 */
	final int NUM;
	final boolean IS_KWANG;
	
	SutdaCard(int num, boolean isKwang) {
//		this.num = num;
//		this.isKwang = isKwang;
		this.NUM = num;				// 단 한 번의 초기화만 가능하며, 생성자에서도 가능
		this.IS_KWANG = isKwang;	// 단 한 번의 초기화만 가능하며, 생성자에서도 가능
	}
	
	public String toString() {
//		return num + ( isKwang ? "K":"");
		return NUM + ( IS_KWANG ? "K":"");
	}
}
/* [해설]	원래 변수 앞에 final을 붙일 때는 선언과 동시에 초기화를 해야 한다.
 *			[by LSH] 초기화 블럭 (static 초기화 블럭 포함) 에서도 초기화 가능
 *			그러나 인스턴스변수의 경우, 선언 시에 초기화를 하지 않고 생성자에서 초기화할 수 있다.
 *			생성할 때 지정된 값이 변하지 않도록 할 수 있는 것이다.
 *			상수이므로 한 번 초기화한 이후로는 값을 바꿀 수 없다.
 */