/* Exercise 9-7. 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
 *
 * 메서드명	: contains
 * 기능		: 첫 번째 문자열(src)에 두 번째 문자열(target)이 포함되어 있는지 확인한다.
			  포함되어 있으면 true, 그렇지 않으면 false를 반환한다.
 * 반환타입	: boolean
 * 매개변수	: String src
 *			  String target
 *
 * [Hint] String클래스의 indexOf()를 사용할 것
 */
class Exercise9_7 {
	/* [참고] boolean	contains(CharSequence s)
			 Returns true if and only if this string contains the specified sequence of char values.
	   [참고] CharSequence는 인터페이스로, 이를 구현한 대표적인 클래스로는 String, SpannableStringBuilder, StringBuilder, StringBuffer 등이 있다. */
	/* (1) contains메서드를 작성하시오. */
	static boolean contains(String src, String target) {
		// return src.contains(target);
		// 위의 한 줄로 해결할 수 있지만, 문제 의도에 따라 String클래스의 indexOf()를 사용해보자.
		/* [참고] int	indexOf(int ch)
				 Returns the index within this string of the first occurrence of the specified character.
				 int	indexOf(int ch, int fromIndex)
				 Returns the index within this string of the first occurrence of the specified character, starting the search at the specified index.
				 int	indexOf(String str)
				 Returns the index within this string of the first occurrence of the specified substring.
				 int	indexOf(String str, int fromIndex)
				 Returns the index within this string of the first occurrence of the specified substring, starting at the specified index. */
		boolean result = false;
		int pos = src.indexOf(target);
		if (pos!=-1) result = true;
		return result;
	}	
	
	public static void main(String[] args) {
		System.out.println(contains("12345","23"));
		System.out.println(contains("12345","67"));
	}
}