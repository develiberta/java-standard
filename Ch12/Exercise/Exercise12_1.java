/* Exercise 12-1. 클래서 Box가 다음과 같이 정의되어 있을 때,
 * 다음 중 오류가 발생하는 문장은? 경고가 발생하는 문장은?
 * 
 * [보기]
 * a. Box<Object> b = new Box<String>();
 * b. Box<Object> b = (Object)new Box<String>();
 * c. new Box<String>().setItem(new Object());
 * d. new Box<String>().setItem("ABC");
 *
 * [정답]
 * (1) 오류가 발생하는 문장
 * a, b, c
 * (2) 경고가 발생하는 문장
 * 
 */
class Box<T> {	// 지네릭 타입 T를 선언
	T item;
	
	void setItem(T item) { this.item = item; }
	T getItem() { return item; }
}