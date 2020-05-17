/* Exercise 9-5. 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
 *
 * 메서드명	: count
 * 기능		: 주어진 문자열(src)에 찾으려는 문자열(target)이 몇 번 나오는지 세어서 반환한다.
 * 반환타입	: int
 * 매개변수	: String src
 *			  String target
 */
class Exercise9_5 {
	public static int count(String src, String target) {
		int count = 0;		// 찾은 횟수
		int pos   = 0;		// 찾기 시작한 위치
		
		/* (1) 반복문을 사용해서 아래의 과정을 반복한다.
				1. src에서 target을 pos의 위치부터 찾는다.
				2. 찾으면 count의 값을 1 증가시키고,
				   pos의 값을 target.length만큼 증가시킨다.
				3. indexOf의 결과가 -1이면 반복문을 빠져나가서 count를 반환한다. */
		
		// 반복문을 사용해서 아래의 과정을 반복한다.
		while (true) {
			/* [참고] int	indexOf(int ch)
					 Returns the index within this string of the first occurrence of the specified character.
					 int	indexOf(int ch, int fromIndex)
					 Returns the index within this string of the first occurrence of the specified character, starting the search at the specified index.
					 int	indexOf(String str)
					 Returns the index within this string of the first occurrence of the specified substring.
					 int	indexOf(String str, int fromIndex)
					 Returns the index within this string of the first occurrence of the specified substring, starting at the specified index. */
			// 1. src에서 target을 pos의 위치부터 찾는다.
			pos = src.indexOf(target, pos);
			// 2. 찾으면 count의 값을 1 증가시키고,
			//	  pos의 값을 target.length만큼 증가시킨다.
			if(pos!=-1) {
				count++;
				pos += target.length();
			// indexOf의 결과가 -1이면 반복문을 빠져나가서 count를 반환한다.
			} else {
				break;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(count("12345AB12AB345AB", "AB"));
		System.out.println(count("12345", "AB"));
	}
}