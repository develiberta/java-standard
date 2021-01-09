/* Exercise 12-4. 아래의 메서드는 두 개의 ArrayList를 매개변수로 받아서,
 * 하나의 새로운 ArrayList로 병합하는 메서드이다.
 * 이를 제네릭 메서드로 변경하시오.
 */
class Exercise12_4 {
	public static void main(String[] args) {
		
	}
	
	public static ArrayList<? extends Product> mergeBefore(
		ArrayList<? extends Product> list1, ArrayList<? extends Product> list2) {
			ArrayList<? extends Product> newList = new ArrayList<>(list1);
			
			newList.addAll(list2);
			
			return newList;
	}
	
	public static <T extends Product> ArrayList<T> mergeAfter(
		ArrayList<T> list1, ArrayList<T> list2) {
			ArrayList<T> newList = new ArrayList<>(list1);
			
			newList.addAll(list2);
			
			return newList;
	}
}