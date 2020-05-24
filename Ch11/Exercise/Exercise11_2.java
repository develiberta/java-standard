import java.util.*;

/* Exercise 11-2. 다음 코드의 실행결과를 적으시오.
 */
class Exercise11_2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();	// 중복 허용O, 순서 유지O
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(7);
		
		System.out.println("list : " + list); 	// [3, 6, 2, 2, 2, 7]
		HashSet set = new HashSet(list);		// 중복 허용X, 순서 유지X
		System.out.println("set : " + set);		// [2, 3, 6, 7]
		TreeSet tset = new TreeSet(set);		// 중복 허용X, 순서 유지X
		System.out.println("tset : " + tset);	// [2, 3, 6, 7]
		Stack stack = new Stack();				// FILO
		stack.addAll(tset);
		
		while(!stack.empty())
			System.out.println(stack.pop());
	}
}
/* [실행결과]
 * 7
 * 6
 * 3
 * 2
 */