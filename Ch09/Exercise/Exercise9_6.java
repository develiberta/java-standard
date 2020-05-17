import java.util.Formatter;

/* Exercise 9-6. 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
 *
 * 메서드명	: fillZero
 * 기능		: 주어진 문자열(숫자)로 주어진 길이의 문자열로 만들고, 왼쪽 빈 공간은 '0'으로 채운다.
			  만일 주어진 문자열이 null이거나 문자열의 길이가 length의 값과 같으면 그대로 반환한다.
			  만일 주어진 length의 값이 0보다 작거나 같은 값이면 빈 문자열("")을 반환한다.
 * 반환타입	: String
 * 매개변수	: String src	- 변환할 문자열
 *			  int length	- 변환한 문자열의 길이
 */
class Exercise9_6 {
	public static String fillZero(String src, int length) {
		/* (1) fillZero메서드를 작성하시오.
				1. src가 null이거나 src.length()가 length와 같으면 src를 그대로 반환한다.
				2. length의 값이 0보다 같거나 작으면 빈 문자열("")을 반환한다.
				3. src의 길이가 length의 값보다 크면 src를 length만큼 잘라서 반환한다.
				4. 길이가 length인 char배열을 생성한다.
				5. 4에서 생성한 char배열을 '0'으로 채운다.
				6. src에서 문자배열을 뽑아내서 4에서 생성한 배열에 복사한다.
				7. 4에서 생성한 배열로 String을 생성해서 반환한다. */
		// [by LSH] java.util.Formatter 을 이용하면 4~7을 한 번에 처리할 수 있다.
		
		String result = "";
		
		// 1. src가 null이거나 src.length()가 length와 같으면 src를 그대로 반환한다.
		if(src==null || src.length()==length) result = src;
		
		// 2. length의 값이 0보다 같거나 작으면 빈 문자열("")을 반환한다.
		else if(length<=0) result = "";
		
		// 3. src의 길이가 length의 값보다 크면 src를 length만큼 잘라서 반환한다.
		else if(src.length()>length) result = src.substring(0, length);
		
		// 4. 길이가 length인 char배열을 생성한다.
		else {
			char[] charArr = new char[length];
			for (int i=0; i<charArr.length; i++) {
				charArr[i] = '0';
			}
			for (int i=0; i<src.length(); i++) {
				charArr[charArr.length-src.length()+i] = src.charAt(i);
			}
			/* [참고] static String	copyValueOf(char[] data)
					 Equivalent to valueOf(char[]).
					 static String	copyValueOf(char[] data, int offset, int count)
					 Equivalent to valueOf(char[], int, int).
					 
					 static String	valueOf(boolean b)
					 Returns the string representation of the boolean argument.
					 static String	valueOf(char c)
					 Returns the string representation of the char argument.
					 static String	valueOf(char[] data)
					 Returns the string representation of the char array argument.
					 static String	valueOf(char[] data, int offset, int count)
					 Returns the string representation of a specific subarray of the char array argument.
					 static String	valueOf(double d)
					 Returns the string representation of the double argument.
					 static String	valueOf(float f)
					 Returns the string representation of the float argument.
					 static String	valueOf(int i)
					 Returns the string representation of the int argument.
					 static String	valueOf(long l)
					 Returns the string representation of the long argument.
					 static String	valueOf(Object obj)
					 Returns the string representation of the Object argument.
			 */
			result = result.valueOf(charArr);
			
//			// [참고] java.util.Formatter 를 이용하는 방법 (import java.util.Formatter 필요)
//			Formatter fmt = new Formatter();
//			result = fmt.format("%0"+length+"d", Integer.parseInt(src)).toString();
		}
		return result;
	}
	
	public static void main(String[] args) {
		String src = "12345";
		System.out.println(fillZero(src,10));
		System.out.println(fillZero(src,-1));
		System.out.println(fillZero(src,3));
	}
}