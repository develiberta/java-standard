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
 * [정답] a, b, d, e, g
 * 
 */
class Box<T extends Fruit> {	// 지네릭 타입 T를 선언
	T item;
	
	void setItem(T item) { this.item = item; }
	T getItem() { return item; }
}