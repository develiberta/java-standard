/* Exercise 6-22. 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
 * 메서드명	:	isNumber
 * 기능		:	주어진 문자열이 모두 숫자로만 이루어져 있는지 확인
 *				모두 숫자로만 이루어져 있으면 true 반환, 그렇지 않으면 false 반환
 *				만일 주어진 문자열이 null이거나 빈 문자열 "" 이라면 false 반환
 * 반환타입	:	boolean
 * 매개변수	:	String str (검사할 문자열)
 * [Hint] String 클래스의 charAt(int i) 메서드를 사용하면 문자열의 i번째 위치한 문자를 얻을 수 있다.
 */
class Exercise6_22 {
	/* (1) isNumber 메서드를 작성하시오. */
	static boolean isNumber(String str) {
		for (int i=0; i<str.length(); i++) {
			if (!('0'<=str.charAt(i) && str.charAt(i)<='9')) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + " 는 숫자입니까? " + isNumber(str));
		
		str = "1234o";
		System.out.println(str + " 는 숫자입니까? " + isNumber(str));
	}
}