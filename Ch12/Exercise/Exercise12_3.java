/* Exercise 12-3. 다음 중 올바르지 않은 문장을 모두 고르시오.
 * 
 * [보기]
 * a. Box<?> b = new Box();
 * b. Box<?> b = new Box<>();
 * c. Box<?> b = new Box<Object>();
 * d. Box<Object> b = new Box<Fruit>();
 * e. Box b = new Box<Fruit>();
 * f. Box<? extends Fruit> b = new Box<Apple>();
 * g. Box<? extends Object> b = new Box<? extends Fruit>();
 *
 * [정답] a, b,    d, e, g(틀림)
 * [정답]       c, d,    g
 *
 * [해설]
 * a. (바람직하지는 않음) Box<?> b = new Box<>();
 * b. (바람직)
 * d. (바람직하지는 않음) Box<?> b = new Box<Fruit>();
 * f. (바람직)
 * 
 */
class Box<T extends Fruit> {	// 지네릭 타입 T를 선언
	T item;
	
	void setItem(T item) { this.item = item; }
	T getItem() { return item; }
}